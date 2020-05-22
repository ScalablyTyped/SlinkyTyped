package typingsSlinky.winrt.global.Windows.Networking.NetworkOperators

import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Networking.NetworkOperators.ProvisioningAgent")
@js.native
class ProvisioningAgent ()
  extends typingsSlinky.winrt.Windows.Networking.NetworkOperators.ProvisioningAgent {
  /* CompleteClass */
  override def getProvisionedProfile(
    mediaType: typingsSlinky.winrt.Windows.Networking.NetworkOperators.ProfileMediaType,
    profileName: String
  ): typingsSlinky.winrt.Windows.Networking.NetworkOperators.ProvisionedProfile = js.native
  /* CompleteClass */
  override def provisionFromXmlDocumentAsync(provisioningXmlDocument: String): IAsyncOperation[
    typingsSlinky.winrt.Windows.Networking.NetworkOperators.ProvisionFromXmlDocumentResults
  ] = js.native
}

/* static members */
@JSGlobal("Windows.Networking.NetworkOperators.ProvisioningAgent")
@js.native
object ProvisioningAgent extends js.Object {
  def createFromNetworkAccountId(networkAccountId: String): typingsSlinky.winrt.Windows.Networking.NetworkOperators.ProvisioningAgent = js.native
}

