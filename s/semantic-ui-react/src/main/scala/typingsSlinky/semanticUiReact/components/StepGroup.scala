package typingsSlinky.semanticUiReact.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandCollection
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandContent
import typingsSlinky.semanticUiReact.semanticUiReactNumbers.`1`
import typingsSlinky.semanticUiReact.semanticUiReactNumbers.`2`
import typingsSlinky.semanticUiReact.semanticUiReactNumbers.`3`
import typingsSlinky.semanticUiReact.semanticUiReactNumbers.`4`
import typingsSlinky.semanticUiReact.semanticUiReactNumbers.`5`
import typingsSlinky.semanticUiReact.semanticUiReactNumbers.`6`
import typingsSlinky.semanticUiReact.semanticUiReactNumbers.`7`
import typingsSlinky.semanticUiReact.semanticUiReactNumbers.`8`
import typingsSlinky.semanticUiReact.semanticUiReactStrings.big
import typingsSlinky.semanticUiReact.semanticUiReactStrings.bottom
import typingsSlinky.semanticUiReact.semanticUiReactStrings.eight
import typingsSlinky.semanticUiReact.semanticUiReactStrings.five
import typingsSlinky.semanticUiReact.semanticUiReactStrings.four
import typingsSlinky.semanticUiReact.semanticUiReactStrings.huge
import typingsSlinky.semanticUiReact.semanticUiReactStrings.large
import typingsSlinky.semanticUiReact.semanticUiReactStrings.massive
import typingsSlinky.semanticUiReact.semanticUiReactStrings.mini
import typingsSlinky.semanticUiReact.semanticUiReactStrings.one
import typingsSlinky.semanticUiReact.semanticUiReactStrings.seven
import typingsSlinky.semanticUiReact.semanticUiReactStrings.six
import typingsSlinky.semanticUiReact.semanticUiReactStrings.small
import typingsSlinky.semanticUiReact.semanticUiReactStrings.tablet
import typingsSlinky.semanticUiReact.semanticUiReactStrings.three
import typingsSlinky.semanticUiReact.semanticUiReactStrings.tiny
import typingsSlinky.semanticUiReact.semanticUiReactStrings.top
import typingsSlinky.semanticUiReact.semanticUiReactStrings.two
import typingsSlinky.semanticUiReact.stepGroupMod.StepGroupProps
import typingsSlinky.semanticUiReact.stepStepMod.StepProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object StepGroup {
  @JSImport("semantic-ui-react/dist/commonjs/elements/Step/StepGroup", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def as(value: js.Any): this.type = set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def attached(value: Boolean | bottom | top): this.type = set("attached", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def contentReactElement(value: ReactElement): this.type = set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def content(value: SemanticShorthandContent): this.type = set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def fluid(value: Boolean): this.type = set("fluid", value.asInstanceOf[js.Any])
    @scala.inline
    def items(value: SemanticShorthandCollection[StepProps]): this.type = set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def ordered(value: Boolean): this.type = set("ordered", value.asInstanceOf[js.Any])
    @scala.inline
    def size(value: mini | tiny | small | large | big | huge | massive): this.type = set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def stackable(value: tablet): this.type = set("stackable", value.asInstanceOf[js.Any])
    @scala.inline
    def unstackable(value: Boolean): this.type = set("unstackable", value.asInstanceOf[js.Any])
    @scala.inline
    def vertical(value: Boolean): this.type = set("vertical", value.asInstanceOf[js.Any])
    @scala.inline
    def widths(
      value: `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | typingsSlinky.semanticUiReact.semanticUiReactStrings.`1` | typingsSlinky.semanticUiReact.semanticUiReactStrings.`2` | typingsSlinky.semanticUiReact.semanticUiReactStrings.`3` | typingsSlinky.semanticUiReact.semanticUiReactStrings.`4` | typingsSlinky.semanticUiReact.semanticUiReactStrings.`5` | typingsSlinky.semanticUiReact.semanticUiReactStrings.`6` | typingsSlinky.semanticUiReact.semanticUiReactStrings.`7` | typingsSlinky.semanticUiReact.semanticUiReactStrings.`8` | one | two | three | four | five | six | seven | eight
    ): this.type = set("widths", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: StepGroupProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: StepGroup.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

