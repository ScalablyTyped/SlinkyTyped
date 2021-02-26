package typingsSlinky.winrt.global.Windows.Storage

import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import typingsSlinky.winrt.Windows.Foundation.Uri
import typingsSlinky.winrt.Windows.Storage.IStorageFile
import typingsSlinky.winrt.Windows.Storage.StreamedFileDataRequestedHandler
import typingsSlinky.winrt.Windows.Storage.Streams.IRandomAccessStreamReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Windows.Storage.StorageFile")
@js.native
class StorageFile ()
  extends typingsSlinky.winrt.Windows.Storage.StorageFile
/* static members */
object StorageFile {
  
  @JSGlobal("Windows.Storage.StorageFile.createStreamedFileAsync")
  @js.native
  def createStreamedFileAsync(
    displayNameWithExtension: String,
    dataRequested: StreamedFileDataRequestedHandler,
    thumbnail: IRandomAccessStreamReference
  ): IAsyncOperation[typingsSlinky.winrt.Windows.Storage.StorageFile] = js.native
  
  @JSGlobal("Windows.Storage.StorageFile.createStreamedFileFromUriAsync")
  @js.native
  def createStreamedFileFromUriAsync(displayNameWithExtension: String, uri: Uri, thumbnail: IRandomAccessStreamReference): IAsyncOperation[typingsSlinky.winrt.Windows.Storage.StorageFile] = js.native
  
  @JSGlobal("Windows.Storage.StorageFile.getFileFromApplicationUriAsync")
  @js.native
  def getFileFromApplicationUriAsync(uri: Uri): IAsyncOperation[typingsSlinky.winrt.Windows.Storage.StorageFile] = js.native
  
  @JSGlobal("Windows.Storage.StorageFile.getFileFromPathAsync")
  @js.native
  def getFileFromPathAsync(path: String): IAsyncOperation[typingsSlinky.winrt.Windows.Storage.StorageFile] = js.native
  
  @JSGlobal("Windows.Storage.StorageFile.replaceWithStreamedFileAsync")
  @js.native
  def replaceWithStreamedFileAsync(
    fileToReplace: IStorageFile,
    dataRequested: StreamedFileDataRequestedHandler,
    thumbnail: IRandomAccessStreamReference
  ): IAsyncOperation[typingsSlinky.winrt.Windows.Storage.StorageFile] = js.native
  
  @JSGlobal("Windows.Storage.StorageFile.replaceWithStreamedFileFromUriAsync")
  @js.native
  def replaceWithStreamedFileFromUriAsync(fileToReplace: IStorageFile, uri: Uri, thumbnail: IRandomAccessStreamReference): IAsyncOperation[typingsSlinky.winrt.Windows.Storage.StorageFile] = js.native
}
