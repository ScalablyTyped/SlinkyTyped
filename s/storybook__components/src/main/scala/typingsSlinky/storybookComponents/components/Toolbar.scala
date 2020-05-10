package typingsSlinky.storybookComponents.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.storybookComponents.toolbarMod.ToolbarProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Toolbar {
  @JSImport("@storybook/components/dist/blocks/Toolbar", "Toolbar")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def baseUrl(value: String): this.type = set("baseUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def border(value: Boolean): this.type = set("border", value.asInstanceOf[js.Any])
    @scala.inline
    def storyId(value: String): this.type = set("storyId", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ToolbarProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(resetZoom: () => Unit, zoom: Double => Unit): Builder = {
    val __props = js.Dynamic.literal(resetZoom = js.Any.fromFunction0(resetZoom), zoom = js.Any.fromFunction1(zoom))
    new Builder(js.Array(this.component, __props.asInstanceOf[ToolbarProps]))
  }
}

