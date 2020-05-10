package typingsSlinky.winrtUwp

import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typingsSlinky.winrtUwp.Windows.Foundation.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonTargetCoordinates extends js.Object {
  /** This function returns asynchronously. */ var returnValue: IPromiseWithIAsyncAction = js.native
  /** The pixel coordinates, mapped to depth image space. */ var targetCoordinates: Point = js.native
}

object AnonTargetCoordinates {
  @scala.inline
  def apply(returnValue: IPromiseWithIAsyncAction, targetCoordinates: Point): AnonTargetCoordinates = {
    val __obj = js.Dynamic.literal(returnValue = returnValue.asInstanceOf[js.Any], targetCoordinates = targetCoordinates.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTargetCoordinates]
  }
  @scala.inline
  implicit class AnonTargetCoordinatesOps[Self <: AnonTargetCoordinates] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReturnValue(value: IPromiseWithIAsyncAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetCoordinates(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetCoordinates")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

