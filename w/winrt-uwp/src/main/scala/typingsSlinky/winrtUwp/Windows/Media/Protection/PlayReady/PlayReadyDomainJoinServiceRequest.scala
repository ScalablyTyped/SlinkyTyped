package typingsSlinky.winrtUwp.Windows.Media.Protection.PlayReady

import typingsSlinky.winrtUwp.Windows.Foundation.IAsyncAction
import typingsSlinky.winrtUwp.Windows.Foundation.Uri
import typingsSlinky.winrtUwp.Windows.WinRTError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides the service methods for joining a PlayReady domain. */
@js.native
trait PlayReadyDomainJoinServiceRequest extends js.Object {
  /** Gets or sets the custom data of the request challenge. */
  var challengeCustomData: String = js.native
  /** Gets or sets the current domain account identifier property. */
  var domainAccountId: String = js.native
  /** Gets or sets the current domain friendly name property. */
  var domainFriendlyName: String = js.native
  /** Gets or sets the current domain service identifier property. */
  var domainServiceId: String = js.native
  /** Gets the vendor content protection system identifier. */
  var protectionSystem: String = js.native
  /** Gets the custom data that was returned in the response from the service. */
  var responseCustomData: String = js.native
  /** Gets the GUID for the type of operation that the PlayReady domain join service request performs. */
  var `type`: String = js.native
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

object PlayReadyDomainJoinServiceRequest {
  @scala.inline
  def apply(
    beginServiceRequest: () => IAsyncAction,
    challengeCustomData: String,
    domainAccountId: String,
    domainFriendlyName: String,
    domainServiceId: String,
    generateManualEnablingChallenge: () => PlayReadySoapMessage,
    nextServiceRequest: () => IPlayReadyServiceRequest,
    processManualEnablingResponse: js.Array[Double] => WinRTError,
    protectionSystem: String,
    responseCustomData: String,
    `type`: String,
    uri: Uri
  ): PlayReadyDomainJoinServiceRequest = {
    val __obj = js.Dynamic.literal(beginServiceRequest = js.Any.fromFunction0(beginServiceRequest), challengeCustomData = challengeCustomData.asInstanceOf[js.Any], domainAccountId = domainAccountId.asInstanceOf[js.Any], domainFriendlyName = domainFriendlyName.asInstanceOf[js.Any], domainServiceId = domainServiceId.asInstanceOf[js.Any], generateManualEnablingChallenge = js.Any.fromFunction0(generateManualEnablingChallenge), nextServiceRequest = js.Any.fromFunction0(nextServiceRequest), processManualEnablingResponse = js.Any.fromFunction1(processManualEnablingResponse), protectionSystem = protectionSystem.asInstanceOf[js.Any], responseCustomData = responseCustomData.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayReadyDomainJoinServiceRequest]
  }
  @scala.inline
  implicit class PlayReadyDomainJoinServiceRequestOps[Self <: PlayReadyDomainJoinServiceRequest] (val x: Self) extends AnyVal {
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
    def withDomainAccountId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainAccountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDomainFriendlyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainFriendlyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDomainServiceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainServiceId")(value.asInstanceOf[js.Any])
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
    def withResponseCustomData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseCustomData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
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

