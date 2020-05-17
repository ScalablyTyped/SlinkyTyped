package typingsSlinky.winrtUwp.Windows.System

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents app memory usage at a single point in time. */
@js.native
trait AppMemoryReport extends js.Object {
  /** Gets the app's peak usage of private commit. */
  var peakPrivateCommitUsage: Double = js.native
  /** Gets the app's usage of private commit. */
  var privateCommitUsage: Double = js.native
  /** Gets the app's total cap for private plus shared commit. */
  var totalCommitLimit: Double = js.native
  /** Gets the app's total usage of private plus shared commit. */
  var totalCommitUsage: Double = js.native
}

object AppMemoryReport {
  @scala.inline
  def apply(
    peakPrivateCommitUsage: Double,
    privateCommitUsage: Double,
    totalCommitLimit: Double,
    totalCommitUsage: Double
  ): AppMemoryReport = {
    val __obj = js.Dynamic.literal(peakPrivateCommitUsage = peakPrivateCommitUsage.asInstanceOf[js.Any], privateCommitUsage = privateCommitUsage.asInstanceOf[js.Any], totalCommitLimit = totalCommitLimit.asInstanceOf[js.Any], totalCommitUsage = totalCommitUsage.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppMemoryReport]
  }
  @scala.inline
  implicit class AppMemoryReportOps[Self <: AppMemoryReport] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPeakPrivateCommitUsage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peakPrivateCommitUsage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrivateCommitUsage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateCommitUsage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalCommitLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalCommitLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalCommitUsage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalCommitUsage")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

