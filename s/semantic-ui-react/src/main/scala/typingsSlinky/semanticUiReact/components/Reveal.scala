package typingsSlinky.semanticUiReact.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandContent
import typingsSlinky.semanticUiReact.revealRevealMod.RevealProps
import typingsSlinky.semanticUiReact.semanticUiReactStrings.`move down`
import typingsSlinky.semanticUiReact.semanticUiReactStrings.`move right`
import typingsSlinky.semanticUiReact.semanticUiReactStrings.`move up`
import typingsSlinky.semanticUiReact.semanticUiReactStrings.`rotate left`
import typingsSlinky.semanticUiReact.semanticUiReactStrings.`small fade`
import typingsSlinky.semanticUiReact.semanticUiReactStrings.fade
import typingsSlinky.semanticUiReact.semanticUiReactStrings.move
import typingsSlinky.semanticUiReact.semanticUiReactStrings.rotate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Reveal {
  @JSImport("semantic-ui-react/dist/commonjs/elements/Reveal", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def active(value: Boolean): this.type = set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def animated(
      value: fade | (`small fade`) | move | (`move right`) | (`move up`) | (`move down`) | rotate | (`rotate left`)
    ): this.type = set("animated", value.asInstanceOf[js.Any])
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
    def instant(value: Boolean): this.type = set("instant", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: RevealProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Reveal.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

