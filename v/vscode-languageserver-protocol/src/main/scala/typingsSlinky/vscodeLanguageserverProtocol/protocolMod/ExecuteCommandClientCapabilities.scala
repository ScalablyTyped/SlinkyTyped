package typingsSlinky.vscodeLanguageserverProtocol.protocolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExecuteCommandClientCapabilities extends StObject {
  
  /**
    * Execute command supports dynamic registration.
    */
  var dynamicRegistration: js.UndefOr[Boolean] = js.native
}
object ExecuteCommandClientCapabilities {
  
  @scala.inline
  def apply(): ExecuteCommandClientCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecuteCommandClientCapabilities]
  }
  
  @scala.inline
  implicit class ExecuteCommandClientCapabilitiesMutableBuilder[Self <: ExecuteCommandClientCapabilities] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDynamicRegistration(value: Boolean): Self = StObject.set(x, "dynamicRegistration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamicRegistrationUndefined: Self = StObject.set(x, "dynamicRegistration", js.undefined)
  }
}
