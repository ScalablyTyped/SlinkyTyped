package typingsSlinky.wordpressEditor

import org.scalablytyped.runtime.Shortcut
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.ComponentType
import typingsSlinky.wordpressEditor.errorBoundaryMod.ErrorBoundary.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorBoundaryMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/editor/components/error-boundary", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object ErrorBoundary {
    
    @js.native
    trait Props extends StObject {
      
      var children: ReactElement = js.native
      
      def onError(): Unit = js.native
    }
    object Props {
      
      @scala.inline
      def apply(onError: () => Unit): Props = {
        val __obj = js.Dynamic.literal(onError = js.Any.fromFunction0(onError))
        __obj.asInstanceOf[Props]
      }
      
      @scala.inline
      implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
        
        @scala.inline
        def setOnError(value: () => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction0(value))
      }
    }
  }
}
