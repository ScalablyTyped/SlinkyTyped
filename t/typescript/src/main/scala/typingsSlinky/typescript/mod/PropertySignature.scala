package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PropertySignature
  extends TypeElement
     with JSDocContainer
     with HasExpressionInitializer
     with HasType
     with VariableLikeDeclaration
     with _HasJSDoc {
  
  var initializer: js.UndefOr[Expression] = js.native
  
  @JSName("kind")
  var kind_PropertySignature: typingsSlinky.typescript.mod.SyntaxKind.PropertySignature = js.native
  
  @JSName("name")
  var name_PropertySignature: PropertyName = js.native
  
  var `type`: js.UndefOr[TypeNode] = js.native
}
