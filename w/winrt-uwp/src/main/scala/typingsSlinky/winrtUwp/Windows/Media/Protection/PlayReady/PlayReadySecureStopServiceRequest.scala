package typingsSlinky.winrtUwp.Windows.Media.Protection.PlayReady

import typingsSlinky.winrtUwp.Windows.Foundation.IAsyncAction
import typingsSlinky.winrtUwp.Windows.Foundation.Uri
import typingsSlinky.winrtUwp.Windows.WinRTError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Manages secure stop messages. */
@js.native
trait PlayReadySecureStopServiceRequest extends StObject {
  
  /**
    * Begins an asynchronous service request operation.
    * @return The asynchronous service action.
    */
  def beginServiceRequest(): IAsyncAction = js.native
  
  /** Gets or sets the custom data of the request challenge. */
  var challengeCustomData: String = js.native
  
  /**
    * Begins the process of manually enabling.
    * @return The SOAP message to be used in a manual license acquisition challenge request.
    */
  def generateManualEnablingChallenge(): PlayReadySoapMessage = js.native
  
  /**
    * Returns a new service request interface.
    * @return The new service request interface.
    */
  def nextServiceRequest(): IPlayReadyServiceRequest = js.native
  
  /**
    * Process the raw binary result of a manual enabling challenge.
    * @param responseBytes The response result to be processed.
    * @return If the methods succeeds, it returns S_OK. If it fails, it returns an error code.
    */
  def processManualEnablingResponse(responseBytes: js.Array[Double]): WinRTError = js.native
  
  /** Gets the vendor content protection system identifier. */
  var protectionSystem: String = js.native
  
  /** Gets the current publisher certificate property. */
  var publisherCertificate: Double = js.native
  
  /** Gets the custom data that was returned in the response from the service. */
  var responseCustomData: String = js.native
  
  /** Gets the session identifier property. */
  var sessionID: String = js.native
  
  /** Gets the secure stop session's start time property. */
  var startTime: js.Date = js.native
  
  /** Gets the secure stop session's stopped flag property which indicates whether the secure stop session for this request was cleanly shut down. */
  var stopped: Boolean = js.native
  
  /** Gets the GUID for the type of operation that the PlayReady secure stop service request performs. */
  var `type`: String = js.native
  
  /** Gets the secure stop session's update/stop time property. */
  var updateTime: js.Date = js.native
  
  /** Gets or sets the URI used to perform a service request action. */
  var uri: Uri = js.native
}
object PlayReadySecureStopServiceRequest {
  
  @scala.inline
  def apply(
    beginServiceRequest: () => IAsyncAction,
    challengeCustomData: String,
    generateManualEnablingChallenge: () => PlayReadySoapMessage,
    nextServiceRequest: () => IPlayReadyServiceRequest,
    processManualEnablingResponse: js.Array[Double] => WinRTError,
    protectionSystem: String,
    publisherCertificate: Double,
    responseCustomData: String,
    sessionID: String,
    startTime: js.Date,
    stopped: Boolean,
    `type`: String,
    updateTime: js.Date,
    uri: Uri
  ): PlayReadySecureStopServiceRequest = {
    val __obj = js.Dynamic.literal(beginServiceRequest = js.Any.fromFunction0(beginServiceRequest), challengeCustomData = challengeCustomData.asInstanceOf[js.Any], generateManualEnablingChallenge = js.Any.fromFunction0(generateManualEnablingChallenge), nextServiceRequest = js.Any.fromFunction0(nextServiceRequest), processManualEnablingResponse = js.Any.fromFunction1(processManualEnablingResponse), protectionSystem = protectionSystem.asInstanceOf[js.Any], publisherCertificate = publisherCertificate.asInstanceOf[js.Any], responseCustomData = responseCustomData.asInstanceOf[js.Any], sessionID = sessionID.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], stopped = stopped.asInstanceOf[js.Any], updateTime = updateTime.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayReadySecureStopServiceRequest]
  }
  
  @scala.inline
  implicit class PlayReadySecureStopServiceRequestMutableBuilder[Self <: PlayReadySecureStopServiceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBeginServiceRequest(value: () => IAsyncAction): Self = StObject.set(x, "beginServiceRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setChallengeCustomData(value: String): Self = StObject.set(x, "challengeCustomData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenerateManualEnablingChallenge(value: () => PlayReadySoapMessage): Self = StObject.set(x, "generateManualEnablingChallenge", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNextServiceRequest(value: () => IPlayReadyServiceRequest): Self = StObject.set(x, "nextServiceRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setProcessManualEnablingResponse(value: js.Array[Double] => WinRTError): Self = StObject.set(x, "processManualEnablingResponse", js.Any.fromFunction1(value))
    
    @scala.inline
    def setProtectionSystem(value: String): Self = StObject.set(x, "protectionSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublisherCertificate(value: Double): Self = StObject.set(x, "publisherCertificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseCustomData(value: String): Self = StObject.set(x, "responseCustomData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionID(value: String): Self = StObject.set(x, "sessionID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTime(value: js.Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopped(value: Boolean): Self = StObject.set(x, "stopped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTime(value: js.Date): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUri(value: Uri): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
