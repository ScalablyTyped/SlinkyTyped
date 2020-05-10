package typingsSlinky.storybookUi.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.storybookUi.AnonChildIds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Link {
  @JSImport("@storybook/ui/dist/components/sidebar/SidebarStories", "Link")
  @js.native
  object component extends js.Object
  
  def withProps(p: AnonChildIds): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(
    childIds: js.Any,
    id: js.Any,
    isComponent: js.Any,
    isExpanded: js.Any,
    isLeaf: js.Any,
    name: js.Any,
    onClick: js.Any,
    onKeyUp: js.Any,
    prefix: js.Any
  ): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(childIds = childIds.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isComponent = isComponent.asInstanceOf[js.Any], isExpanded = isExpanded.asInstanceOf[js.Any], isLeaf = isLeaf.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], onClick = onClick.asInstanceOf[js.Any], onKeyUp = onKeyUp.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[AnonChildIds]))
  }
}

