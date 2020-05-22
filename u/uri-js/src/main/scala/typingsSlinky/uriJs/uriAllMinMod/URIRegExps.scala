package typingsSlinky.uriJs.uriAllMinMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait URIRegExps extends js.Object {
  var ESCAPE: js.RegExp
  var IPV4ADDRESS: js.RegExp
  var IPV6ADDRESS: js.RegExp
  var NOT_FRAGMENT: js.RegExp
  var NOT_HOST: js.RegExp
  var NOT_PATH: js.RegExp
  var NOT_PATH_NOSCHEME: js.RegExp
  var NOT_QUERY: js.RegExp
  var NOT_SCHEME: js.RegExp
  var NOT_USERINFO: js.RegExp
  var OTHER_CHARS: js.RegExp
  var PCT_ENCODED: js.RegExp
  var UNRESERVED: js.RegExp
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
}

