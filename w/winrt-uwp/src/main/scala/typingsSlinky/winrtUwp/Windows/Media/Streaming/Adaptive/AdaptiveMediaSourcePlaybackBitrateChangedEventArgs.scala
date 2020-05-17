package typingsSlinky.winrtUwp.Windows.Media.Streaming.Adaptive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the PlaybackBitrateChanged event. */
@js.native
trait AdaptiveMediaSourcePlaybackBitrateChangedEventArgs extends js.Object {
  /** Gets a value indicating whether the media source contains only audio data. */
  var audioOnly: Boolean = js.native
  /** Gets the new playback bitrate. */
  var newValue: Double = js.native
  /** Gets the old playback bitrate. */
  var oldValue: Double = js.native
}

object AdaptiveMediaSourcePlaybackBitrateChangedEventArgs {
  @scala.inline
  def apply(audioOnly: Boolean, newValue: Double, oldValue: Double): AdaptiveMediaSourcePlaybackBitrateChangedEventArgs = {
    val __obj = js.Dynamic.literal(audioOnly = audioOnly.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdaptiveMediaSourcePlaybackBitrateChangedEventArgs]
  }
  @scala.inline
  implicit class AdaptiveMediaSourcePlaybackBitrateChangedEventArgsOps[Self <: AdaptiveMediaSourcePlaybackBitrateChangedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAudioOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOldValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldValue")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

