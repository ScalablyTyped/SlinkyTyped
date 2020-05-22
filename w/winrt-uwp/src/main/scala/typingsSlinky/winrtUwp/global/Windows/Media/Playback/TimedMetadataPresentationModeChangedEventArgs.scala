package typingsSlinky.winrtUwp.global.Windows.Media.Playback

import typingsSlinky.winrtUwp.Windows.Media.Core.TimedMetadataTrack
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the MediaPlaybackTimedMetadataTrackList::PresentationModeChanged event. */
@JSGlobal("Windows.Media.Playback.TimedMetadataPresentationModeChangedEventArgs")
@js.native
abstract class TimedMetadataPresentationModeChangedEventArgs ()
  extends typingsSlinky.winrtUwp.Windows.Media.Playback.TimedMetadataPresentationModeChangedEventArgs {
  /** Gets the new presentation mode. */
  /* CompleteClass */
  override var newPresentationMode: typingsSlinky.winrtUwp.Windows.Media.Playback.TimedMetadataTrackPresentationMode = js.native
  /** Gets the old presentation mode. */
  /* CompleteClass */
  override var oldPresentationMode: typingsSlinky.winrtUwp.Windows.Media.Playback.TimedMetadataTrackPresentationMode = js.native
  /** Gets the TimedMetadataTrack associated with the presentation mode change. */
  /* CompleteClass */
  override var track: TimedMetadataTrack = js.native
}

