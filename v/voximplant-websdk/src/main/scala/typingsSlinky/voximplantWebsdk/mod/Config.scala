package typingsSlinky.voximplantWebsdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	*	VoxImplant SDK Configuration
	*/
@js.native
trait Config extends js.Object {
  /**
  		*	XSS protection for inbound instant messages that can contain HTML content
  		*/
  var imXSSprotection: js.UndefOr[Boolean] = js.native
  /**
  		*	If set to true microphone access dialog will be shown and all functions will become available only after user allowed access
  		*/
  var micRequired: js.UndefOr[Boolean] = js.native
  /**
  		*	Automatically plays progress tone by means of SDK according to specified progressToneCountry
  		*/
  var progressTone: js.UndefOr[Boolean] = js.native
  /**
  		*	Country code for progress tone generated automatically if progressTone set to true
  		*/
  var progressToneCountry: js.UndefOr[String] = js.native
  /**
  		*	Show debug info in console
  		*/
  var showDebugInfo: js.UndefOr[Boolean] = js.native
  /**
  		*	Show Flash Settings panel instead of standard Allow/Deny dialog (in Flash mode)
  		*/
  var showFlashSettings: js.UndefOr[Boolean] = js.native
  /**
  		*	Id of HTMLElement that will be used as container for Flash component of SDK (Mic/cam access dialog will appear in the container). If micRequired set to true element should have size not less than 215x138 (px) for access dialog to be shown
  		*/
  var swfContainer: js.UndefOr[String] = js.native
  /**
  		*	Force VoxImplant to use Flash (WebRTC is used if available by default)
  		*/
  var useFlashOnly: js.UndefOr[Boolean] = js.native
  /**
  		*	Force VoxImplant to use WebRTC (WebRTC is used if available by default). Error will be thrown if WebRTC in unavailable
  		*/
  var useRTCOnly: js.UndefOr[Boolean] = js.native
  /**
  		*	Default constraints that will be applied while the next attachRecordingDevice function call or if micRequired set to true
  		*/
  var videoConstraints: js.UndefOr[VideoSettings | Boolean] = js.native
  /**
  		*	Video support
  		*/
  var videoSupport: js.UndefOr[Boolean] = js.native
}

object Config {
  @scala.inline
  def apply(): Config = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Config]
  }
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImXSSprotection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imXSSprotection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImXSSprotection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imXSSprotection")(js.undefined)
        ret
    }
    @scala.inline
    def withMicRequired(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("micRequired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMicRequired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("micRequired")(js.undefined)
        ret
    }
    @scala.inline
    def withProgressTone(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressTone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgressTone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressTone")(js.undefined)
        ret
    }
    @scala.inline
    def withProgressToneCountry(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressToneCountry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgressToneCountry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressToneCountry")(js.undefined)
        ret
    }
    @scala.inline
    def withShowDebugInfo(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDebugInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowDebugInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDebugInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withShowFlashSettings(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFlashSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowFlashSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFlashSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withSwfContainer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swfContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwfContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swfContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withUseFlashOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useFlashOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseFlashOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useFlashOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withUseRTCOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useRTCOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseRTCOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useRTCOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withVideoConstraints(value: VideoSettings | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoConstraints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideoConstraints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoConstraints")(js.undefined)
        ret
    }
    @scala.inline
    def withVideoSupport(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoSupport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideoSupport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoSupport")(js.undefined)
        ret
    }
  }
  
}

