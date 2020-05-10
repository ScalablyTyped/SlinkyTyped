package typingsSlinky.semanticUiReact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.semanticUiReact.genericMod.SemanticTRANSITIONS
import typingsSlinky.semanticUiReact.transitionGroupMod.TransitionGroupProps
import typingsSlinky.semanticUiReact.transitionGroupMod.default
import typingsSlinky.semanticUiReact.transitionTransitionMod.TransitionPropDuration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TransitionGroup {
  @JSImport("semantic-ui-react/dist/commonjs/modules/Transition/TransitionGroup", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def animation(value: SemanticTRANSITIONS | String): this.type = set("animation", value.asInstanceOf[js.Any])
    @scala.inline
    def as(value: js.Any): this.type = set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def directional(value: Boolean): this.type = set("directional", value.asInstanceOf[js.Any])
    @scala.inline
    def duration(value: Double | String | TransitionPropDuration): this.type = set("duration", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TransitionGroupProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: TransitionGroup.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

