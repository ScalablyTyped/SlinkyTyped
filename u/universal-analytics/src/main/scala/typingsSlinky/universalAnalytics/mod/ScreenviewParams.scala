package typingsSlinky.universalAnalytics.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScreenviewParams
  extends /* key */ StringDictionary[js.Any] {
  /**
    * Application ID
    *
    * Application identifier.
    *
    * Max length: 150 Bytes
    *
    * Example value: `com.company.app`
    */
  var aid: js.UndefOr[String] = js.native
  /**
    * Application Installer ID
    *
    * Application installer identifier.
    *
    * Max length: 150 Bytes
    *
    * Example value: `com.platform.vending`
    */
  var aiid: js.UndefOr[String] = js.native
  /**
    * Application Name
    *
    * Specifies the application name. This field is required for any hit that has app related data
    * (i.e., app version, app ID, or app installer ID). For hits sent to web properties, this field is optional.
    *
    * Max length: 100 Bytes
    *
    * Example value: `My App`
    */
  var an: js.UndefOr[String] = js.native
  /**
    * Application Version
    *
    * Specifies the application version.
    *
    * Max length: 100 Bytes
    *
    * Example value: `1.2`
    */
  var av: js.UndefOr[String] = js.native
  /**
    * Screen Name
    *
    * This parameter is optional on web properties, and required on mobile properties for screenview hits,
    * where it is used for the 'Screen Name' of the screenview hit.
    *
    * Max length: 2048 Bytes
    *
    * Example value: `High Scores`
    */
  var cd: js.UndefOr[String] = js.native
}

object ScreenviewParams {
  @scala.inline
  def apply(): ScreenviewParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScreenviewParams]
  }
  @scala.inline
  implicit class ScreenviewParamsOps[Self <: ScreenviewParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aid")(js.undefined)
        ret
    }
    @scala.inline
    def withAiid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aiid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAiid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aiid")(js.undefined)
        ret
    }
    @scala.inline
    def withAn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("an")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("an")(js.undefined)
        ret
    }
    @scala.inline
    def withAv(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("av")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAv: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("av")(js.undefined)
        ret
    }
    @scala.inline
    def withCd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cd")(js.undefined)
        ret
    }
  }
  
}

