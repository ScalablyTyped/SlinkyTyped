package typingsSlinky.victory.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.victory.Anon_AxisAxisLabel
import typingsSlinky.victory.Anon_XY
import typingsSlinky.victory.Anon_XYD3Scale
import typingsSlinky.victory.victoryMod.AnimatePropTypeInterface
import typingsSlinky.victory.victoryMod.D3Scale
import typingsSlinky.victory.victoryMod.DomainPropType
import typingsSlinky.victory.victoryMod.EventPropTypeInterface
import typingsSlinky.victory.victoryMod.PaddingProps
import typingsSlinky.victory.victoryMod.ScalePropType
import typingsSlinky.victory.victoryMod.VictoryAxisProps
import typingsSlinky.victory.victoryMod.VictoryThemeDefinition
import typingsSlinky.victory.victoryStrings.axis
import typingsSlinky.victory.victoryStrings.axisLabel
import typingsSlinky.victory.victoryStrings.bottom
import typingsSlinky.victory.victoryStrings.grid
import typingsSlinky.victory.victoryStrings.left
import typingsSlinky.victory.victoryStrings.parent
import typingsSlinky.victory.victoryStrings.right
import typingsSlinky.victory.victoryStrings.tickLabels
import typingsSlinky.victory.victoryStrings.ticks
import typingsSlinky.victory.victoryStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object VictoryAxis
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.victory.victoryMod.VictoryAxis] {
  @JSImport("victory", "VictoryAxis")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: name */
  def apply(
    animate: Boolean | AnimatePropTypeInterface = null,
    axisComponent: ReactElement = null,
    axisLabelComponent: ReactElement = null,
    axisValue: Double | String | js.Object = null,
    containerComponent: ReactElement = null,
    crossAxis: js.UndefOr[Boolean] = js.undefined,
    dependentAxis: js.UndefOr[Boolean] = js.undefined,
    domain: DomainPropType = null,
    events: js.Array[
      EventPropTypeInterface[axis | axisLabel | grid | ticks | tickLabels | parent, Double | String]
    ] = null,
    fixLabelOverlap: js.UndefOr[Boolean] = js.undefined,
    gridComponent: ReactElement = null,
    groupComponent: ReactElement = null,
    height: Int | Double = null,
    horizontal: js.UndefOr[Boolean] = js.undefined,
    invertAxis: js.UndefOr[Boolean] = js.undefined,
    label: js.Any = null,
    maxDomain: Double | Anon_XY = null,
    minDomain: Double | Anon_XY = null,
    offsetX: Int | Double = null,
    offsetY: Int | Double = null,
    orientation: top | bottom | left | right = null,
    padding: PaddingProps = null,
    scale: ScalePropType | D3Scale | Anon_XYD3Scale = null,
    standalone: js.UndefOr[Boolean] = js.undefined,
    style: Anon_AxisAxisLabel = null,
    theme: VictoryThemeDefinition = null,
    tickComponent: ReactElement = null,
    tickCount: Int | Double = null,
    tickFormat: js.Array[_] | (js.Function3[/* tick */ js.Any, /* index */ Double, /* ticks */ js.Array[_], String | Double]) = null,
    tickLabelComponent: ReactElement = null,
    tickValues: js.Array[_] = null,
    width: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.victory.victoryMod.VictoryAxis] = {
    val __obj = js.Dynamic.literal()
    if (animate != null) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (axisComponent != null) __obj.updateDynamic("axisComponent")(axisComponent.asInstanceOf[js.Any])
    if (axisLabelComponent != null) __obj.updateDynamic("axisLabelComponent")(axisLabelComponent.asInstanceOf[js.Any])
    if (axisValue != null) __obj.updateDynamic("axisValue")(axisValue.asInstanceOf[js.Any])
    if (containerComponent != null) __obj.updateDynamic("containerComponent")(containerComponent.asInstanceOf[js.Any])
    if (!js.isUndefined(crossAxis)) __obj.updateDynamic("crossAxis")(crossAxis.asInstanceOf[js.Any])
    if (!js.isUndefined(dependentAxis)) __obj.updateDynamic("dependentAxis")(dependentAxis.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (!js.isUndefined(fixLabelOverlap)) __obj.updateDynamic("fixLabelOverlap")(fixLabelOverlap.asInstanceOf[js.Any])
    if (gridComponent != null) __obj.updateDynamic("gridComponent")(gridComponent.asInstanceOf[js.Any])
    if (groupComponent != null) __obj.updateDynamic("groupComponent")(groupComponent.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontal)) __obj.updateDynamic("horizontal")(horizontal.asInstanceOf[js.Any])
    if (!js.isUndefined(invertAxis)) __obj.updateDynamic("invertAxis")(invertAxis.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (maxDomain != null) __obj.updateDynamic("maxDomain")(maxDomain.asInstanceOf[js.Any])
    if (minDomain != null) __obj.updateDynamic("minDomain")(minDomain.asInstanceOf[js.Any])
    if (offsetX != null) __obj.updateDynamic("offsetX")(offsetX.asInstanceOf[js.Any])
    if (offsetY != null) __obj.updateDynamic("offsetY")(offsetY.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (!js.isUndefined(standalone)) __obj.updateDynamic("standalone")(standalone.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (tickComponent != null) __obj.updateDynamic("tickComponent")(tickComponent.asInstanceOf[js.Any])
    if (tickCount != null) __obj.updateDynamic("tickCount")(tickCount.asInstanceOf[js.Any])
    if (tickFormat != null) __obj.updateDynamic("tickFormat")(tickFormat.asInstanceOf[js.Any])
    if (tickLabelComponent != null) __obj.updateDynamic("tickLabelComponent")(tickLabelComponent.asInstanceOf[js.Any])
    if (tickValues != null) __obj.updateDynamic("tickValues")(tickValues.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.victory.victoryMod.VictoryAxis] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.victory.victoryMod.VictoryAxis](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = VictoryAxisProps
}

