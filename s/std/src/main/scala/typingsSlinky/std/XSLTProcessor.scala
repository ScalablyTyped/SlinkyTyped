package typingsSlinky.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An XSLTProcessor applies an XSLT stylesheet transformation to an XML document to produce a new XML document as output. It has methods to load the XSLT stylesheet, to manipulate <xsl:param> parameter values, and to apply the transformation to documents. */
@js.native
trait XSLTProcessor extends js.Object {
  def clearParameters(): Unit = js.native
  def getParameter(namespaceURI: java.lang.String, localName: java.lang.String): js.Any = js.native
  def importStylesheet(style: org.scalajs.dom.raw.Node): Unit = js.native
  def removeParameter(namespaceURI: java.lang.String, localName: java.lang.String): Unit = js.native
  def reset(): Unit = js.native
  def setParameter(namespaceURI: java.lang.String, localName: java.lang.String, value: js.Any): Unit = js.native
  def transformToDocument(source: org.scalajs.dom.raw.Node): Document_ = js.native
  def transformToFragment(source: org.scalajs.dom.raw.Node, document: Document_): org.scalajs.dom.raw.DocumentFragment = js.native
}

@JSGlobal("XSLTProcessor")
@js.native
object XSLTProcessor extends Instantiable0[XSLTProcessor]

