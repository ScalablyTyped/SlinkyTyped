package typingsSlinky.semanticUiProgress.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-progress.SemanticUI.Progress.RandomSettings._Impl, 'max'> */
@js.native
trait PickImplmax extends StObject {
  
  var max: Double = js.native
}
object PickImplmax {
  
  @scala.inline
  def apply(max: Double): PickImplmax = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplmax]
  }
  
  @scala.inline
  implicit class PickImplmaxMutableBuilder[Self <: PickImplmax] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
  }
}
