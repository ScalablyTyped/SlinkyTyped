package typingsSlinky.vsoNodeApi.taskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AzureSubscription extends js.Object {
  var displayName: String = js.native
  var subscriptionId: String = js.native
  var subscriptionTenantId: String = js.native
  var subscriptionTenantName: String = js.native
}

object AzureSubscription {
  @scala.inline
  def apply(
    displayName: String,
    subscriptionId: String,
    subscriptionTenantId: String,
    subscriptionTenantName: String
  ): AzureSubscription = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], subscriptionId = subscriptionId.asInstanceOf[js.Any], subscriptionTenantId = subscriptionTenantId.asInstanceOf[js.Any], subscriptionTenantName = subscriptionTenantName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AzureSubscription]
  }
  @scala.inline
  implicit class AzureSubscriptionOps[Self <: AzureSubscription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubscriptionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscriptionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubscriptionTenantId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscriptionTenantId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubscriptionTenantName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscriptionTenantName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

