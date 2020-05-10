package typingsSlinky.semanticUiReact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.semanticUiReact.placeholderLineMod.PlaceholderLineProps
import typingsSlinky.semanticUiReact.semanticUiReactStrings.`very long`
import typingsSlinky.semanticUiReact.semanticUiReactStrings.`very short`
import typingsSlinky.semanticUiReact.semanticUiReactStrings.full
import typingsSlinky.semanticUiReact.semanticUiReactStrings.long
import typingsSlinky.semanticUiReact.semanticUiReactStrings.medium
import typingsSlinky.semanticUiReact.semanticUiReactStrings.short
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PlaceholderLine {
  @JSImport("semantic-ui-react/dist/commonjs/elements/Placeholder/PlaceholderLine", JSImport.Default)
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
    def length(value: full | (`very long`) | long | medium | short | (`very short`)): this.type = set("length", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PlaceholderLineProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: PlaceholderLine.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

