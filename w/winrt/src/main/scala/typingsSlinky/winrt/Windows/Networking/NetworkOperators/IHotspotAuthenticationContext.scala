package typingsSlinky.winrt.Windows.Networking.NetworkOperators

import typingsSlinky.winrt.Windows.Data.Xml.Dom.XmlDocument
import typingsSlinky.winrt.Windows.Foundation.Uri
import typingsSlinky.winrt.Windows.Networking.Connectivity.NetworkAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHotspotAuthenticationContext extends js.Object {
  var authenticationUrl: Uri = js.native
  var networkAdapter: NetworkAdapter = js.native
  var redirectMessageUrl: Uri = js.native
  var redirectMessageXml: XmlDocument = js.native
  var wirelessNetworkId: js.typedarray.Uint8Array = js.native
  def abortAuthentication(markAsManual: Boolean): Unit = js.native
  def issueCredentials(userName: String, password: String, extraParameters: String, markAsManualConnectOnFailure: Boolean): Unit = js.native
  def skipAuthentication(): Unit = js.native
  def triggerAttentionRequired(packageRelativeApplicationId: String, applicationParameters: String): Unit = js.native
}

object IHotspotAuthenticationContext {
  @scala.inline
  def apply(
    abortAuthentication: Boolean => Unit,
    authenticationUrl: Uri,
    issueCredentials: (String, String, String, Boolean) => Unit,
    networkAdapter: NetworkAdapter,
    redirectMessageUrl: Uri,
    redirectMessageXml: XmlDocument,
    skipAuthentication: () => Unit,
    triggerAttentionRequired: (String, String) => Unit,
    wirelessNetworkId: js.typedarray.Uint8Array
  ): IHotspotAuthenticationContext = {
    val __obj = js.Dynamic.literal(abortAuthentication = js.Any.fromFunction1(abortAuthentication), authenticationUrl = authenticationUrl.asInstanceOf[js.Any], issueCredentials = js.Any.fromFunction4(issueCredentials), networkAdapter = networkAdapter.asInstanceOf[js.Any], redirectMessageUrl = redirectMessageUrl.asInstanceOf[js.Any], redirectMessageXml = redirectMessageXml.asInstanceOf[js.Any], skipAuthentication = js.Any.fromFunction0(skipAuthentication), triggerAttentionRequired = js.Any.fromFunction2(triggerAttentionRequired), wirelessNetworkId = wirelessNetworkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHotspotAuthenticationContext]
  }
  @scala.inline
  implicit class IHotspotAuthenticationContextOps[Self <: IHotspotAuthenticationContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbortAuthentication(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abortAuthentication")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAuthenticationUrl(value: Uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authenticationUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIssueCredentials(value: (String, String, String, Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issueCredentials")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withNetworkAdapter(value: NetworkAdapter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkAdapter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRedirectMessageUrl(value: Uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirectMessageUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRedirectMessageXml(value: XmlDocument): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirectMessageXml")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSkipAuthentication(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipAuthentication")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTriggerAttentionRequired(value: (String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerAttentionRequired")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withWirelessNetworkId(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wirelessNetworkId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

