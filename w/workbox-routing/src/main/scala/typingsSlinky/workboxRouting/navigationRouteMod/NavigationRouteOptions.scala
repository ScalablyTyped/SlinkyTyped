package typingsSlinky.workboxRouting.navigationRouteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigationRouteOptions extends js.Object {
  
  var blacklist: js.UndefOr[js.Array[js.RegExp]] = js.native
  
  var whitelist: js.UndefOr[js.Array[js.RegExp]] = js.native
}
object NavigationRouteOptions {
  
  @scala.inline
  def apply(): NavigationRouteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationRouteOptions]
  }
  
  @scala.inline
  implicit class NavigationRouteOptionsOps[Self <: NavigationRouteOptions] (val x: Self) extends AnyVal {
    
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
    def setBlacklistVarargs(value: js.RegExp*): Self = this.set("blacklist", js.Array(value :_*))
    
    @scala.inline
    def setBlacklist(value: js.Array[js.RegExp]): Self = this.set("blacklist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlacklist: Self = this.set("blacklist", js.undefined)
    
    @scala.inline
    def setWhitelistVarargs(value: js.RegExp*): Self = this.set("whitelist", js.Array(value :_*))
    
    @scala.inline
    def setWhitelist(value: js.Array[js.RegExp]): Self = this.set("whitelist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhitelist: Self = this.set("whitelist", js.undefined)
  }
}
