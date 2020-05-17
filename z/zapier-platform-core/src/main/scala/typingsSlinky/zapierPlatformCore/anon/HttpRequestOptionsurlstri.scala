package typingsSlinky.zapierPlatformCore.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.experimental.ReadableStream
import typingsSlinky.node.Buffer
import typingsSlinky.node.httpMod.Agent
import typingsSlinky.zapierPlatformCore.mod.HttpMethod
import typingsSlinky.zapierPlatformCore.zapierPlatformCoreStrings.error
import typingsSlinky.zapierPlatformCore.zapierPlatformCoreStrings.follow
import typingsSlinky.zapierPlatformCore.zapierPlatformCoreStrings.manual
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined zapier-platform-core.zapier-platform-core.HttpRequestOptions & {  url  :string} */
@js.native
trait HttpRequestOptionsurlstri extends js.Object {
  var agent: js.UndefOr[Agent] = js.native
  var body: js.UndefOr[String | Buffer | ReadableStream[_] | js.Object] = js.native
  var compress: js.UndefOr[Boolean] = js.native
  var follow: js.UndefOr[Double] = js.native
  var form: js.UndefOr[js.Object] = js.native
  var headers: js.UndefOr[StringDictionary[String]] = js.native
  var json: js.UndefOr[js.Object | js.Array[_]] = js.native
  var method: js.UndefOr[HttpMethod] = js.native
  var params: js.UndefOr[js.Object] = js.native
  var raw: js.UndefOr[Boolean] = js.native
  var redirect: js.UndefOr[manual | error | follow] = js.native
  var removeMissingValuesFrom: js.UndefOr[Body] = js.native
  var size: js.UndefOr[Double] = js.native
  var timeout: js.UndefOr[Double] = js.native
  var url: js.UndefOr[String] = js.native
}

object HttpRequestOptionsurlstri {
  @scala.inline
  def apply(): HttpRequestOptionsurlstri = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpRequestOptionsurlstri]
  }
  @scala.inline
  implicit class HttpRequestOptionsurlstriOps[Self <: HttpRequestOptionsurlstri] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAgent(value: Agent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAgent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agent")(js.undefined)
        ret
    }
    @scala.inline
    def withBodyReadableStream(value: ReadableStream[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBody(value: String | Buffer | ReadableStream[_] | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(js.undefined)
        ret
    }
    @scala.inline
    def withCompress(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compress")(js.undefined)
        ret
    }
    @scala.inline
    def withFollow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("follow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFollow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("follow")(js.undefined)
        ret
    }
    @scala.inline
    def withForm(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("form")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("form")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaders(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.undefined)
        ret
    }
    @scala.inline
    def withJson(value: js.Object | js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("json")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJson: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("json")(js.undefined)
        ret
    }
    @scala.inline
    def withMethod(value: HttpMethod): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(js.undefined)
        ret
    }
    @scala.inline
    def withParams(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(js.undefined)
        ret
    }
    @scala.inline
    def withRaw(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRaw: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw")(js.undefined)
        ret
    }
    @scala.inline
    def withRedirect(value: manual | error | follow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRedirect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirect")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveMissingValuesFrom(value: Body): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeMissingValuesFrom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveMissingValuesFrom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeMissingValuesFrom")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
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

