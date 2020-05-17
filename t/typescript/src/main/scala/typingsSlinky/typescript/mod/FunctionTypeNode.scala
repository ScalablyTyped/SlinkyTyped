package typingsSlinky.typescript.mod

import typingsSlinky.typescript.mod.SyntaxKind.FunctionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FunctionTypeNode
  extends FunctionOrConstructorTypeNodeBase
     with FunctionOrConstructorTypeNode
     with HasJSDoc
     with SignatureDeclaration {
  @JSName("kind")
  var kind_FunctionTypeNode: FunctionType = js.native
}

