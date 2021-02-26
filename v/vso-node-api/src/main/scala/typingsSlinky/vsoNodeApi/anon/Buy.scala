package typingsSlinky.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Buy extends StObject {
  
  var buy: scala.Double = js.native
  
  var get: scala.Double = js.native
  
  var install: scala.Double = js.native
  
  var none: scala.Double = js.native
  
  var purchaseRequest: scala.Double = js.native
  
  var request: scala.Double = js.native
  
  var `try`: scala.Double = js.native
}
object Buy {
  
  @scala.inline
  def apply(
    buy: scala.Double,
    get: scala.Double,
    install: scala.Double,
    none: scala.Double,
    purchaseRequest: scala.Double,
    request: scala.Double,
    `try`: scala.Double
  ): Buy = {
    val __obj = js.Dynamic.literal(buy = buy.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], install = install.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], purchaseRequest = purchaseRequest.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.updateDynamic("try")(`try`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Buy]
  }
  
  @scala.inline
  implicit class BuyMutableBuilder[Self <: Buy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuy(value: scala.Double): Self = StObject.set(x, "buy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGet(value: scala.Double): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstall(value: scala.Double): Self = StObject.set(x, "install", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNone(value: scala.Double): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPurchaseRequest(value: scala.Double): Self = StObject.set(x, "purchaseRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: scala.Double): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTry(value: scala.Double): Self = StObject.set(x, "try", value.asInstanceOf[js.Any])
  }
}
