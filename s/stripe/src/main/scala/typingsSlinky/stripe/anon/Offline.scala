package typingsSlinky.stripe.anon

import typingsSlinky.stripe.stripeStrings.accepted
import typingsSlinky.stripe.stripeStrings.offline
import typingsSlinky.stripe.stripeStrings.online
import typingsSlinky.stripe.stripeStrings.refused
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Offline extends StObject {
  
  var date: js.UndefOr[Double] = js.native
  
  var ip: js.UndefOr[String] = js.native
  
  var offline: js.UndefOr[Contactemail] = js.native
  
  var online: js.UndefOr[Ip] = js.native
  
  var status: accepted | refused = js.native
  
  var `type`: online | offline = js.native
  
  var user_agent: js.UndefOr[String] = js.native
}
object Offline {
  
  @scala.inline
  def apply(status: accepted | refused, `type`: online | offline): Offline = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Offline]
  }
  
  @scala.inline
  implicit class OfflineMutableBuilder[Self <: Offline] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDate(value: Double): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    @scala.inline
    def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpUndefined: Self = StObject.set(x, "ip", js.undefined)
    
    @scala.inline
    def setOffline(value: Contactemail): Self = StObject.set(x, "offline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfflineUndefined: Self = StObject.set(x, "offline", js.undefined)
    
    @scala.inline
    def setOnline(value: Ip): Self = StObject.set(x, "online", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnlineUndefined: Self = StObject.set(x, "online", js.undefined)
    
    @scala.inline
    def setStatus(value: accepted | refused): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: online | offline): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser_agent(value: String): Self = StObject.set(x, "user_agent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser_agentUndefined: Self = StObject.set(x, "user_agent", js.undefined)
  }
}
