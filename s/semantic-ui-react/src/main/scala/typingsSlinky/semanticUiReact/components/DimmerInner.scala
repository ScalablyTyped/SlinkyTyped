package typingsSlinky.semanticUiReact.components

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.div.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.semanticUiReact.dimmerInnerMod.DimmerInnerProps
import typingsSlinky.semanticUiReact.dimmerInnerMod.default
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandContent
import typingsSlinky.semanticUiReact.semanticUiReactStrings.bottom
import typingsSlinky.semanticUiReact.semanticUiReactStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DimmerInner {
  @JSImport("semantic-ui-react/dist/commonjs/modules/Dimmer/DimmerInner", JSImport.Default)
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
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def inverted(value: Boolean): this.type = set("inverted", value.asInstanceOf[js.Any])
    @scala.inline
    def onClick(value: (/* event */ SyntheticMouseEvent[HTMLDivElement], /* data */ DimmerInnerProps) => Unit): this.type = set("onClick", js.Any.fromFunction2(value))
    @scala.inline
    def onClickOutside(value: (/* event */ SyntheticMouseEvent[HTMLDivElement], /* data */ DimmerInnerProps) => Unit): this.type = set("onClickOutside", js.Any.fromFunction2(value))
    @scala.inline
    def page(value: Boolean): this.type = set("page", value.asInstanceOf[js.Any])
    @scala.inline
    def simple(value: Boolean): this.type = set("simple", value.asInstanceOf[js.Any])
    @scala.inline
    def verticalAlign(value: bottom | top): this.type = set("verticalAlign", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: DimmerInnerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: DimmerInner.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

