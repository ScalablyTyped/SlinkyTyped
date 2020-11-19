package typingsSlinky.vscodeLanguageclient.clientMod

import typingsSlinky.vscodeLanguageclient.vscodeLanguageclientNumbers.`1`
import typingsSlinky.vscodeLanguageclient.vscodeLanguageclientNumbers.`2`
import typingsSlinky.vscodeLanguageclient.vscodeLanguageclientNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageclient/lib/client", "TextDocumentSaveReason")
@js.native
object TextDocumentSaveReason extends js.Object {
  
  /**
    * Automatic after a delay.
    */
  val AfterDelay: `2` = js.native
  
  /**
    * When the editor lost focus.
    */
  val FocusOut: `3` = js.native
  
  /**
    * Manually triggered, e.g. by the user pressing save, by starting debugging,
    * or by an API call.
    */
  val Manual: `1` = js.native
}
