package typingsSlinky.winrtUwp

import typingsSlinky.winrtUwp.Windows.Media.Protection.PlayReady.IPlayReadySecureStopServiceRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonItemsIPlayReadySecureStopServiceRequest extends js.Object {
  /** The items in the collection. */ var items: IPlayReadySecureStopServiceRequest = js.native
  /** The number of items in the collection. */ var returnValue: Double = js.native
}

object AnonItemsIPlayReadySecureStopServiceRequest {
  @scala.inline
  def apply(items: IPlayReadySecureStopServiceRequest, returnValue: Double): AnonItemsIPlayReadySecureStopServiceRequest = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonItemsIPlayReadySecureStopServiceRequest]
  }
  @scala.inline
  implicit class AnonItemsIPlayReadySecureStopServiceRequestOps[Self <: AnonItemsIPlayReadySecureStopServiceRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: IPlayReadySecureStopServiceRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReturnValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnValue")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

