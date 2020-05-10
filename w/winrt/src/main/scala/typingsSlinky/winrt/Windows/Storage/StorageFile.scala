package typingsSlinky.winrt.Windows.Storage

import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import typingsSlinky.winrt.Windows.Foundation.Uri
import typingsSlinky.winrt.Windows.Storage.Streams.IRandomAccessStreamReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Storage.StorageFile")
@js.native
class StorageFile ()
  extends IStorageFile
     with IStorageItemProperties

/* static members */
@JSGlobal("Windows.Storage.StorageFile")
@js.native
object StorageFile extends js.Object {
  def createStreamedFileAsync(
    displayNameWithExtension: String,
    dataRequested: StreamedFileDataRequestedHandler,
    thumbnail: IRandomAccessStreamReference
  ): IAsyncOperation[StorageFile] = js.native
  def createStreamedFileFromUriAsync(displayNameWithExtension: String, uri: Uri, thumbnail: IRandomAccessStreamReference): IAsyncOperation[StorageFile] = js.native
  def getFileFromApplicationUriAsync(uri: Uri): IAsyncOperation[StorageFile] = js.native
  def getFileFromPathAsync(path: String): IAsyncOperation[StorageFile] = js.native
  def replaceWithStreamedFileAsync(
    fileToReplace: IStorageFile,
    dataRequested: StreamedFileDataRequestedHandler,
    thumbnail: IRandomAccessStreamReference
  ): IAsyncOperation[StorageFile] = js.native
  def replaceWithStreamedFileFromUriAsync(fileToReplace: IStorageFile, uri: Uri, thumbnail: IRandomAccessStreamReference): IAsyncOperation[StorageFile] = js.native
}

