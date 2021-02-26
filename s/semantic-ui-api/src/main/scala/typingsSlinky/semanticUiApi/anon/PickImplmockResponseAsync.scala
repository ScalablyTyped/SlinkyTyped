package typingsSlinky.semanticUiApi.anon

import typingsSlinky.semanticUiApi.SemanticUI.ApiSettings
import typingsSlinky.semanticUiApi.semanticUiApiBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-api.SemanticUI.ApiSettings._Impl, 'mockResponseAsync'> */
@js.native
trait PickImplmockResponseAsync extends StObject {
  
  var mockResponseAsync: (js.Function2[
    /* settings */ ApiSettings, 
    /* callback */ js.Function1[/* response */ js.Any, Unit], 
    Unit
  ]) | `false` = js.native
}
object PickImplmockResponseAsync {
  
  @scala.inline
  def apply(
    mockResponseAsync: (js.Function2[
      /* settings */ ApiSettings, 
      /* callback */ js.Function1[/* response */ js.Any, Unit], 
      Unit
    ]) | `false`
  ): PickImplmockResponseAsync = {
    val __obj = js.Dynamic.literal(mockResponseAsync = mockResponseAsync.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplmockResponseAsync]
  }
  
  @scala.inline
  implicit class PickImplmockResponseAsyncMutableBuilder[Self <: PickImplmockResponseAsync] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMockResponseAsync(
      value: (js.Function2[
          /* settings */ ApiSettings, 
          /* callback */ js.Function1[/* response */ js.Any, Unit], 
          Unit
        ]) | `false`
    ): Self = StObject.set(x, "mockResponseAsync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMockResponseAsyncFunction2(
      value: (/* settings */ ApiSettings, /* callback */ js.Function1[/* response */ js.Any, Unit]) => Unit
    ): Self = StObject.set(x, "mockResponseAsync", js.Any.fromFunction2(value))
  }
}
