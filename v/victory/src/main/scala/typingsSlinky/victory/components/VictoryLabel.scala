package typingsSlinky.victory.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.DOMAttributes
import typingsSlinky.victory.AnonX
import typingsSlinky.victory.mod.StringOrNumberOrCallback
import typingsSlinky.victory.mod.TextAnchorType
import typingsSlinky.victory.mod.VerticalAnchorType
import typingsSlinky.victory.mod.VictoryLabelProps
import typingsSlinky.victory.victoryStrings.parallel
import typingsSlinky.victory.victoryStrings.perpendicular
import typingsSlinky.victory.victoryStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object VictoryLabel
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.victory.mod.VictoryLabel] {
  @JSImport("victory", "VictoryLabel")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    angle: String | Double = null,
    capHeight: StringOrNumberOrCallback = null,
    data: js.Array[_] = null,
    datum: js.Object = null,
    dx: StringOrNumberOrCallback = null,
    dy: StringOrNumberOrCallback = null,
    events: DOMAttributes[_] = null,
    labelPlacement: parallel | perpendicular | vertical = null,
    lineHeight: StringOrNumberOrCallback = null,
    origin: AnonX = null,
    polar: js.UndefOr[Boolean] = js.undefined,
    renderInPortal: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties | js.Array[CSSProperties] = null,
    text: js.Array[String] | StringOrNumberOrCallback = null,
    textAnchor: TextAnchorType | js.Function0[TextAnchorType] = null,
    transform: String | js.Object | (js.Function0[String | js.Object]) = null,
    verticalAnchor: VerticalAnchorType | js.Function0[VerticalAnchorType] = null,
    x: Int | Double = null,
    y: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.victory.mod.VictoryLabel] = {
    val __obj = js.Dynamic.literal()
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    if (capHeight != null) __obj.updateDynamic("capHeight")(capHeight.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (datum != null) __obj.updateDynamic("datum")(datum.asInstanceOf[js.Any])
    if (dx != null) __obj.updateDynamic("dx")(dx.asInstanceOf[js.Any])
    if (dy != null) __obj.updateDynamic("dy")(dy.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (labelPlacement != null) __obj.updateDynamic("labelPlacement")(labelPlacement.asInstanceOf[js.Any])
    if (lineHeight != null) __obj.updateDynamic("lineHeight")(lineHeight.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    if (!js.isUndefined(polar)) __obj.updateDynamic("polar")(polar.asInstanceOf[js.Any])
    if (!js.isUndefined(renderInPortal)) __obj.updateDynamic("renderInPortal")(renderInPortal.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (textAnchor != null) __obj.updateDynamic("textAnchor")(textAnchor.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    if (verticalAnchor != null) __obj.updateDynamic("verticalAnchor")(verticalAnchor.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.victory.mod.VictoryLabel] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.victory.mod.VictoryLabel](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = VictoryLabelProps
}

