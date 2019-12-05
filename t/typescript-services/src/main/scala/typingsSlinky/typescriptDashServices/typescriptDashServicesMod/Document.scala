package typingsSlinky.typescriptDashServices.typescriptDashServicesMod

import typingsSlinky.typescriptDashServices.TypeScript.IScriptSnapshot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "Document")
@js.native
class Document protected ()
  extends typingsSlinky.typescriptDashServices.TypeScript.Document {
  def this(
    _compiler: typingsSlinky.typescriptDashServices.TypeScript.TypeScriptCompiler,
    _semanticInfoChain: typingsSlinky.typescriptDashServices.TypeScript.SemanticInfoChain,
    fileName: String,
    referencedFiles: js.Array[String],
    _scriptSnapshot: IScriptSnapshot,
    byteOrderMark: typingsSlinky.typescriptDashServices.TypeScript.ByteOrderMark,
    version: Double,
    isOpen: Boolean,
    _syntaxTree: typingsSlinky.typescriptDashServices.TypeScript.SyntaxTree,
    _topLevelDecl: typingsSlinky.typescriptDashServices.TypeScript.PullDecl
  ) = this()
}

/* static members */
@JSImport("typescript-services", "Document")
@js.native
object Document extends js.Object {
  def create(
    compiler: typingsSlinky.typescriptDashServices.TypeScript.TypeScriptCompiler,
    semanticInfoChain: typingsSlinky.typescriptDashServices.TypeScript.SemanticInfoChain,
    fileName: String,
    scriptSnapshot: IScriptSnapshot,
    byteOrderMark: typingsSlinky.typescriptDashServices.TypeScript.ByteOrderMark,
    version: Double,
    isOpen: Boolean,
    referencedFiles: js.Array[String]
  ): typingsSlinky.typescriptDashServices.TypeScript.Document = js.native
}

