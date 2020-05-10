package typingsSlinky.xrm.Xrm.Navigation

import typingsSlinky.xrm.xrmStrings.webresource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageInputHtmlWebResource extends js.Object {
  /**
    * The data to pass to the web resource.
    * */
  var data: js.UndefOr[String] = js.native
  var pageType: webresource = js.native
  /**
    * The name of the web resource to load.
    * */
  var webresourceName: String = js.native
}

object PageInputHtmlWebResource {
  @scala.inline
  def apply(pageType: webresource, webresourceName: String): PageInputHtmlWebResource = {
    val __obj = js.Dynamic.literal(pageType = pageType.asInstanceOf[js.Any], webresourceName = webresourceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageInputHtmlWebResource]
  }
  @scala.inline
  implicit class PageInputHtmlWebResourceOps[Self <: PageInputHtmlWebResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPageType(value: webresource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWebresourceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webresourceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
  }
  
}

