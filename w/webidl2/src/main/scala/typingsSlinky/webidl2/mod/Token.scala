package typingsSlinky.webidl2.mod

import typingsSlinky.webidl2.webidl2Strings.decimal
import typingsSlinky.webidl2.webidl2Strings.identifier
import typingsSlinky.webidl2.webidl2Strings.integer
import typingsSlinky.webidl2.webidl2Strings.other
import typingsSlinky.webidl2.webidl2Strings.string
import typingsSlinky.webidl2.webidl2Strings.whitespace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Token extends js.Object {
  
  var `type`: decimal | integer | identifier | string | whitespace | other = js.native
  
  var value: String = js.native
}
object Token {
  
  @scala.inline
  def apply(`type`: decimal | integer | identifier | string | whitespace | other, value: String): Token = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  
  @scala.inline
  implicit class TokenOps[Self <: Token] (val x: Self) extends AnyVal {
    
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
    def setType(value: decimal | integer | identifier | string | whitespace | other): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
