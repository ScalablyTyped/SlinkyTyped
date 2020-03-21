package typingsSlinky.typescriptServices.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "SyntaxTreeToAstVisitor")
@js.native
class SyntaxTreeToAstVisitor protected ()
  extends typingsSlinky.typescriptServices.TypeScript.SyntaxTreeToAstVisitor {
  def this(
    fileName: String,
    lineMap: typingsSlinky.typescriptServices.TypeScript.LineMap,
    compilationSettings: typingsSlinky.typescriptServices.TypeScript.ImmutableCompilationSettings
  ) = this()
}

/* static members */
@JSImport("typescript-services", "SyntaxTreeToAstVisitor")
@js.native
object SyntaxTreeToAstVisitor extends js.Object {
  def visit(
    syntaxTree: typingsSlinky.typescriptServices.TypeScript.SyntaxTree,
    fileName: String,
    compilationSettings: typingsSlinky.typescriptServices.TypeScript.ImmutableCompilationSettings,
    incrementalAST: Boolean
  ): typingsSlinky.typescriptServices.TypeScript.SourceUnit = js.native
}

