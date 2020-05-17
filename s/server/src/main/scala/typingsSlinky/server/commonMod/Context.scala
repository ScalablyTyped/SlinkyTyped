package typingsSlinky.server.commonMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.express.mod.Request_
import typingsSlinky.express.mod.Response_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.formidable.mod.Files
import typingsSlinky.server.anon.keyinLogLevelLogFn
import typingsSlinky.server.optionsMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Context extends js.Object {
  var cookie: StringDictionary[String] = js.native
  var data: js.Any = js.native
  var error: js.Error = js.native
  var files: Files = js.native
  var headers: StringDictionary[String] = js.native
  var ip: String = js.native
  var ips: js.UndefOr[js.Array[String]] = js.native
  var log: keyinLogLevelLogFn = js.native
  var method: String = js.native
  var options: Options = js.native
  var params: StringDictionary[String] = js.native
  var path: String = js.native
  var query: StringDictionary[String | js.Array[String]] = js.native
  var req: Request_[ParamsDictionary, _, _, Query] = js.native
  var res: Response_[_] = js.native
  var secure: Boolean = js.native
  var session: js.Object = js.native
  var url: String = js.native
  var xhr: Boolean = js.native
}

object Context {
  @scala.inline
  def apply(
    cookie: StringDictionary[String],
    data: js.Any,
    error: js.Error,
    files: Files,
    headers: StringDictionary[String],
    ip: String,
    log: keyinLogLevelLogFn,
    method: String,
    options: Options,
    params: StringDictionary[String],
    path: String,
    query: StringDictionary[String | js.Array[String]],
    req: Request_[ParamsDictionary, _, _, Query],
    res: Response_[_],
    secure: Boolean,
    session: js.Object,
    url: String,
    xhr: Boolean
  ): Context = {
    val __obj = js.Dynamic.literal(cookie = cookie.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], req = req.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any], secure = secure.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], xhr = xhr.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
  @scala.inline
  implicit class ContextOps[Self <: Context] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCookie(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookie")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withError(value: js.Error): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFiles(value: Files): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("files")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaders(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLog(value: keyinLogLevelLogFn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: Options): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParams(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuery(value: StringDictionary[String | js.Array[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReq(value: Request_[ParamsDictionary, _, _, Query]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("req")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRes(value: Response_[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("res")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecure(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSession(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("session")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXhr(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xhr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIps(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ips")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ips")(js.undefined)
        ret
    }
  }
  
}

