package typingsSlinky.sixRuntime.Six.plugins.upm

import typingsSlinky.sixRuntime.Six.next
import typingsSlinky.sixRuntime.Six.plugins.whiteList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait upmConf extends js.Object {
  var clientId: String = js.native
  var clientSecret: String = js.native
  var domain: String = js.native
  var enableMock: Boolean = js.native
  var path: String = js.native
  var skipOffline: Boolean = js.native
  var whiteList: String | js.RegExp | js.Array[String] | typingsSlinky.sixRuntime.Six.plugins.whiteList = js.native
  def failHook(err: js.Error, ctx: js.Object, next: next): js.Any = js.native
  def getPath(ctx: js.Object): String = js.native
}

object upmConf {
  @scala.inline
  def apply(
    clientId: String,
    clientSecret: String,
    domain: String,
    enableMock: Boolean,
    failHook: (js.Error, js.Object, next) => js.Any,
    getPath: js.Object => String,
    path: String,
    skipOffline: Boolean,
    whiteList: String | js.RegExp | js.Array[String] | whiteList
  ): upmConf = {
    val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], enableMock = enableMock.asInstanceOf[js.Any], failHook = js.Any.fromFunction3(failHook), getPath = js.Any.fromFunction1(getPath), path = path.asInstanceOf[js.Any], skipOffline = skipOffline.asInstanceOf[js.Any], whiteList = whiteList.asInstanceOf[js.Any])
    __obj.asInstanceOf[upmConf]
  }
  @scala.inline
  implicit class upmConfOps[Self <: upmConf] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClientSecret(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientSecret")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDomain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnableMock(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableMock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFailHook(value: (js.Error, js.Object, next) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failHook")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withGetPath(value: js.Object => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPath")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSkipOffline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipOffline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWhiteListFunction1(value: /* ctx */ js.Object => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whiteList")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWhiteListRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whiteList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWhiteList(value: String | js.RegExp | js.Array[String] | whiteList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whiteList")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

