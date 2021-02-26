package typingsSlinky.winrt.Windows.Networking.BackgroundTransfer

import typingsSlinky.winrt.Windows.Foundation.Collections.IIterable
import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import typingsSlinky.winrt.Windows.Foundation.Uri
import typingsSlinky.winrt.Windows.Storage.IStorageFile
import typingsSlinky.winrt.Windows.Storage.Streams.IInputStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBackgroundUploader extends IBackgroundTransferBase {
  
  def createUpload(uri: Uri, sourceFile: IStorageFile): UploadOperation = js.native
  
  def createUploadAsync(uri: Uri, parts: IIterable[BackgroundTransferContentPart]): IAsyncOperation[UploadOperation] = js.native
  def createUploadAsync(uri: Uri, parts: IIterable[BackgroundTransferContentPart], subType: String): IAsyncOperation[UploadOperation] = js.native
  def createUploadAsync(uri: Uri, parts: IIterable[BackgroundTransferContentPart], subType: String, boundary: String): IAsyncOperation[UploadOperation] = js.native
  
  def createUploadFromStreamAsync(uri: Uri, sourceStream: IInputStream): IAsyncOperation[UploadOperation] = js.native
}
