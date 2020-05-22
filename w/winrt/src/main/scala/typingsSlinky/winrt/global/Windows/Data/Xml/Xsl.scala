package typingsSlinky.winrt.global.Windows.Data.Xml

import typingsSlinky.winrt.Windows.Data.Xml.Dom.IXmlNode
import typingsSlinky.winrt.Windows.Data.Xml.Dom.XmlDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Data.Xml.Xsl")
@js.native
object Xsl extends js.Object {
  @js.native
  class XsltProcessor protected ()
    extends typingsSlinky.winrt.Windows.Data.Xml.Xsl.XsltProcessor {
    def this(document: XmlDocument) = this()
    /* CompleteClass */
    override def transformToString(inputNode: IXmlNode): String = js.native
  }
  
}

