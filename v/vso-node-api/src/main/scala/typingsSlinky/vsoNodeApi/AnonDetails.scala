package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDetails extends js.Object {
  var all: Double = js.native
  var details: Double = js.native
  var dropLocation: Double = js.native
  var label: Double = js.native
  var none: Double = js.native
  var symbols: Double = js.native
  var testResults: Double = js.native
}

object AnonDetails {
  @scala.inline
  def apply(
    all: Double,
    details: Double,
    dropLocation: Double,
    label: Double,
    none: Double,
    symbols: Double,
    testResults: Double
  ): AnonDetails = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], dropLocation = dropLocation.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], symbols = symbols.asInstanceOf[js.Any], testResults = testResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDetails]
  }
  @scala.inline
  implicit class AnonDetailsOps[Self <: AnonDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAll(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("all")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDetails(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("details")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDropLocation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNone(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSymbols(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbols")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTestResults(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testResults")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

