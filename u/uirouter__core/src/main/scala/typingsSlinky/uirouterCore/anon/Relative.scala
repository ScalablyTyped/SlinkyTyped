package typingsSlinky.uirouterCore.anon

import typingsSlinky.uirouterCore.stateInterfaceMod.StateOrName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Relative extends StObject {
  
  var relative: js.UndefOr[StateOrName] = js.native
}
object Relative {
  
  @scala.inline
  def apply(): Relative = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Relative]
  }
  
  @scala.inline
  implicit class RelativeMutableBuilder[Self <: Relative] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRelative(value: StateOrName): Self = StObject.set(x, "relative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelativeUndefined: Self = StObject.set(x, "relative", js.undefined)
  }
}
