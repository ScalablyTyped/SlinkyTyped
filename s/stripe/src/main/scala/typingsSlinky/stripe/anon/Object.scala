package typingsSlinky.stripe.anon

import typingsSlinky.stripe.stripeStrings.alipay_account
import typingsSlinky.stripe.stripeStrings.all
import typingsSlinky.stripe.stripeStrings.bitcoin_receiver
import typingsSlinky.stripe.stripeStrings.card
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Object extends StObject {
  
  /**
    * Return charges that match this source type string. Available options are
    * "all", "alipay_account", "bitcoin_receiver", or "card".
    */
  var `object`: all | alipay_account | bitcoin_receiver | card = js.native
}
object Object {
  
  @scala.inline
  def apply(`object`: all | alipay_account | bitcoin_receiver | card): Object = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Object]
  }
  
  @scala.inline
  implicit class ObjectMutableBuilder[Self <: Object] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObject(value: all | alipay_account | bitcoin_receiver | card): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
  }
}
