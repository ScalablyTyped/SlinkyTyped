package typingsSlinky.victory.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.std.Pick
import typingsSlinky.victory.Anon_XY
import typingsSlinky.victory.Anon_XYD3Scale
import typingsSlinky.victory.victoryMod.AnimatePropTypeInterface
import typingsSlinky.victory.victoryMod.D3Scale
import typingsSlinky.victory.victoryMod.DomainPaddingPropType
import typingsSlinky.victory.victoryMod.DomainPropType
import typingsSlinky.victory.victoryMod.EventPropTypeInterface
import typingsSlinky.victory.victoryMod.PaddingProps
import typingsSlinky.victory.victoryMod.ScalePropType
import typingsSlinky.victory.victoryMod.StringOrNumberOrCallback
import typingsSlinky.victory.victoryMod.VictoryChartProps
import typingsSlinky.victory.victoryMod.VictoryStyleInterface
import typingsSlinky.victory.victoryMod.VictoryThemeDefinition
import typingsSlinky.victory.victoryStrings.parent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object VictoryChart
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.victory.victoryMod.VictoryChart] {
  @JSImport("victory", "VictoryChart")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: name */
  def apply(
    animate: Boolean | AnimatePropTypeInterface = null,
    containerComponent: ReactElement = null,
    domain: DomainPropType = null,
    domainPadding: DomainPaddingPropType = null,
    eventKey: StringOrNumberOrCallback = null,
    events: js.Array[EventPropTypeInterface[String, StringOrNumberOrCallback]] = null,
    groupComponent: ReactElement = null,
    height: Int | Double = null,
    horizontal: js.UndefOr[Boolean] = js.undefined,
    maxDomain: Double | Anon_XY = null,
    minDomain: Double | Anon_XY = null,
    padding: PaddingProps = null,
    scale: ScalePropType | D3Scale | Anon_XYD3Scale = null,
    standalone: js.UndefOr[Boolean] = js.undefined,
    style: Pick[VictoryStyleInterface, parent] = null,
    theme: VictoryThemeDefinition = null,
    width: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.victory.victoryMod.VictoryChart] = {
    val __obj = js.Dynamic.literal()
    if (animate != null) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (containerComponent != null) __obj.updateDynamic("containerComponent")(containerComponent.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (domainPadding != null) __obj.updateDynamic("domainPadding")(domainPadding.asInstanceOf[js.Any])
    if (eventKey != null) __obj.updateDynamic("eventKey")(eventKey.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (groupComponent != null) __obj.updateDynamic("groupComponent")(groupComponent.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontal)) __obj.updateDynamic("horizontal")(horizontal.asInstanceOf[js.Any])
    if (maxDomain != null) __obj.updateDynamic("maxDomain")(maxDomain.asInstanceOf[js.Any])
    if (minDomain != null) __obj.updateDynamic("minDomain")(minDomain.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (!js.isUndefined(standalone)) __obj.updateDynamic("standalone")(standalone.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.victory.victoryMod.VictoryChart] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.victory.victoryMod.VictoryChart](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = VictoryChartProps
}

