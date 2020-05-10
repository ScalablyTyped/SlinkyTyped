package typingsSlinky.winrt.Windows.Storage

import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import typingsSlinky.winrt.Windows.Foundation.Uri
import typingsSlinky.winrt.Windows.Storage.Streams.IRandomAccessStreamReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStorageFileStatics extends js.Object {
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

object IStorageFileStatics {
  @scala.inline
  def apply(
    createStreamedFileAsync: (String, StreamedFileDataRequestedHandler, IRandomAccessStreamReference) => IAsyncOperation[StorageFile],
    createStreamedFileFromUriAsync: (String, Uri, IRandomAccessStreamReference) => IAsyncOperation[StorageFile],
    getFileFromApplicationUriAsync: Uri => IAsyncOperation[StorageFile],
    getFileFromPathAsync: String => IAsyncOperation[StorageFile],
    replaceWithStreamedFileAsync: (IStorageFile, StreamedFileDataRequestedHandler, IRandomAccessStreamReference) => IAsyncOperation[StorageFile],
    replaceWithStreamedFileFromUriAsync: (IStorageFile, Uri, IRandomAccessStreamReference) => IAsyncOperation[StorageFile]
  ): IStorageFileStatics = {
    val __obj = js.Dynamic.literal(createStreamedFileAsync = js.Any.fromFunction3(createStreamedFileAsync), createStreamedFileFromUriAsync = js.Any.fromFunction3(createStreamedFileFromUriAsync), getFileFromApplicationUriAsync = js.Any.fromFunction1(getFileFromApplicationUriAsync), getFileFromPathAsync = js.Any.fromFunction1(getFileFromPathAsync), replaceWithStreamedFileAsync = js.Any.fromFunction3(replaceWithStreamedFileAsync), replaceWithStreamedFileFromUriAsync = js.Any.fromFunction3(replaceWithStreamedFileFromUriAsync))
    __obj.asInstanceOf[IStorageFileStatics]
  }
  @scala.inline
  implicit class IStorageFileStaticsOps[Self <: IStorageFileStatics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateStreamedFileAsync(
      value: (String, StreamedFileDataRequestedHandler, IRandomAccessStreamReference) => IAsyncOperation[StorageFile]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createStreamedFileAsync")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withCreateStreamedFileFromUriAsync(value: (String, Uri, IRandomAccessStreamReference) => IAsyncOperation[StorageFile]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createStreamedFileFromUriAsync")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withGetFileFromApplicationUriAsync(value: Uri => IAsyncOperation[StorageFile]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFileFromApplicationUriAsync")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetFileFromPathAsync(value: String => IAsyncOperation[StorageFile]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFileFromPathAsync")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReplaceWithStreamedFileAsync(
      value: (IStorageFile, StreamedFileDataRequestedHandler, IRandomAccessStreamReference) => IAsyncOperation[StorageFile]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceWithStreamedFileAsync")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withReplaceWithStreamedFileFromUriAsync(value: (IStorageFile, Uri, IRandomAccessStreamReference) => IAsyncOperation[StorageFile]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceWithStreamedFileFromUriAsync")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

