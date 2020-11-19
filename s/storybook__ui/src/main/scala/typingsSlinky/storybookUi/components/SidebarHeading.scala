package typingsSlinky.storybookUi.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.storybookUi.sidebarHeadingMod.SidebarHeadingProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SidebarHeading {
  
  @JSImport("@storybook/ui/dist/components/sidebar/SidebarHeading", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def menuHighlighted(value: Boolean): this.type = set("menuHighlighted", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SidebarHeadingProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(
    menu: /* import warning: importer.ImportType#apply Failed type conversion: react.react.ComponentProps<react.react.FunctionComponent<@storybook/components.@storybook/components/dist/tooltip/TooltipLinkList.TooltipLinkListProps>>['links'] */ js.Any
  ): Builder = {
    val __props = js.Dynamic.literal(menu = menu.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[SidebarHeadingProps]))
  }
}
