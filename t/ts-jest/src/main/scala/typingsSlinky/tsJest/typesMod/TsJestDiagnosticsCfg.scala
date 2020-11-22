package typingsSlinky.tsJest.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TsJestDiagnosticsCfg extends js.Object {
  
  var ignoreCodes: js.Array[Double] = js.native
  
  var pathRegex: js.UndefOr[String] = js.native
  
  var pretty: Boolean = js.native
  
  var throws: Boolean = js.native
  
  var warnOnly: js.UndefOr[Boolean] = js.native
}
object TsJestDiagnosticsCfg {
  
  @scala.inline
  def apply(ignoreCodes: js.Array[Double], pretty: Boolean, throws: Boolean): TsJestDiagnosticsCfg = {
    val __obj = js.Dynamic.literal(ignoreCodes = ignoreCodes.asInstanceOf[js.Any], pretty = pretty.asInstanceOf[js.Any], throws = throws.asInstanceOf[js.Any])
    __obj.asInstanceOf[TsJestDiagnosticsCfg]
  }
  
  @scala.inline
  implicit class TsJestDiagnosticsCfgOps[Self <: TsJestDiagnosticsCfg] (val x: Self) extends AnyVal {
    
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
    def setIgnoreCodesVarargs(value: Double*): Self = this.set("ignoreCodes", js.Array(value :_*))
    
    @scala.inline
    def setIgnoreCodes(value: js.Array[Double]): Self = this.set("ignoreCodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPretty(value: Boolean): Self = this.set("pretty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThrows(value: Boolean): Self = this.set("throws", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathRegex(value: String): Self = this.set("pathRegex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePathRegex: Self = this.set("pathRegex", js.undefined)
    
    @scala.inline
    def setWarnOnly(value: Boolean): Self = this.set("warnOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWarnOnly: Self = this.set("warnOnly", js.undefined)
  }
}
