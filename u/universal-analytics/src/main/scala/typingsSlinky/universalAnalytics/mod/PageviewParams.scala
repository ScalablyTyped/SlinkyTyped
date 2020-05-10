package typingsSlinky.universalAnalytics.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageviewParams
  extends /* key */ StringDictionary[js.Any] {
  /**
    * Document Host Name
    *
    * Specifies the hostname from which content was hosted.
    *
    * Max length: 100 Bytes
    */
  var dh: js.UndefOr[String] = js.native
  /**
    * Document location URL
    *
    * Use this parameter to send the full URL (document location) of the page on which content resides.
    *
    * Max length: 2048 Bytes
    */
  var dl: js.UndefOr[String] = js.native
  /**
    * Document Path
    *
    * The path portion of the page URL. Should begin with '/'.
    *
    * Max length: 2048 Bytes
    */
  var dp: js.UndefOr[String] = js.native
  /**
    * Document Title
    *
    * The title of the page / document.
    *
    * Max length: 1500 Bytes
    */
  var dt: js.UndefOr[String] = js.native
}

object PageviewParams {
  @scala.inline
  def apply(): PageviewParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageviewParams]
  }
  @scala.inline
  implicit class PageviewParamsOps[Self <: PageviewParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDh(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dh")(js.undefined)
        ret
    }
    @scala.inline
    def withDl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dl")(js.undefined)
        ret
    }
    @scala.inline
    def withDp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dp")(js.undefined)
        ret
    }
    @scala.inline
    def withDt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dt")(js.undefined)
        ret
    }
  }
  
}

