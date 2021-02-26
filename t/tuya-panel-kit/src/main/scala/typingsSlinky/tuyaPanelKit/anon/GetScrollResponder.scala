package typingsSlinky.tuyaPanelKit.anon

import slinky.core.facade.ReactElement
import typingsSlinky.tuyaPanelKit.useScrollToTopMod.ScrollableWrapper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetScrollResponder extends ScrollableWrapper {
  
  def getScrollResponder(): ReactElement = js.native
}
object GetScrollResponder {
  
  @scala.inline
  def apply(getScrollResponder: () => ReactElement): GetScrollResponder = {
    val __obj = js.Dynamic.literal(getScrollResponder = js.Any.fromFunction0(getScrollResponder))
    __obj.asInstanceOf[GetScrollResponder]
  }
  
  @scala.inline
  implicit class GetScrollResponderMutableBuilder[Self <: GetScrollResponder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetScrollResponder(value: () => ReactElement): Self = StObject.set(x, "getScrollResponder", js.Any.fromFunction0(value))
  }
}
