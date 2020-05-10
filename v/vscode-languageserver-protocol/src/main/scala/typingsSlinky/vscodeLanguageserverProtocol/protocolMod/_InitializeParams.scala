package typingsSlinky.vscodeLanguageserverProtocol.protocolMod

import typingsSlinky.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.messages
import typingsSlinky.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.off
import typingsSlinky.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.verbose
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait _InitializeParams extends js.Object {
  /**
    * The capabilities provided by the client (editor or tool)
    */
  var capabilities: ClientCapabilities = js.native
  /**
    * User provided initialization options.
    */
  var initializationOptions: js.UndefOr[js.Any] = js.native
  /**
    * The process Id of the parent process that started
    * the server.
    */
  var processId: Double | Null = js.native
  /**
    * The rootPath of the workspace. Is null
    * if no folder is open.
    *
    * @deprecated in favour of rootUri.
    */
  var rootPath: js.UndefOr[String | Null] = js.native
  /**
    * The rootUri of the workspace. Is null if no
    * folder is open. If both `rootPath` and `rootUri` are set
    * `rootUri` wins.
    *
    * @deprecated in favour of workspaceFolders.
    */
  var rootUri: String | Null = js.native
  /**
    * The initial trace setting. If omitted trace is disabled ('off').
    */
  var trace: js.UndefOr[off | messages | verbose] = js.native
}

object _InitializeParams {
  @scala.inline
  def apply(capabilities: ClientCapabilities): _InitializeParams = {
    val __obj = js.Dynamic.literal(capabilities = capabilities.asInstanceOf[js.Any])
    __obj.asInstanceOf[_InitializeParams]
  }
  @scala.inline
  implicit class _InitializeParamsOps[Self <: _InitializeParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCapabilities(value: ClientCapabilities): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capabilities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInitializationOptions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initializationOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitializationOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initializationOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProcessIdNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processId")(null)
        ret
    }
    @scala.inline
    def withRootPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootPath")(js.undefined)
        ret
    }
    @scala.inline
    def withRootPathNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootPath")(null)
        ret
    }
    @scala.inline
    def withRootUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRootUriNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootUri")(null)
        ret
    }
    @scala.inline
    def withTrace(value: off | messages | verbose): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trace")(js.undefined)
        ret
    }
  }
  
}

