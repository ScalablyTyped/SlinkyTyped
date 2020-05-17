package typingsSlinky.std

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
  def transformToDocument(source: org.scalajs.dom.raw.Node): org.scalajs.dom.raw.Document = js.native
  def transformToFragment(source: org.scalajs.dom.raw.Node, document: org.scalajs.dom.raw.Document): org.scalajs.dom.raw.DocumentFragment = js.native
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
  @scala.inline
  implicit class XSLTProcessorOps[Self <: XSLTProcessor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClearParameters(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearParameters")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetParameter(value: (java.lang.String, java.lang.String) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getParameter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withImportStylesheet(value: org.scalajs.dom.raw.Node => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importStylesheet")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveParameter(value: (java.lang.String, java.lang.String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeParameter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withReset(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetParameter(value: (java.lang.String, java.lang.String, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setParameter")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withTransformToDocument(value: org.scalajs.dom.raw.Node => org.scalajs.dom.raw.Document): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformToDocument")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTransformToFragment(
      value: (org.scalajs.dom.raw.Node, org.scalajs.dom.raw.Document) => org.scalajs.dom.raw.DocumentFragment
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformToFragment")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

