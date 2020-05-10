package typingsSlinky.vsoNodeApi.notificationInterfacesMod

import typingsSlinky.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationSubscriptionCreateParameters extends js.Object {
  /**
    * Channel for delivering notifications triggered by the new subscription.
    */
  var channel: ISubscriptionChannel = js.native
  /**
    * Brief description for the new subscription. Typically describes filter criteria which helps identity the subscription.
    */
  var description: String = js.native
  /**
    * Matching criteria for the new subscription. ExpressionFilter
    */
  var filter: ISubscriptionFilter = js.native
  /**
    * The container in which events must be published from in order to be matched by the new subscription. If not specified, defaults to the current host (typically an account or project collection). For example, a subscription scoped to project A will not produce notifications for events published from project B.
    */
  var scope: SubscriptionScope = js.native
  /**
    * User or group that will receive notifications for events matching the subscription's filter criteria. If not specified, defaults to the calling user.
    */
  var subscriber: IdentityRef = js.native
}

object NotificationSubscriptionCreateParameters {
  @scala.inline
  def apply(
    channel: ISubscriptionChannel,
    description: String,
    filter: ISubscriptionFilter,
    scope: SubscriptionScope,
    subscriber: IdentityRef
  ): NotificationSubscriptionCreateParameters = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], subscriber = subscriber.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationSubscriptionCreateParameters]
  }
  @scala.inline
  implicit class NotificationSubscriptionCreateParametersOps[Self <: NotificationSubscriptionCreateParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withSubscriber(value: IdentityRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscriber")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

