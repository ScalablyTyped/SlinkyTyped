package typingsSlinky.typescriptServices.mod

import typingsSlinky.typescriptServices.TypeScript.IScriptSnapshot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "Document")
@js.native
class Document protected ()
  extends typingsSlinky.typescriptServices.TypeScript.Document {
  def this(
    _compiler: typingsSlinky.typescriptServices.TypeScript.TypeScriptCompiler,
    _semanticInfoChain: typingsSlinky.typescriptServices.TypeScript.SemanticInfoChain,
    fileName: String,
    referencedFiles: js.Array[String],
    _scriptSnapshot: IScriptSnapshot,
    byteOrderMark: typingsSlinky.typescriptServices.TypeScript.ByteOrderMark,
    version: Double,
    isOpen: Boolean,
    _syntaxTree: typingsSlinky.typescriptServices.TypeScript.SyntaxTree,
    _topLevelDecl: typingsSlinky.typescriptServices.TypeScript.PullDecl
  ) = this()
}
object Document {
  
  /* static member */
  @JSImport("typescript-services", "Document.create")
  @js.native
  def create(
    compiler: typingsSlinky.typescriptServices.TypeScript.TypeScriptCompiler,
    semanticInfoChain: typingsSlinky.typescriptServices.TypeScript.SemanticInfoChain,
    fileName: String,
    scriptSnapshot: IScriptSnapshot,
    byteOrderMark: typingsSlinky.typescriptServices.TypeScript.ByteOrderMark,
    version: Double,
    isOpen: Boolean,
    referencedFiles: js.Array[String]
  ): typingsSlinky.typescriptServices.TypeScript.Document = js.native
}
