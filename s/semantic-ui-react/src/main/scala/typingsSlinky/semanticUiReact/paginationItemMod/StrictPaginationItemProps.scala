package typingsSlinky.semanticUiReact.paginationItemMod

import org.scalajs.dom.raw.HTMLAnchorElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.semanticUiReact.semanticUiReactStrings.ellipsisItem
import typingsSlinky.semanticUiReact.semanticUiReactStrings.firstItem
import typingsSlinky.semanticUiReact.semanticUiReactStrings.lastItem
import typingsSlinky.semanticUiReact.semanticUiReactStrings.nextItem
import typingsSlinky.semanticUiReact.semanticUiReactStrings.pageItem
import typingsSlinky.semanticUiReact.semanticUiReactStrings.prevItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StrictPaginationItemProps extends js.Object {
  /** A pagination item can be active. */
  var active: js.UndefOr[Boolean] = js.native
  /** A pagination item can be disabled. */
  var disabled: js.UndefOr[Boolean] = js.native
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
  ] = js.native
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
  ] = js.native
  /** A pagination should have a type. */
  var `type`: js.UndefOr[ellipsisItem | firstItem | prevItem | pageItem | nextItem | lastItem] = js.native
}

object StrictPaginationItemProps {
  @scala.inline
  def apply(): StrictPaginationItemProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrictPaginationItemProps]
  }
  @scala.inline
  implicit class StrictPaginationItemPropsOps[Self <: StrictPaginationItemProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClick(
      value: (/* event */ SyntheticMouseEvent[HTMLAnchorElement], /* data */ PaginationItemProps) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnKeyDown(
      value: (/* event */ SyntheticMouseEvent[HTMLAnchorElement], /* data */ PaginationItemProps) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyDown")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnKeyDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyDown")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: ellipsisItem | firstItem | prevItem | pageItem | nextItem | lastItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

