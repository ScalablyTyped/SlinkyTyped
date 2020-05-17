package typingsSlinky.webcola.anon

import typingsSlinky.webcola.vpscMod.Block
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Constraint extends js.Object {
  var constraint: typingsSlinky.webcola.vpscMod.Constraint = js.native
  var lb: Block = js.native
  var rb: Block = js.native
}

object Constraint {
  @scala.inline
  def apply(constraint: typingsSlinky.webcola.vpscMod.Constraint, lb: Block, rb: Block): Constraint = {
    val __obj = js.Dynamic.literal(constraint = constraint.asInstanceOf[js.Any], lb = lb.asInstanceOf[js.Any], rb = rb.asInstanceOf[js.Any])
    __obj.asInstanceOf[Constraint]
  }
  @scala.inline
  implicit class ConstraintOps[Self <: Constraint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConstraint(value: typingsSlinky.webcola.vpscMod.Constraint): Self = {
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

