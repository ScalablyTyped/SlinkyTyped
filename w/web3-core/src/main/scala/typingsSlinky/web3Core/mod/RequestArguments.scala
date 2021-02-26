package typingsSlinky.web3Core.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestArguments
  extends /* key */ StringDictionary[js.Any] {
  
  var method: String = js.native
  
  var params: js.UndefOr[js.Any] = js.native
}
object RequestArguments {
  
  @scala.inline
  def apply(method: String): RequestArguments = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestArguments]
  }
  
  @scala.inline
  implicit class RequestArgumentsMutableBuilder[Self <: RequestArguments] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParams(value: js.Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
  }
}
