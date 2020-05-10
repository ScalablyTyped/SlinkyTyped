package typingsSlinky.sharp.mod

import typingsSlinky.sharp.sharpNumbers.`1`
import typingsSlinky.sharp.sharpNumbers.`2`
import typingsSlinky.sharp.sharpNumbers.`3`
import typingsSlinky.sharp.sharpNumbers.`4`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Raw extends js.Object {
  var channels: `1` | `2` | `3` | `4` = js.native
  var height: Double = js.native
  var width: Double = js.native
}

object Raw {
  @scala.inline
  def apply(channels: `1` | `2` | `3` | `4`, height: Double, width: Double): Raw = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Raw]
  }
  @scala.inline
  implicit class RawOps[Self <: Raw] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChannels(value: `1` | `2` | `3` | `4`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

