package typingsSlinky.simpleUrlCache.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CacheRules extends js.Object {
  var cacheAlways: js.Array[RegexRule] = js.native
  var cacheMaxAge: js.Array[MaxAgeRegexRule] = js.native
  var cacheNever: js.Array[RegexRule] = js.native
  var default: String = js.native
}

object CacheRules {
  @scala.inline
  def apply(
    cacheAlways: js.Array[RegexRule],
    cacheMaxAge: js.Array[MaxAgeRegexRule],
    cacheNever: js.Array[RegexRule],
    default: String
  ): CacheRules = {
    val __obj = js.Dynamic.literal(cacheAlways = cacheAlways.asInstanceOf[js.Any], cacheMaxAge = cacheMaxAge.asInstanceOf[js.Any], cacheNever = cacheNever.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheRules]
  }
  @scala.inline
  implicit class CacheRulesOps[Self <: CacheRules] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCacheAlways(value: js.Array[RegexRule]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheAlways")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCacheMaxAge(value: js.Array[MaxAgeRegexRule]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheMaxAge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCacheNever(value: js.Array[RegexRule]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheNever")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefault(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

