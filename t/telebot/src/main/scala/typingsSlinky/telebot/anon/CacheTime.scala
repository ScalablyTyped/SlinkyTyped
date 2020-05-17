package typingsSlinky.telebot.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CacheTime extends js.Object {
  var cacheTime: js.UndefOr[Double] = js.native
  var showAlert: js.UndefOr[Boolean] = js.native
  var text: js.UndefOr[String] = js.native
  var url: js.UndefOr[String] = js.native
}

object CacheTime {
  @scala.inline
  def apply(): CacheTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CacheTime]
  }
  @scala.inline
  implicit class CacheTimeOps[Self <: CacheTime] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCacheTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheTime")(js.undefined)
        ret
    }
    @scala.inline
    def withShowAlert(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showAlert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowAlert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showAlert")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

