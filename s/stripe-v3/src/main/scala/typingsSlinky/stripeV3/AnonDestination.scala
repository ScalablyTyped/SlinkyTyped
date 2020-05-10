package typingsSlinky.stripeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDestination extends js.Object {
  /**
    * The account (if any) the payment will be attributed to for tax reporting,
    * and where funds from the payment will be transferred to upon payment success.
    */
  var destination: String = js.native
}

object AnonDestination {
  @scala.inline
  def apply(destination: String): AnonDestination = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDestination]
  }
  @scala.inline
  implicit class AnonDestinationOps[Self <: AnonDestination] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestination(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

