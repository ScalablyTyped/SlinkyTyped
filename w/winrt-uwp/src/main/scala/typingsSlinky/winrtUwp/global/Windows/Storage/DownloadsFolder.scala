package typingsSlinky.winrtUwp.global.Windows.Storage

import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsSlinky.winrtUwp.Windows.System.User
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Creates files and folders inside the Downloads folder. */
@JSGlobal("Windows.Storage.DownloadsFolder")
@js.native
abstract class DownloadsFolder ()
  extends typingsSlinky.winrtUwp.Windows.Storage.DownloadsFolder
object DownloadsFolder {
  
  /**
    * Creates a new file inside the Downloads folder.
    * @param desiredName The desired name of the file to create.
    * @return When this method completes, it returns the new file as a StorageFile object.
    */
  /* static member */
  @JSGlobal("Windows.Storage.DownloadsFolder.createFileAsync")
  @js.native
  def createFileAsync(desiredName: String): IPromiseWithIAsyncOperation[typingsSlinky.winrtUwp.Windows.Storage.StorageFile] = js.native
  /**
    * Creates a new file in the Downloads folder, and specifies what to do if a file with the same name already exists in the Downloads folder.
    * @param desiredName The desired name of the file to create.
    * @param option The enum value that determines how Windows responds if the desiredName is the same as the name of an existing file in the current folder.
    * @return When this method completes, it returns the new file as a StorageFile object.
    */
  /* static member */
  @JSGlobal("Windows.Storage.DownloadsFolder.createFileAsync")
  @js.native
  def createFileAsync(desiredName: String, option: typingsSlinky.winrtUwp.Windows.Storage.CreationCollisionOption): IPromiseWithIAsyncOperation[typingsSlinky.winrtUwp.Windows.Storage.StorageFile] = js.native
  
  /**
    * Creates a new file inside the Downloads folder of a specific User .
    * @param user The User for which the file is created.
    * @param desiredName The desired name of the file to create.
    * @return When this method completes, it returns the new file as a StorageFile object.
    */
  /* static member */
  @JSGlobal("Windows.Storage.DownloadsFolder.createFileForUserAsync")
  @js.native
  def createFileForUserAsync(user: User, desiredName: String): IPromiseWithIAsyncOperation[typingsSlinky.winrtUwp.Windows.Storage.StorageFile] = js.native
  /**
    * Creates a new file in the Downloads folder of a specific User , and specifies what to do if a file with the same name already exists in the Downloads folder.
    * @param user The User for which the file is created.
    * @param desiredName The desired name of the file to create.
    * @param option The enum value that determines how Windows responds if the desiredName is the same as the name of an existing file in the current folder.
    * @return When this method completes, it returns the new file as a StorageFile object.
    */
  /* static member */
  @JSGlobal("Windows.Storage.DownloadsFolder.createFileForUserAsync")
  @js.native
  def createFileForUserAsync(
    user: User,
    desiredName: String,
    option: typingsSlinky.winrtUwp.Windows.Storage.CreationCollisionOption
  ): IPromiseWithIAsyncOperation[typingsSlinky.winrtUwp.Windows.Storage.StorageFile] = js.native
  
  /**
    * Creates a new subfolder in the Downloads folder.
    * @param desiredName The desired name of the subfolder to create.
    * @return When this method completes, it returns the new subfolder as a StorageFolder .
    */
  /* static member */
  @JSGlobal("Windows.Storage.DownloadsFolder.createFolderAsync")
  @js.native
  def createFolderAsync(desiredName: String): IPromiseWithIAsyncOperation[typingsSlinky.winrtUwp.Windows.Storage.StorageFolder] = js.native
  /**
    * Creates a new subfolder in the Downloads folder, and specifies what to do if a subfolder with the same name already exists in the Downloads folder.
    * @param desiredName The desired name of the subfolder to create.
    * @param option The enum value that determines how Windows responds if the desiredName is the same as the name of an existing subfolder in the Downloads folder.
    * @return When this method completes, it returns the new subfolder as a StorageFolder .
    */
  /* static member */
  @JSGlobal("Windows.Storage.DownloadsFolder.createFolderAsync")
  @js.native
  def createFolderAsync(desiredName: String, option: typingsSlinky.winrtUwp.Windows.Storage.CreationCollisionOption): IPromiseWithIAsyncOperation[typingsSlinky.winrtUwp.Windows.Storage.StorageFolder] = js.native
  
  /**
    * Creates a new subfolder inside the Downloads folder of a specific User .
    * @param user The User for which the folder is created.
    * @param desiredName The desired name of the subfolder to create.
    * @return When this method completes, it returns the new subfolder as a StorageFolder .
    */
  /* static member */
  @JSGlobal("Windows.Storage.DownloadsFolder.createFolderForUserAsync")
  @js.native
  def createFolderForUserAsync(user: User, desiredName: String): IPromiseWithIAsyncOperation[typingsSlinky.winrtUwp.Windows.Storage.StorageFolder] = js.native
  /**
    * Creates a new subfolder in the Downloads folder of a specific User , and specifies what to do if a subfolder with the same name already exists in the Downloads folder.
    * @param user The User for which the folder is created.
    * @param desiredName The desired name of the subfolder to create.
    * @param option The enum value that determines how Windows responds if the desiredName is the same as the name of an existing subfolder in the Downloads folder.
    * @return When this method completes, it returns the new subfolder as a StorageFolder .
    */
  /* static member */
  @JSGlobal("Windows.Storage.DownloadsFolder.createFolderForUserAsync")
  @js.native
  def createFolderForUserAsync(
    user: User,
    desiredName: String,
    option: typingsSlinky.winrtUwp.Windows.Storage.CreationCollisionOption
  ): IPromiseWithIAsyncOperation[typingsSlinky.winrtUwp.Windows.Storage.StorageFolder] = js.native
}
