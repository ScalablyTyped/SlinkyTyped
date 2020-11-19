package typingsSlinky.winrtUwp.Windows.Networking.NetworkOperators

import typingsSlinky.winrtUwp.Windows.Data.Xml.Dom.XmlDocument
import typingsSlinky.winrtUwp.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the results of a Hotspot authentication request. */
@js.native
trait HotspotCredentialsAuthenticationResult extends js.Object {
  
  /** Provides the XML blob containing the WISPr authentication reply message from the server. */
  var authenticationReplyXml: XmlDocument = js.native
  
  /** Indicates if a network error has occurred that prevented the authentication attempt. If true, the other properties should not be examined. */
  var hasNetworkErrorOccurred: Boolean = js.native
  
  /** Provides the most recent Logoff URL as returned from the server in the authentication reply or from an earlier redirect message. If no Logoff URL was provided by the server, this property returns an empty URI. */
  var logoffUrl: Uri = js.native
  
  /** Provides the WISPr Response Code for the authentication attempt as returned from the server. Possible values are defined by HotspotAuthenticationResponseCode . */
  var responseCode: HotspotAuthenticationResponseCode = js.native
}
object HotspotCredentialsAuthenticationResult {
  
  @scala.inline
  def apply(
    authenticationReplyXml: XmlDocument,
    hasNetworkErrorOccurred: Boolean,
    logoffUrl: Uri,
    responseCode: HotspotAuthenticationResponseCode
  ): HotspotCredentialsAuthenticationResult = {
    val __obj = js.Dynamic.literal(authenticationReplyXml = authenticationReplyXml.asInstanceOf[js.Any], hasNetworkErrorOccurred = hasNetworkErrorOccurred.asInstanceOf[js.Any], logoffUrl = logoffUrl.asInstanceOf[js.Any], responseCode = responseCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[HotspotCredentialsAuthenticationResult]
  }
  
  @scala.inline
  implicit class HotspotCredentialsAuthenticationResultOps[Self <: HotspotCredentialsAuthenticationResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAuthenticationReplyXml(value: XmlDocument): Self = this.set("authenticationReplyXml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasNetworkErrorOccurred(value: Boolean): Self = this.set("hasNetworkErrorOccurred", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogoffUrl(value: Uri): Self = this.set("logoffUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseCode(value: HotspotAuthenticationResponseCode): Self = this.set("responseCode", value.asInstanceOf[js.Any])
  }
}
