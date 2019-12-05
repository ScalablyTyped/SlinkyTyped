package typingsSlinky.typescriptDashServices.typescriptDashServicesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "SyntaxTreeToAstVisitor")
@js.native
class SyntaxTreeToAstVisitor protected ()
  extends typingsSlinky.typescriptDashServices.TypeScript.SyntaxTreeToAstVisitor {
  def this(
    fileName: String,
    lineMap: typingsSlinky.typescriptDashServices.TypeScript.LineMap,
    compilationSettings: typingsSlinky.typescriptDashServices.TypeScript.ImmutableCompilationSettings
  ) = this()
}

/* static members */
@JSImport("typescript-services", "SyntaxTreeToAstVisitor")
@js.native
object SyntaxTreeToAstVisitor extends js.Object {
  def visit(
    syntaxTree: typingsSlinky.typescriptDashServices.TypeScript.SyntaxTree,
    fileName: String,
    compilationSettings: typingsSlinky.typescriptDashServices.TypeScript.ImmutableCompilationSettings,
    incrementalAST: Boolean
  ): typingsSlinky.typescriptDashServices.TypeScript.SourceUnit = js.native
}

