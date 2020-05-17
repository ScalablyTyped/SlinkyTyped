package typingsSlinky.tablesorter.widgetOptionStoreMod

import typingsSlinky.tablesorter.mod.global.HTMLElement
import typingsSlinky.tablesorter.mod.global.JQuery
import typingsSlinky.tablesorter.widgetOptionsMod.WidgetOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WidgetOptionStore[TElement] extends WidgetOptions[TElement] {
  /**
    * The jQuery-object containing the cloned table for the sticky headers.
    */
  @JSName("$sticky")
  var $sticky: JQuery[HTMLElement] = js.native
  /**
    * A jQuery-object containing all filters which are bound to all columns.
    */
  @JSName("filter_$anyMatch")
  var filter_$anyMatch: JQuery[HTMLElement] = js.native
  /**
    * A jQuery-object containing all external filters.
    */
  @JSName("filter_$externalFilters")
  var filter_$externalFilters: JQuery[HTMLElement] = js.native
  /**
    * A value indicating whether the filters have initialized.
    */
  var filter_initialized: Boolean = js.native
}

object WidgetOptionStore {
  @scala.inline
  def apply[TElement](
    $sticky: JQuery[HTMLElement],
    filter_$anyMatch: JQuery[HTMLElement],
    filter_$externalFilters: JQuery[HTMLElement],
    filter_initialized: Boolean
  ): WidgetOptionStore[TElement] = {
    val __obj = js.Dynamic.literal($sticky = $sticky.asInstanceOf[js.Any], filter_$anyMatch = filter_$anyMatch.asInstanceOf[js.Any], filter_$externalFilters = filter_$externalFilters.asInstanceOf[js.Any], filter_initialized = filter_initialized.asInstanceOf[js.Any])
    __obj.asInstanceOf[WidgetOptionStore[TElement]]
  }
  @scala.inline
  implicit class WidgetOptionStoreOps[Self[telement] <: WidgetOptionStore[telement], TElement] (val x: Self[TElement]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TElement] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TElement]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TElement] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TElement] with Other]
    @scala.inline
    def with$sticky(value: JQuery[HTMLElement]): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$sticky")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilter_$anyMatch(value: JQuery[HTMLElement]): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter_$anyMatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilter_$externalFilters(value: JQuery[HTMLElement]): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter_$externalFilters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilter_initialized(value: Boolean): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter_initialized")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

