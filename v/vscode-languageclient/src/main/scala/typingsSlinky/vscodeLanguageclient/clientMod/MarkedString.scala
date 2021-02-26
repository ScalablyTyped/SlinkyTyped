package typingsSlinky.vscodeLanguageclient.clientMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MarkedString {
  
  /**
    * Creates a marked string from plain text.
    *
    * @param plainText The plain text.
    */
  @JSImport("vscode-languageclient/lib/client", "MarkedString.fromPlainText")
  @js.native
  def fromPlainText(plainText: String): String = js.native
  
  /**
    * Checks whether the given value conforms to the [MarkedString](#MarkedString) type.
    */
  @JSImport("vscode-languageclient/lib/client", "MarkedString.is")
  @js.native
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.MarkedString */ Boolean = js.native
}
