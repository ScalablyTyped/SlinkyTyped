package typingsSlinky.windows1251.anon

import typingsSlinky.windows1251.mod.DecoderMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModeDecoderMode extends js.Object {
  var mode: js.UndefOr[DecoderMode] = js.native
}

object ModeDecoderMode {
  @scala.inline
  def apply(): ModeDecoderMode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModeDecoderMode]
  }
  @scala.inline
  implicit class ModeDecoderModeOps[Self <: ModeDecoderMode] (val x: Self) extends AnyVal {
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

