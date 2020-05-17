package typingsSlinky.typescriptServices.TypeScript.Services.Formatting.Shared

import typingsSlinky.typescriptServices.TypeScript.SyntaxKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TokenRangeAccess extends ITokenAccess {
  var tokens: js.Any = js.native
}

object TokenRangeAccess {
  @scala.inline
  def apply(Contains: SyntaxKind => Boolean, GetTokens: () => js.Array[SyntaxKind], tokens: js.Any): TokenRangeAccess = {
    val __obj = js.Dynamic.literal(Contains = js.Any.fromFunction1(Contains), GetTokens = js.Any.fromFunction0(GetTokens), tokens = tokens.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenRangeAccess]
  }
  @scala.inline
  implicit class TokenRangeAccessOps[Self <: TokenRangeAccess] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTokens(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokens")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

