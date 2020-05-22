package typingsSlinky.vscodeLanguageserverProtocol.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompletionItem extends js.Object {
  /**
    * The client supports the following `CompletionItem` specific
    * capabilities.
    */
  var completionItem: js.UndefOr[CommitCharactersSupport] = js.undefined
  var completionItemKind: js.UndefOr[ValueSetArray] = js.undefined
  /**
    * The client supports to send additional context information for a
    * `textDocument/completion` requestion.
    */
  var contextSupport: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether completion supports dynamic registration.
    */
  var dynamicRegistration: js.UndefOr[Boolean] = js.undefined
}

object CompletionItem {
  @scala.inline
  def apply(
    completionItem: CommitCharactersSupport = null,
    completionItemKind: ValueSetArray = null,
    contextSupport: js.UndefOr[Boolean] = js.undefined,
    dynamicRegistration: js.UndefOr[Boolean] = js.undefined
  ): CompletionItem = {
    val __obj = js.Dynamic.literal()
    if (completionItem != null) __obj.updateDynamic("completionItem")(completionItem.asInstanceOf[js.Any])
    if (completionItemKind != null) __obj.updateDynamic("completionItemKind")(completionItemKind.asInstanceOf[js.Any])
    if (!js.isUndefined(contextSupport)) __obj.updateDynamic("contextSupport")(contextSupport.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dynamicRegistration)) __obj.updateDynamic("dynamicRegistration")(dynamicRegistration.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompletionItem]
  }
}

