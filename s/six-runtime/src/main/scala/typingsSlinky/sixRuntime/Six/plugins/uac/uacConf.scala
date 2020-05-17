package typingsSlinky.sixRuntime.Six.plugins.uac

import typingsSlinky.sixRuntime.Six.next
import typingsSlinky.sixRuntime.Six.plugins.whiteList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait uacConf extends js.Object {
  var client_id: String = js.native
  var client_secret: String = js.native
  var enableMock: Boolean = js.native
  var skipOffline: Boolean = js.native
  var whiteList: String | js.RegExp | js.Array[String] | typingsSlinky.sixRuntime.Six.plugins.whiteList = js.native
  def failHook(err: js.Error, ctx: js.Object, next: next): js.Any = js.native
  def getPath(ctx: js.Object): String = js.native
}

object uacConf {
  @scala.inline
  def apply(
    client_id: String,
    client_secret: String,
    enableMock: Boolean,
    failHook: (js.Error, js.Object, next) => js.Any,
    getPath: js.Object => String,
    skipOffline: Boolean,
    whiteList: String | js.RegExp | js.Array[String] | whiteList
  ): uacConf = {
    val __obj = js.Dynamic.literal(client_id = client_id.asInstanceOf[js.Any], client_secret = client_secret.asInstanceOf[js.Any], enableMock = enableMock.asInstanceOf[js.Any], failHook = js.Any.fromFunction3(failHook), getPath = js.Any.fromFunction1(getPath), skipOffline = skipOffline.asInstanceOf[js.Any], whiteList = whiteList.asInstanceOf[js.Any])
    __obj.asInstanceOf[uacConf]
  }
  @scala.inline
  implicit class uacConfOps[Self <: uacConf] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClient_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClient_secret(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_secret")(value.asInstanceOf[js.Any])
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

