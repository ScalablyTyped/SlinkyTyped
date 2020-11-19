package typingsSlinky.vscodeLanguageserverTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentHighlight extends js.Object {
  
  /**
    * The highlight kind, default is [text](#DocumentHighlightKind.Text).
    */
  var kind: js.UndefOr[DocumentHighlightKind] = js.native
  
  /**
    * The range this highlight applies to.
    */
  var range: Range = js.native
}
@JSImport("vscode-languageserver-types", "DocumentHighlight")
@js.native
object DocumentHighlight extends js.Object {
  
  /**
    * Create a DocumentHighlight object.
    * @param range The range the highlight applies to.
    */
  def create(range: Range): DocumentHighlight = js.native
  def create(range: Range, kind: DocumentHighlightKind): DocumentHighlight = js.native
}
