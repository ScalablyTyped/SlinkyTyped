package typingsSlinky.winrtUwp.global.Windows.Storage

import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsSlinky.winrtUwp.Windows.System.User
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides access to common locations that contain user content. This includes content from a user's local libraries (such as Documents, Pictures, Music, and Videos), HomeGroup, removable devices, and media server devices. */
@JSGlobal("Windows.Storage.KnownFolders")
@js.native
abstract class KnownFolders ()
  extends typingsSlinky.winrtUwp.Windows.Storage.KnownFolders
object KnownFolders {
  
  @JSGlobal("Windows.Storage.KnownFolders")
  @js.native
  val ^ : js.Any = js.native
  
  /** Gets the App Captures folder. */
  /* static member */
  @JSGlobal("Windows.Storage.KnownFolders.appCaptures")
  @js.native
  def appCaptures: typingsSlinky.winrtUwp.Windows.Storage.StorageFolder = js.native
  @scala.inline
  def appCaptures_=(x: typingsSlinky.winrtUwp.Windows.Storage.StorageFolder): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("appCaptures")(x.asInstanceOf[js.Any])
  
  /** Gets the Camera Roll folder. */
  /* static member */
  @JSGlobal("Windows.Storage.KnownFolders.cameraRoll")
  @js.native
  def cameraRoll: typingsSlinky.winrtUwp.Windows.Storage.StorageFolder = js.native
  @scala.inline
  def cameraRoll_=(x: typingsSlinky.winrtUwp.Windows.Storage.StorageFolder): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cameraRoll")(x.asInstanceOf[js.Any])
  
  /** Gets the Documents library. The Documents library is not intended for general use. */
  /* static member */
  @JSGlobal("Windows.Storage.KnownFolders.documentsLibrary")
  @js.native
  def documentsLibrary: typingsSlinky.winrtUwp.Windows.Storage.StorageFolder = js.native
  @scala.inline
  def documentsLibrary_=(x: typingsSlinky.winrtUwp.Windows.Storage.StorageFolder): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("documentsLibrary")(x.asInstanceOf[js.Any])
  
  /**
    * Static method that returns a specified known folder for a User .
    * @param user The User for which the folder is returned.
    * @param folderId The ID of the folder to be returned.
    * @return When this method completes, it returns the requested StorageFolder object.
    */
  /* static member */
  @JSGlobal("Windows.Storage.KnownFolders.getFolderForUserAsync")
  @js.native
  def getFolderForUserAsync(user: User, folderId: typingsSlinky.winrtUwp.Windows.Storage.KnownFolderId): IPromiseWithIAsyncOperation[typingsSlinky.winrtUwp.Windows.Storage.StorageFolder] = js.native
  
  /** Gets the HomeGroup folder. */
  /* static member */
  @JSGlobal("Windows.Storage.KnownFolders.homeGroup")
  @js.native
  def homeGroup: typingsSlinky.winrtUwp.Windows.Storage.StorageFolder = js.native
  @scala.inline
  def homeGroup_=(x: typingsSlinky.winrtUwp.Windows.Storage.StorageFolder): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("homeGroup")(x.asInstanceOf[js.Any])
  
  /** Gets the folder of media server (DLNA) devices. */
  /* static member */
  @JSGlobal("Windows.Storage.KnownFolders.mediaServerDevices")
  @js.native
  def mediaServerDevices: typingsSlinky.winrtUwp.Windows.Storage.StorageFolder = js.native
  @scala.inline
  def mediaServerDevices_=(x: typingsSlinky.winrtUwp.Windows.Storage.StorageFolder): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mediaServerDevices")(x.asInstanceOf[js.Any])
  
  /** Gets the Music library. */
  /* static member */
  @JSGlobal("Windows.Storage.KnownFolders.musicLibrary")
  @js.native
  def musicLibrary: typingsSlinky.winrtUwp.Windows.Storage.StorageFolder = js.native
  @scala.inline
  def musicLibrary_=(x: typingsSlinky.winrtUwp.Windows.Storage.StorageFolder): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("musicLibrary")(x.asInstanceOf[js.Any])
  
  /** Gets the Objects 3D folder. */
  /* static member */
  @JSGlobal("Windows.Storage.KnownFolders.objects3D")
  @js.native
  def objects3D: typingsSlinky.winrtUwp.Windows.Storage.StorageFolder = js.native
  @scala.inline
  def objects3D_=(x: typingsSlinky.winrtUwp.Windows.Storage.StorageFolder): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("objects3D")(x.asInstanceOf[js.Any])
  
  /** Gets the Pictures library. */
  /* static member */
  @JSGlobal("Windows.Storage.KnownFolders.picturesLibrary")
  @js.native
  def picturesLibrary: typingsSlinky.winrtUwp.Windows.Storage.StorageFolder = js.native
  @scala.inline
  def picturesLibrary_=(x: typingsSlinky.winrtUwp.Windows.Storage.StorageFolder): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("picturesLibrary")(x.asInstanceOf[js.Any])
  
  /** Gets the play lists folder. */
  /* static member */
  @JSGlobal("Windows.Storage.KnownFolders.playlists")
  @js.native
  def playlists: typingsSlinky.winrtUwp.Windows.Storage.StorageFolder = js.native
  @scala.inline
  def playlists_=(x: typingsSlinky.winrtUwp.Windows.Storage.StorageFolder): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("playlists")(x.asInstanceOf[js.Any])
  
  /** Gets the recorded calls folder. */
  /* static member */
  @JSGlobal("Windows.Storage.KnownFolders.recordedCalls")
  @js.native
  def recordedCalls: typingsSlinky.winrtUwp.Windows.Storage.StorageFolder = js.native
  @scala.inline
  def recordedCalls_=(x: typingsSlinky.winrtUwp.Windows.Storage.StorageFolder): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("recordedCalls")(x.asInstanceOf[js.Any])
  
  /** Gets the removable devices folder. */
  /* static member */
  @JSGlobal("Windows.Storage.KnownFolders.removableDevices")
  @js.native
  def removableDevices: typingsSlinky.winrtUwp.Windows.Storage.StorageFolder = js.native
  @scala.inline
  def removableDevices_=(x: typingsSlinky.winrtUwp.Windows.Storage.StorageFolder): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("removableDevices")(x.asInstanceOf[js.Any])
  
  /** Gets the Saved Pictures folder. */
  /* static member */
  @JSGlobal("Windows.Storage.KnownFolders.savedPictures")
  @js.native
  def savedPictures: typingsSlinky.winrtUwp.Windows.Storage.StorageFolder = js.native
  @scala.inline
  def savedPictures_=(x: typingsSlinky.winrtUwp.Windows.Storage.StorageFolder): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("savedPictures")(x.asInstanceOf[js.Any])
  
  /** Gets the Videos library. */
  /* static member */
  @JSGlobal("Windows.Storage.KnownFolders.videosLibrary")
  @js.native
  def videosLibrary: typingsSlinky.winrtUwp.Windows.Storage.StorageFolder = js.native
  @scala.inline
  def videosLibrary_=(x: typingsSlinky.winrtUwp.Windows.Storage.StorageFolder): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("videosLibrary")(x.asInstanceOf[js.Any])
}
