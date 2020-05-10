package typingsSlinky.sparkpost.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransmissionOptions extends js.Object {
  /** Whether click tracking is enabled for this transmission */
  var click_tracking: js.UndefOr[Boolean] = js.native
  /** Whether or not to perform CSS inlining in HTML content */
  var inline_css: js.UndefOr[Boolean] = js.native
  /** The ID of a dedicated IP pool associated with your account ( Note: SparkPost only ). */
  var ip_pool: js.UndefOr[String] = js.native
  /** Whether open tracking is enabled for this transmission */
  var open_tracking: js.UndefOr[Boolean] = js.native
  /** Whether or not to use the sandbox sending domain */
  var sandbox: js.UndefOr[Boolean] = js.native
  /** SparkPost Enterprise API only: Whether or not to ignore customer suppression rules, for this transmission only. Only applicable if your configuration supports this parameter. */
  var skip_suppression: js.UndefOr[Boolean] = js.native
  /** Delay generation of messages until this datetime. */
  var start_time: js.UndefOr[String] = js.native
  /** Whether message is transactional or non-transactional for unsubscribe and suppression purposes */
  var transactional: js.UndefOr[Boolean] = js.native
}

object TransmissionOptions {
  @scala.inline
  def apply(): TransmissionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransmissionOptions]
  }
  @scala.inline
  implicit class TransmissionOptionsOps[Self <: TransmissionOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClick_tracking(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click_tracking")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClick_tracking: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click_tracking")(js.undefined)
        ret
    }
    @scala.inline
    def withInline_css(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inline_css")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInline_css: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inline_css")(js.undefined)
        ret
    }
    @scala.inline
    def withIp_pool(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ip_pool")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIp_pool: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ip_pool")(js.undefined)
        ret
    }
    @scala.inline
    def withOpen_tracking(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open_tracking")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpen_tracking: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open_tracking")(js.undefined)
        ret
    }
    @scala.inline
    def withSandbox(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sandbox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSandbox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sandbox")(js.undefined)
        ret
    }
    @scala.inline
    def withSkip_suppression(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skip_suppression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkip_suppression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skip_suppression")(js.undefined)
        ret
    }
    @scala.inline
    def withStart_time(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start_time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStart_time: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start_time")(js.undefined)
        ret
    }
    @scala.inline
    def withTransactional(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transactional")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransactional: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transactional")(js.undefined)
        ret
    }
  }
  
}

