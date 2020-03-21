package typingsSlinky.vscodeLanguageclient.mod

import typingsSlinky.vscodeLanguageclient.clientMod.LanguageClientOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient", "BaseLanguageClient")
@js.native
abstract class BaseLanguageClient protected ()
  extends typingsSlinky.vscodeLanguageclient.clientMod.BaseLanguageClient {
  def this(id: String, name: String, clientOptions: LanguageClientOptions) = this()
}

