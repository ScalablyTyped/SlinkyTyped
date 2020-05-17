package typingsSlinky.semanticUiApi.anon

import typingsSlinky.semanticUiApi.semanticUiApiStrings.local
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-api.SemanticUI.ApiSettings._Impl, 'cache'> */
@js.native
trait PickImplcache extends js.Object {
  var cache: local | Boolean = js.native
}

object PickImplcache {
  @scala.inline
  def apply(cache: local | Boolean): PickImplcache = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplcache]
  }
  @scala.inline
  implicit class PickImplcacheOps[Self <: PickImplcache] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCache(value: local | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

