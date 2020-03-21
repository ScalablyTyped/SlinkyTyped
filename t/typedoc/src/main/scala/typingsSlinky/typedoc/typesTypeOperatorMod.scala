package typingsSlinky.typedoc

import typingsSlinky.typedoc.typedocStrings.keyof
import typingsSlinky.typedoc.typesAbstractMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/models/types/type-operator", JSImport.Namespace)
@js.native
object typesTypeOperatorMod extends js.Object {
  @js.native
  class TypeOperatorType protected () extends Type {
    def this(target: Type) = this()
    val operator: keyof = js.native
    var target: Type = js.native
    def equals(`type`: TypeOperatorType): Boolean = js.native
  }
  
}

