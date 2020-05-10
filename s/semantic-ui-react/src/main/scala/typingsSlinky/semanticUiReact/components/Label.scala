package typingsSlinky.semanticUiReact.components

import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.ReactNodeArray
import typingsSlinky.semanticUiReact.genericMod.SemanticCOLORS
import typingsSlinky.semanticUiReact.genericMod.SemanticSIZES
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandContent
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandItem
import typingsSlinky.semanticUiReact.iconIconMod.IconProps
import typingsSlinky.semanticUiReact.labelDetailMod.LabelDetailProps
import typingsSlinky.semanticUiReact.labelLabelMod.LabelProps
import typingsSlinky.semanticUiReact.labelMod.default
import typingsSlinky.semanticUiReact.semanticUiReactStrings.`bottom left`
import typingsSlinky.semanticUiReact.semanticUiReactStrings.`bottom right`
import typingsSlinky.semanticUiReact.semanticUiReactStrings.`top left`
import typingsSlinky.semanticUiReact.semanticUiReactStrings.`top right`
import typingsSlinky.semanticUiReact.semanticUiReactStrings.above
import typingsSlinky.semanticUiReact.semanticUiReactStrings.below
import typingsSlinky.semanticUiReact.semanticUiReactStrings.bottom
import typingsSlinky.semanticUiReact.semanticUiReactStrings.left
import typingsSlinky.semanticUiReact.semanticUiReactStrings.right
import typingsSlinky.semanticUiReact.semanticUiReactStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Label {
  @JSImport("semantic-ui-react/dist/commonjs/elements/Label", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[slinky.web.html.`*`.tag.type, default] {
    @scala.inline
    def active(value: Boolean): this.type = set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def as(value: js.Any): this.type = set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def attached(value: top | bottom | (`top right`) | (`top left`) | (`bottom left`) | (`bottom right`)): this.type = set("attached", value.asInstanceOf[js.Any])
    @scala.inline
    def basic(value: Boolean): this.type = set("basic", value.asInstanceOf[js.Any])
    @scala.inline
    def circular(value: Boolean): this.type = set("circular", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def color(value: SemanticCOLORS): this.type = set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def contentReactElement(value: ReactElement): this.type = set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def content(value: SemanticShorthandContent): this.type = set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def corner(value: Boolean | left | right): this.type = set("corner", value.asInstanceOf[js.Any])
    @scala.inline
    def detailReactElement(value: ReactElement): this.type = set("detail", value.asInstanceOf[js.Any])
    @scala.inline
    def detailFunction3(
      value: (/* component */ ReactComponentClass[LabelDetailProps], LabelDetailProps, /* children */ js.UndefOr[TagMod[Any] | ReactNodeArray]) => ReactElement | Null
    ): this.type = set("detail", js.Any.fromFunction3(value))
    @scala.inline
    def detail(value: SemanticShorthandItem[LabelDetailProps]): this.type = set("detail", value.asInstanceOf[js.Any])
    @scala.inline
    def empty(value: js.Any): this.type = set("empty", value.asInstanceOf[js.Any])
    @scala.inline
    def floating(value: Boolean): this.type = set("floating", value.asInstanceOf[js.Any])
    @scala.inline
    def horizontal(value: Boolean): this.type = set("horizontal", value.asInstanceOf[js.Any])
    @scala.inline
    def iconReactElement(value: ReactElement): this.type = set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def iconFunction3(
      value: (/* component */ ReactComponentClass[IconProps], IconProps, /* children */ js.UndefOr[TagMod[Any] | ReactNodeArray]) => ReactElement | Null
    ): this.type = set("icon", js.Any.fromFunction3(value))
    @scala.inline
    def icon(value: SemanticShorthandItem[IconProps]): this.type = set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def image(value: js.Any): this.type = set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def onClick(value: (/* event */ SyntheticMouseEvent[HTMLElement], /* data */ LabelProps) => Unit): this.type = set("onClick", js.Any.fromFunction2(value))
    @scala.inline
    def onRemove(value: (/* event */ SyntheticMouseEvent[HTMLElement], /* data */ LabelProps) => Unit): this.type = set("onRemove", js.Any.fromFunction2(value))
    @scala.inline
    def pointing(value: Boolean | above | below | left | right): this.type = set("pointing", value.asInstanceOf[js.Any])
    @scala.inline
    def prompt(value: Boolean): this.type = set("prompt", value.asInstanceOf[js.Any])
    @scala.inline
    def removeIconReactElement(value: ReactElement): this.type = set("removeIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def removeIconFunction3(
      value: (/* component */ ReactComponentClass[IconProps], IconProps, /* children */ js.UndefOr[TagMod[Any] | ReactNodeArray]) => ReactElement | Null
    ): this.type = set("removeIcon", js.Any.fromFunction3(value))
    @scala.inline
    def removeIcon(value: SemanticShorthandItem[IconProps]): this.type = set("removeIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def ribbon(value: Boolean | right): this.type = set("ribbon", value.asInstanceOf[js.Any])
    @scala.inline
    def size(value: SemanticSIZES): this.type = set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def tag(value: Boolean): this.type = set("tag", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: LabelProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Label.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

