package typingsSlinky.twilioChat.channelMod

import typingsSlinky.twilioChat.channelMod.Channel.NotificationLevel
import typingsSlinky.twilioChat.channelMod.Channel.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelDescriptor extends js.Object {
  var attributes: js.Object = js.native
  var channel: String = js.native
  var createdBy: js.UndefOr[String] = js.native
  var dateCreated: js.Any = js.native
  var dateUpdated: js.Any = js.native
  var entityName: String = js.native
  var friendlyName: String = js.native
  var lastConsumedMessageIndex: Double = js.native
  var notificationLevel: js.UndefOr[NotificationLevel] = js.native
  var `type`: Type = js.native
  var uniqueName: String = js.native
}

object ChannelDescriptor {
  @scala.inline
  def apply(
    attributes: js.Object,
    channel: String,
    dateCreated: js.Any,
    dateUpdated: js.Any,
    entityName: String,
    friendlyName: String,
    lastConsumedMessageIndex: Double,
    `type`: Type,
    uniqueName: String
  ): ChannelDescriptor = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any], dateCreated = dateCreated.asInstanceOf[js.Any], dateUpdated = dateUpdated.asInstanceOf[js.Any], entityName = entityName.asInstanceOf[js.Any], friendlyName = friendlyName.asInstanceOf[js.Any], lastConsumedMessageIndex = lastConsumedMessageIndex.asInstanceOf[js.Any], uniqueName = uniqueName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelDescriptor]
  }
  @scala.inline
  implicit class ChannelDescriptorOps[Self <: ChannelDescriptor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributes(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChannel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDateCreated(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateCreated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDateUpdated(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateUpdated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEntityName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFriendlyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("friendlyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastConsumedMessageIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastConsumedMessageIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUniqueName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniqueName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreatedBy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdBy")(js.undefined)
        ret
    }
    @scala.inline
    def withNotificationLevel(value: NotificationLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotificationLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationLevel")(js.undefined)
        ret
    }
  }
  
}

