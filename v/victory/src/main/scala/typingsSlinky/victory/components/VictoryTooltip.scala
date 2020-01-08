package typingsSlinky.victory.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.react.reactMod.CSSProperties
import typingsSlinky.victory.victoryMod.NumberOrCallback
import typingsSlinky.victory.victoryMod.OrientationTypes
import typingsSlinky.victory.victoryMod.StringOrNumberOrCallback
import typingsSlinky.victory.victoryMod.VictoryNumberCallback
import typingsSlinky.victory.victoryMod.VictoryStyleObject
import typingsSlinky.victory.victoryMod.VictoryThemeDefinition
import typingsSlinky.victory.victoryMod.VictoryTooltipProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object VictoryTooltip
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.victory.victoryMod.VictoryTooltip] {
  @JSImport("victory", "VictoryTooltip")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    activateData: js.UndefOr[Boolean] = js.undefined,
    active: js.UndefOr[Boolean] = js.undefined,
    angle: String | Double = null,
    cornerRadius: NumberOrCallback = null,
    data: js.Array[_] = null,
    datum: js.Object = null,
    dx: StringOrNumberOrCallback = null,
    dy: StringOrNumberOrCallback = null,
    events: js.Object = null,
    flyoutComponent: ReactElement = null,
    flyoutHeight: NumberOrCallback = null,
    flyoutStyle: VictoryStyleObject = null,
    flyoutWidth: NumberOrCallback = null,
    groupComponent: ReactElement = null,
    height: Int | Double = null,
    horizontal: js.UndefOr[Boolean] = js.undefined,
    index: Double | String = null,
    labelComponent: ReactElement = null,
    orientation: OrientationTypes | VictoryNumberCallback = null,
    pointerLength: NumberOrCallback = null,
    pointerWidth: NumberOrCallback = null,
    renderInPortal: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    text: StringOrNumberOrCallback | (js.Array[Double | String]) = null,
    theme: VictoryThemeDefinition = null,
    width: Int | Double = null,
    x: Int | Double = null,
    y: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.victory.victoryMod.VictoryTooltip] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(activateData)) __obj.updateDynamic("activateData")(activateData.asInstanceOf[js.Any])
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    if (cornerRadius != null) __obj.updateDynamic("cornerRadius")(cornerRadius.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (datum != null) __obj.updateDynamic("datum")(datum.asInstanceOf[js.Any])
    if (dx != null) __obj.updateDynamic("dx")(dx.asInstanceOf[js.Any])
    if (dy != null) __obj.updateDynamic("dy")(dy.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (flyoutComponent != null) __obj.updateDynamic("flyoutComponent")(flyoutComponent.asInstanceOf[js.Any])
    if (flyoutHeight != null) __obj.updateDynamic("flyoutHeight")(flyoutHeight.asInstanceOf[js.Any])
    if (flyoutStyle != null) __obj.updateDynamic("flyoutStyle")(flyoutStyle.asInstanceOf[js.Any])
    if (flyoutWidth != null) __obj.updateDynamic("flyoutWidth")(flyoutWidth.asInstanceOf[js.Any])
    if (groupComponent != null) __obj.updateDynamic("groupComponent")(groupComponent.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontal)) __obj.updateDynamic("horizontal")(horizontal.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (labelComponent != null) __obj.updateDynamic("labelComponent")(labelComponent.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (pointerLength != null) __obj.updateDynamic("pointerLength")(pointerLength.asInstanceOf[js.Any])
    if (pointerWidth != null) __obj.updateDynamic("pointerWidth")(pointerWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(renderInPortal)) __obj.updateDynamic("renderInPortal")(renderInPortal.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.victory.victoryMod.VictoryTooltip] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.victory.victoryMod.VictoryTooltip](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = VictoryTooltipProps
}

