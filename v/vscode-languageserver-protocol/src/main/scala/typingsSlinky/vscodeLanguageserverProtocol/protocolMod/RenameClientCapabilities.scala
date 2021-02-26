package typingsSlinky.vscodeLanguageserverProtocol.protocolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RenameClientCapabilities extends StObject {
  
  /**
    * Whether rename supports dynamic registration.
    */
  var dynamicRegistration: js.UndefOr[Boolean] = js.native
  
  /**
    * Client supports testing for validity of rename operations
    * before execution.
    *
    * @since version 3.12.0
    */
  var prepareSupport: js.UndefOr[Boolean] = js.native
}
object RenameClientCapabilities {
  
  @scala.inline
  def apply(): RenameClientCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenameClientCapabilities]
  }
  
  @scala.inline
  implicit class RenameClientCapabilitiesMutableBuilder[Self <: RenameClientCapabilities] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDynamicRegistration(value: Boolean): Self = StObject.set(x, "dynamicRegistration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamicRegistrationUndefined: Self = StObject.set(x, "dynamicRegistration", js.undefined)
    
    @scala.inline
    def setPrepareSupport(value: Boolean): Self = StObject.set(x, "prepareSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrepareSupportUndefined: Self = StObject.set(x, "prepareSupport", js.undefined)
  }
}
