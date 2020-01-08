package typingsSlinky.victory.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.react.reactMod.DOMAttributes
import typingsSlinky.victory.Anon_XY
import typingsSlinky.victory.victoryMod.BlockProps
import typingsSlinky.victory.victoryMod.VictoryClipContainerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object VictoryClipContainer
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.victory.victoryMod.VictoryClipContainer] {
  @JSImport("victory", "VictoryClipContainer")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    circleComponent: ReactElement = null,
    clipHeight: Int | Double = null,
    clipId: Double | String = null,
    clipPadding: BlockProps = null,
    clipPathComponent: ReactElement = null,
    clipWidth: Int | Double = null,
    events: DOMAttributes[_] = null,
    groupComponent: ReactElement = null,
    origin: Anon_XY = null,
    polar: js.UndefOr[Boolean] = js.undefined,
    radius: Int | Double = null,
    rectComponent: ReactElement = null,
    translateX: Int | Double = null,
    translateY: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.victory.victoryMod.VictoryClipContainer] = {
    val __obj = js.Dynamic.literal()
    if (circleComponent != null) __obj.updateDynamic("circleComponent")(circleComponent.asInstanceOf[js.Any])
    if (clipHeight != null) __obj.updateDynamic("clipHeight")(clipHeight.asInstanceOf[js.Any])
    if (clipId != null) __obj.updateDynamic("clipId")(clipId.asInstanceOf[js.Any])
    if (clipPadding != null) __obj.updateDynamic("clipPadding")(clipPadding.asInstanceOf[js.Any])
    if (clipPathComponent != null) __obj.updateDynamic("clipPathComponent")(clipPathComponent.asInstanceOf[js.Any])
    if (clipWidth != null) __obj.updateDynamic("clipWidth")(clipWidth.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (groupComponent != null) __obj.updateDynamic("groupComponent")(groupComponent.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    if (!js.isUndefined(polar)) __obj.updateDynamic("polar")(polar.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (rectComponent != null) __obj.updateDynamic("rectComponent")(rectComponent.asInstanceOf[js.Any])
    if (translateX != null) __obj.updateDynamic("translateX")(translateX.asInstanceOf[js.Any])
    if (translateY != null) __obj.updateDynamic("translateY")(translateY.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.victory.victoryMod.VictoryClipContainer] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.victory.victoryMod.VictoryClipContainer](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = VictoryClipContainerProps
}

