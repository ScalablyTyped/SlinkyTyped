package typingsSlinky.winrtUwp.Windows.UI.Input

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides access to the type of user input that triggered the edge gesture event. */
@js.native
trait EdgeGestureEventArgs extends StObject {
  
  /** Gets the type of user input that triggered the edge gesture event. */
  var kind: EdgeGestureKind = js.native
}
object EdgeGestureEventArgs {
  
  @scala.inline
  def apply(kind: EdgeGestureKind): EdgeGestureEventArgs = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[EdgeGestureEventArgs]
  }
  
  @scala.inline
  implicit class EdgeGestureEventArgsMutableBuilder[Self <: EdgeGestureEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: EdgeGestureKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
