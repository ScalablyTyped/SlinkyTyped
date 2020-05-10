package typingsSlinky.vscodeLanguageserverProtocol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCompletionItem extends js.Object {
  /**
    * The client supports the following `CompletionItem` specific
    * capabilities.
    */
  var completionItem: js.UndefOr[AnonCommitCharactersSupport] = js.native
  var completionItemKind: js.UndefOr[AnonValueSetArray] = js.native
  /**
    * The client supports to send additional context information for a
    * `textDocument/completion` requestion.
    */
  var contextSupport: js.UndefOr[Boolean] = js.native
  /**
    * Whether completion supports dynamic registration.
    */
  var dynamicRegistration: js.UndefOr[Boolean] = js.native
}

object AnonCompletionItem {
  @scala.inline
  def apply(): AnonCompletionItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonCompletionItem]
  }
  @scala.inline
  implicit class AnonCompletionItemOps[Self <: AnonCompletionItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompletionItem(value: AnonCommitCharactersSupport): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completionItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompletionItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completionItem")(js.undefined)
        ret
    }
    @scala.inline
    def withCompletionItemKind(value: AnonValueSetArray): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completionItemKind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompletionItemKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completionItemKind")(js.undefined)
        ret
    }
    @scala.inline
    def withContextSupport(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextSupport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContextSupport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextSupport")(js.undefined)
        ret
    }
    @scala.inline
    def withDynamicRegistration(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamicRegistration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDynamicRegistration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamicRegistration")(js.undefined)
        ret
    }
  }
  
}

