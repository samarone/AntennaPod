package de.podfetcher.syndication.namespace.atom;

import org.xml.sax.Attributes;

import de.podfetcher.feed.Feed;
import de.podfetcher.syndication.handler.HandlerState;
import de.podfetcher.syndication.namespace.Namespace;

public class NSAtom extends Namespace {
	public static final String NSTAG = "atom";
	public static final String NSURI = "http://www.w3.org/2005/Atom";
	
	private static final String TITLE = "title";
	private static final String LINK = "link";
	private static final String UPDATED = "updated";
	private static final String AUTHOR = "author";
	
	@Override
	public void handleElement(String localName, HandlerState state, Attributes attributes) {
		if (localName.equals(TITLE)) {
			
		}

	}

	@Override
	public void handleCharacters(String localName, Feed feed, char[] ch,
			int start, int length) {
		
	}

}