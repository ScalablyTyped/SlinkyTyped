package typingsSlinky.vscodeLanguageserverProtocol.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DocumentHighlight {
  
  /**
    * Create a DocumentHighlight object.
    * @param range The range the highlight applies to.
    */
  @JSImport("vscode-languageserver-protocol", "DocumentHighlight.create")
  @js.native
  def create(range: typingsSlinky.vscodeLanguageserverTypes.mod.Range): typingsSlinky.vscodeLanguageserverTypes.mod.DocumentHighlight = js.native
  @JSImport("vscode-languageserver-protocol", "DocumentHighlight.create")
  @js.native
  def create(
    range: typingsSlinky.vscodeLanguageserverTypes.mod.Range,
    kind: typingsSlinky.vscodeLanguageserverTypes.mod.DocumentHighlightKind
  ): typingsSlinky.vscodeLanguageserverTypes.mod.DocumentHighlight = js.native
}
