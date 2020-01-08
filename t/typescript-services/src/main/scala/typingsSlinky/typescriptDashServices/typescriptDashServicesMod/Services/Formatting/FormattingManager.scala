package typingsSlinky.typescriptDashServices.typescriptDashServicesMod.Services.Formatting

import typingsSlinky.typescriptDashServices.TypeScript.Services.EditorOptions
import typingsSlinky.typescriptDashServices.TypeScript.Services.Formatting.ITextSnapshot
import typingsSlinky.typescriptDashServices.TypeScript.SyntaxTree
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "Services.Formatting.FormattingManager")
@js.native
class FormattingManager protected ()
  extends typingsSlinky.typescriptDashServices.TypeScript.Services.Formatting.FormattingManager {
  def this(
    syntaxTree: SyntaxTree,
    snapshot: ITextSnapshot,
    rulesProvider: typingsSlinky.typescriptDashServices.TypeScript.Services.Formatting.RulesProvider,
    editorOptions: EditorOptions
  ) = this()
}

