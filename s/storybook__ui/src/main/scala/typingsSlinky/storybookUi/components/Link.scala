package typingsSlinky.storybookUi.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.storybookUi.AnonChildIds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Link
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("@storybook/ui/dist/components/sidebar/SidebarStories", "Link")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    childIds: js.Any,
    id: js.Any,
    isComponent: js.Any,
    isExpanded: js.Any,
    isLeaf: js.Any,
    name: js.Any,
    onClick: js.Any,
    onKeyUp: js.Any,
    prefix: js.Any,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal(childIds = childIds.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isComponent = isComponent.asInstanceOf[js.Any], isExpanded = isExpanded.asInstanceOf[js.Any], isLeaf = isLeaf.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], onClick = onClick.asInstanceOf[js.Any], onKeyUp = onKeyUp.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = AnonChildIds
}

