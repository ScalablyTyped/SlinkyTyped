package typingsSlinky.winrt.Windows.Data.Xml.Xsl

import typingsSlinky.winrt.Windows.Data.Xml.Dom.IXmlNode
import typingsSlinky.winrt.Windows.Data.Xml.Dom.XmlDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Data.Xml.Xsl.XsltProcessor")
@js.native
class XsltProcessor protected () extends IXsltProcessor {
  def this(document: XmlDocument) = this()
  /* CompleteClass */
  override def transformToString(inputNode: IXmlNode): String = js.native
}

