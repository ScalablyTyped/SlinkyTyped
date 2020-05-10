package typingsSlinky.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCanceled extends js.Object {
  var canceled: Double = js.native
  var fulfiled: Double = js.native
  var paid: Double = js.native
  var returned: Double = js.native
}

object AnonCanceled {
  @scala.inline
  def apply(canceled: Double, fulfiled: Double, paid: Double, returned: Double): AnonCanceled = {
    val __obj = js.Dynamic.literal(canceled = canceled.asInstanceOf[js.Any], fulfiled = fulfiled.asInstanceOf[js.Any], paid = paid.asInstanceOf[js.Any], returned = returned.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCanceled]
  }
  @scala.inline
  implicit class AnonCanceledOps[Self <: AnonCanceled] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanceled(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canceled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFulfiled(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fulfiled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReturned(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returned")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

