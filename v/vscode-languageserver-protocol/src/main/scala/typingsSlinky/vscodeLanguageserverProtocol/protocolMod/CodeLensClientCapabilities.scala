package typingsSlinky.vscodeLanguageserverProtocol.protocolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CodeLensClientCapabilities extends StObject {
  
  /**
    * Whether code lens supports dynamic registration.
    */
  var dynamicRegistration: js.UndefOr[Boolean] = js.native
}
object CodeLensClientCapabilities {
  
  @scala.inline
  def apply(): CodeLensClientCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CodeLensClientCapabilities]
  }
  
  @scala.inline
  implicit class CodeLensClientCapabilitiesMutableBuilder[Self <: CodeLensClientCapabilities] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDynamicRegistration(value: Boolean): Self = StObject.set(x, "dynamicRegistration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamicRegistrationUndefined: Self = StObject.set(x, "dynamicRegistration", js.undefined)
  }
}
