package typingsSlinky.winrtUwp.global.Windows.Storage

import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsSlinky.winrtUwp.Windows.System.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides access to common locations that contain user content. This includes content from a user's local libraries (such as Documents, Pictures, Music, and Videos), HomeGroup, removable devices, and media server devices. */
@JSGlobal("Windows.Storage.KnownFolders")
@js.native
abstract class KnownFolders ()
  extends typingsSlinky.winrtUwp.Windows.Storage.KnownFolders
/* static members */
@JSGlobal("Windows.Storage.KnownFolders")
@js.native
object KnownFolders extends js.Object {
  
  /** Gets the App Captures folder. */
  var appCaptures: typingsSlinky.winrtUwp.Windows.Storage.StorageFolder = js.native
  
  /** Gets the Camera Roll folder. */
  var cameraRoll: typingsSlinky.winrtUwp.Windows.Storage.StorageFolder = js.native
  
  /** Gets the Documents library. The Documents library is not intended for general use. */
  var documentsLibrary: typingsSlinky.winrtUwp.Windows.Storage.StorageFolder = js.native
  
  /**
    * Static method that returns a specified known folder for a User .
    * @param user The User for which the folder is returned.
    * @param folderId The ID of the folder to be returned.
    * @return When this method completes, it returns the requested StorageFolder object.
    */
  def getFolderForUserAsync(user: User, folderId: typingsSlinky.winrtUwp.Windows.Storage.KnownFolderId): IPromiseWithIAsyncOperation[typingsSlinky.winrtUwp.Windows.Storage.StorageFolder] = js.native
  
  /** Gets the HomeGroup folder. */
  var homeGroup: typingsSlinky.winrtUwp.Windows.Storage.StorageFolder = js.native
  
  /** Gets the folder of media server (DLNA) devices. */
  var mediaServerDevices: typingsSlinky.winrtUwp.Windows.Storage.StorageFolder = js.native
  
  /** Gets the Music library. */
  var musicLibrary: typingsSlinky.winrtUwp.Windows.Storage.StorageFolder = js.native
  
  /** Gets the Objects 3D folder. */
  var objects3D: typingsSlinky.winrtUwp.Windows.Storage.StorageFolder = js.native
  
  /** Gets the Pictures library. */
  var picturesLibrary: typingsSlinky.winrtUwp.Windows.Storage.StorageFolder = js.native
  
  /** Gets the play lists folder. */
  var playlists: typingsSlinky.winrtUwp.Windows.Storage.StorageFolder = js.native
  
  /** Gets the recorded calls folder. */
  var recordedCalls: typingsSlinky.winrtUwp.Windows.Storage.StorageFolder = js.native
  
  /** Gets the removable devices folder. */
  var removableDevices: typingsSlinky.winrtUwp.Windows.Storage.StorageFolder = js.native
  
  /** Gets the Saved Pictures folder. */
  var savedPictures: typingsSlinky.winrtUwp.Windows.Storage.StorageFolder = js.native
  
  /** Gets the Videos library. */
  var videosLibrary: typingsSlinky.winrtUwp.Windows.Storage.StorageFolder = js.native
}
