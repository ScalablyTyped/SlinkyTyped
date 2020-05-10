package typingsSlinky.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtensionDailyStat extends js.Object {
  /**
    * Stores the event counts
    */
  var counts: EventCounts = js.native
  /**
    * Generic key/value pair to store extended statistics. Used for sending paid extension stats like Upgrade, Downgrade, Cancel trend etc.
    */
  var extendedStats: StringDictionary[js.Any] = js.native
  /**
    * Timestamp of this data point
    */
  var statisticDate: js.Date = js.native
  /**
    * Version of the extension
    */
  var version: String = js.native
}

object ExtensionDailyStat {
  @scala.inline
  def apply(
    counts: EventCounts,
    extendedStats: StringDictionary[js.Any],
    statisticDate: js.Date,
    version: String
  ): ExtensionDailyStat = {
    val __obj = js.Dynamic.literal(counts = counts.asInstanceOf[js.Any], extendedStats = extendedStats.asInstanceOf[js.Any], statisticDate = statisticDate.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionDailyStat]
  }
  @scala.inline
  implicit class ExtensionDailyStatOps[Self <: ExtensionDailyStat] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCounts(value: EventCounts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("counts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtendedStats(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extendedStats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatisticDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statisticDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

