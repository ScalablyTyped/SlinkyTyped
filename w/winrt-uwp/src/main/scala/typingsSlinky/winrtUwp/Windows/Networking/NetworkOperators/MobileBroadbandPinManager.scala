package typingsSlinky.winrtUwp.Windows.Networking.NetworkOperators

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines the PIN manager for a given mobile broadband modem and SIM Card. */
@js.native
trait MobileBroadbandPinManager extends js.Object {
  /** Gets a list of the supported PIN types for the mobile broadband modem and SIM Card. */
  var supportedPins: IVectorView[MobileBroadbandPinType] = js.native
  /**
    * Gets the mobile broadband PIN of a specific PIN type.
    * @param pinType The mobile broadband PIN type.
    * @return The mobile broadband PIN returned. This value is either provided by the end user or from a cache if allowed. .
    */
  def getPin(pinType: MobileBroadbandPinType): MobileBroadbandPin = js.native
}

object MobileBroadbandPinManager {
  @scala.inline
  def apply(
    getPin: MobileBroadbandPinType => MobileBroadbandPin,
    supportedPins: IVectorView[MobileBroadbandPinType]
  ): MobileBroadbandPinManager = {
    val __obj = js.Dynamic.literal(getPin = js.Any.fromFunction1(getPin), supportedPins = supportedPins.asInstanceOf[js.Any])
    __obj.asInstanceOf[MobileBroadbandPinManager]
  }
  @scala.inline
  implicit class MobileBroadbandPinManagerOps[Self <: MobileBroadbandPinManager] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetPin(value: MobileBroadbandPinType => MobileBroadbandPin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPin")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSupportedPins(value: IVectorView[MobileBroadbandPinType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportedPins")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

