package typingsSlinky.vsoNodeApi.galleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtensionDailyStats extends js.Object {
  /**
    * List of extension statistics data points
    */
  var dailyStats: js.Array[ExtensionDailyStat] = js.native
  /**
    * Id of the extension, this will never be sent back to the client. For internal use only.
    */
  var extensionId: String = js.native
  /**
    * Name of the extension
    */
  var extensionName: String = js.native
  /**
    * Name of the publisher
    */
  var publisherName: String = js.native
  /**
    * Count of stats
    */
  var statCount: Double = js.native
}

object ExtensionDailyStats {
  @scala.inline
  def apply(
    dailyStats: js.Array[ExtensionDailyStat],
    extensionId: String,
    extensionName: String,
    publisherName: String,
    statCount: Double
  ): ExtensionDailyStats = {
    val __obj = js.Dynamic.literal(dailyStats = dailyStats.asInstanceOf[js.Any], extensionId = extensionId.asInstanceOf[js.Any], extensionName = extensionName.asInstanceOf[js.Any], publisherName = publisherName.asInstanceOf[js.Any], statCount = statCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionDailyStats]
  }
  @scala.inline
  implicit class ExtensionDailyStatsOps[Self <: ExtensionDailyStats] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDailyStats(value: js.Array[ExtensionDailyStat]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dailyStats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtensionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtensionName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublisherName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publisherName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statCount")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

