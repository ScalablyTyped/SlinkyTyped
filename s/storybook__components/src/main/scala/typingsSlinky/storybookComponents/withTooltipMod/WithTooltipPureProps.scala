package typingsSlinky.storybookComponents.withTooltipMod

import slinky.core.TagMod
import typingsSlinky.popperJs.mod.Modifiers
import typingsSlinky.popperJs.mod.Placement
import typingsSlinky.storybookComponents.storybookComponentsStrings.`right-click`
import typingsSlinky.storybookComponents.storybookComponentsStrings.click
import typingsSlinky.storybookComponents.storybookComponentsStrings.hover
import typingsSlinky.storybookComponents.storybookComponentsStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WithTooltipPureProps extends js.Object {
  var children: TagMod[Any] = js.native
  var closeOnClick: js.UndefOr[Boolean] = js.native
  var hasChrome: js.UndefOr[Boolean] = js.native
  var modifiers: js.UndefOr[Modifiers] = js.native
  var onDoubleClick: js.UndefOr[js.Function0[Unit]] = js.native
  var onVisibilityChange: js.UndefOr[js.Function1[/* visibility */ Boolean, Unit]] = js.native
  var placement: js.UndefOr[Placement] = js.native
  var svg: js.UndefOr[Boolean] = js.native
  var tooltip: TagMod[Any] | (js.Function1[/* p */ WithHideFn, TagMod[Any]]) = js.native
  var tooltipShown: js.UndefOr[Boolean] = js.native
  var trigger: js.UndefOr[none | hover | click | `right-click`] = js.native
}

object WithTooltipPureProps {
  @scala.inline
  def apply(
    children: TagMod[Any],
    tooltip: TagMod[Any] | (js.Function1[/* p */ WithHideFn, TagMod[Any]]),
    closeOnClick: js.UndefOr[Boolean] = js.undefined,
    hasChrome: js.UndefOr[Boolean] = js.undefined,
    modifiers: Modifiers = null,
    onDoubleClick: () => Unit = null,
    onVisibilityChange: /* visibility */ Boolean => Unit = null,
    placement: Placement = null,
    svg: js.UndefOr[Boolean] = js.undefined,
    tooltipShown: js.UndefOr[Boolean] = js.undefined,
    trigger: none | hover | click | `right-click` = null
  ): WithTooltipPureProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnClick)) __obj.updateDynamic("closeOnClick")(closeOnClick.asInstanceOf[js.Any])
    if (!js.isUndefined(hasChrome)) __obj.updateDynamic("hasChrome")(hasChrome.asInstanceOf[js.Any])
    if (modifiers != null) __obj.updateDynamic("modifiers")(modifiers.asInstanceOf[js.Any])
    if (onDoubleClick != null) __obj.updateDynamic("onDoubleClick")(js.Any.fromFunction0(onDoubleClick))
    if (onVisibilityChange != null) __obj.updateDynamic("onVisibilityChange")(js.Any.fromFunction1(onVisibilityChange))
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (!js.isUndefined(svg)) __obj.updateDynamic("svg")(svg.asInstanceOf[js.Any])
    if (!js.isUndefined(tooltipShown)) __obj.updateDynamic("tooltipShown")(tooltipShown.asInstanceOf[js.Any])
    if (trigger != null) __obj.updateDynamic("trigger")(trigger.asInstanceOf[js.Any])
    __obj.asInstanceOf[WithTooltipPureProps]
  }
}

