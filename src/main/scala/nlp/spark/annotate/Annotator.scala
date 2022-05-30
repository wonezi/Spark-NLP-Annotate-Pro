package nlp.spark.annotate

import scala.collection.immutable.TreeSet

/**
  * This trait represents an function that produces annotations from a given text or document
  */
trait Annotator {
  /**
    * This takes a text, optional metadata, and optional annotations and returns a sequence of new annotations
    * @param text the text to be 