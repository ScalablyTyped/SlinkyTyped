package typingsSlinky.winrtUwp.global.Windows.Media

import typingsSlinky.winrtUwp.Windows.Foundation.EventHandler
import typingsSlinky.winrtUwp.Windows.Foundation.Uri
import typingsSlinky.winrtUwp.Windows.WinRTEvent
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Describes the object that applications register with, to receive media focus and transport control notifications. */
@JSGlobal("Windows.Media.MediaControl")
@js.native
abstract class MediaControl ()
  extends typingsSlinky.winrtUwp.Windows.Media.MediaControl
/* static members */
@JSGlobal("Windows.Media.MediaControl")
@js.native
object MediaControl extends js.Object {
  
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_channeldownpressed(`type`: channeldownpressed, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_channeluppressed(`type`: channeluppressed, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_fastforwardpressed(`type`: fastforwardpressed, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_nexttrackpressed(`type`: nexttrackpressed, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pausepressed(`type`: pausepressed, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_playpausetogglepressed(`type`: playpausetogglepressed, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_playpressed(`type`: playpressed, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_previoustrackpressed(`type`: previoustrackpressed, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_recordpressed(`type`: recordpressed, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rewindpressed(`type`: rewindpressed, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_soundlevelchanged(`type`: soundlevelchanged, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stoppressed(`type`: stoppressed, listener: EventHandler[_]): Unit = js.native
  
  /** Gets or sets the path to the artwork for the album cover. */
  var albumArt: Uri = js.native
  
  /** Gets or sets the name of the artist. */
  var artistName: String = js.native
  
  /** Gets or sets the state of the Play button. */
  var isPlaying: Boolean = js.native
  
  /** Event raised when a ChannelDown command is issued to the application. */
  def onchanneldownpressed(ev: js.Any with WinRTEvent[_]): Unit = js.native
  /** Event raised when a ChannelDown command is issued to the application. */
  @JSName("onchanneldownpressed")
  var onchanneldownpressed_Original: EventHandler[_] = js.native
  
  /** Event raised when a ChannelUp command is issued to the application. */
  def onchanneluppressed(ev: js.Any with WinRTEvent[_]): Unit = js.native
  /** Event raised when a ChannelUp command is issued to the application. */
  @JSName("onchanneluppressed")
  var onchanneluppressed_Original: EventHandler[_] = js.native
  
  /** Event raised when a FastForward command is issued to the application. */
  def onfastforwardpressed(ev: js.Any with WinRTEvent[_]): Unit = js.native
  /** Event raised when a FastForward command is issued to the application. */
  @JSName("onfastforwardpressed")
  var onfastforwardpressed_Original: EventHandler[_] = js.native
  
  /** Event raised when a NextTrack command is issued to the application. */
  def onnexttrackpressed(ev: js.Any with WinRTEvent[_]): Unit = js.native
  /** Event raised when a NextTrack command is issued to the application. */
  @JSName("onnexttrackpressed")
  var onnexttrackpressed_Original: EventHandler[_] = js.native
  
  /** Event raised when a Pause command is issued to the application. */
  def onpausepressed(ev: js.Any with WinRTEvent[_]): Unit = js.native
  /** Event raised when a Pause command is issued to the application. */
  @JSName("onpausepressed")
  var onpausepressed_Original: EventHandler[_] = js.native
  
  /** Event raised when a PlayPauseToggle command is issued to the application. */
  def onplaypausetogglepressed(ev: js.Any with WinRTEvent[_]): Unit = js.native
  /** Event raised when a PlayPauseToggle command is issued to the application. */
  @JSName("onplaypausetogglepressed")
  var onplaypausetogglepressed_Original: EventHandler[_] = js.native
  
  /** Event raised when a Play command is issued to the application. */
  def onplaypressed(ev: js.Any with WinRTEvent[_]): Unit = js.native
  /** Event raised when a Play command is issued to the application. */
  @JSName("onplaypressed")
  var onplaypressed_Original: EventHandler[_] = js.native
  
  /** Event raised when a PreviousTrack command is issued to the application. */
  def onprevioustrackpressed(ev: js.Any with WinRTEvent[_]): Unit = js.native
  /** Event raised when a PreviousTrack command is issued to the application. */
  @JSName("onprevioustrackpressed")
  var onprevioustrackpressed_Original: EventHandler[_] = js.native
  
  /** Event raised when a Record command is issued to the application. */
  def onrecordpressed(ev: js.Any with WinRTEvent[_]): Unit = js.native
  /** Event raised when a Record command is issued to the application. */
  @JSName("onrecordpressed")
  var onrecordpressed_Original: EventHandler[_] = js.native
  
  /** Event raised when a Rewind command is issued to the application. */
  def onrewindpressed(ev: js.Any with WinRTEvent[_]): Unit = js.native
  /** Event raised when a Rewind command is issued to the application. */
  @JSName("onrewindpressed")
  var onrewindpressed_Original: EventHandler[_] = js.native
  
  /** Event raised when the sound level changes. */
  def onsoundlevelchanged(ev: js.Any with WinRTEvent[_]): Unit = js.native
  /** Event raised when the sound level changes. */
  @JSName("onsoundlevelchanged")
  var onsoundlevelchanged_Original: EventHandler[_] = js.native
  
  /** Event raised when a Stop command is issued to the application. */
  def onstoppressed(ev: js.Any with WinRTEvent[_]): Unit = js.native
  /** Event raised when a Stop command is issued to the application. */
  @JSName("onstoppressed")
  var onstoppressed_Original: EventHandler[_] = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_channeldownpressed(`type`: channeldownpressed, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_channeluppressed(`type`: channeluppressed, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_fastforwardpressed(`type`: fastforwardpressed, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_nexttrackpressed(`type`: nexttrackpressed, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pausepressed(`type`: pausepressed, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_playpausetogglepressed(`type`: playpausetogglepressed, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_playpressed(`type`: playpressed, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_previoustrackpressed(`type`: previoustrackpressed, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_recordpressed(`type`: recordpressed, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_rewindpressed(`type`: rewindpressed, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_soundlevelchanged(`type`: soundlevelchanged, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_stoppressed(`type`: stoppressed, listener: EventHandler[_]): Unit = js.native
  
  /** Gets the current sound level. */
  var soundLevel: typingsSlinky.winrtUwp.Windows.Media.SoundLevel = js.native
  
  /** Gets or sets the track name. */
  var trackName: String = js.native
}
