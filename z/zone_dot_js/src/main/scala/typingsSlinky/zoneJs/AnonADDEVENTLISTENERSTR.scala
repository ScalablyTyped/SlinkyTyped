package typingsSlinky.zoneJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonADDEVENTLISTENERSTR extends js.Object {
  var ADD_EVENT_LISTENER_STR: String = js.native
  var FALSE_STR: String = js.native
  var REMOVE_EVENT_LISTENER_STR: String = js.native
  var TRUE_STR: String = js.native
  var ZONE_SYMBOL_PREFIX: String = js.native
  var eventNames: js.Array[String] = js.native
  var globalSources: js.Any = js.native
  var isBrowser: Boolean = js.native
  var isMix: Boolean = js.native
  var isNode: Boolean = js.native
  var zoneSymbolEventNames: js.Any = js.native
}

object AnonADDEVENTLISTENERSTR {
  @scala.inline
  def apply(
    ADD_EVENT_LISTENER_STR: String,
    FALSE_STR: String,
    REMOVE_EVENT_LISTENER_STR: String,
    TRUE_STR: String,
    ZONE_SYMBOL_PREFIX: String,
    eventNames: js.Array[String],
    globalSources: js.Any,
    isBrowser: Boolean,
    isMix: Boolean,
    isNode: Boolean,
    zoneSymbolEventNames: js.Any
  ): AnonADDEVENTLISTENERSTR = {
    val __obj = js.Dynamic.literal(ADD_EVENT_LISTENER_STR = ADD_EVENT_LISTENER_STR.asInstanceOf[js.Any], FALSE_STR = FALSE_STR.asInstanceOf[js.Any], REMOVE_EVENT_LISTENER_STR = REMOVE_EVENT_LISTENER_STR.asInstanceOf[js.Any], TRUE_STR = TRUE_STR.asInstanceOf[js.Any], ZONE_SYMBOL_PREFIX = ZONE_SYMBOL_PREFIX.asInstanceOf[js.Any], eventNames = eventNames.asInstanceOf[js.Any], globalSources = globalSources.asInstanceOf[js.Any], isBrowser = isBrowser.asInstanceOf[js.Any], isMix = isMix.asInstanceOf[js.Any], isNode = isNode.asInstanceOf[js.Any], zoneSymbolEventNames = zoneSymbolEventNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonADDEVENTLISTENERSTR]
  }
  @scala.inline
  implicit class AnonADDEVENTLISTENERSTROps[Self <: AnonADDEVENTLISTENERSTR] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withADD_EVENT_LISTENER_STR(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ADD_EVENT_LISTENER_STR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFALSE_STR(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FALSE_STR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withREMOVE_EVENT_LISTENER_STR(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("REMOVE_EVENT_LISTENER_STR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTRUE_STR(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TRUE_STR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZONE_SYMBOL_PREFIX(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ZONE_SYMBOL_PREFIX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGlobalSources(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalSources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsBrowser(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBrowser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsMix(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsNode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZoneSymbolEventNames(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoneSymbolEventNames")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

