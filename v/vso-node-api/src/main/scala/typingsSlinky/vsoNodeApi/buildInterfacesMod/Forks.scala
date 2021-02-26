package typingsSlinky.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Forks extends StObject {
  
  /**
    * Indicates whether a build should use secrets when building forks of the selected repository.
    */
  var allowSecrets: Boolean = js.native
  
  /**
    * Indicates whether the trigger should queue builds for forks of the selected repository.
    */
  var enabled: Boolean = js.native
}
object Forks {
  
  @scala.inline
  def apply(allowSecrets: Boolean, enabled: Boolean): Forks = {
    val __obj = js.Dynamic.literal(allowSecrets = allowSecrets.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[Forks]
  }
  
  @scala.inline
  implicit class ForksMutableBuilder[Self <: Forks] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowSecrets(value: Boolean): Self = StObject.set(x, "allowSecrets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
  }
}
