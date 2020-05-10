package typingsSlinky.workboxWebpackPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RuntimeCacheRule extends js.Object {
  /**
  	 * The `handler` values are strings, corresponding to names of the strategies supported by
  	 * [`workbox.strategies`](https://developers.google.com/web/tools/workbox/reference-docs/latest/workbox.strategies#methods).
  	 */
  var handler: js.UndefOr[ChacheStrategy] = js.native
  /**
  	 * The `options` properties can be used to configure instances of the cache expiration, cacheable response, and broadcast cache update plugins to apply to a given route.
  	 */
  var options: js.UndefOr[RuntimeCacheOptions] = js.native
  /**
  	 * Cache any same-origin request that matches the pattern.
  	 */
  var urlPattern: js.UndefOr[String | js.RegExp] = js.native
}

object RuntimeCacheRule {
  @scala.inline
  def apply(): RuntimeCacheRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuntimeCacheRule]
  }
  @scala.inline
  implicit class RuntimeCacheRuleOps[Self <: RuntimeCacheRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHandler(value: ChacheStrategy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handler")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: RuntimeCacheOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
    @scala.inline
    def withUrlPatternRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlPattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrlPattern(value: String | js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlPattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrlPattern: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlPattern")(js.undefined)
        ret
    }
  }
  
}

