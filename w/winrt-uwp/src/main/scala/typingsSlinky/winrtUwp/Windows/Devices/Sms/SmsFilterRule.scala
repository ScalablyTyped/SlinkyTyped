package typingsSlinky.winrtUwp.Windows.Devices.Sms

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes an SMS filtering rule. */
@js.native
trait SmsFilterRule extends js.Object {
  /** A list of broadcast channels that match this rule. */
  var broadcastChannels: IVector[Double] = js.native
  /** Gets a list of broadcast types for an SMS message that matches this rule. */
  var broadcastTypes: IVector[SmsBroadcastType] = js.native
  /** The cellular class identifier for SMS messages that match this rule. */
  var cellularClass: CellularClass = js.native
  /** Gets a list of device identifiers for an SMS message that matches this rule. */
  var deviceIds: IVector[String] = js.native
  /** Gets the IMSI prefixes for an SMS message that matches this rule. */
  var imsiPrefixes: IVector[String] = js.native
  /** Gets the message type of an SMS message that matches this filter rule. */
  var messageType: SmsMessageType = js.native
  /** Gets a list of port numbers associated with the SMS message that matches this rule. */
  var portNumbers: IVector[Double] = js.native
  /** Gets a list of protocol identifiers associated with the SMS message that matches this rule.. */
  var protocolIds: IVector[Double] = js.native
  /** Gets the sender numbers associated with an SMS message that matches this rule. */
  var senderNumbers: IVector[String] = js.native
  /** Gets the list of teleservice identifiers for an SMS message that matches this rule. */
  var teleserviceIds: IVector[Double] = js.native
  /** Gets a list of the text message prefixes for an SMS message that matches this filter. */
  var textMessagePrefixes: IVector[String] = js.native
  /** Gets a list of WAP application identifiers for the SMS message that matches this rule. */
  var wapApplicationIds: IVector[String] = js.native
  /** Gets a list of WAP content types for the SMS message that matches this rule. */
  var wapContentTypes: IVector[String] = js.native
}

object SmsFilterRule {
  @scala.inline
  def apply(
    broadcastChannels: IVector[Double],
    broadcastTypes: IVector[SmsBroadcastType],
    cellularClass: CellularClass,
    deviceIds: IVector[String],
    imsiPrefixes: IVector[String],
    messageType: SmsMessageType,
    portNumbers: IVector[Double],
    protocolIds: IVector[Double],
    senderNumbers: IVector[String],
    teleserviceIds: IVector[Double],
    textMessagePrefixes: IVector[String],
    wapApplicationIds: IVector[String],
    wapContentTypes: IVector[String]
  ): SmsFilterRule = {
    val __obj = js.Dynamic.literal(broadcastChannels = broadcastChannels.asInstanceOf[js.Any], broadcastTypes = broadcastTypes.asInstanceOf[js.Any], cellularClass = cellularClass.asInstanceOf[js.Any], deviceIds = deviceIds.asInstanceOf[js.Any], imsiPrefixes = imsiPrefixes.asInstanceOf[js.Any], messageType = messageType.asInstanceOf[js.Any], portNumbers = portNumbers.asInstanceOf[js.Any], protocolIds = protocolIds.asInstanceOf[js.Any], senderNumbers = senderNumbers.asInstanceOf[js.Any], teleserviceIds = teleserviceIds.asInstanceOf[js.Any], textMessagePrefixes = textMessagePrefixes.asInstanceOf[js.Any], wapApplicationIds = wapApplicationIds.asInstanceOf[js.Any], wapContentTypes = wapContentTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmsFilterRule]
  }
  @scala.inline
  implicit class SmsFilterRuleOps[Self <: SmsFilterRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBroadcastChannels(value: IVector[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("broadcastChannels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBroadcastTypes(value: IVector[SmsBroadcastType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("broadcastTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCellularClass(value: CellularClass): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellularClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeviceIds(value: IVector[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImsiPrefixes(value: IVector[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imsiPrefixes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessageType(value: SmsMessageType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPortNumbers(value: IVector[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("portNumbers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProtocolIds(value: IVector[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocolIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSenderNumbers(value: IVector[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("senderNumbers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTeleserviceIds(value: IVector[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teleserviceIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextMessagePrefixes(value: IVector[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textMessagePrefixes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWapApplicationIds(value: IVector[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wapApplicationIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWapContentTypes(value: IVector[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wapContentTypes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

