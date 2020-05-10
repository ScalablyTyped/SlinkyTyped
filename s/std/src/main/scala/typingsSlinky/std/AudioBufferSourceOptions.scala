package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AudioBufferSourceOptions extends js.Object {
  var buffer: js.UndefOr[org.scalajs.dom.raw.AudioBuffer | Null] = js.native
  var detune: js.UndefOr[Double] = js.native
  var loop: js.UndefOr[scala.Boolean] = js.native
  var loopEnd: js.UndefOr[Double] = js.native
  var loopStart: js.UndefOr[Double] = js.native
  var playbackRate: js.UndefOr[Double] = js.native
}

object AudioBufferSourceOptions {
  @scala.inline
  def apply(): AudioBufferSourceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AudioBufferSourceOptions]
  }
  @scala.inline
  implicit class AudioBufferSourceOptionsOps[Self <: AudioBufferSourceOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuffer(value: org.scalajs.dom.raw.AudioBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuffer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buffer")(js.undefined)
        ret
    }
    @scala.inline
    def withBufferNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buffer")(null)
        ret
    }
    @scala.inline
    def withDetune(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detune")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetune: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detune")(js.undefined)
        ret
    }
    @scala.inline
    def withLoop(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loop")(js.undefined)
        ret
    }
    @scala.inline
    def withLoopEnd(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loopEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoopEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loopEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withLoopStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loopStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoopStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loopStart")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaybackRate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playbackRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaybackRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playbackRate")(js.undefined)
        ret
    }
  }
  
}

