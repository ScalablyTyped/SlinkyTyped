package typingsSlinky.umbraco.umbraco.services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cache args
  */
@js.native
trait ICacheArgs extends js.Object {
  var cacheKey: String = js.native
  var childrenOf: js.UndefOr[Double] = js.native
  var section: js.UndefOr[String] = js.native
}

object ICacheArgs {
  @scala.inline
  def apply(cacheKey: String): ICacheArgs = {
    val __obj = js.Dynamic.literal(cacheKey = cacheKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICacheArgs]
  }
  @scala.inline
  implicit class ICacheArgsOps[Self <: ICacheArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCacheKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildrenOf(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childrenOf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildrenOf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childrenOf")(js.undefined)
        ret
    }
    @scala.inline
    def withSection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("section")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("section")(js.undefined)
        ret
    }
  }
  
}

