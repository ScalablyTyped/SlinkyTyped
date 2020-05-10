package typingsSlinky.typedRestClient.interfacesMod

import typingsSlinky.node.httpMod.RequestOptions
import typingsSlinky.node.urlMod.Url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRequestInfo extends js.Object {
  var httpModule: js.Any = js.native
  var options: RequestOptions = js.native
  var parsedUrl: Url = js.native
}

object IRequestInfo {
  @scala.inline
  def apply(httpModule: js.Any, options: RequestOptions, parsedUrl: Url): IRequestInfo = {
    val __obj = js.Dynamic.literal(httpModule = httpModule.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], parsedUrl = parsedUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRequestInfo]
  }
  @scala.inline
  implicit class IRequestInfoOps[Self <: IRequestInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHttpModule(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpModule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: RequestOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParsedUrl(value: Url): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parsedUrl")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

