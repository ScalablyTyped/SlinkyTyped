package typingsSlinky.tuyaPanelKit.anon

import typingsSlinky.tuyaPanelKit.routersTypesMod.NavigationAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Noop extends StObject {
  
  /**
    * The action object which was dispatched.
    */
  var action: NavigationAction = js.native
  
  /**
    * Whether the action was a no-op, i.e. resulted any state changes.
    */
  var noop: Boolean = js.native
}
object Noop {
  
  @scala.inline
  def apply(action: NavigationAction, noop: Boolean): Noop = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], noop = noop.asInstanceOf[js.Any])
    __obj.asInstanceOf[Noop]
  }
  
  @scala.inline
  implicit class NoopMutableBuilder[Self <: Noop] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: NavigationAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoop(value: Boolean): Self = StObject.set(x, "noop", value.asInstanceOf[js.Any])
  }
}
