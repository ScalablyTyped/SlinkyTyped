package typingsSlinky.sqltoolsFormatter.anon

import typingsSlinky.sqltoolsFormatter.typesMod.TokenTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Regex extends js.Object {
  
  var input: String = js.native
  
  var regex: js.RegExp = js.native
  
  var `type`: TokenTypes = js.native
}
object Regex {
  
  @scala.inline
  def apply(input: String, regex: js.RegExp, `type`: TokenTypes): Regex = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], regex = regex.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
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
    def setInput(value: String): Self = this.set("input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegex(value: js.RegExp): Self = this.set("regex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: TokenTypes): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
