package typingsSlinky.winrtUwp.Windows.Media.Protection.PlayReady

import typingsSlinky.winrtUwp.Windows.Foundation.IAsyncAction
import typingsSlinky.winrtUwp.Windows.Foundation.Uri
import typingsSlinky.winrtUwp.Windows.WinRTError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Performs a license acquisition process. */
@js.native
trait IPlayReadyLicenseAcquisitionServiceRequest extends IPlayReadyServiceRequest {
  
  /** Gets the current content header property. */
  var contentHeader: PlayReadyContentHeader = js.native
  
  /** Gets the current domain service identifier property that overrides a service identifier in the content header. */
  var domainServiceId: String = js.native
}
object IPlayReadyLicenseAcquisitionServiceRequest {
  
  @scala.inline
  def apply(
    beginServiceRequest: () => IAsyncAction,
    challengeCustomData: String,
    contentHeader: PlayReadyContentHeader,
    domainServiceId: String,
    generateManualEnablingChallenge: () => PlayReadySoapMessage,
    nextServiceRequest: () => IPlayReadyServiceRequest,
    processManualEnablingResponse: js.Array[Double] => WinRTError,
    protectionSystem: String,
    responseCustomData: String,
    `type`: String,
    uri: Uri
  ): IPlayReadyLicenseAcquisitionServiceRequest = {
    val __obj = js.Dynamic.literal(beginServiceRequest = js.Any.fromFunction0(beginServiceRequest), challengeCustomData = challengeCustomData.asInstanceOf[js.Any], contentHeader = contentHeader.asInstanceOf[js.Any], domainServiceId = domainServiceId.asInstanceOf[js.Any], generateManualEnablingChallenge = js.Any.fromFunction0(generateManualEnablingChallenge), nextServiceRequest = js.Any.fromFunction0(nextServiceRequest), processManualEnablingResponse = js.Any.fromFunction1(processManualEnablingResponse), protectionSystem = protectionSystem.asInstanceOf[js.Any], responseCustomData = responseCustomData.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPlayReadyLicenseAcquisitionServiceRequest]
  }
  
  @scala.inline
  implicit class IPlayReadyLicenseAcquisitionServiceRequestMutableBuilder[Self <: IPlayReadyLicenseAcquisitionServiceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentHeader(value: PlayReadyContentHeader): Self = StObject.set(x, "contentHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainServiceId(value: String): Self = StObject.set(x, "domainServiceId", value.asInstanceOf[js.Any])
  }
}
