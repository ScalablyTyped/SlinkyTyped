package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AudioNodeOptions extends js.Object {
  var channelCount: js.UndefOr[Double] = js.native
  var channelCountMode: js.UndefOr[ChannelCountMode] = js.native
  var channelInterpretation: js.UndefOr[ChannelInterpretation] = js.native
}

object AudioNodeOptions {
  @scala.inline
  def apply(): AudioNodeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AudioNodeOptions]
  }
  @scala.inline
  implicit class AudioNodeOptionsOps[Self <: AudioNodeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChannelCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannelCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelCount")(js.undefined)
        ret
    }
    @scala.inline
    def withChannelCountMode(value: ChannelCountMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelCountMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannelCountMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelCountMode")(js.undefined)
        ret
    }
    @scala.inline
    def withChannelInterpretation(value: ChannelInterpretation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelInterpretation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannelInterpretation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelInterpretation")(js.undefined)
        ret
    }
  }
  
}

