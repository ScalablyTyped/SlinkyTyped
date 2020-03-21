package typingsSlinky.victory.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.react.mod.DOMAttributes
import typingsSlinky.victory.mod.VictoryVoronoiContainerProps
import typingsSlinky.victory.victoryStrings.x
import typingsSlinky.victory.victoryStrings.y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object VictoryVoronoiContainer
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.victory.mod.VictoryVoronoiContainer] {
  @JSImport("victory", "VictoryVoronoiContainer")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: style, title */
  def apply(
    activateData: js.UndefOr[Boolean] = js.undefined,
    activateLabels: js.UndefOr[Boolean] = js.undefined,
    desc: String = null,
    disable: js.UndefOr[Boolean] = js.undefined,
    events: DOMAttributes[_] = null,
    height: Int | Double = null,
    labelComponent: ReactElement = null,
    labels: (/* point */ js.Any, /* index */ Double, /* points */ js.Array[_]) => String = null,
    onActivated: (/* points */ js.Array[_], /* props */ VictoryVoronoiContainerProps) => Unit = null,
    onDeactivated: (/* points */ js.Array[_], /* props */ VictoryVoronoiContainerProps) => Unit = null,
    radius: Int | Double = null,
    responsive: js.UndefOr[Boolean] = js.undefined,
    voronoiBlacklist: js.Array[String] = null,
    voronoiDimension: x | y = null,
    voronoiPadding: Int | Double = null,
    width: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.victory.mod.VictoryVoronoiContainer] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(activateData)) __obj.updateDynamic("activateData")(activateData.asInstanceOf[js.Any])
    if (!js.isUndefined(activateLabels)) __obj.updateDynamic("activateLabels")(activateLabels.asInstanceOf[js.Any])
    if (desc != null) __obj.updateDynamic("desc")(desc.asInstanceOf[js.Any])
    if (!js.isUndefined(disable)) __obj.updateDynamic("disable")(disable.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (labelComponent != null) __obj.updateDynamic("labelComponent")(labelComponent.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(js.Any.fromFunction3(labels))
    if (onActivated != null) __obj.updateDynamic("onActivated")(js.Any.fromFunction2(onActivated))
    if (onDeactivated != null) __obj.updateDynamic("onDeactivated")(js.Any.fromFunction2(onDeactivated))
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (!js.isUndefined(responsive)) __obj.updateDynamic("responsive")(responsive.asInstanceOf[js.Any])
    if (voronoiBlacklist != null) __obj.updateDynamic("voronoiBlacklist")(voronoiBlacklist.asInstanceOf[js.Any])
    if (voronoiDimension != null) __obj.updateDynamic("voronoiDimension")(voronoiDimension.asInstanceOf[js.Any])
    if (voronoiPadding != null) __obj.updateDynamic("voronoiPadding")(voronoiPadding.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.victory.mod.VictoryVoronoiContainer] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.victory.mod.VictoryVoronoiContainer](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = VictoryVoronoiContainerProps
}

