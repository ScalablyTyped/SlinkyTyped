package typingsSlinky.vscodeLanguageserver.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver", "DocumentHighlight")
@js.native
object DocumentHighlight extends js.Object {
  /**
    * Create a DocumentHighlight object.
    * @param range The range the highlight applies to.
    */
  def create(range: typingsSlinky.vscodeLanguageserverTypes.mod.Range): typingsSlinky.vscodeLanguageserverTypes.mod.DocumentHighlight = js.native
  def create(
    range: typingsSlinky.vscodeLanguageserverTypes.mod.Range,
    kind: typingsSlinky.vscodeLanguageserverTypes.mod.DocumentHighlightKind
  ): typingsSlinky.vscodeLanguageserverTypes.mod.DocumentHighlight = js.native
}

