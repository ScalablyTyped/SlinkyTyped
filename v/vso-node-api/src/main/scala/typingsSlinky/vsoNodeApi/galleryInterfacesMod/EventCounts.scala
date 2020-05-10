package typingsSlinky.vsoNodeApi.galleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventCounts extends js.Object {
  /**
    * Average rating on the day for extension
    */
  var averageRating: Double = js.native
  /**
    * Number of times the extension was bought in hosted scenario (applies only to VSTS extensions)
    */
  var buyCount: Double = js.native
  /**
    * Number of times the extension was bought in connected scenario (applies only to VSTS extensions)
    */
  var connectedBuyCount: Double = js.native
  /**
    * Number of times the extension was installed in connected scenario (applies only to VSTS extensions)
    */
  var connectedInstallCount: Double = js.native
  /**
    * Number of times the extension was installed
    */
  var installCount: Double = js.native
  /**
    * Number of times the extension was installed as a trial (applies only to VSTS extensions)
    */
  var tryCount: Double = js.native
  /**
    * Number of times the extension was uninstalled (applies only to VSTS extensions)
    */
  var uninstallCount: Double = js.native
  /**
    * Number of times the extension was downloaded (applies to VSTS extensions and VSCode marketplace click installs)
    */
  var webDownloadCount: Double = js.native
  /**
    * Number of detail page views
    */
  var webPageViews: Double = js.native
}

object EventCounts {
  @scala.inline
  def apply(
    averageRating: Double,
    buyCount: Double,
    connectedBuyCount: Double,
    connectedInstallCount: Double,
    installCount: Double,
    tryCount: Double,
    uninstallCount: Double,
    webDownloadCount: Double,
    webPageViews: Double
  ): EventCounts = {
    val __obj = js.Dynamic.literal(averageRating = averageRating.asInstanceOf[js.Any], buyCount = buyCount.asInstanceOf[js.Any], connectedBuyCount = connectedBuyCount.asInstanceOf[js.Any], connectedInstallCount = connectedInstallCount.asInstanceOf[js.Any], installCount = installCount.asInstanceOf[js.Any], tryCount = tryCount.asInstanceOf[js.Any], uninstallCount = uninstallCount.asInstanceOf[js.Any], webDownloadCount = webDownloadCount.asInstanceOf[js.Any], webPageViews = webPageViews.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventCounts]
  }
  @scala.inline
  implicit class EventCountsOps[Self <: EventCounts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAverageRating(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("averageRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBuyCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buyCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnectedBuyCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectedBuyCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnectedInstallCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectedInstallCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstallCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTryCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tryCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUninstallCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uninstallCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWebDownloadCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webDownloadCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWebPageViews(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webPageViews")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

