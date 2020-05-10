package typingsSlinky.vitalsigns.mod.vitalsigns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConstraintWrapper extends js.Object {
  @JSName("equals")
  var equals_FConstraintWrapper: js.UndefOr[js.Function1[/* num */ Double, ConstraintWrapper]] = js.native
  var greaterThan: js.UndefOr[js.Function1[/* num */ Double, ConstraintWrapper]] = js.native
  var lessThan: js.UndefOr[js.Function1[/* num */ Double, ConstraintWrapper]] = js.native
  var not: js.UndefOr[ConstraintWrapper] = js.native
}

object ConstraintWrapper {
  @scala.inline
  def apply(): ConstraintWrapper = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConstraintWrapper]
  }
  @scala.inline
  implicit class ConstraintWrapperOps[Self <: ConstraintWrapper] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEquals(value: /* num */ Double => ConstraintWrapper): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equals")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutEquals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equals")(js.undefined)
        ret
    }
    @scala.inline
    def withGreaterThan(value: /* num */ Double => ConstraintWrapper): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("greaterThan")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGreaterThan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("greaterThan")(js.undefined)
        ret
    }
    @scala.inline
    def withLessThan(value: /* num */ Double => ConstraintWrapper): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lessThan")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLessThan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lessThan")(js.undefined)
        ret
    }
    @scala.inline
    def withNot(value: ConstraintWrapper): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("not")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("not")(js.undefined)
        ret
    }
  }
  
}

