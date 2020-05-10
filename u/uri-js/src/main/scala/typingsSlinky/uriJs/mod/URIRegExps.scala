package typingsSlinky.uriJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait URIRegExps extends js.Object {
  var ESCAPE: js.RegExp = js.native
  var IPV4ADDRESS: js.RegExp = js.native
  var IPV6ADDRESS: js.RegExp = js.native
  var NOT_FRAGMENT: js.RegExp = js.native
  var NOT_HOST: js.RegExp = js.native
  var NOT_PATH: js.RegExp = js.native
  var NOT_PATH_NOSCHEME: js.RegExp = js.native
  var NOT_QUERY: js.RegExp = js.native
  var NOT_SCHEME: js.RegExp = js.native
  var NOT_USERINFO: js.RegExp = js.native
  var OTHER_CHARS: js.RegExp = js.native
  var PCT_ENCODED: js.RegExp = js.native
  var UNRESERVED: js.RegExp = js.native
}

object URIRegExps {
  @scala.inline
  def apply(
    ESCAPE: js.RegExp,
    IPV4ADDRESS: js.RegExp,
    IPV6ADDRESS: js.RegExp,
    NOT_FRAGMENT: js.RegExp,
    NOT_HOST: js.RegExp,
    NOT_PATH: js.RegExp,
    NOT_PATH_NOSCHEME: js.RegExp,
    NOT_QUERY: js.RegExp,
    NOT_SCHEME: js.RegExp,
    NOT_USERINFO: js.RegExp,
    OTHER_CHARS: js.RegExp,
    PCT_ENCODED: js.RegExp,
    UNRESERVED: js.RegExp
  ): URIRegExps = {
    val __obj = js.Dynamic.literal(ESCAPE = ESCAPE.asInstanceOf[js.Any], IPV4ADDRESS = IPV4ADDRESS.asInstanceOf[js.Any], IPV6ADDRESS = IPV6ADDRESS.asInstanceOf[js.Any], NOT_FRAGMENT = NOT_FRAGMENT.asInstanceOf[js.Any], NOT_HOST = NOT_HOST.asInstanceOf[js.Any], NOT_PATH = NOT_PATH.asInstanceOf[js.Any], NOT_PATH_NOSCHEME = NOT_PATH_NOSCHEME.asInstanceOf[js.Any], NOT_QUERY = NOT_QUERY.asInstanceOf[js.Any], NOT_SCHEME = NOT_SCHEME.asInstanceOf[js.Any], NOT_USERINFO = NOT_USERINFO.asInstanceOf[js.Any], OTHER_CHARS = OTHER_CHARS.asInstanceOf[js.Any], PCT_ENCODED = PCT_ENCODED.asInstanceOf[js.Any], UNRESERVED = UNRESERVED.asInstanceOf[js.Any])
    __obj.asInstanceOf[URIRegExps]
  }
  @scala.inline
  implicit class URIRegExpsOps[Self <: URIRegExps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withESCAPE(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ESCAPE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIPV4ADDRESS(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IPV4ADDRESS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIPV6ADDRESS(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IPV6ADDRESS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNOT_FRAGMENT(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NOT_FRAGMENT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNOT_HOST(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NOT_HOST")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNOT_PATH(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NOT_PATH")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNOT_PATH_NOSCHEME(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NOT_PATH_NOSCHEME")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNOT_QUERY(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NOT_QUERY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNOT_SCHEME(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NOT_SCHEME")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNOT_USERINFO(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NOT_USERINFO")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOTHER_CHARS(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OTHER_CHARS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPCT_ENCODED(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PCT_ENCODED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUNRESERVED(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UNRESERVED")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

