package typingsSlinky.semanticUiReact.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.ReactNodeArray
import typingsSlinky.react.mod.ReactType
import typingsSlinky.semanticUiReact.dimmerDimmerMod.DimmerProps
import typingsSlinky.semanticUiReact.genericMod.SemanticFLOATS
import typingsSlinky.semanticUiReact.genericMod.SemanticSIZES
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandContent
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandItem
import typingsSlinky.semanticUiReact.genericMod.SemanticVERTICALALIGNMENTS
import typingsSlinky.semanticUiReact.imageImageMod.ImageProps
import typingsSlinky.semanticUiReact.itemContentMod.ItemContentProps
import typingsSlinky.semanticUiReact.itemDescriptionMod.ItemDescriptionProps
import typingsSlinky.semanticUiReact.itemExtraMod.ItemExtraProps
import typingsSlinky.semanticUiReact.itemGroupMod.ItemGroupProps
import typingsSlinky.semanticUiReact.itemHeaderMod.ItemHeaderProps
import typingsSlinky.semanticUiReact.itemImageMod.ItemImageProps
import typingsSlinky.semanticUiReact.itemItemMod.ItemProps
import typingsSlinky.semanticUiReact.itemMetaMod.ItemMetaProps
import typingsSlinky.semanticUiReact.labelLabelMod.LabelProps
import typingsSlinky.semanticUiReact.semanticUiReactStrings.left
import typingsSlinky.semanticUiReact.semanticUiReactStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Item {
  @JSImport("semantic-ui-react", "Item")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def as(value: js.Any): this.type = set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def contentReactElement(value: ReactElement): this.type = set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def content(value: SemanticShorthandContent): this.type = set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def descriptionReactElement(value: ReactElement): this.type = set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def descriptionFunction3(
      value: (/* component */ ReactType[ItemDescriptionProps], ItemDescriptionProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
    ): this.type = set("description", js.Any.fromFunction3(value))
    @scala.inline
    def description(value: SemanticShorthandItem[ItemDescriptionProps]): this.type = set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def extraReactElement(value: ReactElement): this.type = set("extra", value.asInstanceOf[js.Any])
    @scala.inline
    def extraFunction3(
      value: (/* component */ ReactType[ItemExtraProps], ItemExtraProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
    ): this.type = set("extra", js.Any.fromFunction3(value))
    @scala.inline
    def extra(value: SemanticShorthandItem[ItemExtraProps]): this.type = set("extra", value.asInstanceOf[js.Any])
    @scala.inline
    def headerReactElement(value: ReactElement): this.type = set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def headerFunction3(
      value: (/* component */ ReactType[ItemHeaderProps], ItemHeaderProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
    ): this.type = set("header", js.Any.fromFunction3(value))
    @scala.inline
    def header(value: SemanticShorthandItem[ItemHeaderProps]): this.type = set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def imageReactElement(value: ReactElement): this.type = set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def imageFunction3(
      value: (/* component */ ReactType[ItemImageProps], ItemImageProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
    ): this.type = set("image", js.Any.fromFunction3(value))
    @scala.inline
    def image(value: SemanticShorthandItem[ItemImageProps]): this.type = set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def metaReactElement(value: ReactElement): this.type = set("meta", value.asInstanceOf[js.Any])
    @scala.inline
    def metaFunction3(
      value: (/* component */ ReactType[ItemMetaProps], ItemMetaProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
    ): this.type = set("meta", js.Any.fromFunction3(value))
    @scala.inline
    def meta(value: SemanticShorthandItem[ItemMetaProps]): this.type = set("meta", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ItemProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Item.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  object Content {
    @JSImport("semantic-ui-react", "Item.Content")
    @js.native
    object component extends js.Object
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, js.Object] {
      @scala.inline
      def as(value: js.Any): this.type = set("as", value.asInstanceOf[js.Any])
      @scala.inline
      def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
      @scala.inline
      def contentReactElement(value: ReactElement): this.type = set("content", value.asInstanceOf[js.Any])
      @scala.inline
      def content(value: SemanticShorthandContent): this.type = set("content", value.asInstanceOf[js.Any])
      @scala.inline
      def descriptionReactElement(value: ReactElement): this.type = set("description", value.asInstanceOf[js.Any])
      @scala.inline
      def descriptionFunction3(
        value: (/* component */ ReactType[ItemDescriptionProps], ItemDescriptionProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
      ): this.type = set("description", js.Any.fromFunction3(value))
      @scala.inline
      def description(value: SemanticShorthandItem[ItemDescriptionProps]): this.type = set("description", value.asInstanceOf[js.Any])
      @scala.inline
      def extraReactElement(value: ReactElement): this.type = set("extra", value.asInstanceOf[js.Any])
      @scala.inline
      def extraFunction3(
        value: (/* component */ ReactType[ItemExtraProps], ItemExtraProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
      ): this.type = set("extra", js.Any.fromFunction3(value))
      @scala.inline
      def extra(value: SemanticShorthandItem[ItemExtraProps]): this.type = set("extra", value.asInstanceOf[js.Any])
      @scala.inline
      def headerReactElement(value: ReactElement): this.type = set("header", value.asInstanceOf[js.Any])
      @scala.inline
      def headerFunction3(
        value: (/* component */ ReactType[ItemHeaderProps], ItemHeaderProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
      ): this.type = set("header", js.Any.fromFunction3(value))
      @scala.inline
      def header(value: SemanticShorthandItem[ItemHeaderProps]): this.type = set("header", value.asInstanceOf[js.Any])
      @scala.inline
      def metaReactElement(value: ReactElement): this.type = set("meta", value.asInstanceOf[js.Any])
      @scala.inline
      def metaFunction3(
        value: (/* component */ ReactType[ItemMetaProps], ItemMetaProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
      ): this.type = set("meta", js.Any.fromFunction3(value))
      @scala.inline
      def meta(value: SemanticShorthandItem[ItemMetaProps]): this.type = set("meta", value.asInstanceOf[js.Any])
      @scala.inline
      def verticalAlign(value: SemanticVERTICALALIGNMENTS): this.type = set("verticalAlign", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: ItemContentProps): typingsSlinky.semanticUiReact.components.Item.Content.Builder = new typingsSlinky.semanticUiReact.components.Item.Content.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
    implicit def make(companion: Content.type): typingsSlinky.semanticUiReact.components.Item.Content.Builder = new typingsSlinky.semanticUiReact.components.Item.Content.Builder(js.Array(this.component, js.Dictionary.empty))()
  }
  
  object Extra {
    @JSImport("semantic-ui-react", "Item.Extra")
    @js.native
    object component extends js.Object
    
    def withProps(p: ItemExtraProps): SharedBuilder_ItemExtraProps1716559528 = new SharedBuilder_ItemExtraProps1716559528(js.Array(this.component, p.asInstanceOf[js.Any]))
    implicit def make(companion: Extra.type): SharedBuilder_ItemExtraProps1716559528 = new SharedBuilder_ItemExtraProps1716559528(js.Array(this.component, js.Dictionary.empty))()
  }
  
  object Image {
    @JSImport("semantic-ui-react", "Item.Image")
    @js.native
    object component extends js.Object
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, js.Object] {
      @scala.inline
      def as(value: js.Any): this.type = set("as", value.asInstanceOf[js.Any])
      @scala.inline
      def avatar(value: Boolean): this.type = set("avatar", value.asInstanceOf[js.Any])
      @scala.inline
      def bordered(value: Boolean): this.type = set("bordered", value.asInstanceOf[js.Any])
      @scala.inline
      def centered(value: Boolean): this.type = set("centered", value.asInstanceOf[js.Any])
      @scala.inline
      def circular(value: Boolean): this.type = set("circular", value.asInstanceOf[js.Any])
      @scala.inline
      def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
      @scala.inline
      def contentReactElement(value: ReactElement): this.type = set("content", value.asInstanceOf[js.Any])
      @scala.inline
      def content(value: SemanticShorthandContent): this.type = set("content", value.asInstanceOf[js.Any])
      @scala.inline
      def dimmerReactElement(value: ReactElement): this.type = set("dimmer", value.asInstanceOf[js.Any])
      @scala.inline
      def dimmerFunction3(
        value: (/* component */ ReactType[DimmerProps], DimmerProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
      ): this.type = set("dimmer", js.Any.fromFunction3(value))
      @scala.inline
      def dimmer(value: SemanticShorthandItem[DimmerProps]): this.type = set("dimmer", value.asInstanceOf[js.Any])
      @scala.inline
      def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
      @scala.inline
      def floated(value: SemanticFLOATS): this.type = set("floated", value.asInstanceOf[js.Any])
      @scala.inline
      def fluid(value: Boolean): this.type = set("fluid", value.asInstanceOf[js.Any])
      @scala.inline
      def hidden(value: Boolean): this.type = set("hidden", value.asInstanceOf[js.Any])
      @scala.inline
      def href(value: String): this.type = set("href", value.asInstanceOf[js.Any])
      @scala.inline
      def `inline`(value: Boolean): this.type = set("inline", value.asInstanceOf[js.Any])
      @scala.inline
      def labelReactElement(value: ReactElement): this.type = set("label", value.asInstanceOf[js.Any])
      @scala.inline
      def labelFunction3(
        value: (/* component */ ReactType[LabelProps], LabelProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
      ): this.type = set("label", js.Any.fromFunction3(value))
      @scala.inline
      def label(value: SemanticShorthandItem[LabelProps]): this.type = set("label", value.asInstanceOf[js.Any])
      @scala.inline
      def rounded(value: Boolean): this.type = set("rounded", value.asInstanceOf[js.Any])
      @scala.inline
      def size(value: SemanticSIZES): this.type = set("size", value.asInstanceOf[js.Any])
      @scala.inline
      def spaced(value: Boolean | left | right): this.type = set("spaced", value.asInstanceOf[js.Any])
      @scala.inline
      def ui(value: Boolean): this.type = set("ui", value.asInstanceOf[js.Any])
      @scala.inline
      def verticalAlign(value: SemanticVERTICALALIGNMENTS): this.type = set("verticalAlign", value.asInstanceOf[js.Any])
      @scala.inline
      def wrapped(value: Boolean): this.type = set("wrapped", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: ImageProps): typingsSlinky.semanticUiReact.components.Item.Image.Builder = new typingsSlinky.semanticUiReact.components.Item.Image.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
    implicit def make(companion: Image.type): typingsSlinky.semanticUiReact.components.Item.Image.Builder = new typingsSlinky.semanticUiReact.components.Item.Image.Builder(js.Array(this.component, js.Dictionary.empty))()
  }
  
  object Header {
    @JSImport("semantic-ui-react", "Item.Header")
    @js.native
    object component extends js.Object
    
    def withProps(p: ItemHeaderProps): SharedBuilder_ItemHeaderProps464154223 = new SharedBuilder_ItemHeaderProps464154223(js.Array(this.component, p.asInstanceOf[js.Any]))
    implicit def make(companion: Header.type): SharedBuilder_ItemHeaderProps464154223 = new SharedBuilder_ItemHeaderProps464154223(js.Array(this.component, js.Dictionary.empty))()
  }
  
  object Group {
    @JSImport("semantic-ui-react", "Item.Group")
    @js.native
    object component extends js.Object
    
    def withProps(p: ItemGroupProps): SharedBuilder_ItemGroupProps1433844644 = new SharedBuilder_ItemGroupProps1433844644(js.Array(this.component, p.asInstanceOf[js.Any]))
    implicit def make(companion: Group.type): SharedBuilder_ItemGroupProps1433844644 = new SharedBuilder_ItemGroupProps1433844644(js.Array(this.component, js.Dictionary.empty))()
  }
  
  object Description {
    @JSImport("semantic-ui-react", "Item.Description")
    @js.native
    object component extends js.Object
    
    def withProps(p: ItemDescriptionProps): SharedBuilder_ItemDescriptionProps919046406 = new SharedBuilder_ItemDescriptionProps919046406(js.Array(this.component, p.asInstanceOf[js.Any]))
    implicit def make(companion: Description.type): SharedBuilder_ItemDescriptionProps919046406 = new SharedBuilder_ItemDescriptionProps919046406(js.Array(this.component, js.Dictionary.empty))()
  }
  
  object Meta {
    @JSImport("semantic-ui-react", "Item.Meta")
    @js.native
    object component extends js.Object
    
    def withProps(p: ItemMetaProps): SharedBuilder_ItemMetaProps247143672 = new SharedBuilder_ItemMetaProps247143672(js.Array(this.component, p.asInstanceOf[js.Any]))
    implicit def make(companion: Meta.type): SharedBuilder_ItemMetaProps247143672 = new SharedBuilder_ItemMetaProps247143672(js.Array(this.component, js.Dictionary.empty))()
  }
  
}

