package typingsSlinky.zapierPlatformCore.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.zapierPlatformCore.mod.HttpMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  method  :zapier-platform-core.zapier-platform-core.HttpMethod,   querystring  :{[x: string] : string},   headers  :{[x: string] : string},   content  :{[x: string] : string}}> */
@js.native
trait PartialmethodHttpMethodquContent extends js.Object {
  var content: js.UndefOr[StringDictionary[String]] = js.native
  var headers: js.UndefOr[StringDictionary[String]] = js.native
  var method: js.UndefOr[HttpMethod] = js.native
  var querystring: js.UndefOr[StringDictionary[String]] = js.native
}

object PartialmethodHttpMethodquContent {
  @scala.inline
  def apply(): PartialmethodHttpMethodquContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialmethodHttpMethodquContent]
  }
  @scala.inline
  implicit class PartialmethodHttpMethodquContentOps[Self <: PartialmethodHttpMethodquContent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContent(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(js.undefined)
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
    def withQuerystring(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("querystring")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuerystring: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("querystring")(js.undefined)
        ret
    }
  }
  
}

