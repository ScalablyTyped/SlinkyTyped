package typingsSlinky.semanticUiShape.anon

import typingsSlinky.semanticUiShape.SemanticUI.Shape.ErrorSettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-shape.SemanticUI.ShapeSettings._Impl, 'error'> */
@js.native
trait PickImplerror extends StObject {
  
  var error: ErrorSettings = js.native
}
object PickImplerror {
  
  @scala.inline
  def apply(error: ErrorSettings): PickImplerror = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplerror]
  }
  
  @scala.inline
  implicit class PickImplerrorMutableBuilder[Self <: PickImplerror] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: ErrorSettings): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
  }
}
