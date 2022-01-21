
package nlp.spark.annotate

/**
  * This class represents an annotation in text
  * @param aType the type of the annotation (e.g. token, sentence, etc.)
  * @param begin the index of the first character of the annotation
  * @param end the index after the last charactor of the annotation
  * @param metadata the metadata for the annotation (e.g. lemma, sentiment, etx.)
  */
case class Annotation(aType: String, begin: Int, end: Int, metadata: Map[String, String] = Map())

/**
  * Companion object for Annotation type