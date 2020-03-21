package typingsSlinky.wonderFrp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "Record")
@js.native
class Record protected ()
  extends typingsSlinky.wonderFrp.recordMod.Record {
  def this(
    time: js.Any,
    value: js.Any,
    actionType: typingsSlinky.wonderFrp.actionTypeMod.ActionType,
    comparer: js.Function
  ) = this()
}

/* static members */
@JSImport("wonder-frp/dist/commonjs", "Record")
@js.native
object Record extends js.Object {
  def create(time: Double, value: js.Any): typingsSlinky.wonderFrp.recordMod.Record = js.native
  def create(time: Double, value: js.Any, actionType: typingsSlinky.wonderFrp.actionTypeMod.ActionType): typingsSlinky.wonderFrp.recordMod.Record = js.native
  def create(
    time: Double,
    value: js.Any,
    actionType: typingsSlinky.wonderFrp.actionTypeMod.ActionType,
    comparer: js.Function
  ): typingsSlinky.wonderFrp.recordMod.Record = js.native
}

