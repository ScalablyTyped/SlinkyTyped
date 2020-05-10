package typingsSlinky.workboxCore.workboxPluginMod

import org.scalajs.dom.experimental.Request
import org.scalajs.dom.experimental.Response
import org.scalajs.dom.experimental.serviceworkers.CacheQueryOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CachedResponseWillBeUsedCallbackParam extends js.Object {
  var cacheName: String = js.native
  var cachedResponse: js.UndefOr[Response] = js.native
  var event: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ExtendableEvent */ js.Any
  ] = js.native
  var matchOptions: js.UndefOr[CacheQueryOptions] = js.native
  var request: Request = js.native
}

object CachedResponseWillBeUsedCallbackParam {
  @scala.inline
  def apply(cacheName: String, request: Request): CachedResponseWillBeUsedCallbackParam = {
    val __obj = js.Dynamic.literal(cacheName = cacheName.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[CachedResponseWillBeUsedCallbackParam]
  }
  @scala.inline
  implicit class CachedResponseWillBeUsedCallbackParamOps[Self <: CachedResponseWillBeUsedCallbackParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCacheName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequest(value: Request): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCachedResponse(value: Response): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cachedResponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCachedResponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cachedResponse")(js.undefined)
        ret
    }
    @scala.inline
    def withEvent(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ExtendableEvent */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(js.undefined)
        ret
    }
    @scala.inline
    def withMatchOptions(value: CacheQueryOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatchOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchOptions")(js.undefined)
        ret
    }
  }
  
}

