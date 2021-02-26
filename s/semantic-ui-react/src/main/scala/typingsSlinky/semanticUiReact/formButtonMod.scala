package typingsSlinky.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.ReactNodeArray
import typingsSlinky.semanticUiReact.buttonButtonMod.StrictButtonProps
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandItem
import typingsSlinky.semanticUiReact.genericMod.SemanticWIDTHS
import typingsSlinky.semanticUiReact.labelLabelMod.LabelProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formButtonMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/collections/Form/FormButton", JSImport.Default)
  @js.native
  val default: ReactComponentClass[FormButtonProps] = js.native
  
  @js.native
  trait FormButtonProps
    extends StrictFormButtonProps
       with /* key */ StringDictionary[js.Any]
  object FormButtonProps {
    
    @scala.inline
    def apply(): FormButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormButtonProps]
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.semanticUiReact.formFieldMod.StrictFormFieldProps because var conflicts: as, children, className, content, disabled, id, label, `type`. Inlined control, error, `inline`, required, width */ @js.native
  trait StrictFormButtonProps extends StrictButtonProps {
    
    /** A FormField control prop. */
    var control: js.UndefOr[js.Any] = js.native
    
    /** Individual fields may display an error state along with a message. */
    var error: js.UndefOr[Boolean | SemanticShorthandItem[LabelProps]] = js.native
    
    /** A field can have its label next to instead of above it. */
    var `inline`: js.UndefOr[Boolean] = js.native
    
    /** A field can show that input is mandatory.  Requires a label. */
    var required: js.UndefOr[js.Any] = js.native
    
    /** A field can specify its width in grid columns */
    var width: js.UndefOr[SemanticWIDTHS] = js.native
  }
  object StrictFormButtonProps {
    
    @scala.inline
    def apply(): StrictFormButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictFormButtonProps]
    }
    
    @scala.inline
    implicit class StrictFormButtonPropsMutableBuilder[Self <: StrictFormButtonProps] (val x: Self) extends AnyVal {
      
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
      
      @scala.inline
      def setRequired(value: js.Any): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      @scala.inline
      def setWidth(value: SemanticWIDTHS): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[FormButtonProps]
  
  /* This means you don't have to write `default`, but can instead just say `formButtonMod.foo` */
  override def _to: ReactComponentClass[FormButtonProps] = default
}
