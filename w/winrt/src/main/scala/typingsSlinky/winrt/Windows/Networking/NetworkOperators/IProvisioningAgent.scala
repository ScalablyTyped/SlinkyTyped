package typingsSlinky.winrt.Windows.Networking.NetworkOperators

import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IProvisioningAgent extends js.Object {
  def getProvisionedProfile(mediaType: ProfileMediaType, profileName: String): ProvisionedProfile = js.native
  def provisionFromXmlDocumentAsync(provisioningXmlDocument: String): IAsyncOperation[ProvisionFromXmlDocumentResults] = js.native
}

object IProvisioningAgent {
  @scala.inline
  def apply(
    getProvisionedProfile: (ProfileMediaType, String) => ProvisionedProfile,
    provisionFromXmlDocumentAsync: String => IAsyncOperation[ProvisionFromXmlDocumentResults]
  ): IProvisioningAgent = {
    val __obj = js.Dynamic.literal(getProvisionedProfile = js.Any.fromFunction2(getProvisionedProfile), provisionFromXmlDocumentAsync = js.Any.fromFunction1(provisionFromXmlDocumentAsync))
    __obj.asInstanceOf[IProvisioningAgent]
  }
  @scala.inline
  implicit class IProvisioningAgentOps[Self <: IProvisioningAgent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetProvisionedProfile(value: (ProfileMediaType, String) => ProvisionedProfile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getProvisionedProfile")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withProvisionFromXmlDocumentAsync(value: String => IAsyncOperation[ProvisionFromXmlDocumentResults]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provisionFromXmlDocumentAsync")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

