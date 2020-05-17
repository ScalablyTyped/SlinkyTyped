package typingsSlinky.winrtUwp.Windows.Media.Playback

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides the data for MediaPlayerRateChanged events. */
@js.native
trait MediaPlayerRateChangedEventArgs extends js.Object {
  /** Gets the new playback rate for the media. */
  var newRate: Double = js.native
}

object MediaPlayerRateChangedEventArgs {
  @scala.inline
  def apply(newRate: Double): MediaPlayerRateChangedEventArgs = {
    val __obj = js.Dynamic.literal(newRate = newRate.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaPlayerRateChangedEventArgs]
  }
  @scala.inline
  implicit class MediaPlayerRateChangedEventArgsOps[Self <: MediaPlayerRateChangedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNewRate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newRate")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

