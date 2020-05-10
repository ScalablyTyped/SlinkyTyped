package typingsSlinky.winrt.Windows.Data.Xml.Dom

import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import typingsSlinky.winrt.Windows.Foundation.Uri
import typingsSlinky.winrt.Windows.Storage.IStorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Data.Xml.Dom.XmlDocument")
@js.native
class XmlDocument ()
  extends IXmlDocument
     with IXmlDocumentIO

/* static members */
@JSGlobal("Windows.Data.Xml.Dom.XmlDocument")
@js.native
object XmlDocument extends js.Object {
  def loadFromFileAsync(file: IStorageFile): IAsyncOperation[XmlDocument] = js.native
  def loadFromFileAsync(file: IStorageFile, loadSettings: XmlLoadSettings): IAsyncOperation[XmlDocument] = js.native
  def loadFromUriAsync(uri: Uri): IAsyncOperation[XmlDocument] = js.native
  def loadFromUriAsync(uri: Uri, loadSettings: XmlLoadSettings): IAsyncOperation[XmlDocument] = js.native
}

