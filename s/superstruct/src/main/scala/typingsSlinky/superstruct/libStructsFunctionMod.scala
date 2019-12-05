package typingsSlinky.superstruct

import typingsSlinky.superstruct.libStructMod.Struct
import typingsSlinky.superstruct.libSuperstructMod.Superstruct
import typingsSlinky.superstruct.libTypesMod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("superstruct/lib/structs/function", JSImport.Namespace)
@js.native
object libStructsFunctionMod extends js.Object {
  def createFunction(schema: Validator, defaults: js.Any, struct: Superstruct): Struct = js.native
}

