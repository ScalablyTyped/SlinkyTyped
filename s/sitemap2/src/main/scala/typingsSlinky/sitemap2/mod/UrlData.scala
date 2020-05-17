package typingsSlinky.sitemap2.mod

import typingsSlinky.sitemap2.anon.Contentloc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UrlData extends js.Object {
  var chengefreq: js.UndefOr[String] = js.native
  var lastmod: js.UndefOr[js.Date] = js.native
  var lastmodInISO: js.UndefOr[Boolean] = js.native
  var lastmodWithTime: js.UndefOr[Boolean] = js.native
  var priority: js.UndefOr[Double | String] = js.native
  var url: String = js.native
  var video: js.UndefOr[Contentloc] = js.native
}

object UrlData {
  @scala.inline
  def apply(url: String): UrlData = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[UrlData]
  }
  @scala.inline
  implicit class UrlDataOps[Self <: UrlData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChengefreq(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chengefreq")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChengefreq: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chengefreq")(js.undefined)
        ret
    }
    @scala.inline
    def withLastmod(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastmod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastmod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastmod")(js.undefined)
        ret
    }
    @scala.inline
    def withLastmodInISO(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastmodInISO")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastmodInISO: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastmodInISO")(js.undefined)
        ret
    }
    @scala.inline
    def withLastmodWithTime(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastmodWithTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastmodWithTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastmodWithTime")(js.undefined)
        ret
    }
    @scala.inline
    def withPriority(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPriority: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(js.undefined)
        ret
    }
    @scala.inline
    def withVideo(value: Contentloc): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("video")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("video")(js.undefined)
        ret
    }
  }
  
}

