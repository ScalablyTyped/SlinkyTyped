package typingsSlinky.tsJest.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgnoreCodes extends js.Object {
  
  var ignoreCodes: js.UndefOr[Double | String | (js.Array[Double | String])] = js.native
  
  var pathRegex: js.UndefOr[js.RegExp | String] = js.native
  
  var pretty: js.UndefOr[Boolean] = js.native
  
  var warnOnly: js.UndefOr[Boolean] = js.native
}
object IgnoreCodes {
  
  @scala.inline
  def apply(): IgnoreCodes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgnoreCodes]
  }
  
  @scala.inline
  implicit class IgnoreCodesOps[Self <: IgnoreCodes] (val x: Self) extends AnyVal {
    
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
    def setIgnoreCodesVarargs(value: (Double | String)*): Self = this.set("ignoreCodes", js.Array(value :_*))
    
    @scala.inline
    def setIgnoreCodes(value: Double | String | (js.Array[Double | String])): Self = this.set("ignoreCodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreCodes: Self = this.set("ignoreCodes", js.undefined)
    
    @scala.inline
    def setPathRegexRegExp(value: js.RegExp): Self = this.set("pathRegex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathRegex(value: js.RegExp | String): Self = this.set("pathRegex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePathRegex: Self = this.set("pathRegex", js.undefined)
    
    @scala.inline
    def setPretty(value: Boolean): Self = this.set("pretty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePretty: Self = this.set("pretty", js.undefined)
    
    @scala.inline
    def setWarnOnly(value: Boolean): Self = this.set("warnOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWarnOnly: Self = this.set("warnOnly", js.undefined)
  }
}
