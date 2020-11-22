package typingsSlinky.stackUtils.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var cwd: js.UndefOr[String] = js.native
  
  var ignoredPackages: js.UndefOr[js.Array[String]] = js.native
  
  var internals: js.UndefOr[js.Array[js.RegExp]] = js.native
  
  var wrapCallSite: js.UndefOr[js.Function1[/* callSite */ CallSite, CallSite]] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setCwd(value: String): Self = this.set("cwd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCwd: Self = this.set("cwd", js.undefined)
    
    @scala.inline
    def setIgnoredPackagesVarargs(value: String*): Self = this.set("ignoredPackages", js.Array(value :_*))
    
    @scala.inline
    def setIgnoredPackages(value: js.Array[String]): Self = this.set("ignoredPackages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoredPackages: Self = this.set("ignoredPackages", js.undefined)
    
    @scala.inline
    def setInternalsVarargs(value: js.RegExp*): Self = this.set("internals", js.Array(value :_*))
    
    @scala.inline
    def setInternals(value: js.Array[js.RegExp]): Self = this.set("internals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInternals: Self = this.set("internals", js.undefined)
    
    @scala.inline
    def setWrapCallSite(value: /* callSite */ CallSite => CallSite): Self = this.set("wrapCallSite", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteWrapCallSite: Self = this.set("wrapCallSite", js.undefined)
  }
}
