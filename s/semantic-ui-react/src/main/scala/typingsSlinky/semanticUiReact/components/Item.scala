package typingsSlinky.semanticUiReact.components

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.ReactNodeArray
import typingsSlinky.react.mod.ReactType
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandContent
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandItem
import typingsSlinky.semanticUiReact.itemDescriptionMod.ItemDescriptionProps
import typingsSlinky.semanticUiReact.itemExtraMod.ItemExtraProps
import typingsSlinky.semanticUiReact.itemHeaderMod.ItemHeaderProps
import typingsSlinky.semanticUiReact.itemImageMod.ItemImageProps
import typingsSlinky.semanticUiReact.itemItemMod.ItemProps
import typingsSlinky.semanticUiReact.itemMetaMod.ItemMetaProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Item {
  @JSImport("semantic-ui-react/dist/commonjs/views/Item", JSImport.Default)
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
      value: (/* component */ ReactType[ItemDescriptionProps], ItemDescriptionProps, /* children */ js.UndefOr[TagMod[Any] | ReactNodeArray]) => ReactElement | Null
    ): this.type = set("description", js.Any.fromFunction3(value))
    @scala.inline
    def description(value: SemanticShorthandItem[ItemDescriptionProps]): this.type = set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def extraReactElement(value: ReactElement): this.type = set("extra", value.asInstanceOf[js.Any])
    @scala.inline
    def extraFunction3(
      value: (/* component */ ReactType[ItemExtraProps], ItemExtraProps, /* children */ js.UndefOr[TagMod[Any] | ReactNodeArray]) => ReactElement | Null
    ): this.type = set("extra", js.Any.fromFunction3(value))
    @scala.inline
    def extra(value: SemanticShorthandItem[ItemExtraProps]): this.type = set("extra", value.asInstanceOf[js.Any])
    @scala.inline
    def headerReactElement(value: ReactElement): this.type = set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def headerFunction3(
      value: (/* component */ ReactType[ItemHeaderProps], ItemHeaderProps, /* children */ js.UndefOr[TagMod[Any] | ReactNodeArray]) => ReactElement | Null
    ): this.type = set("header", js.Any.fromFunction3(value))
    @scala.inline
    def header(value: SemanticShorthandItem[ItemHeaderProps]): this.type = set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def imageReactElement(value: ReactElement): this.type = set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def imageFunction3(
      value: (/* component */ ReactType[ItemImageProps], ItemImageProps, /* children */ js.UndefOr[TagMod[Any] | ReactNodeArray]) => ReactElement | Null
    ): this.type = set("image", js.Any.fromFunction3(value))
    @scala.inline
    def image(value: SemanticShorthandItem[ItemImageProps]): this.type = set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def metaReactElement(value: ReactElement): this.type = set("meta", value.asInstanceOf[js.Any])
    @scala.inline
    def metaFunction3(
      value: (/* component */ ReactType[ItemMetaProps], ItemMetaProps, /* children */ js.UndefOr[TagMod[Any] | ReactNodeArray]) => ReactElement | Null
    ): this.type = set("meta", js.Any.fromFunction3(value))
    @scala.inline
    def meta(value: SemanticShorthandItem[ItemMetaProps]): this.type = set("meta", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ItemProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Item.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

