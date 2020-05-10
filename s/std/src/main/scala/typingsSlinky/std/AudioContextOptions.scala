package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AudioContextOptions extends js.Object {
  var latencyHint: js.UndefOr[AudioContextLatencyCategory | Double] = js.native
  var sampleRate: js.UndefOr[Double] = js.native
}

object AudioContextOptions {
  @scala.inline
  def apply(): AudioContextOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AudioContextOptions]
  }
  @scala.inline
  implicit class AudioContextOptionsOps[Self <: AudioContextOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLatencyHint(value: AudioContextLatencyCategory | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latencyHint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLatencyHint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latencyHint")(js.undefined)
        ret
    }
    @scala.inline
    def withSampleRate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sampleRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSampleRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sampleRate")(js.undefined)
        ret
    }
  }
  
}

