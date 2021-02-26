package typingsSlinky.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.ReactNodeArray
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandContent
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandItem
import typingsSlinky.semanticUiReact.labelLabelMod.LabelProps
import typingsSlinky.semanticUiReact.radioRadioMod.StrictRadioProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formRadioMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/collections/Form/FormRadio", JSImport.Default)
  @js.native
  val default: ReactComponentClass[FormRadioProps] = js.native
  
  @js.native
  trait FormRadioProps
    extends StrictFormRadioProps
       with /* key */ StringDictionary[js.Any]
  object FormRadioProps {
    
    @scala.inline
    def apply(): FormRadioProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormRadioProps]
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.semanticUiReact.formFieldMod.StrictFormFieldProps because var conflicts: as, children, className, disabled, id, label, required, `type`, width. Inlined content, control, error, `inline` */ @js.native
  trait StrictFormRadioProps extends StrictRadioProps {
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.native
    
    /** A FormField control prop. */
    var control: js.UndefOr[js.Any] = js.native
    
    /** Individual fields may display an error state along with a message. */
    var error: js.UndefOr[Boolean | SemanticShorthandItem[LabelProps]] = js.native
    
    /** A field can have its label next to instead of above it. */
    var `inline`: js.UndefOr[Boolean] = js.native
  }
  object StrictFormRadioProps {
    
    @scala.inline
    def apply(): StrictFormRadioProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictFormRadioProps]
    }
    
    @scala.inline
    implicit class StrictFormRadioPropsMutableBuilder[Self <: StrictFormRadioProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: SemanticShorthandContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentReactElement(value: ReactElement): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setControl(value: js.Any): Self = StObject.set(x, "control", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setControlUndefined: Self = StObject.set(x, "control", js.undefined)
      
      @scala.inline
      def setError(value: Boolean | SemanticShorthandItem[LabelProps]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorFunction3(
        value: (/* component */ ReactElement, LabelProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "error", js.Any.fromFunction3(value))
      
      @scala.inline
      def setErrorReactElement(value: ReactElement): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[FormRadioProps]
  
  /* This means you don't have to write `default`, but can instead just say `formRadioMod.foo` */
  override def _to: ReactComponentClass[FormRadioProps] = default
}
