package typingsSlinky.winrtUwp.Windows.Media.Playback

import typingsSlinky.winrtUwp.Windows.Media.Core.TimedMetadataTrack
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the MediaPlaybackTimedMetadataTrackList::PresentationModeChanged event. */
@js.native
trait TimedMetadataPresentationModeChangedEventArgs extends js.Object {
  /** Gets the new presentation mode. */
  var newPresentationMode: TimedMetadataTrackPresentationMode = js.native
  /** Gets the old presentation mode. */
  var oldPresentationMode: TimedMetadataTrackPresentationMode = js.native
  /** Gets the TimedMetadataTrack associated with the presentation mode change. */
  var track: TimedMetadataTrack = js.native
}

object TimedMetadataPresentationModeChangedEventArgs {
  @scala.inline
  def apply(
    newPresentationMode: TimedMetadataTrackPresentationMode,
    oldPresentationMode: TimedMetadataTrackPresentationMode,
    track: TimedMetadataTrack
  ): TimedMetadataPresentationModeChangedEventArgs = {
    val __obj = js.Dynamic.literal(newPresentationMode = newPresentationMode.asInstanceOf[js.Any], oldPresentationMode = oldPresentationMode.asInstanceOf[js.Any], track = track.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimedMetadataPresentationModeChangedEventArgs]
  }
  @scala.inline
  implicit class TimedMetadataPresentationModeChangedEventArgsOps[Self <: TimedMetadataPresentationModeChangedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNewPresentationMode(value: TimedMetadataTrackPresentationMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newPresentationMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOldPresentationMode(value: TimedMetadataTrackPresentationMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldPresentationMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrack(value: TimedMetadataTrack): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("track")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

