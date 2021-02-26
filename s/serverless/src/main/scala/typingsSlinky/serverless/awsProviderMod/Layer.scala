package typingsSlinky.serverless.awsProviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Layer extends StObject {
  
  var allowedAccounts: js.UndefOr[js.Array[String]] = js.native
  
  var compatibleRuntimes: js.UndefOr[js.Array[String]] = js.native
  
  var description: js.UndefOr[String] = js.native
  
  var licenseInfo: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var path: String = js.native
  
  var retain: js.UndefOr[Boolean] = js.native
}
object Layer {
  
  @scala.inline
  def apply(path: String): Layer = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Layer]
  }
  
  @scala.inline
  implicit class LayerMutableBuilder[Self <: Layer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowedAccounts(value: js.Array[String]): Self = StObject.set(x, "allowedAccounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedAccountsUndefined: Self = StObject.set(x, "allowedAccounts", js.undefined)
    
    @scala.inline
    def setAllowedAccountsVarargs(value: String*): Self = StObject.set(x, "allowedAccounts", js.Array(value :_*))
    
    @scala.inline
    def setCompatibleRuntimes(value: js.Array[String]): Self = StObject.set(x, "compatibleRuntimes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompatibleRuntimesUndefined: Self = StObject.set(x, "compatibleRuntimes", js.undefined)
    
    @scala.inline
    def setCompatibleRuntimesVarargs(value: String*): Self = StObject.set(x, "compatibleRuntimes", js.Array(value :_*))
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setLicenseInfo(value: String): Self = StObject.set(x, "licenseInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLicenseInfoUndefined: Self = StObject.set(x, "licenseInfo", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetain(value: Boolean): Self = StObject.set(x, "retain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetainUndefined: Self = StObject.set(x, "retain", js.undefined)
  }
}
