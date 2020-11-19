package typingsSlinky.winrtUwp.global.Windows.Storage

import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsSlinky.winrtUwp.Windows.Storage.IStorageFile
import typingsSlinky.winrtUwp.Windows.Storage.Provider.FileUpdateStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Lets apps manage real-time updates to files. */
@JSGlobal("Windows.Storage.CachedFileManager")
@js.native
abstract class CachedFileManager ()
  extends typingsSlinky.winrtUwp.Windows.Storage.CachedFileManager
/* static members */
@JSGlobal("Windows.Storage.CachedFileManager")
@js.native
object CachedFileManager extends js.Object {
  
  /**
    * Initiates updates for the specified file. This method contacts the app that provided the file to perform the updates.
    * @param file The file to update.
    * @return When this method completes, it returns a FileUpdateStatus enum value that describes the status of the updates to the file.
    */
  def completeUpdatesAsync(file: IStorageFile): IPromiseWithIAsyncOperation[FileUpdateStatus] = js.native
  
  /**
    * Lets apps defer real-time updates for a specified file.
    * @param file The file to defer updates for.
    */
  def deferUpdates(file: IStorageFile): Unit = js.native
}
