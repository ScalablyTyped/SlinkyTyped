package typingsSlinky.winrtUwp

import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typingsSlinky.winrtUwp.Windows.Foundation.Numerics.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonResults extends js.Object {
  /** A set of coordinates, relative to the coordinate system of the camera device and with correlated depth values. */ var results: Vector3 = js.native
  /** This method returns asynchronously. */ var returnValue: IPromiseWithIAsyncAction = js.native
}

object AnonResults {
  @scala.inline
  def apply(results: Vector3, returnValue: IPromiseWithIAsyncAction): AnonResults = {
    val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonResults]
  }
  @scala.inline
  implicit class AnonResultsOps[Self <: AnonResults] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResults(value: Vector3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("results")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReturnValue(value: IPromiseWithIAsyncAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnValue")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

