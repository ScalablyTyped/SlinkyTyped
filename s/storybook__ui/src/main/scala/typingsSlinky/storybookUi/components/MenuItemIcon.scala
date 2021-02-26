package typingsSlinky.storybookUi.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.storybookUi.menuMod.ListItemIconProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MenuItemIcon {
  
  @JSImport("@storybook/ui/dist/components/sidebar/Menu", "MenuItemIcon")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def icon(
      value: /* import warning: importer.ImportType#apply Failed type conversion: react.react.ComponentProps<react.react.FunctionComponent<@storybook/components.@storybook/components/dist/icon/icon.IconsProps>>['icon'] */ js.Any
    ): this.type = set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def imgSrc(value: String): this.type = set("imgSrc", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: MenuItemIcon.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ListItemIconProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
