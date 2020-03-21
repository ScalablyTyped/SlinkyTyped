package typingsSlinky.storybookComponents.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ExternalPropsWriterProvider
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.popperJs.mod.Modifiers
import typingsSlinky.popperJs.mod.Placement
import typingsSlinky.storybookComponents.WithTooltipPurePropsstart
import typingsSlinky.storybookComponents.storybookComponentsStrings.`right-click`
import typingsSlinky.storybookComponents.storybookComponentsStrings.click
import typingsSlinky.storybookComponents.storybookComponentsStrings.hover
import typingsSlinky.storybookComponents.storybookComponentsStrings.none
import typingsSlinky.storybookComponents.withTooltipMod.WithHideFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_WithTooltipPurePropsstart_473704661 (implicit pw: ExternalPropsWriterProvider)
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  def apply(
    tooltip: TagMod[Any] | (js.Function1[/* p */ WithHideFn, TagMod[Any]]),
    closeOnClick: js.UndefOr[Boolean] = js.undefined,
    hasChrome: js.UndefOr[Boolean] = js.undefined,
    modifiers: Modifiers = null,
    onDoubleClick: () => Unit = null,
    onVisibilityChange: /* visibility */ Boolean => Unit = null,
    placement: Placement = null,
    startOpen: js.UndefOr[Boolean] = js.undefined,
    svg: js.UndefOr[Boolean] = js.undefined,
    tooltipShown: js.UndefOr[Boolean] = js.undefined,
    trigger: none | hover | click | `right-click` = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal(tooltip = tooltip.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnClick)) __obj.updateDynamic("closeOnClick")(closeOnClick.asInstanceOf[js.Any])
    if (!js.isUndefined(hasChrome)) __obj.updateDynamic("hasChrome")(hasChrome.asInstanceOf[js.Any])
    if (modifiers != null) __obj.updateDynamic("modifiers")(modifiers.asInstanceOf[js.Any])
    if (onDoubleClick != null) __obj.updateDynamic("onDoubleClick")(js.Any.fromFunction0(onDoubleClick))
    if (onVisibilityChange != null) __obj.updateDynamic("onVisibilityChange")(js.Any.fromFunction1(onVisibilityChange))
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (!js.isUndefined(startOpen)) __obj.updateDynamic("startOpen")(startOpen.asInstanceOf[js.Any])
    if (!js.isUndefined(svg)) __obj.updateDynamic("svg")(svg.asInstanceOf[js.Any])
    if (!js.isUndefined(tooltipShown)) __obj.updateDynamic("tooltipShown")(tooltipShown.asInstanceOf[js.Any])
    if (trigger != null) __obj.updateDynamic("trigger")(trigger.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = WithTooltipPurePropsstart
}

