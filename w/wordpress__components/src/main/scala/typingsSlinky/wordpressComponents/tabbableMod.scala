package typingsSlinky.wordpressComponents

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.ComponentType
import typingsSlinky.react.mod.HTMLProps
import typingsSlinky.wordpressComponents.tabbableMod.TabbableContainer.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabbableMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/components/navigable-container/tabbable", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object TabbableContainer {
    
    @js.native
    trait Props extends HTMLProps[HTMLDivElement] {
      
      @JSName("children")
      var children_Props: ReactElement = js.native
      
      /**
        * A boolean which tells the component whether or not to cycle from the
        * end back to the beginning and vice versa.
        * @defaultValue true
        */
      var cycle: js.UndefOr[Boolean] = js.native
      
      /**
        * A callback invoked when the menu navigates to one of its children
        * passing the index and child as an argument.
        */
      var onNavigate: js.UndefOr[js.Function2[/* nextIndex */ Double, /* focusedElement */ HTMLElement, Unit]] = js.native
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
        def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
        
        @scala.inline
        def setCycle(value: Boolean): Self = StObject.set(x, "cycle", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCycleUndefined: Self = StObject.set(x, "cycle", js.undefined)
        
        @scala.inline
        def setOnNavigate(value: (/* nextIndex */ Double, /* focusedElement */ HTMLElement) => Unit): Self = StObject.set(x, "onNavigate", js.Any.fromFunction2(value))
        
        @scala.inline
        def setOnNavigateUndefined: Self = StObject.set(x, "onNavigate", js.undefined)
      }
    }
  }
}
