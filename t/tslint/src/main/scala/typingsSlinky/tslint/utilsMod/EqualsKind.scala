package typingsSlinky.tslint.utilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EqualsKind extends js.Object {
  var isPositive: Boolean = js.native
  var isStrict: Boolean = js.native
}

object EqualsKind {
  @scala.inline
  def apply(isPositive: Boolean, isStrict: Boolean): EqualsKind = {
    val __obj = js.Dynamic.literal(isPositive = isPositive.asInstanceOf[js.Any], isStrict = isStrict.asInstanceOf[js.Any])
    __obj.asInstanceOf[EqualsKind]
  }
  @scala.inline
  implicit class EqualsKindOps[Self <: EqualsKind] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsPositive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPositive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsStrict(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isStrict")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

