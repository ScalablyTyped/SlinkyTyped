package typingsSlinky.vscodeLanguageserverTypes.mod

import typingsSlinky.vscodeLanguageserverTypes.vscodeLanguageserverTypesStrings.markdown
import typingsSlinky.vscodeLanguageserverTypes.vscodeLanguageserverTypesStrings.plaintext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.vscodeLanguageserverTypes.vscodeLanguageserverTypesStrings.plaintext
  - typingsSlinky.vscodeLanguageserverTypes.vscodeLanguageserverTypesStrings.markdown
*/
trait MarkupKind extends StObject
object MarkupKind {
  
  /**
    * Markdown is supported as a content format
    */
  @JSImport("vscode-languageserver-types", "MarkupKind.Markdown")
  @js.native
  val Markdown: markdown = js.native
  
  /**
    * Plain text is supported as a content format
    */
  @JSImport("vscode-languageserver-types", "MarkupKind.PlainText")
  @js.native
  val PlainText: plaintext = js.native
  
  /**
    * Checks whether the given value is a value of the [MarkupKind](#MarkupKind) type.
    */
  @JSImport("vscode-languageserver-types", "MarkupKind.is")
  @js.native
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.MarkupKind */ Boolean = js.native
}
