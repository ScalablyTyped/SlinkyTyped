package typingsSlinky.winrtUwp.Windows.Devices.Sms

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Manages a decoded SMS text message, providing direct access to the plain text body of the message, as well as key header properties, such as time stamp. */
@js.native
trait SmsTextMessage extends StObject {
  
  /** Specifies the plain text body of the message. */
  var body: String = js.native
  
  /** Specifies the encoding type that has been set to use when sending this message. */
  var encoding: SmsEncoding = js.native
  
  /** Specifies the phone number of the sender of the message. */
  var from: String = js.native
  
  /** Indicates the ID of the SMS text message. */
  var id: Double = js.native
  
  /** Specifies the message class of a message. This message class typically originates on the network, not the mobile device. */
  var messageClass: SmsMessageClass = js.native
  
  /** Indicates the total number of parts in the original message if the message is part of a multi-part message. */
  var partCount: Double = js.native
  
  /** Indicates the part number of a multi-part message if this message is part of a multi-part message. It can be used to reconstruct the original message by joining the parts together, in conjunction with the PartReferenceId and PartCount properties. */
  var partNumber: Double = js.native
  
  /** Indicates a reference value that can be used if the message is part of a multi-part message. If this message belongs to a multi-part message, the PartNumber value can be used to reconstruct the full original message, and each part of that message will have the same value for PartReferenceId. */
  var partReferenceId: Double = js.native
  
  /** Indicates the timestamp of the message. It is determined locally for a constructed message instance or from the service center timestamp of a received message. */
  var timestamp: js.Date = js.native
  
  /** Indicates the recipient phone number of this message. */
  var to: String = js.native
  
  /**
    * Reads a message in the specified format and places the results in a new instance of a binary message.
    * @param format A value from the SmsDataFormat enumeration.
    * @return The new binary message that holds the result of this method call.
    */
  def toBinaryMessages(format: SmsDataFormat): IVectorView[ISmsBinaryMessage] = js.native
}
object SmsTextMessage {
  
  @scala.inline
  def apply(
    body: String,
    encoding: SmsEncoding,
    from: String,
    id: Double,
    messageClass: SmsMessageClass,
    partCount: Double,
    partNumber: Double,
    partReferenceId: Double,
    timestamp: js.Date,
    to: String,
    toBinaryMessages: SmsDataFormat => IVectorView[ISmsBinaryMessage]
  ): SmsTextMessage = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], messageClass = messageClass.asInstanceOf[js.Any], partCount = partCount.asInstanceOf[js.Any], partNumber = partNumber.asInstanceOf[js.Any], partReferenceId = partReferenceId.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any], toBinaryMessages = js.Any.fromFunction1(toBinaryMessages))
    __obj.asInstanceOf[SmsTextMessage]
  }
  
  @scala.inline
  implicit class SmsTextMessageMutableBuilder[Self <: SmsTextMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncoding(value: SmsEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageClass(value: SmsMessageClass): Self = StObject.set(x, "messageClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartCount(value: Double): Self = StObject.set(x, "partCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartNumber(value: Double): Self = StObject.set(x, "partNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartReferenceId(value: Double): Self = StObject.set(x, "partReferenceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: js.Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToBinaryMessages(value: SmsDataFormat => IVectorView[ISmsBinaryMessage]): Self = StObject.set(x, "toBinaryMessages", js.Any.fromFunction1(value))
  }
}
