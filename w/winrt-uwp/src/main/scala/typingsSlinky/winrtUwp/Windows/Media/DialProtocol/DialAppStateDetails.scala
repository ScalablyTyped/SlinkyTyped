package typingsSlinky.winrtUwp.Windows.Media.DialProtocol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the state of the DIAL app. */
@js.native
trait DialAppStateDetails extends js.Object {
  /** Gets the entire XML response that is provided by the app when state of the app was requested. */
  var fullXml: String = js.native
  /** Gets the state of the application at the time the GetAppStateAsync was completed. */
  var state: DialAppState = js.native
}

object DialAppStateDetails {
  @scala.inline
  def apply(fullXml: String, state: DialAppState): DialAppStateDetails = {
    val __obj = js.Dynamic.literal(fullXml = fullXml.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialAppStateDetails]
  }
  @scala.inline
  implicit class DialAppStateDetailsOps[Self <: DialAppStateDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFullXml(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullXml")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: DialAppState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

