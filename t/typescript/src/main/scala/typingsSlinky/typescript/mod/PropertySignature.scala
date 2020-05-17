package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropertySignature
  extends TypeElement
     with JSDocContainer
     with HasExpressionInitializer
     with HasJSDoc
     with HasType
     with VariableLikeDeclaration {
  var initializer: js.UndefOr[Expression] = js.native
  @JSName("kind")
  var kind_PropertySignature: typingsSlinky.typescript.mod.SyntaxKind.PropertySignature = js.native
  @JSName("name")
  var name_PropertySignature: PropertyName = js.native
  var `type`: js.UndefOr[TypeNode] = js.native
}

