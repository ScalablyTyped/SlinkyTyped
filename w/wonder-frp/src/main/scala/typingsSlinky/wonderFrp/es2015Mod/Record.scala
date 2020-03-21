package typingsSlinky.wonderFrp.es2015Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015", "Record")
@js.native
class Record protected ()
  extends typingsSlinky.wonderFrp.testingRecordMod.Record {
  def this(
    time: js.Any,
    value: js.Any,
    actionType: typingsSlinky.wonderFrp.testingActionTypeMod.ActionType,
    comparer: js.Function
  ) = this()
}

/* static members */
@JSImport("wonder-frp/dist/es2015", "Record")
@js.native
object Record extends js.Object {
  def create(time: Double, value: js.Any): typingsSlinky.wonderFrp.testingRecordMod.Record = js.native
  def create(time: Double, value: js.Any, actionType: typingsSlinky.wonderFrp.testingActionTypeMod.ActionType): typingsSlinky.wonderFrp.testingRecordMod.Record = js.native
  def create(
    time: Double,
    value: js.Any,
    actionType: typingsSlinky.wonderFrp.testingActionTypeMod.ActionType,
    comparer: js.Function
  ): typingsSlinky.wonderFrp.testingRecordMod.Record = js.native
}

