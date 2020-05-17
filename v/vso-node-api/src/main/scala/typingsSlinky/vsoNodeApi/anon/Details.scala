package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Details extends js.Object {
  var all: scala.Double = js.native
  var details: scala.Double = js.native
  var dropLocation: scala.Double = js.native
  var label: scala.Double = js.native
  var none: scala.Double = js.native
  var symbols: scala.Double = js.native
  var testResults: scala.Double = js.native
}

object Details {
  @scala.inline
  def apply(
    all: scala.Double,
    details: scala.Double,
    dropLocation: scala.Double,
    label: scala.Double,
    none: scala.Double,
    symbols: scala.Double,
    testResults: scala.Double
  ): Details = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], dropLocation = dropLocation.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], symbols = symbols.asInstanceOf[js.Any], testResults = testResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[Details]
  }
  @scala.inline
  implicit class DetailsOps[Self <: Details] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAll(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("all")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDetails(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("details")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDropLocation(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNone(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSymbols(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbols")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTestResults(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testResults")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

