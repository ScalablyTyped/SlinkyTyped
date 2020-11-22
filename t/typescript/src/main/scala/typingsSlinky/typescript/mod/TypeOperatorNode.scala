package typingsSlinky.typescript.mod

import typingsSlinky.typescript.mod.SyntaxKind.KeyOfKeyword
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
  val kind_TypeOperatorNode: TypeOperator = js.native
  
  val operator: KeyOfKeyword | UniqueKeyword | typingsSlinky.typescript.mod.SyntaxKind.ReadonlyKeyword = js.native
  
  val `type`: TypeNode = js.native
}
