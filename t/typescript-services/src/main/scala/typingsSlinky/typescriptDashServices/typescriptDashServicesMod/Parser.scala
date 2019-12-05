package typingsSlinky.typescriptDashServices.typescriptDashServicesMod

import typingsSlinky.typescriptDashServices.TypeScript.ISimpleText
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "Parser")
@js.native
object Parser extends js.Object {
  def incrementalParse(
    oldSyntaxTree: typingsSlinky.typescriptDashServices.TypeScript.SyntaxTree,
    textChangeRange: typingsSlinky.typescriptDashServices.TypeScript.TextChangeRange,
    newText: ISimpleText
  ): typingsSlinky.typescriptDashServices.TypeScript.SyntaxTree = js.native
  def parse(
    fileName: String,
    text: ISimpleText,
    isDeclaration: Boolean,
    options: typingsSlinky.typescriptDashServices.TypeScript.ParseOptions
  ): typingsSlinky.typescriptDashServices.TypeScript.SyntaxTree = js.native
}

