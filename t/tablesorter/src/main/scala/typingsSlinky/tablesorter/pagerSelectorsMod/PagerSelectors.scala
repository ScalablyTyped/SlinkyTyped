package typingsSlinky.tablesorter.pagerSelectorsMod

import typingsSlinky.jquery.JQuery_.Selector
import typingsSlinky.tablesorter.mod._Global_.HTMLElement
import typingsSlinky.tablesorter.mod._Global_.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PagerSelectors extends js.Object {
  /**
    * The selector for querying the pager-container.
    */
  var container: js.UndefOr[Selector | JQuery[HTMLElement]] = js.native
  /**
    * The selector for querying the control to jump to the first page.
    */
  var first: js.UndefOr[Selector | JQuery[HTMLElement]] = js.native
  /**
    * The selector for querying the dropdown-control to jump to a specific page.
    */
  var gotoPage: js.UndefOr[Selector | JQuery[HTMLElement]] = js.native
  /**
    * The selector for querying the control to jump to the last page.
    */
  var last: js.UndefOr[Selector | JQuery[HTMLElement]] = js.native
  /**
    * The selector for querying the control to jump to the next page.
    */
  var next: js.UndefOr[Selector | JQuery[HTMLElement]] = js.native
  /**
    * The selector for querying the container to print the output to.
    */
  var pageDisplay: js.UndefOr[Selector | JQuery[HTMLElement]] = js.native
  /**
    * The selector for querying the control to set the page-size.
    */
  var pageSize: js.UndefOr[Selector | JQuery[HTMLElement]] = js.native
  /**
    * The selector for querying the control to jump to the previous page.
    */
  var prev: js.UndefOr[Selector | JQuery[HTMLElement]] = js.native
}

object PagerSelectors {
  @scala.inline
  def apply(): PagerSelectors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PagerSelectors]
  }
  @scala.inline
  implicit class PagerSelectorsOps[Self <: PagerSelectors] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainer(value: Selector | JQuery[HTMLElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(js.undefined)
        ret
    }
    @scala.inline
    def withFirst(value: Selector | JQuery[HTMLElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirst: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first")(js.undefined)
        ret
    }
    @scala.inline
    def withGotoPage(value: Selector | JQuery[HTMLElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gotoPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGotoPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gotoPage")(js.undefined)
        ret
    }
    @scala.inline
    def withLast(value: Selector | JQuery[HTMLElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLast: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last")(js.undefined)
        ret
    }
    @scala.inline
    def withNext(value: Selector | JQuery[HTMLElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(js.undefined)
        ret
    }
    @scala.inline
    def withPageDisplay(value: Selector | JQuery[HTMLElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageDisplay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageDisplay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageDisplay")(js.undefined)
        ret
    }
    @scala.inline
    def withPageSize(value: Selector | JQuery[HTMLElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSize")(js.undefined)
        ret
    }
    @scala.inline
    def withPrev(value: Selector | JQuery[HTMLElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prev")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrev: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prev")(js.undefined)
        ret
    }
  }
  
}

