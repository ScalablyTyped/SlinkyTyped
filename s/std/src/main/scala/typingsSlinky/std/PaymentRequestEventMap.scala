package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaymentRequestEventMap extends js.Object {
  var shippingaddresschange: org.scalajs.dom.raw.Event
  var shippingoptionchange: org.scalajs.dom.raw.Event
}

object PaymentRequestEventMap {
  @scala.inline
  def apply(shippingaddresschange: org.scalajs.dom.raw.Event, shippingoptionchange: org.scalajs.dom.raw.Event): PaymentRequestEventMap = {
    val __obj = js.Dynamic.literal(shippingaddresschange = shippingaddresschange.asInstanceOf[js.Any], shippingoptionchange = shippingoptionchange.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentRequestEventMap]
  }
}

