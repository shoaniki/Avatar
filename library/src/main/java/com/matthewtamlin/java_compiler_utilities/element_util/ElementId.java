package com.matthewtamlin.java_compiler_utilities.element_util;

/**
 * Defines an ID for an element in a source file.
 */
public @interface ElementId {
	/**
	 * @return the identifier, not necessary unique
	 */
	String value();
}