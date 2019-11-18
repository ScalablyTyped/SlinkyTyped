package typingsSlinky.semanticDashUiDashReact.distCommonjsAddonsPaginationPaginationItemMod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLAnchorElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.ellipsisItem
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.firstItem
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.lastItem
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.nextItem
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.pageItem
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.prevItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationItemProps
  extends StrictPaginationItemProps
     with /* key */ StringDictionary[js.Any]

object PaginationItemProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    active: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    onClick: (/* event */ SyntheticMouseEvent[HTMLAnchorElement], /* data */ PaginationItemProps) => Unit = null,
    onKeyDown: (/* event */ SyntheticMouseEvent[HTMLAnchorElement], /* data */ PaginationItemProps) => Unit = null,
    `type`: ellipsisItem | firstItem | prevItem | pageItem | nextItem | lastItem = null
  ): PaginationItemProps = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction2(onKeyDown))
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginationItemProps]
  }
}

