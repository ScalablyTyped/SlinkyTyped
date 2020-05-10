package typingsSlinky.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonUsagegte extends js.Object {
  /**
    * Usage threshold that triggers the subscription to create an invoice
    */
  var usage_gte: Double = js.native
}

object AnonUsagegte {
  @scala.inline
  def apply(usage_gte: Double): AnonUsagegte = {
    val __obj = js.Dynamic.literal(usage_gte = usage_gte.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonUsagegte]
  }
  @scala.inline
  implicit class AnonUsagegteOps[Self <: AnonUsagegte] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUsage_gte(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usage_gte")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

