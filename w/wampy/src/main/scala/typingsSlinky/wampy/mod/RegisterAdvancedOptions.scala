package typingsSlinky.wampy.mod

import typingsSlinky.wampy.wampyStrings.first
import typingsSlinky.wampy.wampyStrings.last
import typingsSlinky.wampy.wampyStrings.prefix
import typingsSlinky.wampy.wampyStrings.random
import typingsSlinky.wampy.wampyStrings.roundrobin
import typingsSlinky.wampy.wampyStrings.single
import typingsSlinky.wampy.wampyStrings.wildcard
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegisterAdvancedOptions extends js.Object {
  
  var invoke: js.UndefOr[single | roundrobin | random | first | last] = js.native
  
  var `match`: js.UndefOr[prefix | wildcard] = js.native
}
object RegisterAdvancedOptions {
  
  @scala.inline
  def apply(): RegisterAdvancedOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterAdvancedOptions]
  }
  
  @scala.inline
  implicit class RegisterAdvancedOptionsOps[Self <: RegisterAdvancedOptions] (val x: Self) extends AnyVal {
    
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
    def setInvoke(value: single | roundrobin | random | first | last): Self = this.set("invoke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvoke: Self = this.set("invoke", js.undefined)
    
    @scala.inline
    def setMatch(value: prefix | wildcard): Self = this.set("match", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatch: Self = this.set("match", js.undefined)
  }
}
