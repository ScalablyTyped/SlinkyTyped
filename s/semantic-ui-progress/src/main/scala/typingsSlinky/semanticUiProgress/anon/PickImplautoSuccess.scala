package typingsSlinky.semanticUiProgress.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-progress.SemanticUI.ProgressSettings._Impl, 'autoSuccess'> */
@js.native
trait PickImplautoSuccess extends StObject {
  
  var autoSuccess: Boolean = js.native
}
object PickImplautoSuccess {
  
  @scala.inline
  def apply(autoSuccess: Boolean): PickImplautoSuccess = {
    val __obj = js.Dynamic.literal(autoSuccess = autoSuccess.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplautoSuccess]
  }
  
  @scala.inline
  implicit class PickImplautoSuccessMutableBuilder[Self <: PickImplautoSuccess] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoSuccess(value: Boolean): Self = StObject.set(x, "autoSuccess", value.asInstanceOf[js.Any])
  }
}
