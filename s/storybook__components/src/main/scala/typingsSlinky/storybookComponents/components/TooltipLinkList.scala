package typingsSlinky.storybookComponents.components

import slinky.core.ReactComponentClass
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.storybookComponents.tooltipLinkListMod.TooltipLinkListProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TooltipLinkList {
  
  @scala.inline
  def apply(links: js.Array[typingsSlinky.storybookComponents.tooltipLinkListMod.Link]): Builder = {
    val __props = js.Dynamic.literal(links = links.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[TooltipLinkListProps]))
  }
  
  @JSImport("@storybook/components", "TooltipLinkList")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def LinkWrapper(value: ReactComponentClass[js.Object]): this.type = set("LinkWrapper", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TooltipLinkListProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
