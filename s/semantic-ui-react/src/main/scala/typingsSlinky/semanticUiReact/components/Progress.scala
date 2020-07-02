package typingsSlinky.semanticUiReact.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.ReactNodeArray
import typingsSlinky.react.mod.ReactType
import typingsSlinky.semanticUiReact.genericMod.HtmlLabelProps
import typingsSlinky.semanticUiReact.genericMod.SemanticCOLORS
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandContent
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandItem
import typingsSlinky.semanticUiReact.progressMod.default
import typingsSlinky.semanticUiReact.progressProgressMod.ProgressProps
import typingsSlinky.semanticUiReact.semanticUiReactStrings.big
import typingsSlinky.semanticUiReact.semanticUiReactStrings.bottom
import typingsSlinky.semanticUiReact.semanticUiReactStrings.large
import typingsSlinky.semanticUiReact.semanticUiReactStrings.medium
import typingsSlinky.semanticUiReact.semanticUiReactStrings.percent
import typingsSlinky.semanticUiReact.semanticUiReactStrings.ratio
import typingsSlinky.semanticUiReact.semanticUiReactStrings.small
import typingsSlinky.semanticUiReact.semanticUiReactStrings.tiny
import typingsSlinky.semanticUiReact.semanticUiReactStrings.top
import typingsSlinky.semanticUiReact.semanticUiReactStrings.value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Progress {
  @JSImport("semantic-ui-react/dist/commonjs/modules/Progress", JSImport.Default)
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
    def attached(value: top | bottom): this.type = set("attached", value.asInstanceOf[js.Any])
    @scala.inline
    def autoSuccess(value: Boolean): this.type = set("autoSuccess", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def color(value: SemanticCOLORS): this.type = set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def contentReactElement(value: ReactElement): this.type = set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def content(value: SemanticShorthandContent): this.type = set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def error(value: Boolean): this.type = set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def indicating(value: Boolean): this.type = set("indicating", value.asInstanceOf[js.Any])
    @scala.inline
    def inverted(value: Boolean): this.type = set("inverted", value.asInstanceOf[js.Any])
    @scala.inline
    def labelReactElement(value: ReactElement): this.type = set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def labelFunction3(
      value: (/* component */ ReactType[HtmlLabelProps], HtmlLabelProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
    ): this.type = set("label", js.Any.fromFunction3(value))
    @scala.inline
    def label(value: SemanticShorthandItem[HtmlLabelProps]): this.type = set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def percent(value: Double | String): this.type = set("percent", value.asInstanceOf[js.Any])
    @scala.inline
    def precision(value: Double): this.type = set("precision", value.asInstanceOf[js.Any])
    @scala.inline
    def progress(value: Boolean | percent | ratio | value): this.type = set("progress", value.asInstanceOf[js.Any])
    @scala.inline
    def size(value: tiny | small | medium | large | big): this.type = set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def success(value: Boolean): this.type = set("success", value.asInstanceOf[js.Any])
    @scala.inline
    def total(value: Double | String): this.type = set("total", value.asInstanceOf[js.Any])
    @scala.inline
    def value(value: Double | String): this.type = set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def warning(value: Boolean): this.type = set("warning", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ProgressProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Progress.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

