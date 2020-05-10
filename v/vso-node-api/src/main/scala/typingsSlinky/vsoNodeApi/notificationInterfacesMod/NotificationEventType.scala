package typingsSlinky.vsoNodeApi.notificationInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationEventType extends js.Object {
  var category: NotificationEventTypeCategory = js.native
  /**
    * Gets or sets the color representing this event type. Example: rgb(128,245,211) or #fafafa
    */
  var color: String = js.native
  var customSubscriptionsAllowed: Boolean = js.native
  var eventPublisher: NotificationEventPublisher = js.native
  var fields: StringDictionary[NotificationEventField] = js.native
  var hasInitiator: Boolean = js.native
  /**
    * Gets or sets the icon representing this event type. Can be a URL or a CSS class. Example: css://some-css-class
    */
  var icon: String = js.native
  /**
    * Gets or sets the unique identifier of this event definition.
    */
  var id: String = js.native
  /**
    * Gets or sets the name of this event definition.
    */
  var name: String = js.native
  var roles: js.Array[NotificationEventRole] = js.native
  /**
    * Gets or sets the scopes that this event type supports
    */
  var supportedScopes: js.Array[String] = js.native
  /**
    * Gets or sets the rest end point to get this event type details (fields, fields types)
    */
  var url: String = js.native
}

object NotificationEventType {
  @scala.inline
  def apply(
    category: NotificationEventTypeCategory,
    color: String,
    customSubscriptionsAllowed: Boolean,
    eventPublisher: NotificationEventPublisher,
    fields: StringDictionary[NotificationEventField],
    hasInitiator: Boolean,
    icon: String,
    id: String,
    name: String,
    roles: js.Array[NotificationEventRole],
    supportedScopes: js.Array[String],
    url: String
  ): NotificationEventType = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], customSubscriptionsAllowed = customSubscriptionsAllowed.asInstanceOf[js.Any], eventPublisher = eventPublisher.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], hasInitiator = hasInitiator.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], roles = roles.asInstanceOf[js.Any], supportedScopes = supportedScopes.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationEventType]
  }
  @scala.inline
  implicit class NotificationEventTypeOps[Self <: NotificationEventType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCategory(value: NotificationEventTypeCategory): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomSubscriptionsAllowed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customSubscriptionsAllowed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventPublisher(value: NotificationEventPublisher): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventPublisher")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFields(value: StringDictionary[NotificationEventField]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasInitiator(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasInitiator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoles(value: js.Array[NotificationEventRole]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupportedScopes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportedScopes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

