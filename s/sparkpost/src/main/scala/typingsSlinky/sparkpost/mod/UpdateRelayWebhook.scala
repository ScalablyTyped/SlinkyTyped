package typingsSlinky.sparkpost.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateRelayWebhook extends StObject {
  
  /** Authentication token to present in the X-MessageSystems-Webhook-Token header of POST requests to target */
  var auth_token: js.UndefOr[String] = js.native
  
  /** Restrict which inbound messages will be relayed to the target */
  var `match`: js.UndefOr[Match] = js.native
  
  /** User-friendly name  no  example: Inbound Customer Replies */
  var name: js.UndefOr[String] = js.native
  
  /** URL of the target to which to POST relay batches */
  var target: String = js.native
}
object UpdateRelayWebhook {
  
  @scala.inline
  def apply(target: String): UpdateRelayWebhook = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRelayWebhook]
  }
  
  @scala.inline
  implicit class UpdateRelayWebhookMutableBuilder[Self <: UpdateRelayWebhook] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth_token(value: String): Self = StObject.set(x, "auth_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuth_tokenUndefined: Self = StObject.set(x, "auth_token", js.undefined)
    
    @scala.inline
    def setMatch(value: Match): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
