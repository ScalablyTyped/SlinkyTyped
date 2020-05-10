package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DelayOptions extends AudioNodeOptions {
  var delayTime: js.UndefOr[Double] = js.native
  var maxDelayTime: js.UndefOr[Double] = js.native
}

object DelayOptions {
  @scala.inline
  def apply(): DelayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DelayOptions]
  }
  @scala.inline
  implicit class DelayOptionsOps[Self <: DelayOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelayTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelayTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayTime")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxDelayTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDelayTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxDelayTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDelayTime")(js.undefined)
        ret
    }
  }
  
}

