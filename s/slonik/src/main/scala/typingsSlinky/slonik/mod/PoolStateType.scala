package typingsSlinky.slonik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PoolStateType extends js.Object {
  var activeConnectionCount: Double = js.native
  var ended: Boolean = js.native
  var idleConnectionCount: Double = js.native
  var waitingClientCount: Double = js.native
}

object PoolStateType {
  @scala.inline
  def apply(
    activeConnectionCount: Double,
    ended: Boolean,
    idleConnectionCount: Double,
    waitingClientCount: Double
  ): PoolStateType = {
    val __obj = js.Dynamic.literal(activeConnectionCount = activeConnectionCount.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], idleConnectionCount = idleConnectionCount.asInstanceOf[js.Any], waitingClientCount = waitingClientCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[PoolStateType]
  }
  @scala.inline
  implicit class PoolStateTypeOps[Self <: PoolStateType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveConnectionCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeConnectionCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ended")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIdleConnectionCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idleConnectionCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWaitingClientCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitingClientCount")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

