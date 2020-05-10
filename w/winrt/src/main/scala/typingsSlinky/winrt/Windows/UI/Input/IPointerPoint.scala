package typingsSlinky.winrt.Windows.UI.Input

import typingsSlinky.winrt.Windows.Devices.Input.PointerDevice
import typingsSlinky.winrt.Windows.Foundation.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPointerPoint extends js.Object {
  var frameId: Double = js.native
  var isInContact: Boolean = js.native
  var pointerDevice: PointerDevice = js.native
  var pointerId: Double = js.native
  var position: Point = js.native
  var properties: PointerPointProperties = js.native
  var rawPosition: Point = js.native
  var timestamp: Double = js.native
}

object IPointerPoint {
  @scala.inline
  def apply(
    frameId: Double,
    isInContact: Boolean,
    pointerDevice: PointerDevice,
    pointerId: Double,
    position: Point,
    properties: PointerPointProperties,
    rawPosition: Point,
    timestamp: Double
  ): IPointerPoint = {
    val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any], isInContact = isInContact.asInstanceOf[js.Any], pointerDevice = pointerDevice.asInstanceOf[js.Any], pointerId = pointerId.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], rawPosition = rawPosition.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPointerPoint]
  }
  @scala.inline
  implicit class IPointerPointOps[Self <: IPointerPoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFrameId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsInContact(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInContact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPointerDevice(value: PointerDevice): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointerDevice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPointerId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProperties(value: PointerPointProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRawPosition(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimestamp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

