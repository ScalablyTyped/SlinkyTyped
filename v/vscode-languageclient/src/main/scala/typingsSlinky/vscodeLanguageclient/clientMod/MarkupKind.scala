package typingsSlinky.vscodeLanguageclient.clientMod

import typingsSlinky.vscodeLanguageclient.vscodeLanguageclientStrings.markdown
import typingsSlinky.vscodeLanguageclient.vscodeLanguageclientStrings.plaintext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageclient/lib/client", "MarkupKind")
@js.native
object MarkupKind extends js.Object {
  
  /**
    * Markdown is supported as a content format
    */
  val Markdown: markdown = js.native
  
  /**
    * Plain text is supported as a content format
    */
  val PlainText: plaintext = js.native
  
  /**
    * Checks whether the given value is a value of the [MarkupKind](#MarkupKind) type.
    */
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.MarkupKind */ Boolean = js.native
}
