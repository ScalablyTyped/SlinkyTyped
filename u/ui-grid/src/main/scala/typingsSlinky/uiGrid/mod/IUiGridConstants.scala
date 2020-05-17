package typingsSlinky.uiGrid.mod

import typingsSlinky.uiGrid.anon.ALL
import typingsSlinky.uiGrid.anon.ALT
import typingsSlinky.uiGrid.anon.ALWAYS
import typingsSlinky.uiGrid.anon.Avg
import typingsSlinky.uiGrid.anon.COLUMNHEADERCLICK
import typingsSlinky.uiGrid.anon.CONTAINS
import typingsSlinky.uiGrid.anon.DOWN
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IUiGridConstants extends js.Object {
  var APOS_REGEXP: js.RegExp = js.native
  var ASC: String = js.native
  var BRACKET_REGEXP: js.RegExp = js.native
  var COL_CLASS_PREFIX: String = js.native
  var COL_FIELD: js.RegExp = js.native
  var CURRENCY_SYMBOLS: js.Array[String] = js.native
  var CUSTOM_FILTERS: js.RegExp = js.native
  var DESC: String = js.native
  var DISPLAY_CELL_TEMPLATE: js.RegExp = js.native
  var DOT_REGEXP: js.RegExp = js.native
  var FUNC_REGEXP: js.RegExp = js.native
  var LOG_DEBUG_MESSAGES: Boolean = js.native
  var LOG_ERROR_MESSAGES: Boolean = js.native
  var LOG_WARN_MESSAGES: Boolean = js.native
  var MODEL_COL_FIELD: js.RegExp = js.native
  var TEMPLATE_REGEXP: js.RegExp = js.native
  var TOOLTIP: js.RegExp = js.native
  var aggregationTypes: Avg = js.native
  var dataChange: ALL = js.native
  var events: COLUMNHEADERCLICK = js.native
  var filter: CONTAINS = js.native
  var keymap: ALT = js.native
  var scrollDirection: DOWN = js.native
  var scrollbars: ALWAYS = js.native
}

object IUiGridConstants {
  @scala.inline
  def apply(
    APOS_REGEXP: js.RegExp,
    ASC: String,
    BRACKET_REGEXP: js.RegExp,
    COL_CLASS_PREFIX: String,
    COL_FIELD: js.RegExp,
    CURRENCY_SYMBOLS: js.Array[String],
    CUSTOM_FILTERS: js.RegExp,
    DESC: String,
    DISPLAY_CELL_TEMPLATE: js.RegExp,
    DOT_REGEXP: js.RegExp,
    FUNC_REGEXP: js.RegExp,
    LOG_DEBUG_MESSAGES: Boolean,
    LOG_ERROR_MESSAGES: Boolean,
    LOG_WARN_MESSAGES: Boolean,
    MODEL_COL_FIELD: js.RegExp,
    TEMPLATE_REGEXP: js.RegExp,
    TOOLTIP: js.RegExp,
    aggregationTypes: Avg,
    dataChange: ALL,
    events: COLUMNHEADERCLICK,
    filter: CONTAINS,
    keymap: ALT,
    scrollDirection: DOWN,
    scrollbars: ALWAYS
  ): IUiGridConstants = {
    val __obj = js.Dynamic.literal(APOS_REGEXP = APOS_REGEXP.asInstanceOf[js.Any], ASC = ASC.asInstanceOf[js.Any], BRACKET_REGEXP = BRACKET_REGEXP.asInstanceOf[js.Any], COL_CLASS_PREFIX = COL_CLASS_PREFIX.asInstanceOf[js.Any], COL_FIELD = COL_FIELD.asInstanceOf[js.Any], CURRENCY_SYMBOLS = CURRENCY_SYMBOLS.asInstanceOf[js.Any], CUSTOM_FILTERS = CUSTOM_FILTERS.asInstanceOf[js.Any], DESC = DESC.asInstanceOf[js.Any], DISPLAY_CELL_TEMPLATE = DISPLAY_CELL_TEMPLATE.asInstanceOf[js.Any], DOT_REGEXP = DOT_REGEXP.asInstanceOf[js.Any], FUNC_REGEXP = FUNC_REGEXP.asInstanceOf[js.Any], LOG_DEBUG_MESSAGES = LOG_DEBUG_MESSAGES.asInstanceOf[js.Any], LOG_ERROR_MESSAGES = LOG_ERROR_MESSAGES.asInstanceOf[js.Any], LOG_WARN_MESSAGES = LOG_WARN_MESSAGES.asInstanceOf[js.Any], MODEL_COL_FIELD = MODEL_COL_FIELD.asInstanceOf[js.Any], TEMPLATE_REGEXP = TEMPLATE_REGEXP.asInstanceOf[js.Any], TOOLTIP = TOOLTIP.asInstanceOf[js.Any], aggregationTypes = aggregationTypes.asInstanceOf[js.Any], dataChange = dataChange.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], keymap = keymap.asInstanceOf[js.Any], scrollDirection = scrollDirection.asInstanceOf[js.Any], scrollbars = scrollbars.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUiGridConstants]
  }
  @scala.inline
  implicit class IUiGridConstantsOps[Self <: IUiGridConstants] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAPOS_REGEXP(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("APOS_REGEXP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withASC(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ASC")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBRACKET_REGEXP(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BRACKET_REGEXP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCOL_CLASS_PREFIX(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("COL_CLASS_PREFIX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCOL_FIELD(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("COL_FIELD")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCURRENCY_SYMBOLS(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CURRENCY_SYMBOLS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCUSTOM_FILTERS(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CUSTOM_FILTERS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDESC(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DESC")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDISPLAY_CELL_TEMPLATE(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DISPLAY_CELL_TEMPLATE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDOT_REGEXP(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DOT_REGEXP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFUNC_REGEXP(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FUNC_REGEXP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLOG_DEBUG_MESSAGES(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LOG_DEBUG_MESSAGES")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLOG_ERROR_MESSAGES(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LOG_ERROR_MESSAGES")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLOG_WARN_MESSAGES(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LOG_WARN_MESSAGES")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMODEL_COL_FIELD(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MODEL_COL_FIELD")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTEMPLATE_REGEXP(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TEMPLATE_REGEXP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTOOLTIP(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TOOLTIP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAggregationTypes(value: Avg): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregationTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataChange(value: ALL): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvents(value: COLUMNHEADERCLICK): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilter(value: CONTAINS): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeymap(value: ALT): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keymap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollDirection(value: DOWN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollbars(value: ALWAYS): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollbars")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

