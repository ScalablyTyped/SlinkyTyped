package typingsSlinky.winrtUwp.Windows.Data.Xml.Xsl

import typingsSlinky.winrtUwp.Windows.Data.Xml.Dom.IXmlNode
import typingsSlinky.winrtUwp.Windows.Data.Xml.Dom.XmlDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides the methods needed by the Xslt processor. */
@js.native
trait XsltProcessor extends js.Object {
  /**
    * Processes a node and its children and returns the resulting XmlDocument .
    * @param inputNode The node to process.
    * @return The resulting transformation.
    */
  def transformToDocument(inputNode: IXmlNode): XmlDocument = js.native
  /**
    * Processes a node and its children and returns the resulting string transformation.
    * @param inputNode The node to process.
    * @return The resulting transformation.
    */
  def transformToString(inputNode: IXmlNode): String = js.native
}

object XsltProcessor {
  @scala.inline
  def apply(transformToDocument: IXmlNode => XmlDocument, transformToString: IXmlNode => String): XsltProcessor = {
    val __obj = js.Dynamic.literal(transformToDocument = js.Any.fromFunction1(transformToDocument), transformToString = js.Any.fromFunction1(transformToString))
    __obj.asInstanceOf[XsltProcessor]
  }
  @scala.inline
  implicit class XsltProcessorOps[Self <: XsltProcessor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTransformToDocument(value: IXmlNode => XmlDocument): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformToDocument")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTransformToString(value: IXmlNode => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformToString")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

