package typingsSlinky.semanticUiReact.components

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.div.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.ReactNodeArray
import typingsSlinky.semanticUiReact.embedEmbedMod.EmbedProps
import typingsSlinky.semanticUiReact.embedMod.default
import typingsSlinky.semanticUiReact.genericMod.HtmlIframeProps
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandContent
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandItem
import typingsSlinky.semanticUiReact.iconIconMod.IconProps
import typingsSlinky.semanticUiReact.semanticUiReactStrings.`16Colon9`
import typingsSlinky.semanticUiReact.semanticUiReactStrings.`21Colon9`
import typingsSlinky.semanticUiReact.semanticUiReactStrings.`4Colon3`
import typingsSlinky.semanticUiReact.semanticUiReactStrings.vimeo
import typingsSlinky.semanticUiReact.semanticUiReactStrings.youtube
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Embed {
  @JSImport("semantic-ui-react/dist/commonjs/modules/Embed", JSImport.Default)
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
    def aspectRatio(value: `4Colon3` | `16Colon9` | `21Colon9`): this.type = set("aspectRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def autoplay(value: Boolean): this.type = set("autoplay", value.asInstanceOf[js.Any])
    @scala.inline
    def brandedUI(value: Boolean): this.type = set("brandedUI", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def contentReactElement(value: ReactElement): this.type = set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def content(value: SemanticShorthandContent): this.type = set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultActive(value: Boolean): this.type = set("defaultActive", value.asInstanceOf[js.Any])
    @scala.inline
    def hd(value: Boolean): this.type = set("hd", value.asInstanceOf[js.Any])
    @scala.inline
    def iconReactElement(value: ReactElement): this.type = set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def iconFunction3(
      value: (/* component */ ReactComponentClass[IconProps], IconProps, /* children */ js.UndefOr[TagMod[Any] | ReactNodeArray]) => ReactElement | Null
    ): this.type = set("icon", js.Any.fromFunction3(value))
    @scala.inline
    def icon(value: SemanticShorthandItem[IconProps]): this.type = set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def iframeReactElement(value: ReactElement): this.type = set("iframe", value.asInstanceOf[js.Any])
    @scala.inline
    def iframeFunction3(
      value: (/* component */ ReactComponentClass[HtmlIframeProps], HtmlIframeProps, /* children */ js.UndefOr[TagMod[Any] | ReactNodeArray]) => ReactElement | Null
    ): this.type = set("iframe", js.Any.fromFunction3(value))
    @scala.inline
    def iframe(value: SemanticShorthandItem[HtmlIframeProps]): this.type = set("iframe", value.asInstanceOf[js.Any])
    @scala.inline
    def onClick(value: (/* event */ SyntheticMouseEvent[HTMLDivElement], /* data */ EmbedProps) => Unit): this.type = set("onClick", js.Any.fromFunction2(value))
    @scala.inline
    def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def source(value: youtube | vimeo): this.type = set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def url(value: String): this.type = set("url", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: EmbedProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Embed.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

