package typingsSlinky.tuyaPanelKit.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetInitialState extends StObject {
  
  def getInitialState(): js.Thenable[js.UndefOr[PartialPickReadonlykeystrHistory]] = js.native
}
object GetInitialState {
  
  @scala.inline
  def apply(getInitialState: () => js.Thenable[js.UndefOr[PartialPickReadonlykeystrHistory]]): GetInitialState = {
    val __obj = js.Dynamic.literal(getInitialState = js.Any.fromFunction0(getInitialState))
    __obj.asInstanceOf[GetInitialState]
  }
  
  @scala.inline
  implicit class GetInitialStateMutableBuilder[Self <: GetInitialState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetInitialState(value: () => js.Thenable[js.UndefOr[PartialPickReadonlykeystrHistory]]): Self = StObject.set(x, "getInitialState", js.Any.fromFunction0(value))
  }
}
