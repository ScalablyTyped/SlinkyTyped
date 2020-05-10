package typingsSlinky.webdriver.WebDriver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SettingsReturn extends ProtocolCommandResponse {
  var actionAcknowledgmentTimeout: js.UndefOr[Double] = js.native
  var allowInvisibleElements: js.UndefOr[Boolean] = js.native
  var elementResponseAttributes: js.UndefOr[String] = js.native
  var enableNotificationListener: js.UndefOr[Boolean] = js.native
  var ignoreUnimportantViews: js.UndefOr[Boolean] = js.native
  var keyInjectionDelay: js.UndefOr[Double] = js.native
  var mjpegScalingFactor: js.UndefOr[Double] = js.native
  var mjpegServerFramerate: js.UndefOr[Double] = js.native
  var mjpegServerScreenshotQuality: js.UndefOr[Double] = js.native
  var normalizeTagNames: js.UndefOr[Boolean] = js.native
  var screenshotQuality: js.UndefOr[Double] = js.native
  var scrollAcknowledgmentTimeout: js.UndefOr[Double] = js.native
  var shouldUseCompactResponses: js.UndefOr[Boolean] = js.native
  var shutdownOnPowerDisconnect: js.UndefOr[Boolean] = js.native
  var waitForIdleTimeout: js.UndefOr[Double] = js.native
  var waitForSelectorTimeout: js.UndefOr[Double] = js.native
}

object SettingsReturn {
  @scala.inline
  def apply(): SettingsReturn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SettingsReturn]
  }
  @scala.inline
  implicit class SettingsReturnOps[Self <: SettingsReturn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionAcknowledgmentTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionAcknowledgmentTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActionAcknowledgmentTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionAcknowledgmentTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowInvisibleElements(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowInvisibleElements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowInvisibleElements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowInvisibleElements")(js.undefined)
        ret
    }
    @scala.inline
    def withElementResponseAttributes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementResponseAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElementResponseAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementResponseAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableNotificationListener(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableNotificationListener")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableNotificationListener: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableNotificationListener")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreUnimportantViews(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreUnimportantViews")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreUnimportantViews: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreUnimportantViews")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyInjectionDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyInjectionDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyInjectionDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyInjectionDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withMjpegScalingFactor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mjpegScalingFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMjpegScalingFactor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mjpegScalingFactor")(js.undefined)
        ret
    }
    @scala.inline
    def withMjpegServerFramerate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mjpegServerFramerate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMjpegServerFramerate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mjpegServerFramerate")(js.undefined)
        ret
    }
    @scala.inline
    def withMjpegServerScreenshotQuality(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mjpegServerScreenshotQuality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMjpegServerScreenshotQuality: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mjpegServerScreenshotQuality")(js.undefined)
        ret
    }
    @scala.inline
    def withNormalizeTagNames(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalizeTagNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNormalizeTagNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalizeTagNames")(js.undefined)
        ret
    }
    @scala.inline
    def withScreenshotQuality(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenshotQuality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScreenshotQuality: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenshotQuality")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollAcknowledgmentTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollAcknowledgmentTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollAcknowledgmentTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollAcknowledgmentTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withShouldUseCompactResponses(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldUseCompactResponses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShouldUseCompactResponses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldUseCompactResponses")(js.undefined)
        ret
    }
    @scala.inline
    def withShutdownOnPowerDisconnect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shutdownOnPowerDisconnect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShutdownOnPowerDisconnect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shutdownOnPowerDisconnect")(js.undefined)
        ret
    }
    @scala.inline
    def withWaitForIdleTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForIdleTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWaitForIdleTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForIdleTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withWaitForSelectorTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForSelectorTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWaitForSelectorTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForSelectorTimeout")(js.undefined)
        ret
    }
  }
  
}

