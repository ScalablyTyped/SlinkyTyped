package typingsSlinky.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QuickDiffProvider extends js.Object {
  /**
  		 * Provide a [uri](#Uri) to the original resource of any given resource uri.
  		 *
  		 * @param uri The uri of the resource open in a text editor.
  		 * @param token A cancellation token.
  		 * @return A thenable that resolves to uri of the matching original resource.
  		 */
  var provideOriginalResource: js.UndefOr[js.Function2[/* uri */ Uri, /* token */ CancellationToken, ProviderResult[Uri]]] = js.native
}

object QuickDiffProvider {
  @scala.inline
  def apply(): QuickDiffProvider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QuickDiffProvider]
  }
  @scala.inline
  implicit class QuickDiffProviderOps[Self <: QuickDiffProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProvideOriginalResource(value: (/* uri */ Uri, /* token */ CancellationToken) => ProviderResult[Uri]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provideOriginalResource")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutProvideOriginalResource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provideOriginalResource")(js.undefined)
        ret
    }
  }
  
}

