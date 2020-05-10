package typingsSlinky.tablesorter.stickyHeaderOptionsMod

import typingsSlinky.jquery.JQuery_.Selector
import typingsSlinky.tablesorter.mod._Global_.HTMLElement
import typingsSlinky.tablesorter.mod._Global_.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StickyHeaderOptions extends js.Object {
  /**
    * A set of classes to add to the sticky header.
    */
  var stickyHeaders: js.UndefOr[String] = js.native
  /**
    * A value indicating whether the table should be resized automatically when data is added to or removed from the table.
    */
  var stickyHeaders_addResizeEvent: js.UndefOr[Boolean] = js.native
  /**
    * A jQuery-selector to get an element to append the sticky header to.
    */
  var stickyHeaders_appendTo: js.UndefOr[Selector | JQuery[HTMLElement]] = js.native
  /**
    * A jQuery-selector to get an element to attach the sticky header to.
    */
  var stickyHeaders_attachTo: js.UndefOr[Selector | JQuery[HTMLElement]] = js.native
  /**
    * A string to append to the table-id for the cloned sticky table.
    */
  var stickyHeaders_cloneId: js.UndefOr[String] = js.native
  /**
    * A value indicating whether the filter should be scrolled into view when inputing a filter.
    */
  var stickyHeaders_filteredToTop: js.UndefOr[Boolean] = js.native
  /**
    * A value indicating whether the caption should be included in the sticky header.
    */
  var stickyHeaders_includeCaption: js.UndefOr[Boolean] = js.native
  /**
    * Either a number of the offset to the top of the browser-window or a jQuery-selector or -object for the elemtn which represents the offset.
    */
  var stickyHeaders_offset: js.UndefOr[Double | Selector | JQuery[HTMLElement]] = js.native
  /**
    * The jQuery-selector or -object to monitor for horizontal scrolling.
    */
  var stickyHeaders_xScroll: js.UndefOr[Selector | JQuery[HTMLElement]] = js.native
  /**
    * The jQuery-selector or -object to monitor for vertical scrolling.
    */
  var stickyHeaders_yScroll: js.UndefOr[Selector | JQuery[HTMLElement]] = js.native
  /**
    * The z-index of the sticky header.
    */
  var stickyHeaders_zindex: js.UndefOr[Double] = js.native
}

object StickyHeaderOptions {
  @scala.inline
  def apply(): StickyHeaderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StickyHeaderOptions]
  }
  @scala.inline
  implicit class StickyHeaderOptionsOps[Self <: StickyHeaderOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStickyHeaders(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stickyHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStickyHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stickyHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withStickyHeaders_addResizeEvent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stickyHeaders_addResizeEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStickyHeaders_addResizeEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stickyHeaders_addResizeEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withStickyHeaders_appendTo(value: Selector | JQuery[HTMLElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stickyHeaders_appendTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStickyHeaders_appendTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stickyHeaders_appendTo")(js.undefined)
        ret
    }
    @scala.inline
    def withStickyHeaders_attachTo(value: Selector | JQuery[HTMLElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stickyHeaders_attachTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStickyHeaders_attachTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stickyHeaders_attachTo")(js.undefined)
        ret
    }
    @scala.inline
    def withStickyHeaders_cloneId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stickyHeaders_cloneId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStickyHeaders_cloneId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stickyHeaders_cloneId")(js.undefined)
        ret
    }
    @scala.inline
    def withStickyHeaders_filteredToTop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stickyHeaders_filteredToTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStickyHeaders_filteredToTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stickyHeaders_filteredToTop")(js.undefined)
        ret
    }
    @scala.inline
    def withStickyHeaders_includeCaption(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stickyHeaders_includeCaption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStickyHeaders_includeCaption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stickyHeaders_includeCaption")(js.undefined)
        ret
    }
    @scala.inline
    def withStickyHeaders_offset(value: Double | Selector | JQuery[HTMLElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stickyHeaders_offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStickyHeaders_offset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stickyHeaders_offset")(js.undefined)
        ret
    }
    @scala.inline
    def withStickyHeaders_xScroll(value: Selector | JQuery[HTMLElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stickyHeaders_xScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStickyHeaders_xScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stickyHeaders_xScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withStickyHeaders_yScroll(value: Selector | JQuery[HTMLElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stickyHeaders_yScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStickyHeaders_yScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stickyHeaders_yScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withStickyHeaders_zindex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stickyHeaders_zindex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStickyHeaders_zindex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stickyHeaders_zindex")(js.undefined)
        ret
    }
  }
  
}

