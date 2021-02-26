package typingsSlinky.sparkpost.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Match extends StObject {
  
  /** Inbound domain associated with this webhook. Required when protocol is “SMTP”. */
  var domain: js.UndefOr[String] = js.native
  
  /** ESME address binding associated with this webhook  yes, when protocol is “SMPP”. SparkPost Enterprise API only. */
  var esme_address: js.UndefOr[String] = js.native
  
  /** Inbound messaging protocol associated with this webhook. Defaults to “SMTP” */
  var protocol: js.UndefOr[String] = js.native
}
object Match {
  
  @scala.inline
  def apply(): Match = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Match]
  }
  
  @scala.inline
  implicit class MatchMutableBuilder[Self <: Match] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    @scala.inline
    def setEsme_address(value: String): Self = StObject.set(x, "esme_address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEsme_addressUndefined: Self = StObject.set(x, "esme_address", js.undefined)
    
    @scala.inline
    def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
  }
}
