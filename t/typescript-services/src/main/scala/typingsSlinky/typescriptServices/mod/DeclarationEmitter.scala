package typingsSlinky.typescriptServices.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "DeclarationEmitter")
@js.native
class DeclarationEmitter protected ()
  extends typingsSlinky.typescriptServices.TypeScript.DeclarationEmitter {
  def this(
    emittingFileName: String,
    document: typingsSlinky.typescriptServices.TypeScript.Document,
    compiler: typingsSlinky.typescriptServices.TypeScript.TypeScriptCompiler,
    emitOptions: typingsSlinky.typescriptServices.TypeScript.EmitOptions,
    semanticInfoChain: typingsSlinky.typescriptServices.TypeScript.SemanticInfoChain
  ) = this()
}
/* static members */
@JSImport("typescript-services", "DeclarationEmitter")
@js.native
object DeclarationEmitter extends js.Object {
  
  def getEnclosingContainer(ast: typingsSlinky.typescriptServices.TypeScript.AST): typingsSlinky.typescriptServices.TypeScript.AST = js.native
}
