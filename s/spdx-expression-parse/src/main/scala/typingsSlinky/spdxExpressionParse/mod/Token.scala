package typingsSlinky.spdxExpressionParse.mod

import typingsSlinky.spdxExpressionParse.spdxExpressionParseStrings.DOCUMENTREF
import typingsSlinky.spdxExpressionParse.spdxExpressionParseStrings.EXCEPTION
import typingsSlinky.spdxExpressionParse.spdxExpressionParseStrings.LICENSE
import typingsSlinky.spdxExpressionParse.spdxExpressionParseStrings.LICENSEREF
import typingsSlinky.spdxExpressionParse.spdxExpressionParseStrings.OPERATOR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Token extends js.Object {
  
  var string: String = js.native
  
  var `type`: OPERATOR | LICENSE | DOCUMENTREF | LICENSEREF | EXCEPTION = js.native
}
object Token {
  
  @scala.inline
  def apply(string: String, `type`: OPERATOR | LICENSE | DOCUMENTREF | LICENSEREF | EXCEPTION): Token = {
    val __obj = js.Dynamic.literal(string = string.asInstanceOf[js.Any])
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
    def setString(value: String): Self = this.set("string", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: OPERATOR | LICENSE | DOCUMENTREF | LICENSEREF | EXCEPTION): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
