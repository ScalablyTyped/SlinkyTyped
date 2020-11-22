package typingsSlinky.storybookAddonA11y.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.storybookAddonA11y.anon.Items
import typingsSlinky.storybookAddonA11y.tabsMod.TabsProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Tabs {
  
  @JSImport("@storybook/addon-a11y/dist/components/Tabs", "Tabs")
  @js.native
  object component extends js.Object
  
  def withProps(p: TabsProps): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(tabs: js.Array[Items]): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(tabs = tabs.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[TabsProps]))
  }
}
