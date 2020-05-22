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

trait IUiGridConstants extends js.Object {
  var APOS_REGEXP: js.RegExp
  var ASC: String
  var BRACKET_REGEXP: js.RegExp
  var COL_CLASS_PREFIX: String
  var COL_FIELD: js.RegExp
  var CURRENCY_SYMBOLS: js.Array[String]
  var CUSTOM_FILTERS: js.RegExp
  var DESC: String
  var DISPLAY_CELL_TEMPLATE: js.RegExp
  var DOT_REGEXP: js.RegExp
  var FUNC_REGEXP: js.RegExp
  var LOG_DEBUG_MESSAGES: Boolean
  var LOG_ERROR_MESSAGES: Boolean
  var LOG_WARN_MESSAGES: Boolean
  var MODEL_COL_FIELD: js.RegExp
  var TEMPLATE_REGEXP: js.RegExp
  var TOOLTIP: js.RegExp
  var aggregationTypes: Avg
  var dataChange: ALL
  var events: COLUMNHEADERCLICK
  var filter: CONTAINS
  var keymap: ALT
  var scrollDirection: DOWN
  var scrollbars: ALWAYS
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
}

