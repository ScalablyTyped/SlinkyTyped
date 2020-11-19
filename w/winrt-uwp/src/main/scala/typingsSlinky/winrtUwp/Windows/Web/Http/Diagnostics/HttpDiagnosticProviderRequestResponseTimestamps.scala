package typingsSlinky.winrtUwp.Windows.Web.Http.Diagnostics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides all the timestamps for connection events. */
@js.native
trait HttpDiagnosticProviderRequestResponseTimestamps extends js.Object {
  
  /** Gets the last time local cache was checked. */
  var cacheCheckedTimestamp: js.Date = js.native
  
  /** Gets the timestamp for the end of the TCP connection phase. */
  var connectionCompletedTimestamp: js.Date = js.native
  
  /** Gets the timestamp for the start of the TCP connection phase. */
  var connectionInitiatedTimestamp: js.Date = js.native
  
  /** Gets the time of the DNS name resolution. */
  var nameResolvedTimestamp: js.Date = js.native
  
  /** Gets the timestamp for the last byte sent. */
  var requestCompletedTimestamp: js.Date = js.native
  
  /** Gets the timestamp for the first byte sent. */
  var requestSentTimestamp: js.Date = js.native
  
  /** Gets the timestamp for the last byte received. */
  var responseCompletedTimestamp: js.Date = js.native
  
  /** Gets the timestamp for the fir byte received. */
  var responseReceivedTimestamp: js.Date = js.native
  
  /** Gets the time of the SSL handshake negotiation. */
  var sslNegotiatedTimestamp: js.Date = js.native
}
object HttpDiagnosticProviderRequestResponseTimestamps {
  
  @scala.inline
  def apply(
    cacheCheckedTimestamp: js.Date,
    connectionCompletedTimestamp: js.Date,
    connectionInitiatedTimestamp: js.Date,
    nameResolvedTimestamp: js.Date,
    requestCompletedTimestamp: js.Date,
    requestSentTimestamp: js.Date,
    responseCompletedTimestamp: js.Date,
    responseReceivedTimestamp: js.Date,
    sslNegotiatedTimestamp: js.Date
  ): HttpDiagnosticProviderRequestResponseTimestamps = {
    val __obj = js.Dynamic.literal(cacheCheckedTimestamp = cacheCheckedTimestamp.asInstanceOf[js.Any], connectionCompletedTimestamp = connectionCompletedTimestamp.asInstanceOf[js.Any], connectionInitiatedTimestamp = connectionInitiatedTimestamp.asInstanceOf[js.Any], nameResolvedTimestamp = nameResolvedTimestamp.asInstanceOf[js.Any], requestCompletedTimestamp = requestCompletedTimestamp.asInstanceOf[js.Any], requestSentTimestamp = requestSentTimestamp.asInstanceOf[js.Any], responseCompletedTimestamp = responseCompletedTimestamp.asInstanceOf[js.Any], responseReceivedTimestamp = responseReceivedTimestamp.asInstanceOf[js.Any], sslNegotiatedTimestamp = sslNegotiatedTimestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpDiagnosticProviderRequestResponseTimestamps]
  }
  
  @scala.inline
  implicit class HttpDiagnosticProviderRequestResponseTimestampsOps[Self <: HttpDiagnosticProviderRequestResponseTimestamps] (val x: Self) extends AnyVal {
    
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
    def setCacheCheckedTimestamp(value: js.Date): Self = this.set("cacheCheckedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionCompletedTimestamp(value: js.Date): Self = this.set("connectionCompletedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionInitiatedTimestamp(value: js.Date): Self = this.set("connectionInitiatedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameResolvedTimestamp(value: js.Date): Self = this.set("nameResolvedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestCompletedTimestamp(value: js.Date): Self = this.set("requestCompletedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestSentTimestamp(value: js.Date): Self = this.set("requestSentTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseCompletedTimestamp(value: js.Date): Self = this.set("responseCompletedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseReceivedTimestamp(value: js.Date): Self = this.set("responseReceivedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSslNegotiatedTimestamp(value: js.Date): Self = this.set("sslNegotiatedTimestamp", value.asInstanceOf[js.Any])
  }
}
