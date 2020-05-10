package typingsSlinky.uaParserJs.IUAParser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DEVICE extends js.Object {
  var CONSOLE: String = js.native
  var EMBEDDED: String = js.native
  var MOBILE: String = js.native
  var MODEL: String = js.native
  var SMARTTV: String = js.native
  var TABLET: String = js.native
  var TYPE: String = js.native
  var VENDOR: String = js.native
  var WEARABLE: String = js.native
}

object DEVICE {
  @scala.inline
  def apply(
    CONSOLE: String,
    EMBEDDED: String,
    MOBILE: String,
    MODEL: String,
    SMARTTV: String,
    TABLET: String,
    TYPE: String,
    VENDOR: String,
    WEARABLE: String
  ): DEVICE = {
    val __obj = js.Dynamic.literal(CONSOLE = CONSOLE.asInstanceOf[js.Any], EMBEDDED = EMBEDDED.asInstanceOf[js.Any], MOBILE = MOBILE.asInstanceOf[js.Any], MODEL = MODEL.asInstanceOf[js.Any], SMARTTV = SMARTTV.asInstanceOf[js.Any], TABLET = TABLET.asInstanceOf[js.Any], TYPE = TYPE.asInstanceOf[js.Any], VENDOR = VENDOR.asInstanceOf[js.Any], WEARABLE = WEARABLE.asInstanceOf[js.Any])
    __obj.asInstanceOf[DEVICE]
  }
  @scala.inline
  implicit class DEVICEOps[Self <: DEVICE] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCONSOLE(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CONSOLE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEMBEDDED(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EMBEDDED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMOBILE(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MOBILE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMODEL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MODEL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSMARTTV(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SMARTTV")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTABLET(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TABLET")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTYPE(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TYPE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVENDOR(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VENDOR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWEARABLE(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WEARABLE")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

