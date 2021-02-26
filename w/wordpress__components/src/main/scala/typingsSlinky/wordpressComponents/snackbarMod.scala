package typingsSlinky.wordpressComponents

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.react.mod.ComponentType
import typingsSlinky.wordpressComponents.noticeMod.Notice.Action
import typingsSlinky.wordpressComponents.snackbarMod.Snackbar.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object snackbarMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/components/snackbar", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object Snackbar {
    
    @js.native
    trait Props extends StObject {
      
      /**
        * An array of `Notice.Action` objects.
        */
      var actions: js.UndefOr[js.Array[Action]] = js.native
      
      var className: js.UndefOr[String] = js.native
      
      /**
        * Callback to be called when the snackbar is to be removed.
        */
      var onRemove: js.UndefOr[js.Function0[Unit]] = js.native
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
        def setActions(value: js.Array[Action]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
        
        @scala.inline
        def setActionsVarargs(value: Action*): Self = StObject.set(x, "actions", js.Array(value :_*))
        
        @scala.inline
        def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
        
        @scala.inline
        def setOnRemove(value: () => Unit): Self = StObject.set(x, "onRemove", js.Any.fromFunction0(value))
        
        @scala.inline
        def setOnRemoveUndefined: Self = StObject.set(x, "onRemove", js.undefined)
      }
    }
  }
}
