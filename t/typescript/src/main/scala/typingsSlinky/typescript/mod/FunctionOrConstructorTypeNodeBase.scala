package typingsSlinky.typescript.mod

import typingsSlinky.typescript.mod.SyntaxKind.ConstructorType
import typingsSlinky.typescript.mod.SyntaxKind.FunctionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FunctionOrConstructorTypeNodeBase
  extends SignatureDeclarationBase
     with TypeNode {
  
  @JSName("kind")
  val kind_FunctionOrConstructorTypeNodeBase: FunctionType | ConstructorType = js.native
  
  @JSName("type")
  val type_FunctionOrConstructorTypeNodeBase: TypeNode = js.native
}
