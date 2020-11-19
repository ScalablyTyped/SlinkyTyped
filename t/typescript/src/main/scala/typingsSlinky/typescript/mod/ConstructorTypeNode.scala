package typingsSlinky.typescript.mod

import typingsSlinky.typescript.mod.SyntaxKind.ConstructorType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConstructorTypeNode
  extends FunctionOrConstructorTypeNodeBase
     with FunctionOrConstructorTypeNode
     with SignatureDeclaration
     with _HasJSDoc {
  
  @JSName("kind")
  var kind_ConstructorTypeNode: ConstructorType = js.native
}
