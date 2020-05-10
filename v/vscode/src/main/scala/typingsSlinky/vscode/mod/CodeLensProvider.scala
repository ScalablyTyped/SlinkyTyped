package typingsSlinky.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CodeLensProvider extends js.Object {
  /**
  		 * An optional event to signal that the code lenses from this provider have changed.
  		 */
  var onDidChangeCodeLenses: js.UndefOr[Event[Unit]] = js.native
  /**
  		 * This function will be called for each visible code lens, usually when scrolling and after
  		 * calls to [compute](#CodeLensProvider.provideCodeLenses)-lenses.
  		 *
  		 * @param codeLens code lens that must be resolved.
  		 * @param token A cancellation token.
  		 * @return The given, resolved code lens or thenable that resolves to such.
  		 */
  var resolveCodeLens: js.UndefOr[
    js.Function2[/* codeLens */ CodeLens, /* token */ CancellationToken, ProviderResult[CodeLens]]
  ] = js.native
  /**
  		 * Compute a list of [lenses](#CodeLens). This call should return as fast as possible and if
  		 * computing the commands is expensive implementors should only return code lens objects with the
  		 * range set and implement [resolve](#CodeLensProvider.resolveCodeLens).
  		 *
  		 * @param document The document in which the command was invoked.
  		 * @param token A cancellation token.
  		 * @return An array of code lenses or a thenable that resolves to such. The lack of a result can be
  		 * signaled by returning `undefined`, `null`, or an empty array.
  		 */
  def provideCodeLenses(document: TextDocument, token: CancellationToken): ProviderResult[js.Array[CodeLens]] = js.native
}

object CodeLensProvider {
  @scala.inline
  def apply(provideCodeLenses: (TextDocument, CancellationToken) => ProviderResult[js.Array[CodeLens]]): CodeLensProvider = {
    val __obj = js.Dynamic.literal(provideCodeLenses = js.Any.fromFunction2(provideCodeLenses))
    __obj.asInstanceOf[CodeLensProvider]
  }
  @scala.inline
  implicit class CodeLensProviderOps[Self <: CodeLensProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProvideCodeLenses(value: (TextDocument, CancellationToken) => ProviderResult[js.Array[CodeLens]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provideCodeLenses")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOnDidChangeCodeLenses(
      value: (/* listener */ js.Function1[Unit, js.Any], /* thisArgs */ js.UndefOr[js.Any], /* disposables */ js.UndefOr[js.Array[Disposable]]) => Disposable
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDidChangeCodeLenses")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnDidChangeCodeLenses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDidChangeCodeLenses")(js.undefined)
        ret
    }
    @scala.inline
    def withResolveCodeLens(value: (/* codeLens */ CodeLens, /* token */ CancellationToken) => ProviderResult[CodeLens]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveCodeLens")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutResolveCodeLens: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveCodeLens")(js.undefined)
        ret
    }
  }
  
}

