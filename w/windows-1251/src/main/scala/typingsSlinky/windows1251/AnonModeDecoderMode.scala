package typingsSlinky.windows1251

import typingsSlinky.windows1251.mod.DecoderMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonModeDecoderMode extends js.Object {
  var mode: js.UndefOr[DecoderMode] = js.native
}

object AnonModeDecoderMode {
  @scala.inline
  def apply(): AnonModeDecoderMode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonModeDecoderMode]
  }
  @scala.inline
  implicit class AnonModeDecoderModeOps[Self <: AnonModeDecoderMode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMode(value: DecoderMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
  }
  
}

