package typingsSlinky.semanticDashUiDashReact.distCommonjsAddonsPaginationPaginationItemMod

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

trait StrictPaginationItemProps extends js.Object {
  /** A pagination item can be active. */
  var active: js.UndefOr[Boolean] = js.undefined
  /** A pagination item can be disabled. */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Called on click.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  var onClick: js.UndefOr[
    js.Function2[
      /* event */ SyntheticMouseEvent[HTMLAnchorElement], 
      /* data */ PaginationItemProps, 
      Unit
    ]
  ] = js.undefined
  /**
    * Called on key down.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  var onKeyDown: js.UndefOr[
    js.Function2[
      /* event */ SyntheticMouseEvent[HTMLAnchorElement], 
      /* data */ PaginationItemProps, 
      Unit
    ]
  ] = js.undefined
  /** A pagination should have a type. */
  var `type`: js.UndefOr[ellipsisItem | firstItem | prevItem | pageItem | nextItem | lastItem] = js.undefined
}

object StrictPaginationItemProps {
  @scala.inline
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    onClick: (/* event */ SyntheticMouseEvent[HTMLAnchorElement], /* data */ PaginationItemProps) => Unit = null,
    onKeyDown: (/* event */ SyntheticMouseEvent[HTMLAnchorElement], /* data */ PaginationItemProps) => Unit = null,
    `type`: ellipsisItem | firstItem | prevItem | pageItem | nextItem | lastItem = null
  ): StrictPaginationItemProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction2(onKeyDown))
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictPaginationItemProps]
  }
}

