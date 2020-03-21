package typingsSlinky.superstruct

import typingsSlinky.superstruct.structErrorMod.Branch
import typingsSlinky.superstruct.structErrorMod.Path
import typingsSlinky.superstruct.structMod.Struct
import typingsSlinky.superstruct.superstructMod.Superstruct_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("superstruct/lib/structs/dynamic", JSImport.Namespace)
@js.native
object dynamicMod extends js.Object {
  def createDynamic(
    schema: js.Function3[/* value */ js.Any, /* branch */ Branch, /* path */ Path, Struct],
    defaults: js.Any,
    struct: Superstruct_
  ): Struct = js.native
}

