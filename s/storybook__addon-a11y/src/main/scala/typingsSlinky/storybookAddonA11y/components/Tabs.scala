package typingsSlinky.storybookAddonA11y.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.storybookAddonA11y.AnonItems
import typingsSlinky.storybookAddonA11y.tabsMod.TabsProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Tabs
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.storybookAddonA11y.tabsMod.Tabs] {
  @JSImport("@storybook/addon-a11y/dist/components/Tabs", "Tabs")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(tabs: js.Array[AnonItems], _overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, typingsSlinky.storybookAddonA11y.tabsMod.Tabs] = {
    val __obj = js.Dynamic.literal(tabs = tabs.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = TabsProps
}

