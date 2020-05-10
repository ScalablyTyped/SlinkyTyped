package typingsSlinky.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CoverageStatistics extends js.Object {
  var blocksCovered: Double = js.native
  var blocksNotCovered: Double = js.native
  var linesCovered: Double = js.native
  var linesNotCovered: Double = js.native
  var linesPartiallyCovered: Double = js.native
}

object CoverageStatistics {
  @scala.inline
  def apply(
    blocksCovered: Double,
    blocksNotCovered: Double,
    linesCovered: Double,
    linesNotCovered: Double,
    linesPartiallyCovered: Double
  ): CoverageStatistics = {
    val __obj = js.Dynamic.literal(blocksCovered = blocksCovered.asInstanceOf[js.Any], blocksNotCovered = blocksNotCovered.asInstanceOf[js.Any], linesCovered = linesCovered.asInstanceOf[js.Any], linesNotCovered = linesNotCovered.asInstanceOf[js.Any], linesPartiallyCovered = linesPartiallyCovered.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoverageStatistics]
  }
  @scala.inline
  implicit class CoverageStatisticsOps[Self <: CoverageStatistics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlocksCovered(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blocksCovered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlocksNotCovered(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blocksNotCovered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinesCovered(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linesCovered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinesNotCovered(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linesNotCovered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinesPartiallyCovered(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linesPartiallyCovered")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

