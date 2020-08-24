package typingsSlinky.typedoc.mod.TypeScript

import typingsSlinky.typescript.mod.Identifier
import typingsSlinky.typescript.mod.ThisTypeNode
import typingsSlinky.typescript.mod.TypeNode
import typingsSlinky.typescript.mod.TypePredicateNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.createTypePredicateNode")
@js.native
object createTypePredicateNode extends js.Object {
  def apply(parameterName: String, `type`: TypeNode): TypePredicateNode = js.native
  def apply(parameterName: Identifier, `type`: TypeNode): TypePredicateNode = js.native
  def apply(parameterName: ThisTypeNode, `type`: TypeNode): TypePredicateNode = js.native
}

