package typingsSlinky.winrtUwp.Windows.Networking.NetworkOperators

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the result of a mobile broadband PIN operation. */
@js.native
trait MobileBroadbandPinOperationResult extends js.Object {
  /** Gets the number of PIN entry attempts remaining until the mobile broadband PIN is blocked. */
  var attemptsRemaining: Double = js.native
  /** Gets a value indicating whether the PIN operation was successful. */
  var isSuccessful: Boolean = js.native
}

object MobileBroadbandPinOperationResult {
  @scala.inline
  def apply(attemptsRemaining: Double, isSuccessful: Boolean): MobileBroadbandPinOperationResult = {
    val __obj = js.Dynamic.literal(attemptsRemaining = attemptsRemaining.asInstanceOf[js.Any], isSuccessful = isSuccessful.asInstanceOf[js.Any])
    __obj.asInstanceOf[MobileBroadbandPinOperationResult]
  }
  @scala.inline
  implicit class MobileBroadbandPinOperationResultOps[Self <: MobileBroadbandPinOperationResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttemptsRemaining(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attemptsRemaining")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsSuccessful(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSuccessful")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

