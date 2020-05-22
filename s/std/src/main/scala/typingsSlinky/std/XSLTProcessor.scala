package typingsSlinky.std

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

object XSLTProcessor {
  @scala.inline
  def apply(
    clearParameters: () => Unit,
    getParameter: (java.lang.String, java.lang.String) => js.Any,
    importStylesheet: org.scalajs.dom.raw.Node => Unit,
    removeParameter: (java.lang.String, java.lang.String) => Unit,
    reset: () => Unit,
    setParameter: (java.lang.String, java.lang.String, js.Any) => Unit,
    transformToDocument: org.scalajs.dom.raw.Node => org.scalajs.dom.raw.Document,
    transformToFragment: (org.scalajs.dom.raw.Node, org.scalajs.dom.raw.Document) => org.scalajs.dom.raw.DocumentFragment
  ): XSLTProcessor = {
    val __obj = js.Dynamic.literal(clearParameters = js.Any.fromFunction0(clearParameters), getParameter = js.Any.fromFunction2(getParameter), importStylesheet = js.Any.fromFunction1(importStylesheet), removeParameter = js.Any.fromFunction2(removeParameter), reset = js.Any.fromFunction0(reset), setParameter = js.Any.fromFunction3(setParameter), transformToDocument = js.Any.fromFunction1(transformToDocument), transformToFragment = js.Any.fromFunction2(transformToFragment))
    __obj.asInstanceOf[XSLTProcessor]
  }
}

