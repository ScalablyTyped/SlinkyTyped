package typingsSlinky.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CodeCoverageStatistics extends js.Object {
  /**
    * Covered units
    */
  var covered: Double = js.native
  /**
    * Delta of coverage
    */
  var delta: Double = js.native
  /**
    * Is delta valid
    */
  var isDeltaAvailable: Boolean = js.native
  /**
    * Label of coverage data ("Blocks", "Statements", "Modules", etc.)
    */
  var label: String = js.native
  /**
    * Position of label
    */
  var position: Double = js.native
  /**
    * Total units
    */
  var total: Double = js.native
}

object CodeCoverageStatistics {
  @scala.inline
  def apply(
    covered: Double,
    delta: Double,
    isDeltaAvailable: Boolean,
    label: String,
    position: Double,
    total: Double
  ): CodeCoverageStatistics = {
    val __obj = js.Dynamic.literal(covered = covered.asInstanceOf[js.Any], delta = delta.asInstanceOf[js.Any], isDeltaAvailable = isDeltaAvailable.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeCoverageStatistics]
  }
  @scala.inline
  implicit class CodeCoverageStatisticsOps[Self <: CodeCoverageStatistics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCovered(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("covered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelta(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsDeltaAvailable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDeltaAvailable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

