package typingsSlinky.sharedb.sharedbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StringDeleteOp extends Op {
  var p: Path = js.native
  var sd: String = js.native
}

object StringDeleteOp {
  @scala.inline
  def apply(p: Path, sd: String): StringDeleteOp = {
    val __obj = js.Dynamic.literal(p = p.asInstanceOf[js.Any], sd = sd.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringDeleteOp]
  }
  @scala.inline
  implicit class StringDeleteOpOps[Self <: StringDeleteOp] (val x: Self) extends AnyVal {
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
    def withSd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sd")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

