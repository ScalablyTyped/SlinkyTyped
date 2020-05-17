package typingsSlinky.vscodeLanguageserverProtocol.protocolMod

import typingsSlinky.vscodeLanguageserverProtocol.anon.DocumentChanges
import typingsSlinky.vscodeLanguageserverProtocol.anon.DynamicRegistration
import typingsSlinky.vscodeLanguageserverProtocol.anon.SymbolKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkspaceClientCapabilities extends js.Object {
  /**
    * The client supports applying batch edits
    * to the workspace by supporting the request
    * 'workspace/applyEdit'
    */
  var applyEdit: js.UndefOr[Boolean] = js.native
  /**
    * Capabilities specific to the `workspace/didChangeConfiguration` notification.
    */
  var didChangeConfiguration: js.UndefOr[DynamicRegistration] = js.native
  /**
    * Capabilities specific to the `workspace/didChangeWatchedFiles` notification.
    */
  var didChangeWatchedFiles: js.UndefOr[DynamicRegistration] = js.native
  /**
    * Capabilities specific to the `workspace/executeCommand` request.
    */
  var executeCommand: js.UndefOr[DynamicRegistration] = js.native
  /**
    * Capabilities specific to the `workspace/symbol` request.
    */
  var symbol: js.UndefOr[SymbolKind] = js.native
  /**
    * Capabilities specific to `WorkspaceEdit`s
    */
  var workspaceEdit: js.UndefOr[DocumentChanges] = js.native
}

object WorkspaceClientCapabilities {
  @scala.inline
  def apply(): WorkspaceClientCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkspaceClientCapabilities]
  }
  @scala.inline
  implicit class WorkspaceClientCapabilitiesOps[Self <: WorkspaceClientCapabilities] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplyEdit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyEdit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplyEdit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyEdit")(js.undefined)
        ret
    }
    @scala.inline
    def withDidChangeConfiguration(value: DynamicRegistration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("didChangeConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDidChangeConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("didChangeConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withDidChangeWatchedFiles(value: DynamicRegistration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("didChangeWatchedFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDidChangeWatchedFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("didChangeWatchedFiles")(js.undefined)
        ret
    }
    @scala.inline
    def withExecuteCommand(value: DynamicRegistration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executeCommand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecuteCommand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executeCommand")(js.undefined)
        ret
    }
    @scala.inline
    def withSymbol(value: SymbolKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSymbol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbol")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkspaceEdit(value: DocumentChanges): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workspaceEdit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkspaceEdit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workspaceEdit")(js.undefined)
        ret
    }
  }
  
}

