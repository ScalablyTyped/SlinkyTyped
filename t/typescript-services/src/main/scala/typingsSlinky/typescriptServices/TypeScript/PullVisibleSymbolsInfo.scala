package typingsSlinky.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PullVisibleSymbolsInfo extends StObject {
  
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
  implicit class PullVisibleSymbolsInfoMutableBuilder[Self <: PullVisibleSymbolsInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnclosingScopeSymbol(value: PullSymbol): Self = StObject.set(x, "enclosingScopeSymbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbols(value: js.Array[PullSymbol]): Self = StObject.set(x, "symbols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbolsVarargs(value: PullSymbol*): Self = StObject.set(x, "symbols", js.Array(value :_*))
  }
}
