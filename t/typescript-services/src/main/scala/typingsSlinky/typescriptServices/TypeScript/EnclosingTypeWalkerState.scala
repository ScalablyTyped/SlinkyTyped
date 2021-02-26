package typingsSlinky.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnclosingTypeWalkerState extends StObject {
  
  var _currentSymbols: js.Array[PullSymbol] = js.native
  
  var _hasSetEnclosingType: Boolean = js.native
}
object EnclosingTypeWalkerState {
  
  @scala.inline
  def apply(_currentSymbols: js.Array[PullSymbol], _hasSetEnclosingType: Boolean): EnclosingTypeWalkerState = {
    val __obj = js.Dynamic.literal(_currentSymbols = _currentSymbols.asInstanceOf[js.Any], _hasSetEnclosingType = _hasSetEnclosingType.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnclosingTypeWalkerState]
  }
  
  @scala.inline
  implicit class EnclosingTypeWalkerStateMutableBuilder[Self <: EnclosingTypeWalkerState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set_currentSymbols(value: js.Array[PullSymbol]): Self = StObject.set(x, "_currentSymbols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_currentSymbolsVarargs(value: PullSymbol*): Self = StObject.set(x, "_currentSymbols", js.Array(value :_*))
    
    @scala.inline
    def set_hasSetEnclosingType(value: Boolean): Self = StObject.set(x, "_hasSetEnclosingType", value.asInstanceOf[js.Any])
  }
}
