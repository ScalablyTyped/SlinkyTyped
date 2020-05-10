package typingsSlinky.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModuleCoverage extends js.Object {
  var blockCount: Double = js.native
  var blockData: js.Array[Double] = js.native
  var functions: js.Array[FunctionCoverage] = js.native
  var name: String = js.native
  var signature: String = js.native
  var signatureAge: Double = js.native
  var statistics: CoverageStatistics = js.native
}

object ModuleCoverage {
  @scala.inline
  def apply(
    blockCount: Double,
    blockData: js.Array[Double],
    functions: js.Array[FunctionCoverage],
    name: String,
    signature: String,
    signatureAge: Double,
    statistics: CoverageStatistics
  ): ModuleCoverage = {
    val __obj = js.Dynamic.literal(blockCount = blockCount.asInstanceOf[js.Any], blockData = blockData.asInstanceOf[js.Any], functions = functions.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any], signatureAge = signatureAge.asInstanceOf[js.Any], statistics = statistics.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleCoverage]
  }
  @scala.inline
  implicit class ModuleCoverageOps[Self <: ModuleCoverage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlockCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlockData(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFunctions(value: js.Array[FunctionCoverage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("functions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSignature(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSignatureAge(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signatureAge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatistics(value: CoverageStatistics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statistics")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

