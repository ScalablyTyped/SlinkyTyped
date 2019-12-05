package typingsSlinky.winrtDashUwp.Windows.Storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait KnownFolderId extends js.Object

/** Provides values that identify storage folders. */
@JSGlobal("Windows.Storage.KnownFolderId")
@js.native
object KnownFolderId extends js.Object {
  /** App Captures folder. */
  @js.native
  sealed trait appCaptures extends KnownFolderId
  
  /** Camera Roll folder. */
  @js.native
  sealed trait cameraRoll extends KnownFolderId
  
  /** Documents library folder. */
  @js.native
  sealed trait documentsLibrary extends KnownFolderId
  
  /** HomeGroup folder. */
  @js.native
  sealed trait homeGroup extends KnownFolderId
  
  /** The folder of media server (DLNA) devices. */
  @js.native
  sealed trait mediaServerDevices extends KnownFolderId
  
  /** Music library folder. */
  @js.native
  sealed trait musicLibrary extends KnownFolderId
  
  /** Objects 3D folder. */
  @js.native
  sealed trait objects3D extends KnownFolderId
  
  /** Pictures library folder. */
  @js.native
  sealed trait picturesLibrary extends KnownFolderId
  
  /** Playlists folder. */
  @js.native
  sealed trait playlists extends KnownFolderId
  
  /** Recorded calls folder. */
  @js.native
  sealed trait recordedCalls extends KnownFolderId
  
  /** Removable devices folder. */
  @js.native
  sealed trait removableDevices extends KnownFolderId
  
  /** Saved pictures folder. */
  @js.native
  sealed trait savedPictures extends KnownFolderId
  
  /** Screenshots folder. */
  @js.native
  sealed trait screenshots extends KnownFolderId
  
  /** Videos library folder. */
  @js.native
  sealed trait videosLibrary extends KnownFolderId
  
  /* 0 */ val appCaptures: typingsSlinky.winrtDashUwp.Windows.Storage.KnownFolderId.appCaptures with Double = js.native
  /* 1 */ val cameraRoll: typingsSlinky.winrtDashUwp.Windows.Storage.KnownFolderId.cameraRoll with Double = js.native
  /* 2 */ val documentsLibrary: typingsSlinky.winrtDashUwp.Windows.Storage.KnownFolderId.documentsLibrary with Double = js.native
  /* 3 */ val homeGroup: typingsSlinky.winrtDashUwp.Windows.Storage.KnownFolderId.homeGroup with Double = js.native
  /* 4 */ val mediaServerDevices: typingsSlinky.winrtDashUwp.Windows.Storage.KnownFolderId.mediaServerDevices with Double = js.native
  /* 5 */ val musicLibrary: typingsSlinky.winrtDashUwp.Windows.Storage.KnownFolderId.musicLibrary with Double = js.native
  /* 6 */ val objects3D: typingsSlinky.winrtDashUwp.Windows.Storage.KnownFolderId.objects3D with Double = js.native
  /* 7 */ val picturesLibrary: typingsSlinky.winrtDashUwp.Windows.Storage.KnownFolderId.picturesLibrary with Double = js.native
  /* 8 */ val playlists: typingsSlinky.winrtDashUwp.Windows.Storage.KnownFolderId.playlists with Double = js.native
  /* 9 */ val recordedCalls: typingsSlinky.winrtDashUwp.Windows.Storage.KnownFolderId.recordedCalls with Double = js.native
  /* 10 */ val removableDevices: typingsSlinky.winrtDashUwp.Windows.Storage.KnownFolderId.removableDevices with Double = js.native
  /* 11 */ val savedPictures: typingsSlinky.winrtDashUwp.Windows.Storage.KnownFolderId.savedPictures with Double = js.native
  /* 12 */ val screenshots: typingsSlinky.winrtDashUwp.Windows.Storage.KnownFolderId.screenshots with Double = js.native
  /* 13 */ val videosLibrary: typingsSlinky.winrtDashUwp.Windows.Storage.KnownFolderId.videosLibrary with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[KnownFolderId with Double] = js.native
}

