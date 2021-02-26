package typingsSlinky.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.FunctionComponent
import typingsSlinky.react.mod.ReactNodeArray
import typingsSlinky.semanticUiReact.dimmerDimmerMod.DimmerProps
import typingsSlinky.semanticUiReact.genericMod.SemanticFLOATS
import typingsSlinky.semanticUiReact.genericMod.SemanticSIZES
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandContent
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandItem
import typingsSlinky.semanticUiReact.genericMod.SemanticVERTICALALIGNMENTS
import typingsSlinky.semanticUiReact.imageGroupMod.ImageGroupProps
import typingsSlinky.semanticUiReact.labelLabelMod.LabelProps
import typingsSlinky.semanticUiReact.semanticUiReactStrings.left
import typingsSlinky.semanticUiReact.semanticUiReactStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageImageMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/elements/Image/Image", JSImport.Default)
  @js.native
  val default: ImageComponent = js.native
  
  @js.native
  trait ImageComponent extends FunctionComponent[ImageProps] {
    
    var Group: ReactComponentClass[ImageGroupProps] = js.native
  }
  
  @js.native
  trait ImageProps
    extends StrictImageProps
       with /* key */ StringDictionary[js.Any]
  object ImageProps {
    
    @scala.inline
    def apply(): ImageProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ImageProps]
    }
  }
  
  @js.native
  trait StrictImageProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[js.Any] = js.native
    
    /** An image may be formatted to appear inline with text as an avatar. */
    var avatar: js.UndefOr[Boolean] = js.native
    
    /** An image may include a border to emphasize the edges of white or transparent content. */
    var bordered: js.UndefOr[Boolean] = js.native
    
    /** An image can appear centered in a content block. */
    var centered: js.UndefOr[Boolean] = js.native
    
    /** Primary content. */
    var children: js.UndefOr[ReactElement] = js.native
    
    /** An image may appear circular. */
    var circular: js.UndefOr[Boolean] = js.native
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.native
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.native
    
    /** Shorthand for Dimmer. */
    var dimmer: js.UndefOr[SemanticShorthandItem[DimmerProps]] = js.native
    
    /** An image can show that it is disabled and cannot be selected. */
    var disabled: js.UndefOr[Boolean] = js.native
    
    /** An image can sit to the left or right of other content. */
    var floated: js.UndefOr[SemanticFLOATS] = js.native
    
    /** An image can take up the width of its container. */
    var fluid: js.UndefOr[Boolean] = js.native
    
    /** An image can be hidden. */
    var hidden: js.UndefOr[Boolean] = js.native
    
    /** Renders the Image as an <a> tag with this href. */
    var href: js.UndefOr[String] = js.native
    
    /** An image may appear inline. */
    var `inline`: js.UndefOr[Boolean] = js.native
    
    /** Shorthand for Label. */
    var label: js.UndefOr[SemanticShorthandItem[LabelProps]] = js.native
    
    /** An image may appear rounded. */
    var rounded: js.UndefOr[Boolean] = js.native
    
    /** An image may appear at different sizes. */
    var size: js.UndefOr[SemanticSIZES] = js.native
    
    /** An image can specify that it needs an additional spacing to separate it from nearby content. */
    var spaced: js.UndefOr[Boolean | left | right] = js.native
    
    /** Whether or not to add the ui className. */
    var ui: js.UndefOr[Boolean] = js.native
    
    /** An image can specify its vertical alignment. */
    var verticalAlign: js.UndefOr[SemanticVERTICALALIGNMENTS] = js.native
    
    /** An image can render wrapped in a `div.ui.image` as alternative HTML markup. */
    var wrapped: js.UndefOr[Boolean] = js.native
  }
  object StrictImageProps {
    
    @scala.inline
    def apply(): StrictImageProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictImageProps]
    }
    
    @scala.inline
    implicit class StrictImagePropsMutableBuilder[Self <: StrictImageProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAs(value: js.Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      @scala.inline
      def setAvatar(value: Boolean): Self = StObject.set(x, "avatar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvatarUndefined: Self = StObject.set(x, "avatar", js.undefined)
      
      @scala.inline
      def setBordered(value: Boolean): Self = StObject.set(x, "bordered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderedUndefined: Self = StObject.set(x, "bordered", js.undefined)
      
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
      def setCircular(value: Boolean): Self = StObject.set(x, "circular", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCircularUndefined: Self = StObject.set(x, "circular", js.undefined)
      
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
      def setDimmer(value: SemanticShorthandItem[DimmerProps]): Self = StObject.set(x, "dimmer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimmerFunction3(
        value: (/* component */ ReactElement, DimmerProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "dimmer", js.Any.fromFunction3(value))
      
      @scala.inline
      def setDimmerReactElement(value: ReactElement): Self = StObject.set(x, "dimmer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimmerUndefined: Self = StObject.set(x, "dimmer", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setFloated(value: SemanticFLOATS): Self = StObject.set(x, "floated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFloatedUndefined: Self = StObject.set(x, "floated", js.undefined)
      
      @scala.inline
      def setFluid(value: Boolean): Self = StObject.set(x, "fluid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFluidUndefined: Self = StObject.set(x, "fluid", js.undefined)
      
      @scala.inline
      def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      @scala.inline
      def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      @scala.inline
      def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
      
      @scala.inline
      def setLabel(value: SemanticShorthandItem[LabelProps]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelFunction3(
        value: (/* component */ ReactElement, LabelProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "label", js.Any.fromFunction3(value))
      
      @scala.inline
      def setLabelReactElement(value: ReactElement): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setRounded(value: Boolean): Self = StObject.set(x, "rounded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoundedUndefined: Self = StObject.set(x, "rounded", js.undefined)
      
      @scala.inline
      def setSize(value: SemanticSIZES): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setSpaced(value: Boolean | left | right): Self = StObject.set(x, "spaced", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpacedUndefined: Self = StObject.set(x, "spaced", js.undefined)
      
      @scala.inline
      def setUi(value: Boolean): Self = StObject.set(x, "ui", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUiUndefined: Self = StObject.set(x, "ui", js.undefined)
      
      @scala.inline
      def setVerticalAlign(value: SemanticVERTICALALIGNMENTS): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalAlignUndefined: Self = StObject.set(x, "verticalAlign", js.undefined)
      
      @scala.inline
      def setWrapped(value: Boolean): Self = StObject.set(x, "wrapped", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrappedUndefined: Self = StObject.set(x, "wrapped", js.undefined)
    }
  }
  
  type _To = ImageComponent
  
  /* This means you don't have to write `default`, but can instead just say `imageImageMod.foo` */
  override def _to: ImageComponent = default
}
