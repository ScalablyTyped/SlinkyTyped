package typingsSlinky.typescriptServices.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "SyntaxTree")
@js.native
class SyntaxTree protected ()
  extends typingsSlinky.typescriptServices.TypeScript.SyntaxTree {
  def this(
    sourceUnit: typingsSlinky.typescriptServices.TypeScript.SourceUnitSyntax,
    isDeclaration: Boolean,
    diagnostics: js.Array[typingsSlinky.typescriptServices.TypeScript.Diagnostic],
    fileName: String,
    lineMap: typingsSlinky.typescriptServices.TypeScript.LineMap,
    parseOtions: typingsSlinky.typescriptServices.TypeScript.ParseOptions
  ) = this()
}

