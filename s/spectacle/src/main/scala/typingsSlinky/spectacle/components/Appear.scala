package typingsSlinky.spectacle.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.spectacle.mod.AppearProps
import typingsSlinky.spectacle.mod.CSSProperties
import typingsSlinky.spectacle.mod.easeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Appear {
  @JSImport("spectacle", "Appear")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.spectacle.mod.Appear] {
    @scala.inline
    def easing(value: easeType): this.type = set("easing", value.asInstanceOf[js.Any])
    @scala.inline
    def endValue(value: js.Object): this.type = set("endValue", value.asInstanceOf[js.Any])
    @scala.inline
    def fid(value: String): this.type = set("fid", value.asInstanceOf[js.Any])
    @scala.inline
    def order(value: Double): this.type = set("order", value.asInstanceOf[js.Any])
    @scala.inline
    def startValue(value: js.Object): this.type = set("startValue", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def transitionDuration(value: Double): this.type = set("transitionDuration", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: AppearProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Appear.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

