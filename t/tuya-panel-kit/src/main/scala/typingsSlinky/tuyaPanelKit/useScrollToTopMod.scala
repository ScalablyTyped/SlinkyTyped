package typingsSlinky.tuyaPanelKit

import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import typingsSlinky.tuyaPanelKit.anon.Animated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useScrollToTopMod {
  
  @JSImport("tuya-panel-kit/@react-navigation/native/useScrollToTop", JSImport.Default)
  @js.native
  def default(ref: ReactRef[ScrollableWrapper]): Unit = js.native
  
  // tslint:disable-next-line strict-export-declare-modifiers interface-over-type-literal
  @js.native
  trait ScrollOptions extends StObject {
    
    var animated: js.UndefOr[Boolean] = js.native
    
    var y: js.UndefOr[Double] = js.native
  }
  object ScrollOptions {
    
    @scala.inline
    def apply(): ScrollOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScrollOptions]
    }
    
    @scala.inline
    implicit class ScrollOptionsMutableBuilder[Self <: ScrollOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  // tslint:disable-next-line strict-export-declare-modifiers interface-over-type-literal
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.tuyaPanelKit.anon.ScrollToTop
    - typingsSlinky.tuyaPanelKit.anon.ScrollTo
    - typingsSlinky.tuyaPanelKit.anon.ScrollToOffset
    - typingsSlinky.tuyaPanelKit.anon.ScrollResponderScrollTo
  */
  trait ScrollableView extends ScrollableWrapper
  object ScrollableView {
    
    @scala.inline
    def ScrollResponderScrollTo(scrollResponderScrollTo: ScrollOptions => Unit): typingsSlinky.tuyaPanelKit.anon.ScrollResponderScrollTo = {
      val __obj = js.Dynamic.literal(scrollResponderScrollTo = js.Any.fromFunction1(scrollResponderScrollTo))
      __obj.asInstanceOf[typingsSlinky.tuyaPanelKit.anon.ScrollResponderScrollTo]
    }
    
    @scala.inline
    def ScrollTo(scrollTo: ScrollOptions => Unit): typingsSlinky.tuyaPanelKit.anon.ScrollTo = {
      val __obj = js.Dynamic.literal(scrollTo = js.Any.fromFunction1(scrollTo))
      __obj.asInstanceOf[typingsSlinky.tuyaPanelKit.anon.ScrollTo]
    }
    
    @scala.inline
    def ScrollToOffset(scrollToOffset: Animated => Unit): typingsSlinky.tuyaPanelKit.anon.ScrollToOffset = {
      val __obj = js.Dynamic.literal(scrollToOffset = js.Any.fromFunction1(scrollToOffset))
      __obj.asInstanceOf[typingsSlinky.tuyaPanelKit.anon.ScrollToOffset]
    }
    
    @scala.inline
    def ScrollToTop(scrollToTop: () => Unit): typingsSlinky.tuyaPanelKit.anon.ScrollToTop = {
      val __obj = js.Dynamic.literal(scrollToTop = js.Any.fromFunction0(scrollToTop))
      __obj.asInstanceOf[typingsSlinky.tuyaPanelKit.anon.ScrollToTop]
    }
  }
  
  // tslint:disable-next-line strict-export-declare-modifiers
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.tuyaPanelKit.anon.GetScrollResponder
    - typingsSlinky.tuyaPanelKit.anon.GetNode
    - typingsSlinky.tuyaPanelKit.useScrollToTopMod.ScrollableView
  */
  trait ScrollableWrapper extends StObject
  object ScrollableWrapper {
    
    @scala.inline
    def GetNode(getNode: () => ScrollableView): typingsSlinky.tuyaPanelKit.anon.GetNode = {
      val __obj = js.Dynamic.literal(getNode = js.Any.fromFunction0(getNode))
      __obj.asInstanceOf[typingsSlinky.tuyaPanelKit.anon.GetNode]
    }
    
    @scala.inline
    def GetScrollResponder(getScrollResponder: () => ReactElement): typingsSlinky.tuyaPanelKit.anon.GetScrollResponder = {
      val __obj = js.Dynamic.literal(getScrollResponder = js.Any.fromFunction0(getScrollResponder))
      __obj.asInstanceOf[typingsSlinky.tuyaPanelKit.anon.GetScrollResponder]
    }
    
    @scala.inline
    def ScrollResponderScrollTo(scrollResponderScrollTo: ScrollOptions => Unit): typingsSlinky.tuyaPanelKit.anon.ScrollResponderScrollTo = {
      val __obj = js.Dynamic.literal(scrollResponderScrollTo = js.Any.fromFunction1(scrollResponderScrollTo))
      __obj.asInstanceOf[typingsSlinky.tuyaPanelKit.anon.ScrollResponderScrollTo]
    }
    
    @scala.inline
    def ScrollTo(scrollTo: ScrollOptions => Unit): typingsSlinky.tuyaPanelKit.anon.ScrollTo = {
      val __obj = js.Dynamic.literal(scrollTo = js.Any.fromFunction1(scrollTo))
      __obj.asInstanceOf[typingsSlinky.tuyaPanelKit.anon.ScrollTo]
    }
    
    @scala.inline
    def ScrollToOffset(scrollToOffset: Animated => Unit): typingsSlinky.tuyaPanelKit.anon.ScrollToOffset = {
      val __obj = js.Dynamic.literal(scrollToOffset = js.Any.fromFunction1(scrollToOffset))
      __obj.asInstanceOf[typingsSlinky.tuyaPanelKit.anon.ScrollToOffset]
    }
    
    @scala.inline
    def ScrollToTop(scrollToTop: () => Unit): typingsSlinky.tuyaPanelKit.anon.ScrollToTop = {
      val __obj = js.Dynamic.literal(scrollToTop = js.Any.fromFunction0(scrollToTop))
      __obj.asInstanceOf[typingsSlinky.tuyaPanelKit.anon.ScrollToTop]
    }
  }
}
