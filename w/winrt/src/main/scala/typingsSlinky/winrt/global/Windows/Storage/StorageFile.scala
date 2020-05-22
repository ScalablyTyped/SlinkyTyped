package typingsSlinky.winrt.global.Windows.Storage

import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import typingsSlinky.winrt.Windows.Foundation.Uri
import typingsSlinky.winrt.Windows.Storage.IStorageFile
import typingsSlinky.winrt.Windows.Storage.StreamedFileDataRequestedHandler
import typingsSlinky.winrt.Windows.Storage.Streams.IInputStream
import typingsSlinky.winrt.Windows.Storage.Streams.IRandomAccessStreamReference
import typingsSlinky.winrt.Windows.Storage.Streams.IRandomAccessStreamWithContentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Storage.StorageFile")
@js.native
class StorageFile ()
  extends typingsSlinky.winrt.Windows.Storage.StorageFile {
  /* CompleteClass */
  override def openReadAsync(): IAsyncOperation[IRandomAccessStreamWithContentType] = js.native
  /* CompleteClass */
  override def openSequentialReadAsync(): IAsyncOperation[IInputStream] = js.native
}

/* static members */
@JSGlobal("Windows.Storage.StorageFile")
@js.native
object StorageFile extends js.Object {
  def createStreamedFileAsync(
    displayNameWithExtension: String,
    dataRequested: StreamedFileDataRequestedHandler,
    thumbnail: IRandomAccessStreamReference
  ): IAsyncOperation[typingsSlinky.winrt.Windows.Storage.StorageFile] = js.native
  def createStreamedFileFromUriAsync(displayNameWithExtension: String, uri: Uri, thumbnail: IRandomAccessStreamReference): IAsyncOperation[typingsSlinky.winrt.Windows.Storage.StorageFile] = js.native
  def getFileFromApplicationUriAsync(uri: Uri): IAsyncOperation[typingsSlinky.winrt.Windows.Storage.StorageFile] = js.native
  def getFileFromPathAsync(path: String): IAsyncOperation[typingsSlinky.winrt.Windows.Storage.StorageFile] = js.native
  def replaceWithStreamedFileAsync(
    fileToReplace: IStorageFile,
    dataRequested: StreamedFileDataRequestedHandler,
    thumbnail: IRandomAccessStreamReference
  ): IAsyncOperation[typingsSlinky.winrt.Windows.Storage.StorageFile] = js.native
  def replaceWithStreamedFileFromUriAsync(fileToReplace: IStorageFile, uri: Uri, thumbnail: IRandomAccessStreamReference): IAsyncOperation[typingsSlinky.winrt.Windows.Storage.StorageFile] = js.native
}

