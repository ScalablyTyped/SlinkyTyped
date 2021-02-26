package typingsSlinky.winrt.Windows.Networking.NetworkOperators

import typingsSlinky.winrt.Windows.Data.Xml.Dom.XmlDocument
import typingsSlinky.winrt.Windows.Foundation.Uri
import typingsSlinky.winrt.Windows.Networking.Connectivity.NetworkAdapter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IHotspotAuthenticationContext extends StObject {
  
  def abortAuthentication(markAsManual: Boolean): Unit = js.native
  
  var authenticationUrl: Uri = js.native
  
  def issueCredentials(userName: String, password: String, extraParameters: String, markAsManualConnectOnFailure: Boolean): Unit = js.native
  
  var networkAdapter: NetworkAdapter = js.native
  
  var redirectMessageUrl: Uri = js.native
  
  var redirectMessageXml: XmlDocument = js.native
  
  def skipAuthentication(): Unit = js.native
  
  def triggerAttentionRequired(packageRelativeApplicationId: String, applicationParameters: String): Unit = js.native
  
  var wirelessNetworkId: js.typedarray.Uint8Array = js.native
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
  implicit class IHotspotAuthenticationContextMutableBuilder[Self <: IHotspotAuthenticationContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbortAuthentication(value: Boolean => Unit): Self = StObject.set(x, "abortAuthentication", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAuthenticationUrl(value: Uri): Self = StObject.set(x, "authenticationUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssueCredentials(value: (String, String, String, Boolean) => Unit): Self = StObject.set(x, "issueCredentials", js.Any.fromFunction4(value))
    
    @scala.inline
    def setNetworkAdapter(value: NetworkAdapter): Self = StObject.set(x, "networkAdapter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedirectMessageUrl(value: Uri): Self = StObject.set(x, "redirectMessageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedirectMessageXml(value: XmlDocument): Self = StObject.set(x, "redirectMessageXml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipAuthentication(value: () => Unit): Self = StObject.set(x, "skipAuthentication", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTriggerAttentionRequired(value: (String, String) => Unit): Self = StObject.set(x, "triggerAttentionRequired", js.Any.fromFunction2(value))
    
    @scala.inline
    def setWirelessNetworkId(value: js.typedarray.Uint8Array): Self = StObject.set(x, "wirelessNetworkId", value.asInstanceOf[js.Any])
  }
}
