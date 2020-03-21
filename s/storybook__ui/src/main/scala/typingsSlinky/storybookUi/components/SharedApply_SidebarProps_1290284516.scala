package typingsSlinky.storybookUi.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ExternalPropsWriterProvider
import slinky.web.html.`*`.tag
import typingsSlinky.storybookUi.sidebarMod.SidebarProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_SidebarProps_1290284516 (implicit pw: ExternalPropsWriterProvider)
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  def apply(
    menu: js.Array[_],
    stories: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/api.@storybook/api.State['StoriesHash'] */ js.Any,
    loading: js.UndefOr[Boolean] = js.undefined,
    menuHighlighted: js.UndefOr[Boolean] = js.undefined,
    storyId: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal(menu = menu.asInstanceOf[js.Any], stories = stories.asInstanceOf[js.Any])
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (!js.isUndefined(menuHighlighted)) __obj.updateDynamic("menuHighlighted")(menuHighlighted.asInstanceOf[js.Any])
    if (storyId != null) __obj.updateDynamic("storyId")(storyId.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = SidebarProps
}

