package typingsSlinky.simpleUrlCache.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegexRule extends js.Object {
  
  var regex: js.RegExp = js.native
}
object RegexRule {
  
  @scala.inline
  def apply(regex: js.RegExp): RegexRule = {
    val __obj = js.Dynamic.literal(regex = regex.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegexRule]
  }
  
  @scala.inline
  implicit class RegexRuleOps[Self <: RegexRule] (val x: Self) extends AnyVal {
    
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
    def setRegex(value: js.RegExp): Self = this.set("regex", value.asInstanceOf[js.Any])
  }
}
