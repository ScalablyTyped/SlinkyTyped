package typingsSlinky.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnvironmentOptions extends js.Object {
  var autoLinkWorkItems: Boolean = js.native
  var badgeEnabled: Boolean = js.native
  var emailNotificationType: String = js.native
  var emailRecipients: String = js.native
  var enableAccessToken: Boolean = js.native
  var publishDeploymentStatus: Boolean = js.native
  var skipArtifactsDownload: Boolean = js.native
  var timeoutInMinutes: Double = js.native
}

object EnvironmentOptions {
  @scala.inline
  def apply(
    autoLinkWorkItems: Boolean,
    badgeEnabled: Boolean,
    emailNotificationType: String,
    emailRecipients: String,
    enableAccessToken: Boolean,
    publishDeploymentStatus: Boolean,
    skipArtifactsDownload: Boolean,
    timeoutInMinutes: Double
  ): EnvironmentOptions = {
    val __obj = js.Dynamic.literal(autoLinkWorkItems = autoLinkWorkItems.asInstanceOf[js.Any], badgeEnabled = badgeEnabled.asInstanceOf[js.Any], emailNotificationType = emailNotificationType.asInstanceOf[js.Any], emailRecipients = emailRecipients.asInstanceOf[js.Any], enableAccessToken = enableAccessToken.asInstanceOf[js.Any], publishDeploymentStatus = publishDeploymentStatus.asInstanceOf[js.Any], skipArtifactsDownload = skipArtifactsDownload.asInstanceOf[js.Any], timeoutInMinutes = timeoutInMinutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvironmentOptions]
  }
  @scala.inline
  implicit class EnvironmentOptionsOps[Self <: EnvironmentOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoLinkWorkItems(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoLinkWorkItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBadgeEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badgeEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmailNotificationType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emailNotificationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmailRecipients(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emailRecipients")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnableAccessToken(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAccessToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublishDeploymentStatus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publishDeploymentStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSkipArtifactsDownload(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipArtifactsDownload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeoutInMinutes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeoutInMinutes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

