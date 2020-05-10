package typingsSlinky.vscodeLanguageserverProtocol.protocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait _ClientCapabilities extends js.Object {
  /**
    * Experimental client capabilities.
    */
  var experimental: js.UndefOr[js.Any] = js.native
  /**
    * Text document specific client capabilities.
    */
  var textDocument: js.UndefOr[TextDocumentClientCapabilities] = js.native
  /**
    * Workspace specific client capabilities.
    */
  var workspace: js.UndefOr[WorkspaceClientCapabilities] = js.native
}

object _ClientCapabilities {
  @scala.inline
  def apply(): _ClientCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[_ClientCapabilities]
  }
  @scala.inline
  implicit class _ClientCapabilitiesOps[Self <: _ClientCapabilities] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExperimental(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("experimental")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExperimental: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("experimental")(js.undefined)
        ret
    }
    @scala.inline
    def withTextDocument(value: TextDocumentClientCapabilities): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textDocument")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextDocument: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textDocument")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkspace(value: WorkspaceClientCapabilities): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workspace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkspace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workspace")(js.undefined)
        ret
    }
  }
  
}

