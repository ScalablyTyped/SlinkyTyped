package typingsSlinky.shellQuote.anon

import typingsSlinky.shellQuote.mod.ParseEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Op extends ParseEntry {
  var op: String = js.native
}

object Op {
  @scala.inline
  def apply(op: String): Op = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any])
    __obj.asInstanceOf[Op]
  }
  @scala.inline
  implicit class OpOps[Self <: Op] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("op")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

