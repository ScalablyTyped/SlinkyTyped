package typingsSlinky.typescript.mod

import typingsSlinky.typescript.mod.SyntaxKind.ConstructorType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConstructorTypeNode
  extends FunctionOrConstructorTypeNodeBase
     with FunctionOrConstructorTypeNode
     with HasJSDoc
     with SignatureDeclaration {
  @JSName("kind")
  var kind_ConstructorTypeNode: ConstructorType = js.native
}

