package typingsSlinky.vscodeLanguageclient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient", "TextEdit")
@js.native
object TextEdit extends js.Object {
  /**
    * Creates a delete text edit.
    * @param range The range of text to be deleted.
    */
  def del(range: typingsSlinky.vscodeLanguageserverTypes.mod.Range): typingsSlinky.vscodeLanguageserverTypes.mod.TextEdit = js.native
  /**
    * Creates a insert text edit.
    * @param position The position to insert the text at.
    * @param newText The text to be inserted.
    */
  def insert(position: typingsSlinky.vscodeLanguageserverTypes.mod.Position, newText: String): typingsSlinky.vscodeLanguageserverTypes.mod.TextEdit = js.native
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.TextEdit */ Boolean = js.native
  /**
    * Creates a replace text edit.
    * @param range The range of text to be replaced.
    * @param newText The new text.
    */
  def replace(range: typingsSlinky.vscodeLanguageserverTypes.mod.Range, newText: String): typingsSlinky.vscodeLanguageserverTypes.mod.TextEdit = js.native
}

