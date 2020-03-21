package typingsSlinky.wonderFrp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "Operator")
@js.native
class Operator ()
  extends typingsSlinky.wonderFrp.operatorMod.Operator

/* static members */
@JSImport("wonder-frp/dist/commonjs", "Operator")
@js.native
object Operator extends js.Object {
  def createStream(subscribeFunc: js.Any): typingsSlinky.wonderFrp.anonymousStreamMod.AnonymousStream = js.native
  def empty(): typingsSlinky.wonderFrp.anonymousStreamMod.AnonymousStream = js.native
  def fromArray(array: js.Array[_]): typingsSlinky.wonderFrp.fromArrayStreamMod.FromArrayStream = js.native
  def fromArray(array: js.Array[_], scheduler: typingsSlinky.wonderFrp.schedulerMod.Scheduler): typingsSlinky.wonderFrp.fromArrayStreamMod.FromArrayStream = js.native
}

