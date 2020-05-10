package typingsSlinky.stropheJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAUTH extends js.Object {
  var AUTH: String = js.native
  var BIND: String = js.native
  var BOSH: String = js.native
  var CLIENT: String = js.native
  var DISCO_INFO: String = js.native
  var DISCO_ITEMS: String = js.native
  var FRAMING: String = js.native
  var HTTPBIND: String = js.native
  var MUC: String = js.native
  var PROFILE: String = js.native
  var ROSTER: String = js.native
  var SASL: String = js.native
  var SESSION: String = js.native
  var STANZAS: String = js.native
  var STREAM: String = js.native
  var VERSION: String = js.native
  var XHTML: String = js.native
  var XHTML_IM: String = js.native
}

object AnonAUTH {
  @scala.inline
  def apply(
    AUTH: String,
    BIND: String,
    BOSH: String,
    CLIENT: String,
    DISCO_INFO: String,
    DISCO_ITEMS: String,
    FRAMING: String,
    HTTPBIND: String,
    MUC: String,
    PROFILE: String,
    ROSTER: String,
    SASL: String,
    SESSION: String,
    STANZAS: String,
    STREAM: String,
    VERSION: String,
    XHTML: String,
    XHTML_IM: String
  ): AnonAUTH = {
    val __obj = js.Dynamic.literal(AUTH = AUTH.asInstanceOf[js.Any], BIND = BIND.asInstanceOf[js.Any], BOSH = BOSH.asInstanceOf[js.Any], CLIENT = CLIENT.asInstanceOf[js.Any], DISCO_INFO = DISCO_INFO.asInstanceOf[js.Any], DISCO_ITEMS = DISCO_ITEMS.asInstanceOf[js.Any], FRAMING = FRAMING.asInstanceOf[js.Any], HTTPBIND = HTTPBIND.asInstanceOf[js.Any], MUC = MUC.asInstanceOf[js.Any], PROFILE = PROFILE.asInstanceOf[js.Any], ROSTER = ROSTER.asInstanceOf[js.Any], SASL = SASL.asInstanceOf[js.Any], SESSION = SESSION.asInstanceOf[js.Any], STANZAS = STANZAS.asInstanceOf[js.Any], STREAM = STREAM.asInstanceOf[js.Any], VERSION = VERSION.asInstanceOf[js.Any], XHTML = XHTML.asInstanceOf[js.Any], XHTML_IM = XHTML_IM.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAUTH]
  }
  @scala.inline
  implicit class AnonAUTHOps[Self <: AnonAUTH] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAUTH(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AUTH")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBIND(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BIND")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBOSH(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BOSH")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCLIENT(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CLIENT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDISCO_INFO(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DISCO_INFO")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDISCO_ITEMS(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DISCO_ITEMS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFRAMING(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FRAMING")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHTTPBIND(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HTTPBIND")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMUC(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MUC")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPROFILE(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PROFILE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withROSTER(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ROSTER")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSASL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SASL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSESSION(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SESSION")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSTANZAS(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("STANZAS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSTREAM(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("STREAM")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVERSION(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VERSION")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXHTML(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("XHTML")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXHTML_IM(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("XHTML_IM")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

