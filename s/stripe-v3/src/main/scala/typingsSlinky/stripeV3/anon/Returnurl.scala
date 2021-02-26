package typingsSlinky.stripeV3.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Returnurl extends StObject {
  
  var return_url: String = js.native
}
object Returnurl {
  
  @scala.inline
  def apply(return_url: String): Returnurl = {
    val __obj = js.Dynamic.literal(return_url = return_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Returnurl]
  }
  
  @scala.inline
  implicit class ReturnurlMutableBuilder[Self <: Returnurl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReturn_url(value: String): Self = StObject.set(x, "return_url", value.asInstanceOf[js.Any])
  }
}
