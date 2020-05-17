package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeliveryTimelineView extends js.Object {
  var deliveryTimelineView: scala.Double = js.native
}

object DeliveryTimelineView {
  @scala.inline
  def apply(deliveryTimelineView: scala.Double): DeliveryTimelineView = {
    val __obj = js.Dynamic.literal(deliveryTimelineView = deliveryTimelineView.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeliveryTimelineView]
  }
  @scala.inline
  implicit class DeliveryTimelineViewOps[Self <: DeliveryTimelineView] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeliveryTimelineView(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deliveryTimelineView")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

