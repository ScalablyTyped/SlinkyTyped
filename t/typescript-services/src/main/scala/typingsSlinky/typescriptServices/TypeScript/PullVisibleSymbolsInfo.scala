package typingsSlinky.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PullVisibleSymbolsInfo extends js.Object {
  var enclosingScopeSymbol: PullSymbol = js.native
  var symbols: js.Array[PullSymbol] = js.native
}

object PullVisibleSymbolsInfo {
  @scala.inline
  def apply(enclosingScopeSymbol: PullSymbol, symbols: js.Array[PullSymbol]): PullVisibleSymbolsInfo = {
    val __obj = js.Dynamic.literal(enclosingScopeSymbol = enclosingScopeSymbol.asInstanceOf[js.Any], symbols = symbols.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullVisibleSymbolsInfo]
  }
  @scala.inline
  implicit class PullVisibleSymbolsInfoOps[Self <: PullVisibleSymbolsInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnclosingScopeSymbol(value: PullSymbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enclosingScopeSymbol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSymbols(value: js.Array[PullSymbol]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbols")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

