package typingsSlinky.twilio.mod

import typingsSlinky.q.mod.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountInstance extends PostableResource {
  
  var addresses: AddressResource = js.native
  
  var applications: ApplicationResource = js.native
  
  var authorizedConnectApps: AuthorizedConnectAppResource = js.native
  
  // Mixed-in resources
  def availablePhoneNumbers(resourceSid: String): AvailablePhoneNumberInstance = js.native
  // Mixed-in resources
  @JSName("availablePhoneNumbers")
  var availablePhoneNumbers_Original: AvailablePhoneNumberResource = js.native
  
  var calls: CallResource = js.native
  
  var conferences: ConferenceResource = js.native
  
  var connectApps: ConnectAppResource = js.native
  
  var incomingPhoneNumbers: IncomingPhoneNumberResource = js.native
  
  var keys: KeyResource = js.native
  
  var messages: MessageResource = js.native
  
  var notifications: NotificationResource = js.native
  
  var outgoingCallerIds: OutgoingCallerIdResource = js.native
  
  def put(args: js.Any): Promise[_] = js.native
  def put(args: js.Any, callback: RequestCallback): Promise[_] = js.native
  def put(callback: RequestCallback): Promise[_] = js.native
  @JSName("put")
  var put_Original: RestMethod = js.native
  
  var queues: QueueResource = js.native
  
  var recordings: RecordingResource = js.native
  
  var sip: SIPIntermediary = js.native
  
  var sms: SMSIntermediary = js.native
  
  var tokens: TokenResource = js.native
  
  var transcriptions: TranscriptionResource = js.native
  
  def update(args: js.Any): Promise[_] = js.native
  def update(args: js.Any, callback: RequestCallback): Promise[_] = js.native
  def update(callback: RequestCallback): Promise[_] = js.native
  @JSName("update")
  var update_Original: RestMethod = js.native
  
  var usage: UsageIntermediary = js.native
}
