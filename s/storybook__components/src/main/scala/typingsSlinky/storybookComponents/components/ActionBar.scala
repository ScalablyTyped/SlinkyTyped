package typingsSlinky.storybookComponents.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.storybookComponents.actionBarMod.ActionBarProps
import typingsSlinky.storybookComponents.actionBarMod.ActionItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ActionBar {
  
  @scala.inline
  def apply(actionItems: js.Array[ActionItem]): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(actionItems = actionItems.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[ActionBarProps]))
  }
  
  @JSImport("@storybook/components", "ActionBar")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ActionBarProps): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
