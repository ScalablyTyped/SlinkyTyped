package typingsSlinky.storybookComponents.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.storybookComponents.actionBarMod.ActionBarProps
import typingsSlinky.storybookComponents.actionBarMod.ActionItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ActionBar {
  @JSImport("@storybook/components", "ActionBar")
  @js.native
  object component extends js.Object
  
  def withProps(p: ActionBarProps): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(actionItems: js.Array[ActionItem]): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(actionItems = actionItems.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[ActionBarProps]))
  }
}

