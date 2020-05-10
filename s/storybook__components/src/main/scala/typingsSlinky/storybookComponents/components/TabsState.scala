package typingsSlinky.storybookComponents.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.storybookComponents.tabsMod.TabsStateProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TabsState {
  @JSImport("@storybook/components", "TabsState")
  @js.native
  object component extends js.Object
  
  def withProps(p: TabsStateProps): Default[tag.type, typingsSlinky.storybookComponents.mod.TabsState] = new Default[tag.type, typingsSlinky.storybookComponents.mod.TabsState](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(absolute: Boolean, backgroundColor: String, bordered: Boolean, initial: String): Default[tag.type, typingsSlinky.storybookComponents.mod.TabsState] = {
    val __props = js.Dynamic.literal(absolute = absolute.asInstanceOf[js.Any], backgroundColor = backgroundColor.asInstanceOf[js.Any], bordered = bordered.asInstanceOf[js.Any], initial = initial.asInstanceOf[js.Any])
    new Default[tag.type, typingsSlinky.storybookComponents.mod.TabsState](js.Array(this.component, __props.asInstanceOf[TabsStateProps]))
  }
}

