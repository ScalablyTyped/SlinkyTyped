package typingsSlinky.universalAnalytics.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimingParams
  extends /* key */ StringDictionary[js.Any] {
  /**
    * User timing category
    *
    * **Required for timing hit type.**
    *
    * Specifies the user timing category.
    *
    * Max length: 150 Bytes
    *
    * Example value: `category`
    */
  var utc: js.UndefOr[String] = js.native
  /**
    * User timing label
    *
    * Specifies the user timing label.
    *
    * Max length: 500 Bytes
    *
    * Example value: `label`
    */
  var utl: js.UndefOr[String] = js.native
  /**
    * User timing time
    *
    * **Required for timing hit type.**
    *
    * Specifies the user timing value. The value is in milliseconds.
    *
    * Example value: `123`
    */
  var utt: js.UndefOr[String | Double] = js.native
  /**
    * User timing variable name
    *
    * **Required for timing hit type.**
    *
    * Specifies the user timing variable.
    *
    * Max length: 500 Bytes
    *
    * Example value: `lookup`
    */
  var utv: js.UndefOr[String] = js.native
}

object TimingParams {
  @scala.inline
  def apply(): TimingParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimingParams]
  }
  @scala.inline
  implicit class TimingParamsOps[Self <: TimingParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUtc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUtc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utc")(js.undefined)
        ret
    }
    @scala.inline
    def withUtl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUtl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utl")(js.undefined)
        ret
    }
    @scala.inline
    def withUtt(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUtt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utt")(js.undefined)
        ret
    }
    @scala.inline
    def withUtv(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utv")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUtv: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utv")(js.undefined)
        ret
    }
  }
  
}

