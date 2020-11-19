package typingsSlinky.winrt.Windows.Storage

import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import typingsSlinky.winrt.Windows.Foundation.Uri
import typingsSlinky.winrt.Windows.Storage.Streams.IRandomAccessStreamReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCreateStreamedFileAsync(
      value: (String, StreamedFileDataRequestedHandler, IRandomAccessStreamReference) => IAsyncOperation[StorageFile]
    ): Self = this.set("createStreamedFileAsync", js.Any.fromFunction3(value))
    
    @scala.inline
    def setCreateStreamedFileFromUriAsync(value: (String, Uri, IRandomAccessStreamReference) => IAsyncOperation[StorageFile]): Self = this.set("createStreamedFileFromUriAsync", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGetFileFromApplicationUriAsync(value: Uri => IAsyncOperation[StorageFile]): Self = this.set("getFileFromApplicationUriAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetFileFromPathAsync(value: String => IAsyncOperation[StorageFile]): Self = this.set("getFileFromPathAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReplaceWithStreamedFileAsync(
      value: (IStorageFile, StreamedFileDataRequestedHandler, IRandomAccessStreamReference) => IAsyncOperation[StorageFile]
    ): Self = this.set("replaceWithStreamedFileAsync", js.Any.fromFunction3(value))
    
    @scala.inline
    def setReplaceWithStreamedFileFromUriAsync(value: (IStorageFile, Uri, IRandomAccessStreamReference) => IAsyncOperation[StorageFile]): Self = this.set("replaceWithStreamedFileFromUriAsync", js.Any.fromFunction3(value))
  }
}
