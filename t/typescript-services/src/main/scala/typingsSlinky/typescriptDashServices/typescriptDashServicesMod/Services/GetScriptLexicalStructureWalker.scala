package typingsSlinky.typescriptDashServices.typescriptDashServicesMod.Services

import typingsSlinky.typescriptDashServices.TypeScript.SourceUnitSyntax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "Services.GetScriptLexicalStructureWalker")
@js.native
class GetScriptLexicalStructureWalker protected ()
  extends typingsSlinky.typescriptDashServices.TypeScript.Services.GetScriptLexicalStructureWalker {
  def this(fileName: String) = this()
}

/* static members */
@JSImport("typescript-services", "Services.GetScriptLexicalStructureWalker")
@js.native
object GetScriptLexicalStructureWalker extends js.Object {
  def getListsOfAllScriptLexicalStructure(
    items: js.Array[typingsSlinky.typescriptDashServices.TypeScript.Services.NavigateToItem],
    fileName: String,
    unit: SourceUnitSyntax
  ): Unit = js.native
}

