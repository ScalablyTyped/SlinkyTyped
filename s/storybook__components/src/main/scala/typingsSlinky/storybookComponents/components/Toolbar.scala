package typingsSlinky.storybookComponents.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.storybookComponents.toolbarMod.ToolbarProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Toolbar
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("@storybook/components/dist/blocks/Toolbar", "Toolbar")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    resetZoom: () => Unit,
    zoom: Double => Unit,
    baseUrl: String = null,
    border: js.UndefOr[Boolean] = js.undefined,
    storyId: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal(resetZoom = js.Any.fromFunction0(resetZoom), zoom = js.Any.fromFunction1(zoom))
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(border)) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (storyId != null) __obj.updateDynamic("storyId")(storyId.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ToolbarProps
}

