package typingsSlinky.web3Eth.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Syncing extends js.Object {
  var CurrentBlock: Double = js.native
  var HighestBlock: Double = js.native
  var KnownStates: Double = js.native
  var PulledStates: Double = js.native
  var StartingBlock: Double = js.native
}

object Syncing {
  @scala.inline
  def apply(
    CurrentBlock: Double,
    HighestBlock: Double,
    KnownStates: Double,
    PulledStates: Double,
    StartingBlock: Double
  ): Syncing = {
    val __obj = js.Dynamic.literal(CurrentBlock = CurrentBlock.asInstanceOf[js.Any], HighestBlock = HighestBlock.asInstanceOf[js.Any], KnownStates = KnownStates.asInstanceOf[js.Any], PulledStates = PulledStates.asInstanceOf[js.Any], StartingBlock = StartingBlock.asInstanceOf[js.Any])
    __obj.asInstanceOf[Syncing]
  }
  @scala.inline
  implicit class SyncingOps[Self <: Syncing] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentBlock(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentBlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHighestBlock(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HighestBlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKnownStates(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KnownStates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPulledStates(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PulledStates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartingBlock(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartingBlock")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

