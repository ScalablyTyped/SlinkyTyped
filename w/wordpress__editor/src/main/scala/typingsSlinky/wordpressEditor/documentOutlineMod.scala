package typingsSlinky.wordpressEditor

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.react.mod.ComponentType
import typingsSlinky.wordpressEditor.documentOutlineMod.DocumentOutline.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object documentOutlineMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/editor/components/document-outline", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object DocumentOutline {
    
    @js.native
    trait Props extends StObject {
      
      var children: js.UndefOr[scala.Nothing] = js.native
      
      var hasOutlineItemsDisabled: js.UndefOr[Boolean] = js.native
      
      def onSelect(): Unit = js.native
    }
    object Props {
      
      @scala.inline
      def apply(onSelect: () => Unit): Props = {
        val __obj = js.Dynamic.literal(onSelect = js.Any.fromFunction0(onSelect))
        __obj.asInstanceOf[Props]
      }
      
      @scala.inline
      implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setHasOutlineItemsDisabled(value: Boolean): Self = StObject.set(x, "hasOutlineItemsDisabled", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHasOutlineItemsDisabledUndefined: Self = StObject.set(x, "hasOutlineItemsDisabled", js.undefined)
        
        @scala.inline
        def setOnSelect(value: () => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction0(value))
      }
    }
  }
}
