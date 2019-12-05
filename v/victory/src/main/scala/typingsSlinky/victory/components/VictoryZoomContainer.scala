package typingsSlinky.victory.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.react.reactMod.CSSProperties
import typingsSlinky.react.reactMod.DOMAttributes
import typingsSlinky.victory.victoryMod.CursorData
import typingsSlinky.victory.victoryMod.DomainPropType
import typingsSlinky.victory.victoryMod.VictoryZoomContainerProps
import typingsSlinky.victory.victoryStrings.all
import typingsSlinky.victory.victoryStrings.disable
import typingsSlinky.victory.victoryStrings.none
import typingsSlinky.victory.victoryStrings.x
import typingsSlinky.victory.victoryStrings.y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object VictoryZoomContainer
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.victory.victoryMod.VictoryZoomContainer] {
  @JSImport("victory", "VictoryZoomContainer")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    allowPan: js.UndefOr[Boolean] = js.undefined,
    allowZoom: js.UndefOr[Boolean] = js.undefined,
    brushStyle: CSSProperties = null,
    clipContainerComponent: ReactElement = null,
    defaultBrushArea: all | none | disable = null,
    desc: String = null,
    disable: js.UndefOr[Boolean] = js.undefined,
    downsample: Double | Boolean = null,
    events: DOMAttributes[_] = null,
    height: Int | Double = null,
    minimumZoom: CursorData = null,
    onZoomDomainChange: (/* domain */ DomainPropType, /* props */ VictoryZoomContainerProps) => Unit = null,
    responsive: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    title: String = null,
    width: Int | Double = null,
    zoomDimension: x | y = null,
    zoomDomain: DomainPropType = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.victory.victoryMod.VictoryZoomContainer] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowPan)) __obj.updateDynamic("allowPan")(allowPan.asInstanceOf[js.Any])
    if (!js.isUndefined(allowZoom)) __obj.updateDynamic("allowZoom")(allowZoom.asInstanceOf[js.Any])
    if (brushStyle != null) __obj.updateDynamic("brushStyle")(brushStyle.asInstanceOf[js.Any])
    if (clipContainerComponent != null) __obj.updateDynamic("clipContainerComponent")(clipContainerComponent.asInstanceOf[js.Any])
    if (defaultBrushArea != null) __obj.updateDynamic("defaultBrushArea")(defaultBrushArea.asInstanceOf[js.Any])
    if (desc != null) __obj.updateDynamic("desc")(desc.asInstanceOf[js.Any])
    if (!js.isUndefined(disable)) __obj.updateDynamic("disable")(disable.asInstanceOf[js.Any])
    if (downsample != null) __obj.updateDynamic("downsample")(downsample.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (minimumZoom != null) __obj.updateDynamic("minimumZoom")(minimumZoom.asInstanceOf[js.Any])
    if (onZoomDomainChange != null) __obj.updateDynamic("onZoomDomainChange")(js.Any.fromFunction2(onZoomDomainChange))
    if (!js.isUndefined(responsive)) __obj.updateDynamic("responsive")(responsive.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (zoomDimension != null) __obj.updateDynamic("zoomDimension")(zoomDimension.asInstanceOf[js.Any])
    if (zoomDomain != null) __obj.updateDynamic("zoomDomain")(zoomDomain.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = VictoryZoomContainerProps
}

