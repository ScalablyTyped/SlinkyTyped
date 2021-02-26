package typingsSlinky.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DocumentHighlightKind extends StObject
@JSImport("vscode", "DocumentHighlightKind")
@js.native
object DocumentHighlightKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DocumentHighlightKind with Double] = js.native
  
  /**
    * Read-access of a symbol, like reading a variable.
    */
  @js.native
  sealed trait Read extends DocumentHighlightKind
  /* 1 */ val Read: typingsSlinky.vscode.mod.DocumentHighlightKind.Read with Double = js.native
  
  /**
    * A textual occurrence.
    */
  @js.native
  sealed trait Text extends DocumentHighlightKind
  /* 0 */ val Text: typingsSlinky.vscode.mod.DocumentHighlightKind.Text with Double = js.native
  
  /**
    * Write-access of a symbol, like writing to a variable.
    */
  @js.native
  sealed trait Write extends DocumentHighlightKind
  /* 2 */ val Write: typingsSlinky.vscode.mod.DocumentHighlightKind.Write with Double = js.native
}
