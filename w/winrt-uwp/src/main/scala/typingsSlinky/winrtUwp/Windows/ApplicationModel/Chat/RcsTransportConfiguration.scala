package typingsSlinky.winrtUwp.Windows.ApplicationModel.Chat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data about the configuration of a Rich Communication Services (RCS) transport. */
@js.native
trait RcsTransportConfiguration extends js.Object {
  /** Gets the maximum number of attachments supported by the transport. */
  var maxAttachmentCount: Double = js.native
  /** Gets the maximum size of a file that can be sent using the transport. */
  var maxFileSizeInKilobytes: Double = js.native
  /** Gets the maximum size of a group chat message supported by the transport. */
  var maxGroupMessageSizeInKilobytes: Double = js.native
  /** Gets the maximum size of a chat message supported by the transport. */
  var maxMessageSizeInKilobytes: Double = js.native
  /** Gets the maximum number of recipients supported for a group chat. */
  var maxRecipientCount: Double = js.native
  /** Gets the size at which the user should be warned that they are attaching a large file for the transport. */
  var warningFileSizeInKilobytes: Double = js.native
}

object RcsTransportConfiguration {
  @scala.inline
  def apply(
    maxAttachmentCount: Double,
    maxFileSizeInKilobytes: Double,
    maxGroupMessageSizeInKilobytes: Double,
    maxMessageSizeInKilobytes: Double,
    maxRecipientCount: Double,
    warningFileSizeInKilobytes: Double
  ): RcsTransportConfiguration = {
    val __obj = js.Dynamic.literal(maxAttachmentCount = maxAttachmentCount.asInstanceOf[js.Any], maxFileSizeInKilobytes = maxFileSizeInKilobytes.asInstanceOf[js.Any], maxGroupMessageSizeInKilobytes = maxGroupMessageSizeInKilobytes.asInstanceOf[js.Any], maxMessageSizeInKilobytes = maxMessageSizeInKilobytes.asInstanceOf[js.Any], maxRecipientCount = maxRecipientCount.asInstanceOf[js.Any], warningFileSizeInKilobytes = warningFileSizeInKilobytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[RcsTransportConfiguration]
  }
  @scala.inline
  implicit class RcsTransportConfigurationOps[Self <: RcsTransportConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxAttachmentCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAttachmentCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxFileSizeInKilobytes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFileSizeInKilobytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxGroupMessageSizeInKilobytes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxGroupMessageSizeInKilobytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxMessageSizeInKilobytes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxMessageSizeInKilobytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxRecipientCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRecipientCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWarningFileSizeInKilobytes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warningFileSizeInKilobytes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

