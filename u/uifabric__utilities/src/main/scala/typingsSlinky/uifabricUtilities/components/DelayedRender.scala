package typingsSlinky.uifabricUtilities.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.uifabricUtilities.delayedRenderMod.IDelayedRenderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DelayedRender {
  @JSImport("@uifabric/utilities", "DelayedRender")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.uifabricUtilities.mod.DelayedRender] {
    @scala.inline
    def delay(value: Double): this.type = set("delay", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IDelayedRenderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: DelayedRender.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

