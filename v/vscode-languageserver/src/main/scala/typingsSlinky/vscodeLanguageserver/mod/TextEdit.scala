package typingsSlinky.vscodeLanguageserver.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TextEdit {
  
  /**
    * Creates a delete text edit.
    * @param range The range of text to be deleted.
    */
  @JSImport("vscode-languageserver", "TextEdit.del")
  @js.native
  def del(range: typingsSlinky.vscodeLanguageserverTypes.mod.Range): typingsSlinky.vscodeLanguageserverTypes.mod.TextEdit = js.native
  
  /**
    * Creates a insert text edit.
    * @param position The position to insert the text at.
    * @param newText The text to be inserted.
    */
  @JSImport("vscode-languageserver", "TextEdit.insert")
  @js.native
  def insert(position: typingsSlinky.vscodeLanguageserverTypes.mod.Position, newText: String): typingsSlinky.vscodeLanguageserverTypes.mod.TextEdit = js.native
  
  @JSImport("vscode-languageserver", "TextEdit.is")
  @js.native
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.TextEdit */ Boolean = js.native
  
  /**
    * Creates a replace text edit.
    * @param range The range of text to be replaced.
    * @param newText The new text.
    */
  @JSImport("vscode-languageserver", "TextEdit.replace")
  @js.native
  def replace(range: typingsSlinky.vscodeLanguageserverTypes.mod.Range, newText: String): typingsSlinky.vscodeLanguageserverTypes.mod.TextEdit = js.native
}
