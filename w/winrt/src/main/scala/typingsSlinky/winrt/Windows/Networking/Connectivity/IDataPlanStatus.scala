package typingsSlinky.winrt.Windows.Networking.Connectivity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDataPlanStatus extends js.Object {
  var dataLimitInMegabytes: Double = js.native
  var dataPlanUsage: DataPlanUsage = js.native
  var inboundBitsPerSecond: Double = js.native
  var maxTransferSizeInMegabytes: Double = js.native
  var nextBillingCycle: js.Date = js.native
  var outboundBitsPerSecond: Double = js.native
}

object IDataPlanStatus {
  @scala.inline
  def apply(
    dataLimitInMegabytes: Double,
    dataPlanUsage: DataPlanUsage,
    inboundBitsPerSecond: Double,
    maxTransferSizeInMegabytes: Double,
    nextBillingCycle: js.Date,
    outboundBitsPerSecond: Double
  ): IDataPlanStatus = {
    val __obj = js.Dynamic.literal(dataLimitInMegabytes = dataLimitInMegabytes.asInstanceOf[js.Any], dataPlanUsage = dataPlanUsage.asInstanceOf[js.Any], inboundBitsPerSecond = inboundBitsPerSecond.asInstanceOf[js.Any], maxTransferSizeInMegabytes = maxTransferSizeInMegabytes.asInstanceOf[js.Any], nextBillingCycle = nextBillingCycle.asInstanceOf[js.Any], outboundBitsPerSecond = outboundBitsPerSecond.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDataPlanStatus]
  }
  @scala.inline
  implicit class IDataPlanStatusOps[Self <: IDataPlanStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataLimitInMegabytes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataLimitInMegabytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataPlanUsage(value: DataPlanUsage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataPlanUsage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInboundBitsPerSecond(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inboundBitsPerSecond")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxTransferSizeInMegabytes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTransferSizeInMegabytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextBillingCycle(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextBillingCycle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutboundBitsPerSecond(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outboundBitsPerSecond")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

