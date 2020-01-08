package typingsSlinky.victory.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.victory.Anon_Left
import typingsSlinky.victory.Anon_Name
import typingsSlinky.victory.Anon_XY
import typingsSlinky.victory.Anon_XYD3Scale
import typingsSlinky.victory.victoryMod.AnimatePropTypeInterface
import typingsSlinky.victory.victoryMod.BlockProps
import typingsSlinky.victory.victoryMod.CategoryPropType
import typingsSlinky.victory.victoryMod.ColorScalePropType
import typingsSlinky.victory.victoryMod.D3Scale
import typingsSlinky.victory.victoryMod.DataGetterPropType
import typingsSlinky.victory.victoryMod.DomainPropType
import typingsSlinky.victory.victoryMod.EventPropTypeInterface
import typingsSlinky.victory.victoryMod.Omit
import typingsSlinky.victory.victoryMod.OrientationTypes
import typingsSlinky.victory.victoryMod.PaddingProps
import typingsSlinky.victory.victoryMod.ScalePropType
import typingsSlinky.victory.victoryMod.StringOrNumberOrCallback
import typingsSlinky.victory.victoryMod.VictoryLegendProps
import typingsSlinky.victory.victoryMod.VictoryStyleInterface
import typingsSlinky.victory.victoryMod.VictoryThemeDefinition
import typingsSlinky.victory.victoryStrings.data
import typingsSlinky.victory.victoryStrings.horizontal
import typingsSlinky.victory.victoryStrings.labels
import typingsSlinky.victory.victoryStrings.left
import typingsSlinky.victory.victoryStrings.parent
import typingsSlinky.victory.victoryStrings.right
import typingsSlinky.victory.victoryStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object VictoryLegend
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.victory.victoryMod.VictoryLegend] {
  @JSImport("victory", "VictoryLegend")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: name */
  def apply(
    animate: Boolean | AnimatePropTypeInterface = null,
    borderComponent: ReactElement = null,
    borderPadding: PaddingProps = null,
    categories: CategoryPropType = null,
    centerTitle: js.UndefOr[Boolean] = js.undefined,
    colorScale: ColorScalePropType = null,
    containerComponent: ReactElement = null,
    data: js.Array[Anon_Name] = null,
    dataComponent: ReactElement = null,
    domain: DomainPropType = null,
    eventKey: StringOrNumberOrCallback | js.Array[String] = null,
    events: js.Array[EventPropTypeInterface[data | labels | parent, StringOrNumberOrCallback]] = null,
    externalEventMutations: js.Array[_] = null,
    groupComponent: ReactElement = null,
    gutter: Double | Anon_Left = null,
    height: Int | Double = null,
    horizontal: js.UndefOr[Boolean] = js.undefined,
    itemsPerRow: Int | Double = null,
    label: String | (js.Function1[/* data */ js.Any, String]) = null,
    labelComponent: ReactElement = null,
    maxDomain: Double | Anon_XY = null,
    minDomain: Double | Anon_XY = null,
    orientation: horizontal | vertical = null,
    padding: PaddingProps = null,
    rowGutter: Double | (Omit[BlockProps, left | right]) = null,
    scale: ScalePropType | D3Scale | Anon_XYD3Scale = null,
    standalone: js.UndefOr[Boolean] = js.undefined,
    style: VictoryStyleInterface = null,
    symbolSpacer: Int | Double = null,
    theme: VictoryThemeDefinition = null,
    title: String | js.Array[String] = null,
    titleComponent: ReactElement = null,
    titleOrientation: OrientationTypes = null,
    width: Int | Double = null,
    x: Int | Double = null,
    y: Int | Double = null,
    y0: DataGetterPropType = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.victory.victoryMod.VictoryLegend] = {
    val __obj = js.Dynamic.literal()
    if (animate != null) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (borderComponent != null) __obj.updateDynamic("borderComponent")(borderComponent.asInstanceOf[js.Any])
    if (borderPadding != null) __obj.updateDynamic("borderPadding")(borderPadding.asInstanceOf[js.Any])
    if (categories != null) __obj.updateDynamic("categories")(categories.asInstanceOf[js.Any])
    if (!js.isUndefined(centerTitle)) __obj.updateDynamic("centerTitle")(centerTitle.asInstanceOf[js.Any])
    if (colorScale != null) __obj.updateDynamic("colorScale")(colorScale.asInstanceOf[js.Any])
    if (containerComponent != null) __obj.updateDynamic("containerComponent")(containerComponent.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dataComponent != null) __obj.updateDynamic("dataComponent")(dataComponent.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (eventKey != null) __obj.updateDynamic("eventKey")(eventKey.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (externalEventMutations != null) __obj.updateDynamic("externalEventMutations")(externalEventMutations.asInstanceOf[js.Any])
    if (groupComponent != null) __obj.updateDynamic("groupComponent")(groupComponent.asInstanceOf[js.Any])
    if (gutter != null) __obj.updateDynamic("gutter")(gutter.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontal)) __obj.updateDynamic("horizontal")(horizontal.asInstanceOf[js.Any])
    if (itemsPerRow != null) __obj.updateDynamic("itemsPerRow")(itemsPerRow.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (labelComponent != null) __obj.updateDynamic("labelComponent")(labelComponent.asInstanceOf[js.Any])
    if (maxDomain != null) __obj.updateDynamic("maxDomain")(maxDomain.asInstanceOf[js.Any])
    if (minDomain != null) __obj.updateDynamic("minDomain")(minDomain.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (rowGutter != null) __obj.updateDynamic("rowGutter")(rowGutter.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (!js.isUndefined(standalone)) __obj.updateDynamic("standalone")(standalone.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (symbolSpacer != null) __obj.updateDynamic("symbolSpacer")(symbolSpacer.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titleComponent != null) __obj.updateDynamic("titleComponent")(titleComponent.asInstanceOf[js.Any])
    if (titleOrientation != null) __obj.updateDynamic("titleOrientation")(titleOrientation.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    if (y0 != null) __obj.updateDynamic("y0")(y0.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.victory.victoryMod.VictoryLegend] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.victory.victoryMod.VictoryLegend](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = VictoryLegendProps
}

