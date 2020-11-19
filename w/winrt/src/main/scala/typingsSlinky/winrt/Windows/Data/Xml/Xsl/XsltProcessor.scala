package typingsSlinky.winrt.Windows.Data.Xml.Xsl

import typingsSlinky.winrt.Windows.Data.Xml.Dom.IXmlNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XsltProcessor extends IXsltProcessor
object XsltProcessor {
  
  @scala.inline
  def apply(transformToString: IXmlNode => String): XsltProcessor = {
    val __obj = js.Dynamic.literal(transformToString = js.Any.fromFunction1(transformToString))
    __obj.asInstanceOf[XsltProcessor]
  }
}
