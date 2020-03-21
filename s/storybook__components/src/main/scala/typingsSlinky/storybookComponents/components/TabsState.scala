package typingsSlinky.storybookComponents.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.storybookComponents.tabsMod.TabsStateProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TabsState
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.storybookComponents.mod.TabsState] {
  @JSImport("@storybook/components", "TabsState")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    absolute: Boolean,
    backgroundColor: String,
    bordered: Boolean,
    initial: String,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.storybookComponents.mod.TabsState] = {
    val __obj = js.Dynamic.literal(absolute = absolute.asInstanceOf[js.Any], backgroundColor = backgroundColor.asInstanceOf[js.Any], bordered = bordered.asInstanceOf[js.Any], initial = initial.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = TabsStateProps
}

