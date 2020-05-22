package typingsSlinky.vscodeLanguageserverProtocol.protocolMod

import typingsSlinky.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.messages
import typingsSlinky.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.off
import typingsSlinky.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.verbose
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _InitializeParams extends js.Object {
  /**
    * The capabilities provided by the client (editor or tool)
    */
  var capabilities: ClientCapabilities
  /**
    * User provided initialization options.
    */
  var initializationOptions: js.UndefOr[js.Any] = js.undefined
  /**
    * The process Id of the parent process that started
    * the server.
    */
  var processId: Double | Null
  /**
    * The rootPath of the workspace. Is null
    * if no folder is open.
    *
    * @deprecated in favour of rootUri.
    */
  var rootPath: js.UndefOr[String | Null] = js.undefined
  /**
    * The rootUri of the workspace. Is null if no
    * folder is open. If both `rootPath` and `rootUri` are set
    * `rootUri` wins.
    *
    * @deprecated in favour of workspaceFolders.
    */
  var rootUri: String | Null
  /**
    * The initial trace setting. If omitted trace is disabled ('off').
    */
  var trace: js.UndefOr[off | messages | verbose] = js.undefined
}

object _InitializeParams {
  @scala.inline
  def apply(
    capabilities: ClientCapabilities,
    initializationOptions: js.Any = null,
    processId: Double = null.asInstanceOf[Double],
    rootPath: js.UndefOr[Null | String] = js.undefined,
    rootUri: String = null,
    trace: off | messages | verbose = null
  ): _InitializeParams = {
    val __obj = js.Dynamic.literal(capabilities = capabilities.asInstanceOf[js.Any], processId = processId.asInstanceOf[js.Any], rootUri = rootUri.asInstanceOf[js.Any])
    if (initializationOptions != null) __obj.updateDynamic("initializationOptions")(initializationOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(rootPath)) __obj.updateDynamic("rootPath")(rootPath.asInstanceOf[js.Any])
    if (trace != null) __obj.updateDynamic("trace")(trace.asInstanceOf[js.Any])
    __obj.asInstanceOf[_InitializeParams]
  }
}

