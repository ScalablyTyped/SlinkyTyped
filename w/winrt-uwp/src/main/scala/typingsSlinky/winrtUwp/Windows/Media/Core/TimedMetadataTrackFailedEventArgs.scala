package typingsSlinky.winrtUwp.Windows.Media.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the TimedMetadataTrack::TrackFailed event. */
@js.native
trait TimedMetadataTrackFailedEventArgs extends js.Object {
  /** Gets an object representing the error that occurred with the timed metadata track. */
  var error: TimedMetadataTrackError = js.native
}

object TimedMetadataTrackFailedEventArgs {
  @scala.inline
  def apply(error: TimedMetadataTrackError): TimedMetadataTrackFailedEventArgs = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimedMetadataTrackFailedEventArgs]
  }
  @scala.inline
  implicit class TimedMetadataTrackFailedEventArgsOps[Self <: TimedMetadataTrackFailedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withError(value: TimedMetadataTrackError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

