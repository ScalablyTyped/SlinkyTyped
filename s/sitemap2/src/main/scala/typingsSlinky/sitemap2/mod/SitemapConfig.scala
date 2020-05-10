package typingsSlinky.sitemap2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SitemapConfig extends js.Object {
  var cacheTime: js.UndefOr[Double] = js.native
  var childrens: js.UndefOr[js.Array[Sitemap]] = js.native
  var fileName: js.UndefOr[String] = js.native
  var hostName: js.UndefOr[String] = js.native
  var limit: js.UndefOr[Double] = js.native
  var urls: js.UndefOr[js.Array[String]] = js.native
  var xslUrl: js.UndefOr[String] = js.native
}

object SitemapConfig {
  @scala.inline
  def apply(): SitemapConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SitemapConfig]
  }
  @scala.inline
  implicit class SitemapConfigOps[Self <: SitemapConfig] (val x: Self) extends AnyVal {
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
    def withChildrens(value: js.Array[Sitemap]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childrens")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildrens: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childrens")(js.undefined)
        ret
    }
    @scala.inline
    def withFileName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileName")(js.undefined)
        ret
    }
    @scala.inline
    def withHostName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostName")(js.undefined)
        ret
    }
    @scala.inline
    def withLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(js.undefined)
        ret
    }
    @scala.inline
    def withUrls(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urls")(js.undefined)
        ret
    }
    @scala.inline
    def withXslUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xslUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXslUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xslUrl")(js.undefined)
        ret
    }
  }
  
}

