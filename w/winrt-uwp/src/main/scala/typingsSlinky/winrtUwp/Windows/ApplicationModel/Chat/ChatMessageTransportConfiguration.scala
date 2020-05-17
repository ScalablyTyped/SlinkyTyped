package typingsSlinky.winrtUwp.Windows.ApplicationModel.Chat

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IMapView
import typingsSlinky.winrtUwp.Windows.Media.MediaProperties.MediaEncodingProfile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents data about the chat message transport. */
@js.native
trait ChatMessageTransportConfiguration extends js.Object {
  /** Gets the extended properties of the transport. */
  var extendedProperties: IMapView[String, _] = js.native
  /** Gets the maximum attachment limit for a message on the transport. */
  var maxAttachmentCount: Double = js.native
  /** Gets the maximum size of an attachment for the transport. */
  var maxMessageSizeInKilobytes: Double = js.native
  /** Gets the maximum number of recipients for the transport. */
  var maxRecipientCount: Double = js.native
  /** Gets the supported video encoding format for the transport. */
  var supportedVideoFormat: MediaEncodingProfile = js.native
}

object ChatMessageTransportConfiguration {
  @scala.inline
  def apply(
    extendedProperties: IMapView[String, _],
    maxAttachmentCount: Double,
    maxMessageSizeInKilobytes: Double,
    maxRecipientCount: Double,
    supportedVideoFormat: MediaEncodingProfile
  ): ChatMessageTransportConfiguration = {
    val __obj = js.Dynamic.literal(extendedProperties = extendedProperties.asInstanceOf[js.Any], maxAttachmentCount = maxAttachmentCount.asInstanceOf[js.Any], maxMessageSizeInKilobytes = maxMessageSizeInKilobytes.asInstanceOf[js.Any], maxRecipientCount = maxRecipientCount.asInstanceOf[js.Any], supportedVideoFormat = supportedVideoFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatMessageTransportConfiguration]
  }
  @scala.inline
  implicit class ChatMessageTransportConfigurationOps[Self <: ChatMessageTransportConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExtendedProperties(value: IMapView[String, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extendedProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxAttachmentCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAttachmentCount")(value.asInstanceOf[js.Any])
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
    def withSupportedVideoFormat(value: MediaEncodingProfile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportedVideoFormat")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

