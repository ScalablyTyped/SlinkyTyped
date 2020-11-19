package typingsSlinky.winrt.Windows.Data.Xml.Dom

import typingsSlinky.winrt.Windows.Foundation.IAsyncAction
import typingsSlinky.winrt.Windows.Storage.IStorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IXmlDocumentIO extends js.Object {
  
  def loadXml(xml: String): Unit = js.native
  def loadXml(xml: String, loadSettings: XmlLoadSettings): Unit = js.native
  
  def saveToFileAsync(file: IStorageFile): IAsyncAction = js.native
}
