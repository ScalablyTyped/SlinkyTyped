package typingsSlinky.wordpressBlockEditor

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.ComponentClass
import typingsSlinky.react.mod.FunctionComponent
import typingsSlinky.std.Omit
import typingsSlinky.wordpressBlockEditor.anon.PartialProps
import typingsSlinky.wordpressBlockEditor.mod.EditorColor
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.colors
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.disableCustomColors
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.hasColorsToChoose
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object withColorContextMod {
  
  object default {
    
    // prettier-ignore
    @JSImport("@wordpress/block-editor/components/color-palette/with-color-context", JSImport.Default)
    @js.native
    def apply[ProvidedProps /* <: PartialProps */, OwnProps /* <: js.Any */](component: ComponentClass[ProvidedProps with OwnProps, js.Object]): ReactComponentClass[
        (Omit[_, colors | disableCustomColors | hasColorsToChoose]) with (Omit[ProvidedProps, hasColorsToChoose])
      ] = js.native
    @JSImport("@wordpress/block-editor/components/color-palette/with-color-context", JSImport.Default)
    @js.native
    def apply[ProvidedProps /* <: PartialProps */, OwnProps /* <: js.Any */](component: FunctionComponent[ProvidedProps with OwnProps]): ReactComponentClass[
        (Omit[_, colors | disableCustomColors | hasColorsToChoose]) with (Omit[ProvidedProps, hasColorsToChoose])
      ] = js.native
  }
  
  object withColorContext {
    
    @js.native
    trait Props extends StObject {
      
      var colors: js.Array[EditorColor] = js.native
      
      var disableCustomColors: Boolean = js.native
      
      var hasColorsToChoose: Boolean = js.native
    }
    object Props {
      
      @scala.inline
      def apply(colors: js.Array[EditorColor], disableCustomColors: Boolean, hasColorsToChoose: Boolean): Props = {
        val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], disableCustomColors = disableCustomColors.asInstanceOf[js.Any], hasColorsToChoose = hasColorsToChoose.asInstanceOf[js.Any])
        __obj.asInstanceOf[Props]
      }
      
      @scala.inline
      implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setColors(value: js.Array[EditorColor]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setColorsVarargs(value: EditorColor*): Self = StObject.set(x, "colors", js.Array(value :_*))
        
        @scala.inline
        def setDisableCustomColors(value: Boolean): Self = StObject.set(x, "disableCustomColors", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHasColorsToChoose(value: Boolean): Self = StObject.set(x, "hasColorsToChoose", value.asInstanceOf[js.Any])
      }
    }
  }
}
