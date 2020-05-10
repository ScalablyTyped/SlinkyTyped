package typingsSlinky.simpleUrlCache.mod.privateN

import typingsSlinky.simpleUrlCache.mod.RegexRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CacheCategory extends js.Object {
  /* private */ def getCacheCategory(): String = js.native
  def getCategory(): String = js.native
  def getCurrentUrl(): String = js.native
  /* private */ def getRegexTest(u: RegexRule): Boolean = js.native
}

object CacheCategory {
  @scala.inline
  def apply(
    getCacheCategory: () => String,
    getCategory: () => String,
    getCurrentUrl: () => String,
    getRegexTest: RegexRule => Boolean
  ): CacheCategory = {
    val __obj = js.Dynamic.literal(getCacheCategory = js.Any.fromFunction0(getCacheCategory), getCategory = js.Any.fromFunction0(getCategory), getCurrentUrl = js.Any.fromFunction0(getCurrentUrl), getRegexTest = js.Any.fromFunction1(getRegexTest))
    __obj.asInstanceOf[CacheCategory]
  }
  @scala.inline
  implicit class CacheCategoryOps[Self <: CacheCategory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetCacheCategory(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCacheCategory")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetCategory(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCategory")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetCurrentUrl(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCurrentUrl")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetRegexTest(value: RegexRule => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRegexTest")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

