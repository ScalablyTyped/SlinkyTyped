package typingsSlinky.vscodeLanguageclient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageclient", "SelectionRange")
@js.native
object SelectionRange extends js.Object {
  
  /**
    * Creates a new SelectionRange
    * @param range the range.
    * @param parent an optional parent.
    */
  def create(range: typingsSlinky.vscodeLanguageserverTypes.mod.Range): typingsSlinky.vscodeLanguageserverTypes.mod.SelectionRange = js.native
  def create(
    range: typingsSlinky.vscodeLanguageserverTypes.mod.Range,
    parent: typingsSlinky.vscodeLanguageserverTypes.mod.SelectionRange
  ): typingsSlinky.vscodeLanguageserverTypes.mod.SelectionRange = js.native
  
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.SelectionRange */ Boolean = js.native
}
