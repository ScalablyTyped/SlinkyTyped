package typingsSlinky.winrtUwp.global.Windows.Media

import typingsSlinky.winrtUwp.Windows.Foundation.EventHandler
import typingsSlinky.winrtUwp.Windows.Foundation.Uri
import typingsSlinky.winrtUwp.winrtUwpStrings.channeldownpressed
import typingsSlinky.winrtUwp.winrtUwpStrings.channeluppressed
import typingsSlinky.winrtUwp.winrtUwpStrings.fastforwardpressed
import typingsSlinky.winrtUwp.winrtUwpStrings.nexttrackpressed
import typingsSlinky.winrtUwp.winrtUwpStrings.pausepressed
import typingsSlinky.winrtUwp.winrtUwpStrings.playpausetogglepressed
import typingsSlinky.winrtUwp.winrtUwpStrings.playpressed
import typingsSlinky.winrtUwp.winrtUwpStrings.previoustrackpressed
import typingsSlinky.winrtUwp.winrtUwpStrings.recordpressed
import typingsSlinky.winrtUwp.winrtUwpStrings.rewindpressed
import typingsSlinky.winrtUwp.winrtUwpStrings.soundlevelchanged
import typingsSlinky.winrtUwp.winrtUwpStrings.stoppressed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Describes the object that applications register with, to receive media focus and transport control notifications. */
@JSGlobal("Windows.Media.MediaControl")
@js.native
abstract class MediaControl ()
  extends typingsSlinky.winrtUwp.Windows.Media.MediaControl
object MediaControl {
  
  @JSGlobal("Windows.Media.MediaControl")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("Windows.Media.MediaControl.addEventListener")
  @js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  /* static member */
  @JSGlobal("Windows.Media.MediaControl.addEventListener")
  @js.native
  def addEventListener_channeldownpressed(`type`: channeldownpressed, listener: EventHandler[_]): Unit = js.native
  /* static member */
  @JSGlobal("Windows.Media.MediaControl.addEventListener")
  @js.native
  def addEventListener_channeluppressed(`type`: channeluppressed, listener: EventHandler[_]): Unit = js.native
  /* static member */
  @JSGlobal("Windows.Media.MediaControl.addEventListener")
  @js.native
  def addEventListener_fastforwardpressed(`type`: fastforwardpressed, listener: EventHandler[_]): Unit = js.native
  /* static member */
  @JSGlobal("Windows.Media.MediaControl.addEventListener")
  @js.native
  def addEventListener_nexttrackpressed(`type`: nexttrackpressed, listener: EventHandler[_]): Unit = js.native
  /* static member */
  @JSGlobal("Windows.Media.MediaControl.addEventListener")
  @js.native
  def addEventListener_pausepressed(`type`: pausepressed, listener: EventHandler[_]): Unit = js.native
  /* static member */
  @JSGlobal("Windows.Media.MediaControl.addEventListener")
  @js.native
  def addEventListener_playpausetogglepressed(`type`: playpausetogglepressed, listener: EventHandler[_]): Unit = js.native
  /* static member */
  @JSGlobal("Windows.Media.MediaControl.addEventListener")
  @js.native
  def addEventListener_playpressed(`type`: playpressed, listener: EventHandler[_]): Unit = js.native
  /* static member */
  @JSGlobal("Windows.Media.MediaControl.addEventListener")
  @js.native
  def addEventListener_previoustrackpressed(`type`: previoustrackpressed, listener: EventHandler[_]): Unit = js.native
  /* static member */
  @JSGlobal("Windows.Media.MediaControl.addEventListener")
  @js.native
  def addEventListener_recordpressed(`type`: recordpressed, listener: EventHandler[_]): Unit = js.native
  /* static member */
  @JSGlobal("Windows.Media.MediaControl.addEventListener")
  @js.native
  def addEventListener_rewindpressed(`type`: rewindpressed, listener: EventHandler[_]): Unit = js.native
  /* static member */
  @JSGlobal("Windows.Media.MediaControl.addEventListener")
  @js.native
  def addEventListener_soundlevelchanged(`type`: soundlevelchanged, listener: EventHandler[_]): Unit = js.native
  /* static member */
  @JSGlobal("Windows.Media.MediaControl.addEventListener")
  @js.native
  def addEventListener_stoppressed(`type`: stoppressed, listener: EventHandler[_]): Unit = js.native
  
