package typingsSlinky.stripe.anon

import typingsSlinky.stripe.stripeStrings.fraudulent
import typingsSlinky.stripe.stripeStrings.safe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Userreport extends StObject {
  
  /**
    * If you believe a charge is fraudulent, include a user_report key with a value of fraudulent. If you believe a
    * charge is safe, include a user_report key with a value of safe. Note that you must refund a charge before setting
    * the user_report to fraudulent. Stripe will use the information you send to improve our fraud detection algorithm
    */
  var user_report: js.UndefOr[fraudulent | safe] = js.native
}
object Userreport {
  
  @scala.inline
  def apply(): Userreport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Userreport]
  }
  
  @scala.inline
  implicit class UserreportMutableBuilder[Self <: Userreport] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUser_report(value: fraudulent | safe): Self = StObject.set(x, "user_report", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser_reportUndefined: Self = StObject.set(x, "user_report", js.undefined)
  }
}
