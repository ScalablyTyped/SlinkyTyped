package typingsSlinky.tuyaPanelKit.anon

import typingsSlinky.tuyaPanelKit.useScrollToTopMod.ScrollOptions
import typingsSlinky.tuyaPanelKit.useScrollToTopMod.ScrollableView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScrollResponderScrollTo extends ScrollableView {
  
  def scrollResponderScrollTo(options: ScrollOptions): Unit = js.native
}
object ScrollResponderScrollTo {
  
  @scala.inline
  def apply(scrollResponderScrollTo: ScrollOptions => Unit): ScrollResponderScrollTo = {
    val __obj = js.Dynamic.literal(scrollResponderScrollTo = js.Any.fromFunction1(scrollResponderScrollTo))
    __obj.asInstanceOf[ScrollResponderScrollTo]
  }
  
  @scala.inline
  implicit class ScrollResponderScrollToMutableBuilder[Self <: ScrollResponderScrollTo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScrollResponderScrollTo(value: ScrollOptions => Unit): Self = StObject.set(x, "scrollResponderScrollTo", js.Any.fromFunction1(value))
  }
}
