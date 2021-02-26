package typingsSlinky.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLAnchorElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.ComponentClass
import typingsSlinky.react.mod.ReactNodeArray
import typingsSlinky.semanticUiReact.cardContentMod.CardContentProps
import typingsSlinky.semanticUiReact.cardDescriptionMod.CardDescriptionProps
import typingsSlinky.semanticUiReact.cardGroupMod.CardGroupProps
import typingsSlinky.semanticUiReact.cardHeaderMod.CardHeaderProps
import typingsSlinky.semanticUiReact.cardMetaMod.CardMetaProps
import typingsSlinky.semanticUiReact.genericMod.SemanticCOLORS
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandContent
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandItem
import typingsSlinky.semanticUiReact.imageImageMod.ImageProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardCardMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react/dist/commonjs/views/Card/Card", JSImport.Default)
  @js.native
  class default protected ()
    extends Component[CardProps, js.Object, js.Any] {
    def this(props: CardProps) = this()
    def this(props: CardProps, context: js.Any) = this()
  }
  @JSImport("semantic-ui-react/dist/commonjs/views/Card/Card", JSImport.Default)
  @js.native
  val default: CardComponent = js.native
  
  @js.native
  trait CardComponent
    extends ComponentClass[CardProps, js.Object] {
    
    var Content: ReactComponentClass[CardContentProps] = js.native
    
    var Description: ReactComponentClass[CardDescriptionProps] = js.native
    
    var Group: ReactComponentClass[CardGroupProps] = js.native
    
    var Header: ReactComponentClass[CardHeaderProps] = js.native
    
    var Meta: ReactComponentClass[CardMetaProps] = js.native
  }
  
  @js.native
  trait CardProps
    extends StrictCardProps
       with /* key */ StringDictionary[js.Any]
  object CardProps {
    
    @scala.inline
    def apply(): CardProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardProps]
    }
  }
  
  @js.native
  trait StrictCardProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[js.Any] = js.native
    
    /** A Card can center itself inside its container. */
    var centered: js.UndefOr[Boolean] = js.native
    
    /** Primary content. */
    var children: js.UndefOr[ReactElement] = js.native
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.native
    
    /** A Card can be formatted to display different colors. */
    var color: js.UndefOr[SemanticCOLORS] = js.native
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.native
    
    /** Shorthand for CardDescription. */
    var description: js.UndefOr[SemanticShorthandItem[CardDescriptionProps]] = js.native
    
    /** Shorthand for primary content of CardContent. */
    var extra: js.UndefOr[SemanticShorthandContent] = js.native
    
    /** A Card can be formatted to take up the width of its container. */
    var fluid: js.UndefOr[Boolean] = js.native
    
    /** Shorthand for CardHeader. */
    var header: js.UndefOr[SemanticShorthandItem[CardHeaderProps]] = js.native
    
    /** Render as an `a` tag instead of a `div` and adds the href attribute. */
    var href: js.UndefOr[String] = js.native
    
    /** A card can contain an Image component. */
    var image: js.UndefOr[SemanticShorthandItem[ImageProps]] = js.native
    
    /** A card can be formatted to link to other content. */
    var link: js.UndefOr[Boolean] = js.native
    
    /** Shorthand for CardMeta. */
    var meta: js.UndefOr[SemanticShorthandItem[CardMetaProps]] = js.native
    
    /**
      * Called on click. When passed, the component renders as an `a`
      * tag by default instead of a `div`.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props.
      */
    var onClick: js.UndefOr[
        js.Function2[/* event */ SyntheticMouseEvent[HTMLAnchorElement], /* data */ CardProps, Unit]
      ] = js.native
    
    /** A Card can be formatted to raise above the page. */
    var raised: js.UndefOr[Boolean] = js.native
  }
  object StrictCardProps {
    
    @scala.inline
    def apply(): StrictCardProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictCardProps]
    }
    
    @scala.inline
    implicit class StrictCardPropsMutableBuilder[Self <: StrictCardProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAs(value: js.Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      @scala.inline
      def setCentered(value: Boolean): Self = StObject.set(x, "centered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenteredUndefined: Self = StObject.set(x, "centered", js.undefined)
      
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
      def setColor(value: SemanticCOLORS): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setContent(value: SemanticShorthandContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentReactElement(value: ReactElement): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setDescription(value: SemanticShorthandItem[CardDescriptionProps]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionFunction3(
        value: (/* component */ ReactElement, CardDescriptionProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "description", js.Any.fromFunction3(value))
      
      @scala.inline
      def setDescriptionReactElement(value: ReactElement): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setExtra(value: SemanticShorthandContent): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraReactElement(value: ReactElement): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
      
      @scala.inline
      def setFluid(value: Boolean): Self = StObject.set(x, "fluid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFluidUndefined: Self = StObject.set(x, "fluid", js.undefined)
      
      @scala.inline
      def setHeader(value: SemanticShorthandItem[CardHeaderProps]): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderFunction3(
        value: (/* component */ ReactElement, CardHeaderProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "header", js.Any.fromFunction3(value))
      
      @scala.inline
      def setHeaderReactElement(value: ReactElement): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      @scala.inline
      def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      @scala.inline
      def setImage(value: SemanticShorthandItem[ImageProps]): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageFunction3(
        value: (/* component */ ReactElement, ImageProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "image", js.Any.fromFunction3(value))
      
      @scala.inline
      def setImageReactElement(value: ReactElement): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      @scala.inline
      def setLink(value: Boolean): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
      
      @scala.inline
      def setMeta(value: SemanticShorthandItem[CardMetaProps]): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetaFunction3(
        value: (/* component */ ReactElement, CardMetaProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "meta", js.Any.fromFunction3(value))
      
      @scala.inline
      def setMetaReactElement(value: ReactElement): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      @scala.inline
      def setOnClick(value: (/* event */ SyntheticMouseEvent[HTMLAnchorElement], /* data */ CardProps) => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setRaised(value: Boolean): Self = StObject.set(x, "raised", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRaisedUndefined: Self = StObject.set(x, "raised", js.undefined)
    }
  }
  
  type _To = CardComponent
  
  /* This means you don't have to write `default`, but can instead just say `cardCardMod.foo` */
  override def _to: CardComponent = default
}
