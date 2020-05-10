package typingsSlinky.vsoNodeApi.notificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationSubscriptionUpdateParameters extends js.Object {
  /**
    * Admin-managed settings for the subscription. Only applies to subscriptions where the subscriber is a group.
    */
  var adminSettings: SubscriptionAdminSettings = js.native
  /**
    * Channel for delivering notifications triggered by the subscription.
    */
  var channel: ISubscriptionChannel = js.native
  /**
    * Updated description for the subscription. Typically describes filter criteria which helps identity the subscription.
    */
  var description: String = js.native
  /**
    * Matching criteria for the subscription. ExpressionFilter
    */
  var filter: ISubscriptionFilter = js.native
  /**
    * The container in which events must be published from in order to be matched by the new subscription. If not specified, defaults to the current host (typically the current account or project collection). For example, a subscription scoped to project A will not produce notifications for events published from project B.
    */
  var scope: SubscriptionScope = js.native
  /**
    * Updated status for the subscription. Typically used to enable or disable a subscription.
    */
  var status: SubscriptionStatus = js.native
  /**
    * Optional message that provides more details about the updated status.
    */
  var statusMessage: String = js.native
  /**
    * User-managed settings for the subscription. Only applies to subscriptions where the subscriber is a group. Typically used to opt-in or opt-out a user from a group subscription.
    */
  var userSettings: SubscriptionUserSettings = js.native
}

object NotificationSubscriptionUpdateParameters {
  @scala.inline
  def apply(
    adminSettings: SubscriptionAdminSettings,
    channel: ISubscriptionChannel,
    description: String,
    filter: ISubscriptionFilter,
    scope: SubscriptionScope,
    status: SubscriptionStatus,
    statusMessage: String,
    userSettings: SubscriptionUserSettings
  ): NotificationSubscriptionUpdateParameters = {
    val __obj = js.Dynamic.literal(adminSettings = adminSettings.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusMessage = statusMessage.asInstanceOf[js.Any], userSettings = userSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationSubscriptionUpdateParameters]
  }
  @scala.inline
  implicit class NotificationSubscriptionUpdateParametersOps[Self <: NotificationSubscriptionUpdateParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdminSettings(value: SubscriptionAdminSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adminSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChannel(value: ISubscriptionChannel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilter(value: ISubscriptionFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScope(value: SubscriptionScope): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: SubscriptionStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatusMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserSettings(value: SubscriptionUserSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userSettings")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

