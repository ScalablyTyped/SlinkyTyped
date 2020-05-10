package typingsSlinky.terminalKit

import typingsSlinky.terminalKit.screenBufferMod.ScreenBuffer
import typingsSlinky.terminalKit.terminalMod.Terminal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDst extends js.Object {
  var dst: Terminal | ScreenBuffer = js.native
}

object AnonDst {
  @scala.inline
  def apply(dst: Terminal | ScreenBuffer): AnonDst = {
    val __obj = js.Dynamic.literal(dst = dst.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDst]
  }
  @scala.inline
  implicit class AnonDstOps[Self <: AnonDst] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDst(value: Terminal | ScreenBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dst")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

