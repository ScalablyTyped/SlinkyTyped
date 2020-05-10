package typingsSlinky.spectacle.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.spectacle.mod.AnimProps
import typingsSlinky.spectacle.mod.CSSProperties
import typingsSlinky.spectacle.mod.easeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Anim {
  @JSImport("spectacle", "Anim")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.spectacle.mod.Anim] {
    @scala.inline
    def onAnim(value: (/* forwards */ js.UndefOr[Boolean], /* animIndex */ js.UndefOr[Double]) => Unit): this.type = set("onAnim", js.Any.fromFunction2(value))
    @scala.inline
    def order(value: Double): this.type = set("order", value.asInstanceOf[js.Any])
    @scala.inline
    def route(value: js.Object): this.type = set("route", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: AnimProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(
    easing: easeType,
    fromStyle: CSSProperties | js.Array[CSSProperties],
    toStyle: CSSProperties | js.Array[CSSProperties],
    transitionDuration: Double
  ): Builder = {
    val __props = js.Dynamic.literal(easing = easing.asInstanceOf[js.Any], fromStyle = fromStyle.asInstanceOf[js.Any], toStyle = toStyle.asInstanceOf[js.Any], transitionDuration = transitionDuration.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[AnimProps]))
  }
}

