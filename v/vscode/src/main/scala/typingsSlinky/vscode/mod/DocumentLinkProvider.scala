package typingsSlinky.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentLinkProvider extends js.Object {
  /**
  		 * Given a link fill in its [target](#DocumentLink.target). This method is called when an incomplete
  		 * link is selected in the UI. Providers can implement this method and return incomplete links
  		 * (without target) from the [`provideDocumentLinks`](#DocumentLinkProvider.provideDocumentLinks) method which
  		 * often helps to improve performance.
  		 *
  		 * @param link The link that is to be resolved.
  		 * @param token A cancellation token.
  		 */
  var resolveDocumentLink: js.UndefOr[
    js.Function2[/* link */ DocumentLink, /* token */ CancellationToken, ProviderResult[DocumentLink]]
  ] = js.native
  /**
  		 * Provide links for the given document. Note that the editor ships with a default provider that detects
  		 * `http(s)` and `file` links.
  		 *
  		 * @param document The document in which the command was invoked.
  		 * @param token A cancellation token.
  		 * @return An array of [document links](#DocumentLink) or a thenable that resolves to such. The lack of a result
  		 * can be signaled by returning `undefined`, `null`, or an empty array.
  		 */
  def provideDocumentLinks(document: TextDocument, token: CancellationToken): ProviderResult[js.Array[DocumentLink]] = js.native
}

object DocumentLinkProvider {
  @scala.inline
  def apply(provideDocumentLinks: (TextDocument, CancellationToken) => ProviderResult[js.Array[DocumentLink]]): DocumentLinkProvider = {
    val __obj = js.Dynamic.literal(provideDocumentLinks = js.Any.fromFunction2(provideDocumentLinks))
    __obj.asInstanceOf[DocumentLinkProvider]
  }
  @scala.inline
  implicit class DocumentLinkProviderOps[Self <: DocumentLinkProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProvideDocumentLinks(value: (TextDocument, CancellationToken) => ProviderResult[js.Array[DocumentLink]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provideDocumentLinks")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withResolveDocumentLink(value: (/* link */ DocumentLink, /* token */ CancellationToken) => ProviderResult[DocumentLink]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveDocumentLink")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutResolveDocumentLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveDocumentLink")(js.undefined)
        ret
    }
  }
  
}

