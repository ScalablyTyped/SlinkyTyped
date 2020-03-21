package typingsSlinky.typescriptServices.mod

import typingsSlinky.typescriptServices.TypeScript.ISimpleText
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "Parser")
@js.native
object Parser extends js.Object {
  def incrementalParse(
    oldSyntaxTree: typingsSlinky.typescriptServices.TypeScript.SyntaxTree,
    textChangeRange: typingsSlinky.typescriptServices.TypeScript.TextChangeRange,
    newText: ISimpleText
  ): typingsSlinky.typescriptServices.TypeScript.SyntaxTree = js.native
  def parse(
    fileName: String,
    text: ISimpleText,
    isDeclaration: Boolean,
    options: typingsSlinky.typescriptServices.TypeScript.ParseOptions
  ): typingsSlinky.typescriptServices.TypeScript.SyntaxTree = js.native
}

