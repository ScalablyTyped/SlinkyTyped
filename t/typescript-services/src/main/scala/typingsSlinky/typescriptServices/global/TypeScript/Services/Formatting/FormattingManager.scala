package typingsSlinky.typescriptServices.global.TypeScript.Services.Formatting

import typingsSlinky.typescriptServices.TypeScript.Services.EditorOptions
import typingsSlinky.typescriptServices.TypeScript.Services.Formatting.ITextSnapshot
import typingsSlinky.typescriptServices.TypeScript.SyntaxTree
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.Services.Formatting.FormattingManager")
@js.native
class FormattingManager protected ()
  extends typingsSlinky.typescriptServices.TypeScript.Services.Formatting.FormattingManager {
  def this(
    syntaxTree: SyntaxTree,
    snapshot: ITextSnapshot,
    rulesProvider: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.RulesProvider,
    editorOptions: EditorOptions
  ) = this()
}
