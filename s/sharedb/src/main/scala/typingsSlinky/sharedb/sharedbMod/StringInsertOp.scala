package typingsSlinky.sharedb.sharedbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StringInsertOp extends Op {
  var p: Path = js.native
  var si: String = js.native
}

object StringInsertOp {
  @scala.inline
  def apply(p: Path, si: String): StringInsertOp = {
    val __obj = js.Dynamic.literal(p = p.asInstanceOf[js.Any], si = si.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringInsertOp]
  }
  @scala.inline
  implicit class StringInsertOpOps[Self <: StringInsertOp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withP(value: Path): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("p")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSi(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("si")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

