package typingsSlinky.victory.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.DOMAttributes
import typingsSlinky.victory.mod.DomainPropType
import typingsSlinky.victory.mod.VictoryBrushContainerProps
import typingsSlinky.victory.victoryStrings.all
import typingsSlinky.victory.victoryStrings.disable
import typingsSlinky.victory.victoryStrings.none
import typingsSlinky.victory.victoryStrings.x
import typingsSlinky.victory.victoryStrings.y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object VictoryBrushContainer
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.victory.mod.VictoryBrushContainer] {
  @JSImport("victory", "VictoryBrushContainer")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: style, title */
  def apply(
    allowDrag: js.UndefOr[Boolean] = js.undefined,
    allowResize: js.UndefOr[Boolean] = js.undefined,
    brushComponent: ReactElement = null,
    brushDimension: x | y = null,
    brushDomain: DomainPropType = null,
    brushStyle: CSSProperties = null,
    defaultBrushArea: all | none | disable = null,
    desc: String = null,
    disable: js.UndefOr[Boolean] = js.undefined,
    events: DOMAttributes[_] = null,
    handleComponent: ReactElement = null,
    handleStyle: CSSProperties = null,
    height: Int | Double = null,
    onBrushDomainChange: (/* domain */ DomainPropType, /* props */ VictoryBrushContainerProps) => Unit = null,
    responsive: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.victory.mod.VictoryBrushContainer] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowDrag)) __obj.updateDynamic("allowDrag")(allowDrag.asInstanceOf[js.Any])
    if (!js.isUndefined(allowResize)) __obj.updateDynamic("allowResize")(allowResize.asInstanceOf[js.Any])
    if (brushComponent != null) __obj.updateDynamic("brushComponent")(brushComponent.asInstanceOf[js.Any])
    if (brushDimension != null) __obj.updateDynamic("brushDimension")(brushDimension.asInstanceOf[js.Any])
    if (brushDomain != null) __obj.updateDynamic("brushDomain")(brushDomain.asInstanceOf[js.Any])
    if (brushStyle != null) __obj.updateDynamic("brushStyle")(brushStyle.asInstanceOf[js.Any])
    if (defaultBrushArea != null) __obj.updateDynamic("defaultBrushArea")(defaultBrushArea.asInstanceOf[js.Any])
    if (desc != null) __obj.updateDynamic("desc")(desc.asInstanceOf[js.Any])
    if (!js.isUndefined(disable)) __obj.updateDynamic("disable")(disable.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (handleComponent != null) __obj.updateDynamic("handleComponent")(handleComponent.asInstanceOf[js.Any])
    if (handleStyle != null) __obj.updateDynamic("handleStyle")(handleStyle.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (onBrushDomainChange != null) __obj.updateDynamic("onBrushDomainChange")(js.Any.fromFunction2(onBrushDomainChange))
    if (!js.isUndefined(responsive)) __obj.updateDynamic("responsive")(responsive.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.victory.mod.VictoryBrushContainer] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.victory.mod.VictoryBrushContainer](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = VictoryBrushContainerProps
}