  /** Gets or sets the path to the artwork for the album cover. */
  /* static member */
  @JSGlobal("Windows.Media.MediaControl.albumArt")
  @js.native
  def albumArt: Uri = js.native
  @scala.inline
  def albumArt_=(x: Uri): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("albumArt")(x.asInstanceOf[js.Any])
  
  /** Gets or sets the name of the artist. */
  /* static member */
  @JSGlobal("Windows.Media.MediaControl.artistName")
  @js.native
  def artistName: String = js.native
  @scala.inline
  def artistName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("artistName")(x.asInstanceOf[js.Any])
  
  /** Gets or sets the state of the Play button. */
  /* static member */
  @JSGlobal("Windows.Media.MediaControl.isPlaying")
  @js.native
  def isPlaying: Boolean = js.native
  @scala.inline
  def isPlaying_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isPlaying")(x.asInstanceOf[js.Any])
  
  /** Event raised when a ChannelDown command is issued to the application. */
  /* static member */
  @JSGlobal("Windows.Media.MediaControl.onchanneldownpressed")
  @js.native
  def onchanneldownpressed: EventHandler[js.Any] = js.native
  @scala.inline
  def onchanneldownpressed_=(x: EventHandler[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onchanneldownpressed")(x.asInstanceOf[js.Any])
  
  /** Event raised when a ChannelUp command is issued to the application. */
  /* static member */
  @JSGlobal("Windows.Media.MediaControl.onchanneluppressed")
  @js.native
  def onchanneluppressed: EventHandler[js.Any] = js.native
  @scala.inline
  def onchanneluppressed_=(x: EventHandler[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onchanneluppressed")(x.asInstanceOf[js.Any])
  
  /** Event raised when a FastForward command is issued to the application. */
  /* static member */
  @JSGlobal("Windows.Media.MediaControl.onfastforwardpressed")
  @js.native
  def onfastforwardpressed: EventHandler[js.Any] = js.native
  @scala.inline
  def onfastforwardpressed_=(x: EventHandler[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onfastforwardpressed")(x.asInstanceOf[js.Any])
  
  /** Event raised when a NextTrack command is issued to the application. */
  /* static member */
  @JSGlobal("Windows.Media.MediaControl.onnexttrackpressed")
  @js.native
  def onnexttrackpressed: EventHandler[js.Any] = js.native
  @scala.inline
  def onnexttrackpressed_=(x: EventHandler[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onnexttrackpressed")(x.asInstanceOf[js.Any])
  
  /** Event raised when a Pause command is issued to the application. */
  /* static member */
  @JSGlobal("Windows.Media.MediaControl.onpausepressed")
  @js.native
  def onpausepressed: EventHandler[js.Any] = js.native
  @scala.inline
  def onpausepressed_=(x: EventHandler[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onpausepressed")(x.asInstanceOf[js.Any])
  
  /** Event raised when a PlayPauseToggle command is issued to the application. */
  /* static member */
  @JSGlobal("Windows.Media.MediaControl.onplaypausetogglepressed")
  @js.native
  def onplaypausetogglepressed: EventHandler[js.Any] = js.native
  @scala.inline
  def onplaypausetogglepressed_=(x: EventHandler[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onplaypausetogglepressed")(x.asInstanceOf[js.Any])
  
  /** Event raised when a Play command is issued to the application. */
  /* static member */
  @JSGlobal("Windows.Media.MediaControl.onplaypressed")
  @js.native
  def onplaypressed: EventHandler[js.Any] = js.native
  @scala.inline
  def onplaypressed_=(x: EventHandler[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onplaypressed")(x.asInstanceOf[js.Any])
  
  /** Event raised when a PreviousTrack command is issued to the application. */
  /* static member */
  @JSGlobal("Windows.Media.MediaControl.onprevioustrackpressed")
  @js.native
  def onprevioustrackpressed: EventHandler[js.Any] = js.native
  @scala.inline
  def onprevioustrackpressed_=(x: EventHandler[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onprevioustrackpressed")(x.asInstanceOf[js.Any])
  
  /** Event raised when a Record command is issued to the application. */
  /* static member */
  @JSGlobal("Windows.Media.MediaControl.onrecordpressed")
  @js.native
  def onrecordpressed: EventHandler[js.Any] = js.native
  @scala.inline
  def onrecordpressed_=(x: EventHandler[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onrecordpressed")(x.asInstanceOf[js.Any])
  
  /** Event raised when a Rewind command is issued to the application. */
  /* static member */
  @JSGlobal("Windows.Media.MediaControl.onrewindpressed")
  @js.native
  def onrewindpressed: EventHandler[js.Any] = js.native
  @scala.inline
  def onrewindpressed_=(x: EventHandler[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onrewindpressed")(x.asInstanceOf[js.Any])
  
  /** Event raised when the sound level changes. */
  /* static member */
  @JSGlobal("Windows.Media.MediaControl.onsoundlevelchanged")
  @js.native
  def onsoundlevelchanged: EventHandler[js.Any] = js.native
  @scala.inline
  def onsoundlevelchanged_=(x: EventHandler[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onsoundlevelchanged")(x.asInstanceOf[js.Any])
  
  /** Event raised when a Stop command is issued to the application. */
  /* static member */
  @JSGlobal("Windows.Media.MediaControl.onstoppressed")
  @js.native
  def onstoppressed: EventHandler[js.Any] = js.native
  @scala.inline
  def onstoppressed_=(x: EventHandler[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onstoppressed")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Windows.Media.MediaControl.removeEventListener")
  @js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  /* static member */
  @JSGlobal("Windows.Media.MediaControl.removeEventListener")
  @js.native
  def removeEventListener_channeldownpressed(`type`: channeldownpressed, listener: EventHandler[_]): Unit = js.native
  /* static member */
  @JSGlobal("Windows.Media.MediaControl.removeEventListener")
  @js.native
  def removeEventListener_channeluppressed(`type`: channeluppressed, listener: EventHandler[_]): Unit = js.native
  /* static member */
  @JSGlobal("Windows.Media.MediaControl.removeEventListener")
  @js.native
  def removeEventListener_fastforwardpressed(`type`: fastforwardpressed, listener: EventHandler[_]): Unit = js.native
  /* static member */
  @JSGlobal("Windows.Media.MediaControl.removeEventListener")
  @js.native
  def removeEventListener_nexttrackpressed(`type`: nexttrackpressed, listener: EventHandler[_]): Unit = js.native
  /* static member */
  @JSGlobal("Windows.Media.MediaControl.removeEventListener")
  @js.native
  def removeEventListener_pausepressed(`type`: pausepressed, listener: EventHandler[_]): Unit = js.native
  /* static member */
  @JSGlobal("Windows.Media.MediaControl.removeEventListener")
  @js.native
  def removeEventListener_playpausetogglepressed(`type`: playpausetogglepressed, listener: EventHandler[_]): Unit = js.native
  /* static member */
  @JSGlobal("Windows.Media.MediaControl.removeEventListener")
  @js.native
  def removeEventListener_playpressed(`type`: playpressed, listener: EventHandler[_]): Unit = js.native
  /* static member */
  @JSGlobal("Windows.Media.MediaControl.removeEventListener")
  @js.native
  def removeEventListener_previoustrackpressed(`type`: previoustrackpressed, listener: EventHandler[_]): Unit = js.native
  /* static member */
  @JSGlobal("Windows.Media.MediaControl.removeEventListener")
  @js.native
  def removeEventListener_recordpressed(`type`: recordpressed, listener: EventHandler[_]): Unit = js.native
  /* static member */
  @JSGlobal("Windows.Media.MediaControl.removeEventListener")
  @js.native
  def removeEventListener_rewindpressed(`type`: rewindpressed, listener: EventHandler[_]): Unit = js.native
  /* static member */
  @JSGlobal("Windows.Media.MediaControl.removeEventListener")
  @js.native
  def removeEventListener_soundlevelchanged(`type`: soundlevelchanged, listener: EventHandler[_]): Unit = js.native
  /* static member */
  @JSGlobal("Windows.Media.MediaControl.removeEventListener")
  @js.native
  def removeEventListener_stoppressed(`type`: stoppressed, listener: EventHandler[_]): Unit = js.native
  
  /** Gets the current sound level. */
  /* static member */
  @JSGlobal("Windows.Media.MediaControl.soundLevel")
  @js.native
  def soundLevel: typingsSlinky.winrtUwp.Windows.Media.SoundLevel = js.native
  @scala.inline
  def soundLevel_=(x: typingsSlinky.winrtUwp.Windows.Media.SoundLevel): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("soundLevel")(x.asInstanceOf[js.Any])
  
  /** Gets or sets the track name. */
  /* static member */
  @JSGlobal("Windows.Media.MediaControl.trackName")
  @js.native
  def trackName: String = js.native
  @scala.inline
  def trackName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("trackName")(x.asInstanceOf[js.Any])
}
