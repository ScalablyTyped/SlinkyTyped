package typingsSlinky.semanticUiReact.components

import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.ReactNodeArray
import typingsSlinky.semanticUiReact.formFieldMod.FormFieldProps
import typingsSlinky.semanticUiReact.genericMod.HtmlLabelProps
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandContent
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandItem
import typingsSlinky.semanticUiReact.genericMod.SemanticWIDTHS
import typingsSlinky.semanticUiReact.labelLabelMod.LabelProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object FormField {
  @JSImport("semantic-ui-react/dist/commonjs/collections/Form/FormField", JSImport.Default)
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
    def control(value: js.Any): this.type = set("control", value.asInstanceOf[js.Any])
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def errorReactElement(value: ReactElement): this.type = set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def errorFunction3(
      value: (/* component */ ReactComponentClass[LabelProps], LabelProps, /* children */ js.UndefOr[TagMod[Any] | ReactNodeArray]) => ReactElement | Null
    ): this.type = set("error", js.Any.fromFunction3(value))
    @scala.inline
    def error(value: Boolean | SemanticShorthandItem[LabelProps]): this.type = set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def id(value: Double | String): this.type = set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def `inline`(value: Boolean): this.type = set("inline", value.asInstanceOf[js.Any])
    @scala.inline
    def labelReactElement(value: ReactElement): this.type = set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def labelFunction3(
      value: (/* component */ ReactComponentClass[HtmlLabelProps], HtmlLabelProps, /* children */ js.UndefOr[TagMod[Any] | ReactNodeArray]) => ReactElement | Null
    ): this.type = set("label", js.Any.fromFunction3(value))
    @scala.inline
    def label(value: SemanticShorthandItem[HtmlLabelProps]): this.type = set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def required(value: js.Any): this.type = set("required", value.asInstanceOf[js.Any])
    @scala.inline
    def `type`(value: String): this.type = set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def width(value: SemanticWIDTHS): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: FormFieldProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: FormField.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

