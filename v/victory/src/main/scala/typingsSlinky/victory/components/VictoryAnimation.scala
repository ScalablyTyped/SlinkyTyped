package typingsSlinky.victory.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.victory.mod.AnimationData
import typingsSlinky.victory.mod.AnimationEasing
import typingsSlinky.victory.mod.VictoryAnimationProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object VictoryAnimation {
  @JSImport("victory", "VictoryAnimation")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.victory.mod.VictoryAnimation] {
    @scala.inline
    def data(value: AnimationData): this.type = set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def delay(value: Double): this.type = set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def duration(value: Double): this.type = set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def easing(value: AnimationEasing): this.type = set("easing", value.asInstanceOf[js.Any])
    @scala.inline
    def onEnd(value: () => Unit): this.type = set("onEnd", js.Any.fromFunction0(value))
  }
  
  def withProps(p: VictoryAnimationProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: VictoryAnimation.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

