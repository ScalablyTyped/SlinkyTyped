package typingsSlinky.vscodeLanguageclient.semanticTokensProposedMod

import typingsSlinky.vscodeLanguageclient.clientMod.BaseLanguageClient
import typingsSlinky.vscodeLanguageclient.clientMod.TextDocumentFeature
import typingsSlinky.vscodeLanguageserverProtocol.mod.Proposed.SemanticTokensOptions
import typingsSlinky.vscodeLanguageserverProtocol.mod.Proposed.SemanticTokensRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/semanticTokens.proposed", "SemanticTokensFeature")
@js.native
class SemanticTokensFeature protected () extends TextDocumentFeature[
      Boolean | SemanticTokensOptions, 
      SemanticTokensRegistrationOptions, 
      SemanticTokensProviders
    ] {
  def this(client: BaseLanguageClient) = this()
}

