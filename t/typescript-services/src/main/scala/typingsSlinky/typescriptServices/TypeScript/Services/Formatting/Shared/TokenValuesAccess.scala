package typingsSlinky.typescriptServices.TypeScript.Services.Formatting.Shared

import typingsSlinky.typescriptServices.TypeScript.SyntaxKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TokenValuesAccess extends ITokenAccess {
  
  var tokens: js.Any = js.native
}
object TokenValuesAccess {
  
  @scala.inline
  def apply(Contains: SyntaxKind => Boolean, GetTokens: () => js.Array[SyntaxKind], tokens: js.Any): TokenValuesAccess = {
    val __obj = js.Dynamic.literal(Contains = js.Any.fromFunction1(Contains), GetTokens = js.Any.fromFunction0(GetTokens), tokens = tokens.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenValuesAccess]
  }
  
  @scala.inline
  implicit class TokenValuesAccessOps[Self <: TokenValuesAccess] (val x: Self) extends AnyVal {
    
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
    def setTokens(value: js.Any): Self = this.set("tokens", value.asInstanceOf[js.Any])
  }
}
