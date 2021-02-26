package typingsSlinky.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.ReactNodeArray
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandContent
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandItem
import typingsSlinky.semanticUiReact.stepDescriptionMod.StepDescriptionProps
import typingsSlinky.semanticUiReact.stepTitleMod.StepTitleProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stepContentMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/elements/Step/StepContent", JSImport.Default)
  @js.native
  val default: ReactComponentClass[StepContentProps] = js.native
  
  @js.native
  trait StepContentProps
    extends StrictStepContentProps
       with /* key */ StringDictionary[js.Any]
  object StepContentProps {
    
    @scala.inline
    def apply(): StepContentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StepContentProps]
    }
  }
  
  @js.native
  trait StrictStepContentProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[js.Any] = js.native
    
    /** Primary content. */
    var children: js.UndefOr[ReactElement] = js.native
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.native
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.native
    
    /** Shorthand for StepDescription. */
    var description: js.UndefOr[SemanticShorthandItem[StepDescriptionProps]] = js.native
    
    /** Shorthand for StepTitle. */
    var title: js.UndefOr[SemanticShorthandItem[StepTitleProps]] = js.native
  }
  object StrictStepContentProps {
    
    @scala.inline
    def apply(): StrictStepContentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictStepContentProps]
    }
    
    @scala.inline
    implicit class StrictStepContentPropsMutableBuilder[Self <: StrictStepContentProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAs(value: js.Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setContent(value: SemanticShorthandContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentReactElement(value: ReactElement): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setDescription(value: SemanticShorthandItem[StepDescriptionProps]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionFunction3(
        value: (/* component */ ReactElement, StepDescriptionProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "description", js.Any.fromFunction3(value))
      
      @scala.inline
      def setDescriptionReactElement(value: ReactElement): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setTitle(value: SemanticShorthandItem[StepTitleProps]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleFunction3(
        value: (/* component */ ReactElement, StepTitleProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "title", js.Any.fromFunction3(value))
      
      @scala.inline
      def setTitleReactElement(value: ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[StepContentProps]
  
  /* This means you don't have to write `default`, but can instead just say `stepContentMod.foo` */
  override def _to: ReactComponentClass[StepContentProps] = default
}
