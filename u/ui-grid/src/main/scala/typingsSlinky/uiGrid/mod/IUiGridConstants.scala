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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAPOS_REGEXP(value: js.RegExp): Self = this.set("APOS_REGEXP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setASC(value: String): Self = this.set("ASC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBRACKET_REGEXP(value: js.RegExp): Self = this.set("BRACKET_REGEXP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCOL_CLASS_PREFIX(value: String): Self = this.set("COL_CLASS_PREFIX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCOL_FIELD(value: js.RegExp): Self = this.set("COL_FIELD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCURRENCY_SYMBOLSVarargs(value: String*): Self = this.set("CURRENCY_SYMBOLS", js.Array(value :_*))
    
    @scala.inline
    def setCURRENCY_SYMBOLS(value: js.Array[String]): Self = this.set("CURRENCY_SYMBOLS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCUSTOM_FILTERS(value: js.RegExp): Self = this.set("CUSTOM_FILTERS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDESC(value: String): Self = this.set("DESC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDISPLAY_CELL_TEMPLATE(value: js.RegExp): Self = this.set("DISPLAY_CELL_TEMPLATE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDOT_REGEXP(value: js.RegExp): Self = this.set("DOT_REGEXP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFUNC_REGEXP(value: js.RegExp): Self = this.set("FUNC_REGEXP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLOG_DEBUG_MESSAGES(value: Boolean): Self = this.set("LOG_DEBUG_MESSAGES", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLOG_ERROR_MESSAGES(value: Boolean): Self = this.set("LOG_ERROR_MESSAGES", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLOG_WARN_MESSAGES(value: Boolean): Self = this.set("LOG_WARN_MESSAGES", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMODEL_COL_FIELD(value: js.RegExp): Self = this.set("MODEL_COL_FIELD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTEMPLATE_REGEXP(value: js.RegExp): Self = this.set("TEMPLATE_REGEXP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTOOLTIP(value: js.RegExp): Self = this.set("TOOLTIP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAggregationTypes(value: Avg): Self = this.set("aggregationTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataChange(value: ALL): Self = this.set("dataChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvents(value: COLUMNHEADERCLICK): Self = this.set("events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilter(value: CONTAINS): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeymap(value: ALT): Self = this.set("keymap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollDirection(value: DOWN): Self = this.set("scrollDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollbars(value: ALWAYS): Self = this.set("scrollbars", value.asInstanceOf[js.Any])
  }
}
