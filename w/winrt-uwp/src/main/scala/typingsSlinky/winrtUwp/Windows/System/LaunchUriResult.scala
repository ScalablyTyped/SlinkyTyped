package typingsSlinky.winrtUwp.Windows.System

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.ValueSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the results of a Uri launch. */
@js.native
trait LaunchUriResult extends js.Object {
  /** Gets the result of the Uri launch. */
  var result: ValueSet = js.native
  /** Gets the status of the Uri launch. */
  var status: LaunchUriStatus = js.native
}

object LaunchUriResult {
  @scala.inline
  def apply(result: ValueSet, status: LaunchUriStatus): LaunchUriResult = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchUriResult]
  }
  @scala.inline
  implicit class LaunchUriResultOps[Self <: LaunchUriResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResult(value: ValueSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: LaunchUriStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

