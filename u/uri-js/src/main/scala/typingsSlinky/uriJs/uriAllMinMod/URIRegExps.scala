package typingsSlinky.uriJs.uriAllMinMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setESCAPE(value: js.RegExp): Self = this.set("ESCAPE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIPV4ADDRESS(value: js.RegExp): Self = this.set("IPV4ADDRESS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIPV6ADDRESS(value: js.RegExp): Self = this.set("IPV6ADDRESS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNOT_FRAGMENT(value: js.RegExp): Self = this.set("NOT_FRAGMENT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNOT_HOST(value: js.RegExp): Self = this.set("NOT_HOST", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNOT_PATH(value: js.RegExp): Self = this.set("NOT_PATH", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNOT_PATH_NOSCHEME(value: js.RegExp): Self = this.set("NOT_PATH_NOSCHEME", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNOT_QUERY(value: js.RegExp): Self = this.set("NOT_QUERY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNOT_SCHEME(value: js.RegExp): Self = this.set("NOT_SCHEME", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNOT_USERINFO(value: js.RegExp): Self = this.set("NOT_USERINFO", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOTHER_CHARS(value: js.RegExp): Self = this.set("OTHER_CHARS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPCT_ENCODED(value: js.RegExp): Self = this.set("PCT_ENCODED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUNRESERVED(value: js.RegExp): Self = this.set("UNRESERVED", value.asInstanceOf[js.Any])
  }
}
