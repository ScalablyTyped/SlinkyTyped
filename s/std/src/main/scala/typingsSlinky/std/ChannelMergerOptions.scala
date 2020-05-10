package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelMergerOptions extends AudioNodeOptions {
  var numberOfInputs: js.UndefOr[Double] = js.native
}

object ChannelMergerOptions {
  @scala.inline
  def apply(): ChannelMergerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelMergerOptions]
  }
  @scala.inline
  implicit class ChannelMergerOptionsOps[Self <: ChannelMergerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNumberOfInputs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfInputs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberOfInputs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfInputs")(js.undefined)
        ret
    }
  }
  
}

