package typingsSlinky.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An XSLTProcessor applies an XSLT stylesheet transformation to an XML document to produce a new XML document as output. It has methods to load the XSLT stylesheet, to manipulate <xsl:param> parameter values, and to apply the transformation to documents. */
trait XSLTProcessor extends js.Object {
  def clearParameters(): Unit
  def getParameter(namespaceURI: java.lang.String, localName: java.lang.String): js.Any
  def importStylesheet(style: org.scalajs.dom.raw.Node): Unit
  def removeParameter(namespaceURI: java.lang.String, localName: java.lang.String): Unit
  def reset(): Unit
  def setParameter(namespaceURI: java.lang.String, localName: java.lang.String, value: js.Any): Unit
  def transformToDocument(source: org.scalajs.dom.raw.Node): org.scalajs.dom.raw.Document
  def transformToFragment(source: org.scalajs.dom.raw.Node, document: org.scalajs.dom.raw.Document): org.scalajs.dom.raw.DocumentFragment
}

@JSGlobal("XSLTProcessor")
@js.native
object XSLTProcessor extends Instantiable0[XSLTProcessor]

