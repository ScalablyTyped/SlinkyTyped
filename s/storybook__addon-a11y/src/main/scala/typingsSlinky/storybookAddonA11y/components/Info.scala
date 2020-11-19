package typingsSlinky.storybookAddonA11y.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.axeCore.mod.Result
import typingsSlinky.storybookAddonA11y.infoMod.InfoProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Info {
  
  @JSImport("@storybook/addon-a11y/dist/components/Report/Info", "Info")
  @js.native
  object component extends js.Object
  
  def withProps(p: InfoProps): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(item: Result): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[InfoProps]))
  }
}
