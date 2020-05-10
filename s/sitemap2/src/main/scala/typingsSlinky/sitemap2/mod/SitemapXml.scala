package typingsSlinky.sitemap2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SitemapXml extends js.Object {
  var fileName: String = js.native
  var xml: String = js.native
}

object SitemapXml {
  @scala.inline
  def apply(fileName: String, xml: String): SitemapXml = {
    val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], xml = xml.asInstanceOf[js.Any])
    __obj.asInstanceOf[SitemapXml]
  }
  @scala.inline
  implicit class SitemapXmlOps[Self <: SitemapXml] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFileName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXml(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xml")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

