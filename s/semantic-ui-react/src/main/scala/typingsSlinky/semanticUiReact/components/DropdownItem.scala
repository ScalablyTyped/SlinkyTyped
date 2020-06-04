package typingsSlinky.semanticUiReact.components

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.div.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.ReactNodeArray
import typingsSlinky.react.mod.ReactType
import typingsSlinky.semanticUiReact.dropdownItemMod.DropdownItemProps
import typingsSlinky.semanticUiReact.dropdownItemMod.default
import typingsSlinky.semanticUiReact.flagFlagMod.FlagProps
import typingsSlinky.semanticUiReact.genericMod.HtmlSpanProps
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandContent
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandItem
import typingsSlinky.semanticUiReact.iconIconMod.IconProps
import typingsSlinky.semanticUiReact.imageImageMod.ImageProps
import typingsSlinky.semanticUiReact.labelLabelMod.LabelProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DropdownItem {
  @JSImport("semantic-ui-react/dist/commonjs/modules/Dropdown/DropdownItem", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def active(value: Boolean): this.type = set("active", value.asInstanceOf[js.Any])
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
      value: (/* component */ ReactType[HtmlSpanProps], HtmlSpanProps, /* children */ js.UndefOr[TagMod[Any] | ReactNodeArray]) => ReactElement | Null
    ): this.type = set("description", js.Any.fromFunction3(value))
    @scala.inline
    def description(value: SemanticShorthandItem[HtmlSpanProps]): this.type = set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def flagReactElement(value: ReactElement): this.type = set("flag", value.asInstanceOf[js.Any])
    @scala.inline
    def flagFunction3(
      value: (/* component */ ReactType[FlagProps], FlagProps, /* children */ js.UndefOr[TagMod[Any] | ReactNodeArray]) => ReactElement | Null
    ): this.type = set("flag", js.Any.fromFunction3(value))
    @scala.inline
    def flag(value: SemanticShorthandItem[FlagProps]): this.type = set("flag", value.asInstanceOf[js.Any])
    @scala.inline
    def iconReactElement(value: ReactElement): this.type = set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def iconFunction3(
      value: (/* component */ ReactType[IconProps], IconProps, /* children */ js.UndefOr[TagMod[Any] | ReactNodeArray]) => ReactElement | Null
    ): this.type = set("icon", js.Any.fromFunction3(value))
    @scala.inline
    def icon(value: SemanticShorthandItem[IconProps]): this.type = set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def imageReactElement(value: ReactElement): this.type = set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def imageFunction3(
      value: (/* component */ ReactType[ImageProps], ImageProps, /* children */ js.UndefOr[TagMod[Any] | ReactNodeArray]) => ReactElement | Null
    ): this.type = set("image", js.Any.fromFunction3(value))
    @scala.inline
    def image(value: SemanticShorthandItem[ImageProps]): this.type = set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def labelReactElement(value: ReactElement): this.type = set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def labelFunction3(
      value: (/* component */ ReactType[LabelProps], LabelProps, /* children */ js.UndefOr[TagMod[Any] | ReactNodeArray]) => ReactElement | Null
    ): this.type = set("label", js.Any.fromFunction3(value))
    @scala.inline
    def label(value: SemanticShorthandItem[LabelProps]): this.type = set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def onClick(value: (/* event */ SyntheticMouseEvent[HTMLDivElement], /* data */ DropdownItemProps) => Unit): this.type = set("onClick", js.Any.fromFunction2(value))
    @scala.inline
    def selected(value: Boolean): this.type = set("selected", value.asInstanceOf[js.Any])
    @scala.inline
    def textReactElement(value: ReactElement): this.type = set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def text(value: SemanticShorthandContent): this.type = set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def value(value: Boolean | Double | String): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: DropdownItemProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: DropdownItem.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

