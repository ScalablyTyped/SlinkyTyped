package typingsSlinky.typescriptServices.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
object SyntaxTreeToAstVisitor {
  
  /* static member */
  @JSImport("typescript-services", "SyntaxTreeToAstVisitor.visit")
  @js.native
  def visit(
    syntaxTree: typingsSlinky.typescriptServices.TypeScript.SyntaxTree,
    fileName: String,
    compilationSettings: typingsSlinky.typescriptServices.TypeScript.ImmutableCompilationSettings,
    incrementalAST: Boolean
  ): typingsSlinky.typescriptServices.TypeScript.SourceUnit = js.native
}
