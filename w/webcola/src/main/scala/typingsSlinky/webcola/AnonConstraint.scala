package typingsSlinky.webcola

import typingsSlinky.webcola.vpscMod.Block
import typingsSlinky.webcola.vpscMod.Constraint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonConstraint extends js.Object {
  var constraint: Constraint = js.native
  var lb: Block = js.native
  var rb: Block = js.native
}

object AnonConstraint {
  @scala.inline
  def apply(constraint: Constraint, lb: Block, rb: Block): AnonConstraint = {
    val __obj = js.Dynamic.literal(constraint = constraint.asInstanceOf[js.Any], lb = lb.asInstanceOf[js.Any], rb = rb.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonConstraint]
  }
  @scala.inline
  implicit class AnonConstraintOps[Self <: AnonConstraint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConstraint(value: Constraint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constraint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLb(value: Block): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRb(value: Block): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rb")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

