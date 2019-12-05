package typingsSlinky.superstruct

import typingsSlinky.superstruct.libStructMod.Struct
import typingsSlinky.superstruct.libSuperstructMod.Superstruct
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("superstruct/lib/structs/record", JSImport.Namespace)
@js.native
object libStructsRecordMod extends js.Object {
  def createRecord(schema: js.Tuple2[_, _], defaults: js.Any, struct: Superstruct): Struct = js.native
}

