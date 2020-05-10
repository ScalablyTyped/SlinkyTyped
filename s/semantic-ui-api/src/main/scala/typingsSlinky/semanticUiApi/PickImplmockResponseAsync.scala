package typingsSlinky.semanticUiApi

import typingsSlinky.semanticUiApi.SemanticUI.ApiSettings
import typingsSlinky.semanticUiApi.semanticUiApiBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-api.SemanticUI.ApiSettings._Impl, 'mockResponseAsync'> */
@js.native
trait PickImplmockResponseAsync extends js.Object {
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
  implicit class PickImplmockResponseAsyncOps[Self <: PickImplmockResponseAsync] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMockResponseAsyncFunction2(
      value: (/* settings */ ApiSettings, /* callback */ js.Function1[/* response */ js.Any, Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mockResponseAsync")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withMockResponseAsync(
      value: (js.Function2[
          /* settings */ ApiSettings, 
          /* callback */ js.Function1[/* response */ js.Any, Unit], 
          Unit
        ]) | `false`
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mockResponseAsync")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

