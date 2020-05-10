package typingsSlinky.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PullCallSymbolInfo extends js.Object {
  var ast: AST = js.native
  var candidateSignature: PullSignatureSymbol = js.native
  var enclosingScopeSymbol: PullSymbol = js.native
  var isConstructorCall: Boolean = js.native
  var resolvedSignatures: js.Array[PullSignatureSymbol] = js.native
  var targetSymbol: PullSymbol = js.native
}

object PullCallSymbolInfo {
  @scala.inline
  def apply(
    ast: AST,
    candidateSignature: PullSignatureSymbol,
    enclosingScopeSymbol: PullSymbol,
    isConstructorCall: Boolean,
    resolvedSignatures: js.Array[PullSignatureSymbol],
    targetSymbol: PullSymbol
  ): PullCallSymbolInfo = {
    val __obj = js.Dynamic.literal(ast = ast.asInstanceOf[js.Any], candidateSignature = candidateSignature.asInstanceOf[js.Any], enclosingScopeSymbol = enclosingScopeSymbol.asInstanceOf[js.Any], isConstructorCall = isConstructorCall.asInstanceOf[js.Any], resolvedSignatures = resolvedSignatures.asInstanceOf[js.Any], targetSymbol = targetSymbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullCallSymbolInfo]
  }
  @scala.inline
  implicit class PullCallSymbolInfoOps[Self <: PullCallSymbolInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAst(value: AST): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCandidateSignature(value: PullSignatureSymbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("candidateSignature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnclosingScopeSymbol(value: PullSymbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enclosingScopeSymbol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsConstructorCall(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isConstructorCall")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResolvedSignatures(value: js.Array[PullSignatureSymbol]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolvedSignatures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetSymbol(value: PullSymbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetSymbol")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

