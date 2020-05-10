package typingsSlinky.semanticUiReact.paginationPaginationMod

import org.scalajs.dom.raw.HTMLAnchorElement
import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.ReactNodeArray
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandItem
import typingsSlinky.semanticUiReact.paginationItemMod.PaginationItemProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StrictPaginationProps extends js.Object {
  /** Index of the currently active page. */
  var activePage: js.UndefOr[Double | String] = js.native
  /** A pagination item can have an aria label. */
  var `aria-label`: js.UndefOr[String] = js.native
  /** Number of always visible pages at the beginning and end. */
  var boundaryRange: js.UndefOr[Double | String] = js.native
  /** Initial activePage value. */
  var defaultActivePage: js.UndefOr[Double | String] = js.native
  /** A pagination can be disabled. */
  var disabled: js.UndefOr[Boolean] = js.native
  /** A shorthand for PaginationItem. */
  var ellipsisItem: js.UndefOr[SemanticShorthandItem[PaginationItemProps]] = js.native
  /** A shorthand for PaginationItem. */
  var firstItem: js.UndefOr[SemanticShorthandItem[PaginationItemProps]] = js.native
  /** A shorthand for PaginationItem. */
  var lastItem: js.UndefOr[SemanticShorthandItem[PaginationItemProps]] = js.native
  /** A shorthand for PaginationItem. */
  var nextItem: js.UndefOr[SemanticShorthandItem[PaginationItemProps]] = js.native
  /**
    * Called on change of an active page.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  var onPageChange: js.UndefOr[
    js.Function2[/* event */ SyntheticMouseEvent[HTMLAnchorElement], /* data */ PaginationProps, Unit]
  ] = js.native
  /** A shorthand for PaginationItem. */
  var pageItem: js.UndefOr[SemanticShorthandItem[PaginationItemProps]] = js.native
  /** A shorthand for PaginationItem. */
  var prevItem: js.UndefOr[SemanticShorthandItem[PaginationItemProps]] = js.native
  /** Number of always visible pages before and after the current one. */
  var siblingRange: js.UndefOr[Double | String] = js.native
  /** Total number of pages. */
  var totalPages: Double | String = js.native
}

object StrictPaginationProps {
  @scala.inline
  def apply(totalPages: Double | String): StrictPaginationProps = {
    val __obj = js.Dynamic.literal(totalPages = totalPages.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictPaginationProps]
  }
  @scala.inline
  implicit class StrictPaginationPropsOps[Self <: StrictPaginationProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTotalPages(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalPages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActivePage(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activePage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActivePage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activePage")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-label`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-label`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-label")(js.undefined)
        ret
    }
    @scala.inline
    def withBoundaryRange(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundaryRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoundaryRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundaryRange")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultActivePage(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultActivePage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultActivePage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultActivePage")(js.undefined)
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
    def withEllipsisItemReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ellipsisItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEllipsisItemFunction3(
      value: (/* component */ ReactComponentClass[PaginationItemProps], PaginationItemProps, /* children */ js.UndefOr[TagMod[Any] | ReactNodeArray]) => ReactElement | Null
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ellipsisItem")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withEllipsisItem(value: SemanticShorthandItem[PaginationItemProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ellipsisItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEllipsisItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ellipsisItem")(js.undefined)
        ret
    }
    @scala.inline
    def withFirstItemReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirstItemFunction3(
      value: (/* component */ ReactComponentClass[PaginationItemProps], PaginationItemProps, /* children */ js.UndefOr[TagMod[Any] | ReactNodeArray]) => ReactElement | Null
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstItem")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withFirstItem(value: SemanticShorthandItem[PaginationItemProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstItem")(js.undefined)
        ret
    }
    @scala.inline
    def withLastItemReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastItemFunction3(
      value: (/* component */ ReactComponentClass[PaginationItemProps], PaginationItemProps, /* children */ js.UndefOr[TagMod[Any] | ReactNodeArray]) => ReactElement | Null
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastItem")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withLastItem(value: SemanticShorthandItem[PaginationItemProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastItem")(js.undefined)
        ret
    }
    @scala.inline
    def withNextItemReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextItemFunction3(
      value: (/* component */ ReactComponentClass[PaginationItemProps], PaginationItemProps, /* children */ js.UndefOr[TagMod[Any] | ReactNodeArray]) => ReactElement | Null
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextItem")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withNextItem(value: SemanticShorthandItem[PaginationItemProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextItem")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPageChange(value: (/* event */ SyntheticMouseEvent[HTMLAnchorElement], /* data */ PaginationProps) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPageChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnPageChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPageChange")(js.undefined)
        ret
    }
    @scala.inline
    def withPageItemReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageItemFunction3(
      value: (/* component */ ReactComponentClass[PaginationItemProps], PaginationItemProps, /* children */ js.UndefOr[TagMod[Any] | ReactNodeArray]) => ReactElement | Null
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageItem")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withPageItem(value: SemanticShorthandItem[PaginationItemProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageItem")(js.undefined)
        ret
    }
    @scala.inline
    def withPrevItemReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrevItemFunction3(
      value: (/* component */ ReactComponentClass[PaginationItemProps], PaginationItemProps, /* children */ js.UndefOr[TagMod[Any] | ReactNodeArray]) => ReactElement | Null
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevItem")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withPrevItem(value: SemanticShorthandItem[PaginationItemProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrevItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevItem")(js.undefined)
        ret
    }
    @scala.inline
    def withSiblingRange(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("siblingRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSiblingRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("siblingRange")(js.undefined)
        ret
    }
  }
  
}

