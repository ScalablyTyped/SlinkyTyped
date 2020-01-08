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
import typingsSlinky.victory.victoryMod.D3Scale
import typingsSlinky.victory.victoryMod.FlyoutProps
import typingsSlinky.victory.victoryMod.PaddingProps
import typingsSlinky.victory.victoryMod.ScalePropType
import typingsSlinky.victory.victoryMod.VictoryStyleObject
import typingsSlinky.victory.victoryMod.VictoryThemeDefinition
import typingsSlinky.victory.victoryStrings.bottom
import typingsSlinky.victory.victoryStrings.left
import typingsSlinky.victory.victoryStrings.right
import typingsSlinky.victory.victoryStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Flyout
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.victory.victoryMod.Flyout] {
  @JSImport("victory", "Flyout")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, name */
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    animate: Boolean | AnimatePropTypeInterface = null,
    center: Anon_XY = null,
    containerComponent: ReactElement = null,
    cornerRadius: Int | Double = null,
    data: js.Array[_] = null,
    datum: js.Object = null,
    dx: Int | Double = null,
    dy: Int | Double = null,
    events: js.Object = null,
    groupComponent: ReactElement = null,
    height: Int | Double = null,
    horizontal: js.UndefOr[Boolean] = js.undefined,
    id: String | Double = null,
    index: Int | Double = null,
    maxDomain: Double | Anon_XY = null,
    minDomain: Double | Anon_XY = null,
    orientation: top | bottom | left | right = null,
    origin: js.Object = null,
    padding: PaddingProps = null,
    pathComponent: ReactElement = null,
    pointerLength: Int | Double = null,
    pointerWidth: Int | Double = null,
    polar: js.UndefOr[Boolean] = js.undefined,
    role: String = null,
    scale: ScalePropType | D3Scale | Anon_XYD3Scale = null,
    shapeRendering: String = null,
    standalone: js.UndefOr[Boolean] = js.undefined,
    style: VictoryStyleObject = null,
    theme: VictoryThemeDefinition = null,
    transform: String = null,
    width: Int | Double = null,
    x: Int | Double = null,
    y: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.victory.victoryMod.Flyout] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (animate != null) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (center != null) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (containerComponent != null) __obj.updateDynamic("containerComponent")(containerComponent.asInstanceOf[js.Any])
    if (cornerRadius != null) __obj.updateDynamic("cornerRadius")(cornerRadius.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (datum != null) __obj.updateDynamic("datum")(datum.asInstanceOf[js.Any])
    if (dx != null) __obj.updateDynamic("dx")(dx.asInstanceOf[js.Any])
    if (dy != null) __obj.updateDynamic("dy")(dy.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (groupComponent != null) __obj.updateDynamic("groupComponent")(groupComponent.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontal)) __obj.updateDynamic("horizontal")(horizontal.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (maxDomain != null) __obj.updateDynamic("maxDomain")(maxDomain.asInstanceOf[js.Any])
    if (minDomain != null) __obj.updateDynamic("minDomain")(minDomain.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (pathComponent != null) __obj.updateDynamic("pathComponent")(pathComponent.asInstanceOf[js.Any])
    if (pointerLength != null) __obj.updateDynamic("pointerLength")(pointerLength.asInstanceOf[js.Any])
    if (pointerWidth != null) __obj.updateDynamic("pointerWidth")(pointerWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(polar)) __obj.updateDynamic("polar")(polar.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (shapeRendering != null) __obj.updateDynamic("shapeRendering")(shapeRendering.asInstanceOf[js.Any])
    if (!js.isUndefined(standalone)) __obj.updateDynamic("standalone")(standalone.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.victory.victoryMod.Flyout] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.victory.victoryMod.Flyout](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = FlyoutProps
}

