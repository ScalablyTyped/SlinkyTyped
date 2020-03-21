package typingsSlinky.victory.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.victory.Anon1
import typingsSlinky.victory.AnonXBoolean
import typingsSlinky.victory.AnonY
import typingsSlinky.victory.mod.AnimatePropTypeInterface
import typingsSlinky.victory.mod.CategoryPropType
import typingsSlinky.victory.mod.D3Scale
import typingsSlinky.victory.mod.DataGetterPropType
import typingsSlinky.victory.mod.DomainPaddingPropType
import typingsSlinky.victory.mod.DomainPropType
import typingsSlinky.victory.mod.EventPropTypeInterface
import typingsSlinky.victory.mod.PaddingProps
import typingsSlinky.victory.mod.ScalePropType
import typingsSlinky.victory.mod.StringOrNumberOrCallback
import typingsSlinky.victory.mod.VictoryBoxPlotProps
import typingsSlinky.victory.mod.VictoryBoxPlotStyleInterface
import typingsSlinky.victory.mod.VictoryThemeDefinition
import typingsSlinky.victory.victoryStrings.bottom
import typingsSlinky.victory.victoryStrings.left
import typingsSlinky.victory.victoryStrings.right
import typingsSlinky.victory.victoryStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object VictoryBoxPlot
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.victory.mod.VictoryBoxPlot] {
  @JSImport("victory", "VictoryBoxPlot")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: name */
  def apply(
    animate: Boolean | AnimatePropTypeInterface = null,
    boxWidth: Int | Double = null,
    categories: CategoryPropType = null,
    containerComponent: ReactElement = null,
    data: js.Array[_] = null,
    dataComponent: ReactElement = null,
    domain: DomainPropType = null,
    domainPadding: DomainPaddingPropType = null,
    eventKey: StringOrNumberOrCallback = null,
    events: js.Array[EventPropTypeInterface[String, StringOrNumberOrCallback]] = null,
    groupComponent: ReactElement = null,
    height: Int | Double = null,
    horizontal: js.UndefOr[Boolean] = js.undefined,
    labelOrientation: top | bottom | left | right = null,
    labels: js.UndefOr[Boolean] = js.undefined,
    max: StringOrNumberOrCallback | js.Array[String] = null,
    maxComponent: ReactElement = null,
    maxDomain: Double | AnonY = null,
    maxLabelComponent: ReactElement = null,
    median: StringOrNumberOrCallback | js.Array[String] = null,
    medianComponent: ReactElement = null,
    medianLabelComponent: ReactElement = null,
    min: StringOrNumberOrCallback | js.Array[String] = null,
    minComponent: ReactElement = null,
    minDomain: Double | AnonY = null,
    minLabelComponent: ReactElement = null,
    padding: PaddingProps = null,
    q1: StringOrNumberOrCallback | js.Array[String] = null,
    q1Component: ReactElement = null,
    q1LabelComponent: ReactElement = null,
    q3: StringOrNumberOrCallback | js.Array[String] = null,
    q3Component: ReactElement = null,
    q3LabelComponent: ReactElement = null,
    scale: ScalePropType | D3Scale | Anon1 = null,
    singleQuadrantDomainPadding: Boolean | AnonXBoolean = null,
    standalone: js.UndefOr[Boolean] = js.undefined,
    style: VictoryBoxPlotStyleInterface = null,
    theme: VictoryThemeDefinition = null,
    whiskerWidth: Int | Double = null,
    width: Int | Double = null,
    x: DataGetterPropType = null,
    y: DataGetterPropType = null,
    y0: DataGetterPropType = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.victory.mod.VictoryBoxPlot] = {
    val __obj = js.Dynamic.literal()
    if (animate != null) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (boxWidth != null) __obj.updateDynamic("boxWidth")(boxWidth.asInstanceOf[js.Any])
    if (categories != null) __obj.updateDynamic("categories")(categories.asInstanceOf[js.Any])
    if (containerComponent != null) __obj.updateDynamic("containerComponent")(containerComponent.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dataComponent != null) __obj.updateDynamic("dataComponent")(dataComponent.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (domainPadding != null) __obj.updateDynamic("domainPadding")(domainPadding.asInstanceOf[js.Any])
    if (eventKey != null) __obj.updateDynamic("eventKey")(eventKey.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (groupComponent != null) __obj.updateDynamic("groupComponent")(groupComponent.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontal)) __obj.updateDynamic("horizontal")(horizontal.asInstanceOf[js.Any])
    if (labelOrientation != null) __obj.updateDynamic("labelOrientation")(labelOrientation.asInstanceOf[js.Any])
    if (!js.isUndefined(labels)) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (maxComponent != null) __obj.updateDynamic("maxComponent")(maxComponent.asInstanceOf[js.Any])
    if (maxDomain != null) __obj.updateDynamic("maxDomain")(maxDomain.asInstanceOf[js.Any])
    if (maxLabelComponent != null) __obj.updateDynamic("maxLabelComponent")(maxLabelComponent.asInstanceOf[js.Any])
    if (median != null) __obj.updateDynamic("median")(median.asInstanceOf[js.Any])
    if (medianComponent != null) __obj.updateDynamic("medianComponent")(medianComponent.asInstanceOf[js.Any])
    if (medianLabelComponent != null) __obj.updateDynamic("medianLabelComponent")(medianLabelComponent.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (minComponent != null) __obj.updateDynamic("minComponent")(minComponent.asInstanceOf[js.Any])
    if (minDomain != null) __obj.updateDynamic("minDomain")(minDomain.asInstanceOf[js.Any])
    if (minLabelComponent != null) __obj.updateDynamic("minLabelComponent")(minLabelComponent.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (q1 != null) __obj.updateDynamic("q1")(q1.asInstanceOf[js.Any])
    if (q1Component != null) __obj.updateDynamic("q1Component")(q1Component.asInstanceOf[js.Any])
    if (q1LabelComponent != null) __obj.updateDynamic("q1LabelComponent")(q1LabelComponent.asInstanceOf[js.Any])
    if (q3 != null) __obj.updateDynamic("q3")(q3.asInstanceOf[js.Any])
    if (q3Component != null) __obj.updateDynamic("q3Component")(q3Component.asInstanceOf[js.Any])
    if (q3LabelComponent != null) __obj.updateDynamic("q3LabelComponent")(q3LabelComponent.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (singleQuadrantDomainPadding != null) __obj.updateDynamic("singleQuadrantDomainPadding")(singleQuadrantDomainPadding.asInstanceOf[js.Any])
    if (!js.isUndefined(standalone)) __obj.updateDynamic("standalone")(standalone.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (whiskerWidth != null) __obj.updateDynamic("whiskerWidth")(whiskerWidth.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    if (y0 != null) __obj.updateDynamic("y0")(y0.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.victory.mod.VictoryBoxPlot] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.victory.mod.VictoryBoxPlot](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = VictoryBoxPlotProps
}

