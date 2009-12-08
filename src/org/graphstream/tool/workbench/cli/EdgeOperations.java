/*
 * This file is part of GraphStream.
 * 
 * GraphStream is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * GraphStream is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with GraphStream.  If not, see <http://www.gnu.org/licenses/>.
 * 
 * Copyright 2006 - 2009
 * 	Julien Baudry
 * 	Antoine Dutot
 * 	Yoann Pigné
 * 	Guilhelm Savin
 */
package org.graphstream.tool.workbench.cli;

import org.graphstream.graph.Element;

/**
 * Defines some edge operations like 'add' or 'del'.
 * 
 * @author Guilhelm Savin
 *
 */
public class EdgeOperations extends CLICommand
{
	private static final String PATTERN = "^(add|del)( directed)? edge \"(" + PATTERN_ID + ")\"(?: \"(" + PATTERN_ID + ")\" \"(" + PATTERN_ID + ")\")?(" + PATTERN_ATTRIBUTES + ")$";
	
	static
	{
		CLI.registerCommand( new EdgeOperations() );
	}
	
	protected EdgeOperations()
	{
		super( PATTERN );
		
		attributes.put( "action", 1 );
		attributes.put( "directed", 2 );
		attributes.put( "id", 3 );
		attributes.put( "src", 4 );
		attributes.put( "dst", 5 );
		attributes.put( "attributes", 6 );
		
		usage = "{add|del} [directed] edge \"<i>id</i>\" [\"<i>id<sub>n1</sub></i>\" \"<i>id<sub>n2</sub></i>\"] [attributes]";
	}
	
	@Override
	public String execute(CLI cli, String cmd)
	{
		CLICommandResult ccr = result( cmd );
		if( ! ccr.isValid() ) 	return createErrorMessage( "bad command" );
		if( cli.ctx == null ) 	return createErrorMessage( "no context" );
		
		String id = ccr.getAttribute( "id" );
		if( ccr.getAttribute( "action" ).equals( "add" ) )
		{
			if( ! ccr.hasAttribute( "src" ) || ! ccr.hasAttribute( "dst" ) )
				return usage();
			
			Element e = cli.ctx.getGraph().addEdge( id, 
					ccr.getAttribute( "src" ), 
					ccr.getAttribute( "dst" ), 
					ccr.hasAttribute( "directed" ) );
			cli.ctx.getHistory().registerAddEdgeAction(e);
			
			if( ccr.hasAttribute( "attributes" ) )
				fillAttributes( cli.ctx.getGraph().getEdge(id), ccr.getAttribute( "attributes" ) );
		}
		else
		{
			Element e = cli.ctx.getGraph().removeEdge(id);
			cli.ctx.getHistory().registerDelEdgeAction(e);
		}
		
		return R_OK;
	}

}