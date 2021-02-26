package typingsSlinky.sparkpost.mod

import typingsSlinky.sparkpost.sparkpostStrings.active
import typingsSlinky.sparkpost.sparkpostStrings.suspended
import typingsSlinky.sparkpost.sparkpostStrings.terminated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubaccountInformation extends StObject {
  
  var compliance_status: String = js.native
  
  /** ID of subaccount */
  var id: Double = js.native
  
  /** The ID of the default IP Pool assigned to this subaccount’s transmissions */
  var ip_pool: js.UndefOr[String] = js.native
  
  /** User friendly identifier for a specific subaccount */
  var name: String = js.native
  
  /** Status of the account */
  var status: active | suspended | terminated = js.native
}
object SubaccountInformation {
  
  @scala.inline
  def apply(compliance_status: String, id: Double, name: String, status: active | suspended | terminated): SubaccountInformation = {
    val __obj = js.Dynamic.literal(compliance_status = compliance_status.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubaccountInformation]
  }
  
  @scala.inline
  implicit class SubaccountInformationMutableBuilder[Self <: SubaccountInformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompliance_status(value: String): Self = StObject.set(x, "compliance_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIp_pool(value: String): Self = StObject.set(x, "ip_pool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIp_poolUndefined: Self = StObject.set(x, "ip_pool", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: active | suspended | terminated): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
