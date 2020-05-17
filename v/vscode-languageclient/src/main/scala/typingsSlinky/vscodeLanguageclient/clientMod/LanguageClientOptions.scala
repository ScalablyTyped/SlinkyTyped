package typingsSlinky.vscodeLanguageclient.clientMod

import typingsSlinky.vscode.mod.OutputChannel
import typingsSlinky.vscode.mod.WorkspaceFolder
import typingsSlinky.vscodeLanguageclient.anon.Code2Protocol
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.DocumentSelector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LanguageClientOptions extends js.Object {
  var diagnosticCollectionName: js.UndefOr[String] = js.native
  var documentSelector: js.UndefOr[DocumentSelector | js.Array[String]] = js.native
  var errorHandler: js.UndefOr[ErrorHandler] = js.native
  var initializationFailedHandler: js.UndefOr[InitializationFailedHandler] = js.native
  var initializationOptions: js.UndefOr[js.Any | js.Function0[_]] = js.native
  var middleware: js.UndefOr[Middleware] = js.native
  var outputChannel: js.UndefOr[OutputChannel] = js.native
  var outputChannelName: js.UndefOr[String] = js.native
  var revealOutputChannelOn: js.UndefOr[RevealOutputChannelOn] = js.native
  /**
    * The encoding use to read stdout and stderr. Defaults
    * to 'utf8' if ommitted.
    */
  var stdioEncoding: js.UndefOr[String] = js.native
  var synchronize: js.UndefOr[SynchronizeOptions] = js.native
  var uriConverters: js.UndefOr[Code2Protocol] = js.native
  var workspaceFolder: js.UndefOr[WorkspaceFolder] = js.native
}

object LanguageClientOptions {
  @scala.inline
  def apply(): LanguageClientOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LanguageClientOptions]
  }
  @scala.inline
  implicit class LanguageClientOptionsOps[Self <: LanguageClientOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDiagnosticCollectionName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diagnosticCollectionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiagnosticCollectionName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diagnosticCollectionName")(js.undefined)
        ret
    }
    @scala.inline
    def withDocumentSelector(value: DocumentSelector | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocumentSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentSelector")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorHandler(value: ErrorHandler): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorHandler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorHandler")(js.undefined)
        ret
    }
    @scala.inline
    def withInitializationFailedHandler(
      value: /* error */ typingsSlinky.vscodeLanguageserverProtocol.mod.ResponseError[typingsSlinky.vscodeLanguageserverProtocol.protocolMod.InitializeError] | js.Error | js.Any => Boolean
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initializationFailedHandler")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutInitializationFailedHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initializationFailedHandler")(js.undefined)
        ret
    }
    @scala.inline
    def withInitializationOptionsFunction0(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initializationOptions")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInitializationOptions(value: js.Any | js.Function0[_]): Self = {
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
    def withMiddleware(value: Middleware): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("middleware")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMiddleware: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("middleware")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputChannel(value: OutputChannel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputChannel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputChannel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputChannel")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputChannelName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputChannelName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputChannelName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputChannelName")(js.undefined)
        ret
    }
    @scala.inline
    def withRevealOutputChannelOn(value: RevealOutputChannelOn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revealOutputChannelOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRevealOutputChannelOn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revealOutputChannelOn")(js.undefined)
        ret
    }
    @scala.inline
    def withStdioEncoding(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stdioEncoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStdioEncoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stdioEncoding")(js.undefined)
        ret
    }
    @scala.inline
    def withSynchronize(value: SynchronizeOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("synchronize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSynchronize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("synchronize")(js.undefined)
        ret
    }
    @scala.inline
    def withUriConverters(value: Code2Protocol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uriConverters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUriConverters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uriConverters")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkspaceFolder(value: WorkspaceFolder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workspaceFolder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkspaceFolder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workspaceFolder")(js.undefined)
        ret
    }
  }
  
}

