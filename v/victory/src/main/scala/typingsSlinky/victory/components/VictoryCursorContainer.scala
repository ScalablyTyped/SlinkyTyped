package typingsSlinky.victory.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.react.mod.DOMAttributes
import typingsSlinky.victory.mod.CursorData
import typingsSlinky.victory.mod.VictoryCursorContainerProps
import typingsSlinky.victory.victoryStrings.x
import typingsSlinky.victory.victoryStrings.y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object VictoryCursorContainer
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.victory.mod.VictoryCursorContainer] {
  @JSImport("victory", "VictoryCursorContainer")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: style, title */
  def apply(
    cursorComponent: ReactElement = null,
    cursorDimension: x | y = null,
    cursorLabel: /* point */ CursorData => Unit = null,
    cursorLabelComponent: ReactElement = null,
    cursorLabelOffset: Double | CursorData = null,
    defaultCursorValue: Double | CursorData = null,
    desc: String = null,
    disable: js.UndefOr[Boolean] = js.undefined,
    events: DOMAttributes[_] = null,
    height: Int | Double = null,
    onCursorChange: (/* value */ CursorData, /* props */ VictoryCursorContainerProps) => Unit = null,
    responsive: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.victory.mod.VictoryCursorContainer] = {
    val __obj = js.Dynamic.literal()
    if (cursorComponent != null) __obj.updateDynamic("cursorComponent")(cursorComponent.asInstanceOf[js.Any])
    if (cursorDimension != null) __obj.updateDynamic("cursorDimension")(cursorDimension.asInstanceOf[js.Any])
    if (cursorLabel != null) __obj.updateDynamic("cursorLabel")(js.Any.fromFunction1(cursorLabel))
    if (cursorLabelComponent != null) __obj.updateDynamic("cursorLabelComponent")(cursorLabelComponent.asInstanceOf[js.Any])
    if (cursorLabelOffset != null) __obj.updateDynamic("cursorLabelOffset")(cursorLabelOffset.asInstanceOf[js.Any])
    if (defaultCursorValue != null) __obj.updateDynamic("defaultCursorValue")(defaultCursorValue.asInstanceOf[js.Any])
    if (desc != null) __obj.updateDynamic("desc")(desc.asInstanceOf[js.Any])
    if (!js.isUndefined(disable)) __obj.updateDynamic("disable")(disable.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (onCursorChange != null) __obj.updateDynamic("onCursorChange")(js.Any.fromFunction2(onCursorChange))
    if (!js.isUndefined(responsive)) __obj.updateDynamic("responsive")(responsive.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.victory.mod.VictoryCursorContainer] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.victory.mod.VictoryCursorContainer](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = VictoryCursorContainerProps
}

