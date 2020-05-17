package typingsSlinky.winrtUwp.Windows.Media.Protection.PlayReady

import typingsSlinky.winrtUwp.Windows.Foundation.IAsyncAction
import typingsSlinky.winrtUwp.Windows.Foundation.Uri
import typingsSlinky.winrtUwp.Windows.WinRTError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Manages secure stop messages. */
@js.native
trait PlayReadySecureStopServiceRequest extends js.Object {
  /** Gets or sets the custom data of the request challenge. */
  var challengeCustomData: String = js.native
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
  /**
    * Begins an asynchronous service request operation.
    * @return The asynchronous service action.
    */
  def beginServiceRequest(): IAsyncAction = js.native
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
  implicit class PlayReadySecureStopServiceRequestOps[Self <: PlayReadySecureStopServiceRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBeginServiceRequest(value: () => IAsyncAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beginServiceRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withChallengeCustomData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("challengeCustomData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGenerateManualEnablingChallenge(value: () => PlayReadySoapMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateManualEnablingChallenge")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNextServiceRequest(value: () => IPlayReadyServiceRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextServiceRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withProcessManualEnablingResponse(value: js.Array[Double] => WinRTError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processManualEnablingResponse")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withProtectionSystem(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protectionSystem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublisherCertificate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publisherCertificate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResponseCustomData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseCustomData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSessionID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStopped(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUri(value: Uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

