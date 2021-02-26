package typingsSlinky.wordpressBlockEditor

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.react.mod.ComponentType
import typingsSlinky.wordpressBlockEditor.blockVerticalAlignmentToolbarMod.BlockVerticalAlignmentToolbar.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object blockVerticalAlignmentToolbarMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/block-editor/components/block-vertical-alignment-toolbar", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object BlockVerticalAlignmentToolbar {
    
    @js.native
    trait Props extends StObject {
      
      var children: js.UndefOr[scala.Nothing] = js.native
      
      def onChange(newValue: Value): Unit = js.native
      
      var value: Value = js.native
    }
    object Props {
      
      @scala.inline
      def apply(onChange: Value => Unit): Props = {
        val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange))
        __obj.asInstanceOf[Props]
      }
      
      @scala.inline
      implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setOnChange(value: Value => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
        
        @scala.inline
        def setValue(value: Value): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.bottom
      - typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.center
      - typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.top
      - js.UndefOr[scala.Nothing]
    */
    type Value = js.UndefOr[_Value]
    
    trait _Value extends StObject
  }
}
