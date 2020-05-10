package typingsSlinky.sharedb.sharedbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListReplaceOp extends Op {
  var ld: js.Any = js.native
  var li: js.Any = js.native
  var p: Path = js.native
}

object ListReplaceOp {
  @scala.inline
  def apply(ld: js.Any, li: js.Any, p: Path): ListReplaceOp = {
    val __obj = js.Dynamic.literal(ld = ld.asInstanceOf[js.Any], li = li.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListReplaceOp]
  }
  @scala.inline
  implicit class ListReplaceOpOps[Self <: ListReplaceOp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLd(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ld")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLi(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("li")(value.asInstanceOf[js.Any])
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

