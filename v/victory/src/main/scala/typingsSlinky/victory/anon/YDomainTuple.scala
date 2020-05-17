package typingsSlinky.victory.anon

import typingsSlinky.victory.mod.DomainPropType
import typingsSlinky.victory.mod.DomainTuple
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait YDomainTuple extends DomainPropType {
  var x: DomainTuple = js.native
  var y: js.UndefOr[DomainTuple] = js.native
}

object YDomainTuple {
  @scala.inline
  def apply(x: DomainTuple): YDomainTuple = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any])
    __obj.asInstanceOf[YDomainTuple]
  }
  @scala.inline
  implicit class YDomainTupleOps[Self <: YDomainTuple] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withX(value: DomainTuple): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY(value: DomainTuple): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(js.undefined)
        ret
    }
  }
  
}

