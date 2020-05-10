package typingsSlinky.storybookUi.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.storybookUi.mod.ListItemIconProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ListItemIcon {
  @JSImport("@storybook/ui/dist/components/sidebar/ListItemIcon", JSImport.Default)
  @js.native
  object component extends js.Object
  
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
  
  def withProps(p: ListItemIconProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ListItemIcon.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

