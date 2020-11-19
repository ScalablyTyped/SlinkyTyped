package typingsSlinky.typescript.mod

import typingsSlinky.typescript.mod.SyntaxKind.KeyOfKeyword
import typingsSlinky.typescript.mod.SyntaxKind.ReadonlyKeyword
import typingsSlinky.typescript.mod.SyntaxKind.TypeOperator
import typingsSlinky.typescript.mod.SyntaxKind.UniqueKeyword
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeOperatorNode
  extends TypeNode
     with HasType {
  
  @JSName("kind")
  var kind_TypeOperatorNode: TypeOperator = js.native
  
  var operator: KeyOfKeyword | UniqueKeyword | ReadonlyKeyword = js.native
  
  var `type`: TypeNode = js.native
}
