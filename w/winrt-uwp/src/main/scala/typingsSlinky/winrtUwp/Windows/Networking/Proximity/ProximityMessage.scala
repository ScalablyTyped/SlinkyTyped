package typingsSlinky.winrtUwp.Windows.Networking.Proximity

import typingsSlinky.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a message that's received from a subscription. */
@js.native
trait ProximityMessage extends js.Object {
  /** Gets the binary data of the message. */
  var data: IBuffer = js.native
  /** Gets the message data as text. */
  var dataAsString: String = js.native
  /** Gets the type of the message. */
  var messageType: String = js.native
  /** Gets the subscription ID of the message. */
  var subscriptionId: Double = js.native
}

object ProximityMessage {
  @scala.inline
  def apply(data: IBuffer, dataAsString: String, messageType: String, subscriptionId: Double): ProximityMessage = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], dataAsString = dataAsString.asInstanceOf[js.Any], messageType = messageType.asInstanceOf[js.Any], subscriptionId = subscriptionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProximityMessage]
  }
  @scala.inline
  implicit class ProximityMessageOps[Self <: ProximityMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: IBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataAsString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataAsString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessageType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubscriptionId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscriptionId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

