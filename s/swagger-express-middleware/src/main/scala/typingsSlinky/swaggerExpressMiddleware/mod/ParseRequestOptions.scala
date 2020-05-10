package typingsSlinky.swaggerExpressMiddleware.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParseRequestOptions extends js.Object {
  /**
    * Cookie parser options
    */
  var cookie: js.UndefOr[CookieParserOptionItem] = js.native
  /**
    * JSON body parser options
    */
  var json: js.UndefOr[JsonParseOptionItem] = js.native
  /**
    * Multipart form data parser options
    */
  var multipart: js.UndefOr[MulterOptions] = js.native
  /**
    * Raw body parser options
    */
  var raw: js.UndefOr[RawParserOptionItem] = js.native
  /**
    * Plain-text body parser options
    */
  var text: js.UndefOr[TextParserOptionItem] = js.native
  /**
    * URL-encoded body parser options
    */
  var urlencoded: js.UndefOr[UrlEncodedOptionItem] = js.native
}

object ParseRequestOptions {
  @scala.inline
  def apply(): ParseRequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParseRequestOptions]
  }
  @scala.inline
  implicit class ParseRequestOptionsOps[Self <: ParseRequestOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCookie(value: CookieParserOptionItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookie")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCookie: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookie")(js.undefined)
        ret
    }
    @scala.inline
    def withJson(value: JsonParseOptionItem): Self = {
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
    def withMultipart(value: MulterOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multipart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultipart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multipart")(js.undefined)
        ret
    }
    @scala.inline
    def withRaw(value: RawParserOptionItem): Self = {
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
    def withText(value: TextParserOptionItem): Self = {
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
    def withUrlencoded(value: UrlEncodedOptionItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlencoded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrlencoded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlencoded")(js.undefined)
        ret
    }
  }
  
}

