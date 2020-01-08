package typingsSlinky.victory.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.victory.Anon_XY
import typingsSlinky.victory.Anon_XYD3Scale
import typingsSlinky.victory.victoryMod.AnimatePropTypeInterface
import typingsSlinky.victory.victoryMod.ColorScalePropType
import typingsSlinky.victory.victoryMod.D3Scale
import typingsSlinky.victory.victoryMod.DataGetterPropType
import typingsSlinky.victory.victoryMod.EventPropTypeInterface
import typingsSlinky.victory.victoryMod.PaddingProps
import typingsSlinky.victory.victoryMod.ScalePropType
import typingsSlinky.victory.victoryMod.StringOrNumberOrCallback
import typingsSlinky.victory.victoryMod.VictoryPieProps
import typingsSlinky.victory.victoryMod.VictoryStyleInterface
import typingsSlinky.victory.victoryMod.VictoryThemeDefinition
import typingsSlinky.victory.victoryStrings.data
import typingsSlinky.victory.victoryStrings.labels
import typingsSlinky.victory.victoryStrings.parent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object VictoryPie
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.victory.victoryMod.VictoryPie] {
  @JSImport("victory", "VictoryPie")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: name */
  def apply(
    animate: Boolean | AnimatePropTypeInterface = null,
    colorScale: ColorScalePropType = null,
    containerComponent: ReactElement = null,
    cornerRadius: Int | Double = null,
    data: js.Array[_] = null,
    dataComponent: ReactElement = null,
    endAngle: Int | Double = null,
    eventKey: StringOrNumberOrCallback = null,
    events: js.Array[
      EventPropTypeInterface[data | labels | parent, StringOrNumberOrCallback | (js.Array[Double | String])]
    ] = null,
    groupComponent: ReactElement = null,
    height: Int | Double = null,
    horizontal: js.UndefOr[Boolean] = js.undefined,
    innerRadius: Int | Double = null,
    labelComponent: ReactElement = null,
    labelRadius: Int | Double = null,
    labels: js.Array[String] | (js.Function1[/* data */ js.Any, String]) = null,
    maxDomain: Double | Anon_XY = null,
    minDomain: Double | Anon_XY = null,
    padAngle: Int | Double = null,
    padding: PaddingProps = null,
    radius: Int | Double = null,
    scale: ScalePropType | D3Scale | Anon_XYD3Scale = null,
    standalone: js.UndefOr[Boolean] = js.undefined,
    startAngle: Int | Double = null,
    style: VictoryStyleInterface = null,
    theme: VictoryThemeDefinition = null,
    width: Int | Double = null,
    x: DataGetterPropType = null,
    y: DataGetterPropType = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.victory.victoryMod.VictoryPie] = {
    val __obj = js.Dynamic.literal()
    if (animate != null) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (colorScale != null) __obj.updateDynamic("colorScale")(colorScale.asInstanceOf[js.Any])
    if (containerComponent != null) __obj.updateDynamic("containerComponent")(containerComponent.asInstanceOf[js.Any])
    if (cornerRadius != null) __obj.updateDynamic("cornerRadius")(cornerRadius.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dataComponent != null) __obj.updateDynamic("dataComponent")(dataComponent.asInstanceOf[js.Any])
    if (endAngle != null) __obj.updateDynamic("endAngle")(endAngle.asInstanceOf[js.Any])
    if (eventKey != null) __obj.updateDynamic("eventKey")(eventKey.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (groupComponent != null) __obj.updateDynamic("groupComponent")(groupComponent.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontal)) __obj.updateDynamic("horizontal")(horizontal.asInstanceOf[js.Any])
    if (innerRadius != null) __obj.updateDynamic("innerRadius")(innerRadius.asInstanceOf[js.Any])
    if (labelComponent != null) __obj.updateDynamic("labelComponent")(labelComponent.asInstanceOf[js.Any])
    if (labelRadius != null) __obj.updateDynamic("labelRadius")(labelRadius.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (maxDomain != null) __obj.updateDynamic("maxDomain")(maxDomain.asInstanceOf[js.Any])
    if (minDomain != null) __obj.updateDynamic("minDomain")(minDomain.asInstanceOf[js.Any])
    if (padAngle != null) __obj.updateDynamic("padAngle")(padAngle.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (!js.isUndefined(standalone)) __obj.updateDynamic("standalone")(standalone.asInstanceOf[js.Any])
    if (startAngle != null) __obj.updateDynamic("startAngle")(startAngle.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.victory.victoryMod.VictoryPie] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.victory.victoryMod.VictoryPie](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = VictoryPieProps
}

