package nlp.spark.annotate

import scala.collection.immutable.TreeSet

/**
  * This trait represents an function that produces annotations from a given text or document
  */
trait Annotator {
  /**
    * This takes a text, optional metadata, and optional annotations and returns a sequence of new annotations
    * @param text the text to be annotated
    * @param metadata the metadata associated with the text
    * @param annotations the annotations alread found in the text
    * @return a sequence of new annotations found in the text
    */
  def annotate(
    text: String,
    metadata: Map[String, String] = Map(),
    annotations: TreeSet[Annotation] = TreeSet()): Seq[Annotation]

  /**
    * This takes a document and re