package typingsSlinky.storybookComponents.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.storybookComponents.tabsMod.TabWrapperProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TabWrapper {
  @JSImport("@storybook/components", "TabWrapper")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def render(value: () => ReactElement): this.type = set("render", js.Any.fromFunction0(value))
  }
  
  def withProps(p: TabWrapperProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(active: Boolean): Builder = {
    val __props = js.Dynamic.literal(active = active.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[TabWrapperProps]))
  }
}

