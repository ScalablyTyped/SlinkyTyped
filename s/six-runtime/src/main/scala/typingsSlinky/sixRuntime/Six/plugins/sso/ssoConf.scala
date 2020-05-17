package typingsSlinky.sixRuntime.Six.plugins.sso

import typingsSlinky.sixRuntime.Six.plugins.whiteList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ssoConf extends js.Object {
  var enableCache: Boolean = js.native
  var hasLoginCacheMaxAge: Double = js.native
  var ssoConf: ssoClientConf = js.native
  var whiteList: String | js.RegExp | js.Array[String] | typingsSlinky.sixRuntime.Six.plugins.whiteList = js.native
  def adapter(user: js.Object): js.Object = js.native
}

object ssoConf {
  @scala.inline
  def apply(
    adapter: js.Object => js.Object,
    enableCache: Boolean,
    hasLoginCacheMaxAge: Double,
    ssoConf: ssoClientConf,
    whiteList: String | js.RegExp | js.Array[String] | whiteList
  ): ssoConf = {
    val __obj = js.Dynamic.literal(adapter = js.Any.fromFunction1(adapter), enableCache = enableCache.asInstanceOf[js.Any], hasLoginCacheMaxAge = hasLoginCacheMaxAge.asInstanceOf[js.Any], ssoConf = ssoConf.asInstanceOf[js.Any], whiteList = whiteList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ssoConf]
  }
  @scala.inline
  implicit class ssoConfOps[Self <: ssoConf] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdapter(value: js.Object => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adapter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEnableCache(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableCache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasLoginCacheMaxAge(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasLoginCacheMaxAge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSsoConf(value: ssoClientConf): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssoConf")(value.asInstanceOf[js.Any])
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

