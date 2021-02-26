package typingsSlinky.winrtUwp.Windows.Devices.Sms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Encapsulates an SMS voicemail message. */
@js.native
trait SmsVoicemailMessage extends StObject {
  
  /** Gets the body of the voicemail message. */
  var body: String = js.native
  
  /** Gets the cellular class of the message. */
  var cellularClass: CellularClass = js.native
  
  /** Gets the unique device identifier associated with the message. */
  var deviceId: String = js.native
  
  /** Gets the message class of the message. */
  var messageClass: SmsMessageClass = js.native
  
  /** Gets the number of available messages. */
  var messageCount: Double = js.native
  
  /** Gets the type of the message. */
  var messageType: SmsMessageType = js.native
  
  /** Gets the ICCID (Integrated Circuit Card Identifier) of the SIM that received the message. */
  var simIccId: String = js.native
  
  /** The timestamp of the message. */
  var timestamp: js.Date = js.native
  
  /** The phone number the message was sent to. */
  var to: String = js.native
}
object SmsVoicemailMessage {
  
  @scala.inline
  def apply(
    body: String,
    cellularClass: CellularClass,
    deviceId: String,
    messageClass: SmsMessageClass,
    messageCount: Double,
    messageType: SmsMessageType,
    simIccId: String,
    timestamp: js.Date,
    to: String
  ): SmsVoicemailMessage = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], cellularClass = cellularClass.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any], messageClass = messageClass.asInstanceOf[js.Any], messageCount = messageCount.asInstanceOf[js.Any], messageType = messageType.asInstanceOf[js.Any], simIccId = simIccId.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmsVoicemailMessage]
  }
  
  @scala.inline
  implicit class SmsVoicemailMessageMutableBuilder[Self <: SmsVoicemailMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellularClass(value: CellularClass): Self = StObject.set(x, "cellularClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageClass(value: SmsMessageClass): Self = StObject.set(x, "messageClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageCount(value: Double): Self = StObject.set(x, "messageCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageType(value: SmsMessageType): Self = StObject.set(x, "messageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSimIccId(value: String): Self = StObject.set(x, "simIccId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: js.Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
  }
}
