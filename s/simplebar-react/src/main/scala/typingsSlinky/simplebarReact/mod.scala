package typingsSlinky.simplebarReact

import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.HTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("simplebar-react", JSImport.Default)
  @js.native
  class default ()
    extends Component[Props, js.Object, js.Any]
  
  @js.native
  trait Props extends HTMLAttributes[HTMLElement] {
    
    var options: js.UndefOr[js.Object] = js.native
    
    var scrollableNodeProps: js.UndefOr[js.Object] = js.native
  }
  object Props {
    
    @scala.inline
    def apply(): Props = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOptions(value: js.Object): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setScrollableNodeProps(value: js.Object): Self = StObject.set(x, "scrollableNodeProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollableNodePropsUndefined: Self = StObject.set(x, "scrollableNodeProps", js.undefined)
    }
  }
  
  type SimpleBar = ReactComponentClass[Props]
}
