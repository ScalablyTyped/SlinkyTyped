package typingsSlinky.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.FunctionComponent
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandContent
import typingsSlinky.semanticUiReact.placeholderHeaderMod.PlaceholderHeaderProps
import typingsSlinky.semanticUiReact.placeholderImageMod.PlaceholderImageProps
import typingsSlinky.semanticUiReact.placeholderLineMod.PlaceholderLineProps
import typingsSlinky.semanticUiReact.placeholderParagraphMod.PlaceholderParagraphProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object placeholderPlaceholderMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/elements/Placeholder/Placeholder", JSImport.Default)
  @js.native
  val default: PlaceholderComponent = js.native
  
  @js.native
  trait PlaceholderComponent extends FunctionComponent[PlaceholderProps] {
    
    var Header: ReactComponentClass[PlaceholderHeaderProps] = js.native
    
    var Image: ReactComponentClass[PlaceholderImageProps] = js.native
    
    var Line: ReactComponentClass[PlaceholderLineProps] = js.native
    
    var Paragraph: ReactComponentClass[PlaceholderParagraphProps] = js.native
  }
  
  @js.native
  trait PlaceholderProps
    extends StrictPlaceholderProps
       with /* key */ StringDictionary[js.Any]
  object PlaceholderProps {
    
    @scala.inline
    def apply(): PlaceholderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PlaceholderProps]
    }
  }
  
  @js.native
  trait StrictPlaceholderProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[js.Any] = js.native
    
    /** Primary content. */
    var children: js.UndefOr[ReactElement] = js.native
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.native
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.native
    
    /** A fluid placeholder takes up the width of its container. */
    var fluid: js.UndefOr[Boolean] = js.native
    
    /** A placeholder can have their colors inverted. */
    var inverted: js.UndefOr[Boolean] = js.native
  }
  object StrictPlaceholderProps {
    
    @scala.inline
    def apply(): StrictPlaceholderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictPlaceholderProps]
    }
    
    @scala.inline
    implicit class StrictPlaceholderPropsMutableBuilder[Self <: StrictPlaceholderProps] (val x: Self) extends AnyVal {
      
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
      def setFluid(value: Boolean): Self = StObject.set(x, "fluid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFluidUndefined: Self = StObject.set(x, "fluid", js.undefined)
      
      @scala.inline
      def setInverted(value: Boolean): Self = StObject.set(x, "inverted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvertedUndefined: Self = StObject.set(x, "inverted", js.undefined)
    }
  }
  
  type _To = PlaceholderComponent
  
  /* This means you don't have to write `default`, but can instead just say `placeholderPlaceholderMod.foo` */
  override def _to: PlaceholderComponent = default
}
