package typingsSlinky.winrtUwp.Windows.Media

import typingsSlinky.winrtUwp.Windows.Foundation.EventHandler
import typingsSlinky.winrtUwp.Windows.Foundation.TypedEventHandler
import typingsSlinky.winrtUwp.Windows.WinRTEvent
import typingsSlinky.winrtUwp.winrtUwpStrings.autorepeatmodechangerequested
import typingsSlinky.winrtUwp.winrtUwpStrings.buttonpressed
import typingsSlinky.winrtUwp.winrtUwpStrings.playbackpositionchangerequested
import typingsSlinky.winrtUwp.winrtUwpStrings.playbackratechangerequested
import typingsSlinky.winrtUwp.winrtUwpStrings.propertychanged
import typingsSlinky.winrtUwp.winrtUwpStrings.shuffleenabledchangerequested
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an object that enables integrate with the system media transport controls and support for media commands. */
@js.native
trait SystemMediaTransportControls extends StObject {
  
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_autorepeatmodechangerequested(
    `type`: autorepeatmodechangerequested,
    listener: TypedEventHandler[SystemMediaTransportControls, AutoRepeatModeChangeRequestedEventArgs]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_buttonpressed(
    `type`: buttonpressed,
    listener: TypedEventHandler[SystemMediaTransportControls, SystemMediaTransportControlsButtonPressedEventArgs]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_playbackpositionchangerequested(
    `type`: playbackpositionchangerequested,
    listener: TypedEventHandler[SystemMediaTransportControls, PlaybackPositionChangeRequestedEventArgs]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_playbackratechangerequested(`type`: playbackratechangerequested, listener: TypedEventHandler[SystemMediaTransportControls, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_propertychanged(
    `type`: propertychanged,
    listener: TypedEventHandler[SystemMediaTransportControls, SystemMediaTransportControlsPropertyChangedEventArgs]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_shuffleenabledchangerequested(
    `type`: shuffleenabledchangerequested,
    listener: TypedEventHandler[SystemMediaTransportControls, ShuffleEnabledChangeRequestedEventArgs]
  ): Unit = js.native
  
  /** Gets or sets a value representing the current auto-repeat mode of the SystemMediaTransportControls . */
  var autoRepeatMode: MediaPlaybackAutoRepeatMode = js.native
  
  /** Gets the display updater for the SystemMediaTransportControls which enable updating the information displayed about the currently playing song. */
  var displayUpdater: SystemMediaTransportControlsDisplayUpdater = js.native
  
  /** Gets or sets a value that specifies if the channel down button is supported. */
  var isChannelDownEnabled: Boolean = js.native
  
  /** Gets or sets a value that specifies if the channel up button is supported. */
  var isChannelUpEnabled: Boolean = js.native
  
  /** Enables and disables the system media transport controls for the app. */
  var isEnabled: Boolean = js.native
  
  /** Gets or sets a value that specifies if the fast forward button is supported. */
  var isFastForwardEnabled: Boolean = js.native
  
  /** Gets or sets a value that specifies if the next button is supported. */
  var isNextEnabled: Boolean = js.native
  
  /** Gets or sets a value that specifies if the pause button is supported. true if the pause button is supported; otherwise, false. */
  var isPauseEnabled: Boolean = js.native
  
  /** Gets or sets a value that specifies if the play button is supported. */
  var isPlayEnabled: Boolean = js.native
  
  /** Gets or sets a value that specifies if the previous button is supported. */
  var isPreviousEnabled: Boolean = js.native
  
  /** Gets or sets a value that specifies if the record button is supported. true if the record button is supported; otherwise, false. */
  var isRecordEnabled: Boolean = js.native
  
  /** Gets or sets a value that specifies if the rewind button is supported. */
  var isRewindEnabled: Boolean = js.native
  
  /** Gets or sets a value that specifies if the stop button is supported. */
  var isStopEnabled: Boolean = js.native
  
  /** Occurs when the user modifies the SystemMediaTransportControls auto-repeat mode. */
  def onautorepeatmodechangerequested(ev: AutoRepeatModeChangeRequestedEventArgs with WinRTEvent[SystemMediaTransportControls]): Unit = js.native
  /** Occurs when the user modifies the SystemMediaTransportControls auto-repeat mode. */
  @JSName("onautorepeatmodechangerequested")
  var onautorepeatmodechangerequested_Original: TypedEventHandler[SystemMediaTransportControls, AutoRepeatModeChangeRequestedEventArgs] = js.native
  
  /** Occurs when a button is pressed on the SystemMediaTransportControls . */
  def onbuttonpressed(
    ev: SystemMediaTransportControlsButtonPressedEventArgs with WinRTEvent[SystemMediaTransportControls]
  ): Unit = js.native
  /** Occurs when a button is pressed on the SystemMediaTransportControls . */
  @JSName("onbuttonpressed")
  var onbuttonpressed_Original: TypedEventHandler[SystemMediaTransportControls, SystemMediaTransportControlsButtonPressedEventArgs] = js.native
  
  /** Occurs when the user modifies the playback position of the SystemMediaTransportControls . */
  def onplaybackpositionchangerequested(ev: PlaybackPositionChangeRequestedEventArgs with WinRTEvent[SystemMediaTransportControls]): Unit = js.native
  /** Occurs when the user modifies the playback position of the SystemMediaTransportControls . */
  @JSName("onplaybackpositionchangerequested")
  var onplaybackpositionchangerequested_Original: TypedEventHandler[SystemMediaTransportControls, PlaybackPositionChangeRequestedEventArgs] = js.native
  
  /** Occurs when the user modifies the SystemMediaTransportControls playback rate. */
  def onplaybackratechangerequested(ev: js.Any with WinRTEvent[SystemMediaTransportControls]): Unit = js.native
  /** Occurs when the user modifies the SystemMediaTransportControls playback rate. */
  @JSName("onplaybackratechangerequested")
  var onplaybackratechangerequested_Original: TypedEventHandler[SystemMediaTransportControls, _] = js.native
  
  /** Occurs when a property on the SystemMediaTransportControls has changed. */
  def onpropertychanged(
    ev: SystemMediaTransportControlsPropertyChangedEventArgs with WinRTEvent[SystemMediaTransportControls]
  ): Unit = js.native
  /** Occurs when a property on the SystemMediaTransportControls has changed. */
  @JSName("onpropertychanged")
  var onpropertychanged_Original: TypedEventHandler[SystemMediaTransportControls, SystemMediaTransportControlsPropertyChangedEventArgs] = js.native
  
  /** Occurs when the user modifies the SystemMediaTransportControls shuffle state. */
  def onshuffleenabledchangerequested(ev: ShuffleEnabledChangeRequestedEventArgs with WinRTEvent[SystemMediaTransportControls]): Unit = js.native
  /** Occurs when the user modifies the SystemMediaTransportControls shuffle state. */
  @JSName("onshuffleenabledchangerequested")
  var onshuffleenabledchangerequested_Original: TypedEventHandler[SystemMediaTransportControls, ShuffleEnabledChangeRequestedEventArgs] = js.native
  
  /** Gets or sets the playback rate of the SystemMediaTransportControls . */
  var playbackRate: Double = js.native
  
  /** Gets the playback status of the media. */
  var playbackStatus: MediaPlaybackStatus = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_autorepeatmodechangerequested(
    `type`: autorepeatmodechangerequested,
    listener: TypedEventHandler[SystemMediaTransportControls, AutoRepeatModeChangeRequestedEventArgs]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_buttonpressed(
    `type`: buttonpressed,
    listener: TypedEventHandler[SystemMediaTransportControls, SystemMediaTransportControlsButtonPressedEventArgs]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_playbackpositionchangerequested(
    `type`: playbackpositionchangerequested,
    listener: TypedEventHandler[SystemMediaTransportControls, PlaybackPositionChangeRequestedEventArgs]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_playbackratechangerequested(`type`: playbackratechangerequested, listener: TypedEventHandler[SystemMediaTransportControls, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_propertychanged(
    `type`: propertychanged,
    listener: TypedEventHandler[SystemMediaTransportControls, SystemMediaTransportControlsPropertyChangedEventArgs]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_shuffleenabledchangerequested(
    `type`: shuffleenabledchangerequested,
    listener: TypedEventHandler[SystemMediaTransportControls, ShuffleEnabledChangeRequestedEventArgs]
  ): Unit = js.native
  
  /** Gets or sets a value representing the current shuffle state of the SystemMediaTransportControls . */
  var shuffleEnabled: Boolean = js.native
  
  /** Gets the sound level of the media for the capture and render streams. */
  var soundLevel: SoundLevel = js.native
  
  /**
    * Updates the SystemMediaTransportControls timeline properties with the values in the provided object.
    * @param timelineProperties The object representing the new timeline property values.
    */
  def updateTimelineProperties(timelineProperties: SystemMediaTransportControlsTimelineProperties): Unit = js.native
}
