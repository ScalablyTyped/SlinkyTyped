package typingsSlinky.wordpressBlockEditor

import org.scalablytyped.runtime.Shortcut
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.ComponentType
import typingsSlinky.react.mod.ReactFragment
import typingsSlinky.wordpressBlockEditor.anon.OnClick
import typingsSlinky.wordpressBlockEditor.warningMod.Warning.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object warningMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/block-editor/components/warning", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object Warning {
    
    @js.native
    trait Props extends StObject {
      
      var actions: js.UndefOr[ReactFragment] = js.native
      
      var children: ReactElement = js.native
      
      var className: js.UndefOr[String] = js.native
      
      var secondaryActions: js.UndefOr[js.Array[OnClick]] = js.native
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
        def setActions(value: ReactFragment): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
        
        @scala.inline
        def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
        
        @scala.inline
        def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
        
        @scala.inline
        def setSecondaryActions(value: js.Array[OnClick]): Self = StObject.set(x, "secondaryActions", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSecondaryActionsUndefined: Self = StObject.set(x, "secondaryActions", js.undefined)
        
        @scala.inline
        def setSecondaryActionsVarargs(value: OnClick*): Self = StObject.set(x, "secondaryActions", js.Array(value :_*))
      }
    }
  }
}
