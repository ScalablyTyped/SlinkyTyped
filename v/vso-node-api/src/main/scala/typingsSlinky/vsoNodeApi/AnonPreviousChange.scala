package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPreviousChange extends js.Object {
  var firstParent: Double = js.native
  var none: Double = js.native
  var previousChange: Double = js.native
}

object AnonPreviousChange {
  @scala.inline
  def apply(firstParent: Double, none: Double, previousChange: Double): AnonPreviousChange = {
    val __obj = js.Dynamic.literal(firstParent = firstParent.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], previousChange = previousChange.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPreviousChange]
  }
  @scala.inline
  implicit class AnonPreviousChangeOps[Self <: AnonPreviousChange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFirstParent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstParent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNone(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreviousChange(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousChange")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

