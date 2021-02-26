package typingsSlinky.wordpressEditor

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.react.mod.ComponentType
import typingsSlinky.wordpressEditor.postSavedStateMod.PostSavedState.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object postSavedStateMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/editor/components/post-saved-state", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object PostSavedState {
    
    @js.native
    trait Props extends StObject {
      
      var children: js.UndefOr[scala.Nothing] = js.native
      
      var forceIsDirty: js.UndefOr[Boolean] = js.native
      
      var forceIsSaving: js.UndefOr[Boolean] = js.native
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
        def setForceIsDirty(value: Boolean): Self = StObject.set(x, "forceIsDirty", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setForceIsDirtyUndefined: Self = StObject.set(x, "forceIsDirty", js.undefined)
        
        @scala.inline
        def setForceIsSaving(value: Boolean): Self = StObject.set(x, "forceIsSaving", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setForceIsSavingUndefined: Self = StObject.set(x, "forceIsSaving", js.undefined)
      }
    }
  }
}
