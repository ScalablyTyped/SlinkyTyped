package typingsSlinky.spectacle.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.spectacle.mod.CSSProperties
import typingsSlinky.spectacle.mod.GoToActionProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object GoToAction {
  @JSImport("spectacle", "GoToAction")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.spectacle.mod.GoToAction] {
    @scala.inline
    def margin(value: Double | String): this.type = set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def padding(value: Double | String): this.type = set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def render(value: /* goToSlide */ js.UndefOr[js.Function1[/* slide */ Double | String, Unit]] => Unit): this.type = set("render", js.Any.fromFunction1(value))
    @scala.inline
    def slide(value: Double | String): this.type = set("slide", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: GoToActionProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: GoToAction.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

