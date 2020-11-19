package typingsSlinky.yup.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Regex extends js.Object {
  
  var regex: js.RegExp = js.native
}
object Regex {
  
  @scala.inline
  def apply(regex: js.RegExp): Regex = {
    val __obj = js.Dynamic.literal(regex = regex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Regex]
  }
  
  @scala.inline
  implicit class RegexOps[Self <: Regex] (val x: Self) extends AnyVal {
    
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
