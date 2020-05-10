package typingsSlinky.stripe.mod.subscriptionItems

import typingsSlinky.stripe.mod.IListOptionsCreated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISubscriptionItemListOptions extends IListOptionsCreated {
  /**
    * The ID of the subscription whose items will be retrieved.
    */
  var subscription: String = js.native
}

object ISubscriptionItemListOptions {
  @scala.inline
  def apply(subscription: String): ISubscriptionItemListOptions = {
    val __obj = js.Dynamic.literal(subscription = subscription.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISubscriptionItemListOptions]
  }
  @scala.inline
  implicit class ISubscriptionItemListOptionsOps[Self <: ISubscriptionItemListOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSubscription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscription")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

