package typingsSlinky.typeFest

import typingsSlinky.typeFest.anon._empty
import typingsSlinky.typeFest.basicMod.Primitive
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("type-fest/source/literal-union", JSImport.Namespace)
@js.native
object literalUnionMod extends js.Object {
  type LiteralUnion[LiteralType /* <: BaseType */, BaseType /* <: Primitive */] = LiteralType | (BaseType with _empty)
}

