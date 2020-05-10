package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDeliveryTimelineView extends js.Object {
  var deliveryTimelineView: Double = js.native
}

object AnonDeliveryTimelineView {
  @scala.inline
  def apply(deliveryTimelineView: Double): AnonDeliveryTimelineView = {
    val __obj = js.Dynamic.literal(deliveryTimelineView = deliveryTimelineView.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDeliveryTimelineView]
  }
  @scala.inline
  implicit class AnonDeliveryTimelineViewOps[Self <: AnonDeliveryTimelineView] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeliveryTimelineView(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deliveryTimelineView")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

