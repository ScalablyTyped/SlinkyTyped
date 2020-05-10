package typingsSlinky.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AggregatedResultsDifference extends js.Object {
  var increaseInDuration: js.Any = js.native
  var increaseInFailures: Double = js.native
  var increaseInOtherTests: Double = js.native
  var increaseInPassedTests: Double = js.native
  var increaseInTotalTests: Double = js.native
}

object AggregatedResultsDifference {
  @scala.inline
  def apply(
    increaseInDuration: js.Any,
    increaseInFailures: Double,
    increaseInOtherTests: Double,
    increaseInPassedTests: Double,
    increaseInTotalTests: Double
  ): AggregatedResultsDifference = {
    val __obj = js.Dynamic.literal(increaseInDuration = increaseInDuration.asInstanceOf[js.Any], increaseInFailures = increaseInFailures.asInstanceOf[js.Any], increaseInOtherTests = increaseInOtherTests.asInstanceOf[js.Any], increaseInPassedTests = increaseInPassedTests.asInstanceOf[js.Any], increaseInTotalTests = increaseInTotalTests.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregatedResultsDifference]
  }
  @scala.inline
  implicit class AggregatedResultsDifferenceOps[Self <: AggregatedResultsDifference] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIncreaseInDuration(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("increaseInDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncreaseInFailures(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("increaseInFailures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncreaseInOtherTests(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("increaseInOtherTests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncreaseInPassedTests(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("increaseInPassedTests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncreaseInTotalTests(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("increaseInTotalTests")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

