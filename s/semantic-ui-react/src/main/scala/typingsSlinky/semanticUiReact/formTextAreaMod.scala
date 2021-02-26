package typingsSlinky.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.ReactNodeArray
import typingsSlinky.semanticUiReact.genericMod.HtmlLabelProps
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandContent
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandItem
import typingsSlinky.semanticUiReact.genericMod.SemanticWIDTHS
import typingsSlinky.semanticUiReact.labelLabelMod.LabelProps
import typingsSlinky.semanticUiReact.textAreaTextAreaMod.StrictTextAreaProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formTextAreaMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/collections/Form/FormTextArea", JSImport.Default)
  @js.native
  val default: ReactComponentClass[FormTextAreaProps] = js.native
  
  @js.native
  trait FormTextAreaProps
    extends StrictFormTextAreaProps
       with /* key */ StringDictionary[js.Any]
  object FormTextAreaProps {
    
    @scala.inline
    def apply(): FormTextAreaProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormTextAreaProps]
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.semanticUiReact.formFieldMod.StrictFormFieldProps because var conflicts: as, children, className, disabled, id, required. Inlined content, control, error, `inline`, label, `type`, width */ @js.native
  trait StrictFormTextAreaProps extends StrictTextAreaProps {
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.native
    
    /** A FormField control prop. */
    var control: js.UndefOr[js.Any] = js.native
    
    /** Individual fields may display an error state along with a message. */
    var error: js.UndefOr[Boolean | SemanticShorthandItem[LabelProps]] = js.native
    
    /** A field can have its label next to instead of above it. */
    var `inline`: js.UndefOr[Boolean] = js.native
    
    /** Mutually exclusive with children. */
    var label: js.UndefOr[SemanticShorthandItem[HtmlLabelProps]] = js.native
    
    /** Passed to the control component (i.e. <input type='password' />) */
    var `type`: js.UndefOr[String] = js.native
    
    /** A field can specify its width in grid columns */
    var width: js.UndefOr[SemanticWIDTHS] = js.native
  }
  object StrictFormTextAreaProps {
    
    @scala.inline
    def apply(): StrictFormTextAreaProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictFormTextAreaProps]
    }
    
    @scala.inline
    implicit class StrictFormTextAreaPropsMutableBuilder[Self <: StrictFormTextAreaProps] (val x: Self) extends AnyVal {
      
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
      
      @scala.inline
      def setLabel(value: SemanticShorthandItem[HtmlLabelProps]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelFunction3(
        value: (/* component */ ReactElement, HtmlLabelProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "label", js.Any.fromFunction3(value))
      
      @scala.inline
      def setLabelReactElement(value: ReactElement): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setWidth(value: SemanticWIDTHS): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[FormTextAreaProps]
  
  /* This means you don't have to write `default`, but can instead just say `formTextAreaMod.foo` */
  override def _to: ReactComponentClass[FormTextAreaProps] = default
}
