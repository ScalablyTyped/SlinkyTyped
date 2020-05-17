package typingsSlinky.winrtUwp.Windows.Networking.Connectivity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the current status information for the data plan associated with a connection. */
@js.native
trait DataPlanStatus extends js.Object {
  /** Gets a value indicating the maximum data transfer allowance for a connection within each billing cycle, as defined by the data plan. */
  var dataLimitInMegabytes: Double = js.native
  /** Gets a DataPlanUsage object that indicates the amount of data transferred over the connection, in megabytes, and the last time this value was refreshed. */
  var dataPlanUsage: DataPlanUsage = js.native
  /** Gets a value indicating the nominal rate of the inbound data transfer occurring on the connection. */
  var inboundBitsPerSecond: Double = js.native
  /** Gets a value indicates the maximum size of a transfer that is allowed without user consent on a metered network. */
  var maxTransferSizeInMegabytes: Double = js.native
  /** Gets a value indicating the date and time of the next billing cycle. */
  var nextBillingCycle: js.Date = js.native
  /** Gets a value indicating the nominal rate of the outbound data transfer. */
  var outboundBitsPerSecond: Double = js.native
}

object DataPlanStatus {
  @scala.inline
  def apply(
    dataLimitInMegabytes: Double,
    dataPlanUsage: DataPlanUsage,
    inboundBitsPerSecond: Double,
    maxTransferSizeInMegabytes: Double,
    nextBillingCycle: js.Date,
    outboundBitsPerSecond: Double
  ): DataPlanStatus = {
    val __obj = js.Dynamic.literal(dataLimitInMegabytes = dataLimitInMegabytes.asInstanceOf[js.Any], dataPlanUsage = dataPlanUsage.asInstanceOf[js.Any], inboundBitsPerSecond = inboundBitsPerSecond.asInstanceOf[js.Any], maxTransferSizeInMegabytes = maxTransferSizeInMegabytes.asInstanceOf[js.Any], nextBillingCycle = nextBillingCycle.asInstanceOf[js.Any], outboundBitsPerSecond = outboundBitsPerSecond.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataPlanStatus]
  }
  @scala.inline
  implicit class DataPlanStatusOps[Self <: DataPlanStatus] (val x: Self) extends AnyVal {
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

