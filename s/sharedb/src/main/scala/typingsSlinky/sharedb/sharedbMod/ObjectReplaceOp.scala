package typingsSlinky.sharedb.sharedbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectReplaceOp extends Op {
  var od: js.Any = js.native
  var oi: js.Any = js.native
  var p: Path = js.native
}

object ObjectReplaceOp {
  @scala.inline
  def apply(od: js.Any, oi: js.Any, p: Path): ObjectReplaceOp = {
    val __obj = js.Dynamic.literal(od = od.asInstanceOf[js.Any], oi = oi.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectReplaceOp]
  }
  @scala.inline
  implicit class ObjectReplaceOpOps[Self <: ObjectReplaceOp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOd(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("od")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOi(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withP(value: Path): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("p")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

