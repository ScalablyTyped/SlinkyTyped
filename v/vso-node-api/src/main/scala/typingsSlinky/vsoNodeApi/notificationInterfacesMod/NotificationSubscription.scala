package typingsSlinky.vsoNodeApi.notificationInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationSubscription extends js.Object {
  /**
    * Links to related resources, APIs, and views for the subscription.
    */
  var _links: js.Any = js.native
  /**
    * Admin-managed settings for the subscription. Only applies when the subscriber is a group.
    */
  var adminSettings: SubscriptionAdminSettings = js.native
  /**
    * Channel for delivering notifications triggered by the subscription.
    */
  var channel: ISubscriptionChannel = js.native
  /**
    * Description of the subscription. Typically describes filter criteria which helps identity the subscription.
    */
  var description: String = js.native
  /**
    * Diagnostics for this subscription.
    */
  var diagnostics: SubscriptionDiagnostics = js.native
  /**
    * Any extra properties like detailed description for different contexts, user/group contexts
    */
  var extendedProperties: StringDictionary[String] = js.native
  /**
    * Matching criteria for the subscription. ExpressionFilter
    */
  var filter: ISubscriptionFilter = js.native
  /**
    * Read-only indicators that further describe the subscription.
    */
  var flags: SubscriptionFlags = js.native
  /**
    * Subscription identifier.
    */
  var id: String = js.native
  /**
    * User that last modified (or created) the subscription.
    */
  var lastModifiedBy: IdentityRef = js.native
  /**
    * Date when the subscription was last modified. If the subscription has not been updated since it was created, this value will indicate when the subscription was created.
    */
  var modifiedDate: js.Date = js.native
  /**
    * The permissions the user have for this subscriptions.
    */
  var permissions: SubscriptionPermissions = js.native
  /**
    * The container in which events must be published from in order to be matched by the subscription. If empty, the scope is the current host (typically an account or project collection). For example, a subscription scoped to project A will not produce notifications for events published from project B.
    */
  var scope: SubscriptionScope = js.native
  /**
    * Status of the subscription. Typically indicates whether the subscription is enabled or not.
    */
  var status: SubscriptionStatus = js.native
  /**
    * Message that provides more details about the status of the subscription.
    */
  var statusMessage: String = js.native
  /**
    * User or group that will receive notifications for events matching the subscription's filter criteria.
    */
  var subscriber: IdentityRef = js.native
  /**
    * REST API URL of the subscriotion.
    */
  var url: String = js.native
  /**
    * User-managed settings for the subscription. Only applies when the subscriber is a group. Typically used to indicate whether the calling user is opted in or out of a group subscription.
    */
  var userSettings: SubscriptionUserSettings = js.native
}

object NotificationSubscription {
  @scala.inline
  def apply(
    _links: js.Any,
    adminSettings: SubscriptionAdminSettings,
    channel: ISubscriptionChannel,
    description: String,
    diagnostics: SubscriptionDiagnostics,
    extendedProperties: StringDictionary[String],
    filter: ISubscriptionFilter,
    flags: SubscriptionFlags,
    id: String,
    lastModifiedBy: IdentityRef,
    modifiedDate: js.Date,
    permissions: SubscriptionPermissions,
    scope: SubscriptionScope,
    status: SubscriptionStatus,
    statusMessage: String,
    subscriber: IdentityRef,
    url: String,
    userSettings: SubscriptionUserSettings
  ): NotificationSubscription = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], adminSettings = adminSettings.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], diagnostics = diagnostics.asInstanceOf[js.Any], extendedProperties = extendedProperties.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastModifiedBy = lastModifiedBy.asInstanceOf[js.Any], modifiedDate = modifiedDate.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusMessage = statusMessage.asInstanceOf[js.Any], subscriber = subscriber.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], userSettings = userSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationSubscription]
  }
  @scala.inline
  implicit class NotificationSubscriptionOps[Self <: NotificationSubscription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_links(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_links")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withDiagnostics(value: SubscriptionDiagnostics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diagnostics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtendedProperties(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extendedProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilter(value: ISubscriptionFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlags(value: SubscriptionFlags): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastModifiedBy(value: IdentityRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModifiedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModifiedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifiedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPermissions(value: SubscriptionPermissions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permissions")(value.asInstanceOf[js.Any])
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
    def withSubscriber(value: IdentityRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscriber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
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

