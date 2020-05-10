package typingsSlinky.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PullSymbolInfo extends js.Object {
  var aliasSymbol: PullTypeAliasSymbol = js.native
  var ast: AST = js.native
  var enclosingScopeSymbol: PullSymbol = js.native
  var symbol: PullSymbol = js.native
}

object PullSymbolInfo {
  @scala.inline
  def apply(aliasSymbol: PullTypeAliasSymbol, ast: AST, enclosingScopeSymbol: PullSymbol, symbol: PullSymbol): PullSymbolInfo = {
    val __obj = js.Dynamic.literal(aliasSymbol = aliasSymbol.asInstanceOf[js.Any], ast = ast.asInstanceOf[js.Any], enclosingScopeSymbol = enclosingScopeSymbol.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullSymbolInfo]
  }
  @scala.inline
  implicit class PullSymbolInfoOps[Self <: PullSymbolInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAliasSymbol(value: PullTypeAliasSymbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aliasSymbol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAst(value: AST): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnclosingScopeSymbol(value: PullSymbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enclosingScopeSymbol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSymbol(value: PullSymbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbol")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

