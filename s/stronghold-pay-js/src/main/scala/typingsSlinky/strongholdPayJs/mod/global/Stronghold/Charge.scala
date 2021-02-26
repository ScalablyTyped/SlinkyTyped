package typingsSlinky.strongholdPayJs.mod.global.Stronghold

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Charge extends StObject {
  
  var amount: Double = js.native
  
  var created_at: String = js.native
  
  var id: String = js.native
  
  var status: CHARGE_STATUS = js.native
  
  var `type`: CHARGE_TYPE = js.native
}
object Charge {
  
  @scala.inline
  def apply(amount: Double, created_at: String, id: String, status: CHARGE_STATUS, `type`: CHARGE_TYPE): Charge = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Charge]
  }
  
  @scala.inline
  implicit class ChargeMutableBuilder[Self <: Charge] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: CHARGE_STATUS): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: CHARGE_TYPE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
