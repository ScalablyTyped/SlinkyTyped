package typingsSlinky.workboxCore.workboxPluginMod

import org.scalajs.dom.experimental.Request
import org.scalajs.dom.experimental.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkboxPlugin extends js.Object {
  var cacheDidUpdate: js.UndefOr[CacheDidUpdateCallback] = js.native
  var cacheKeyWillBeUsed: js.UndefOr[CacheKeyWillBeUsedCallback] = js.native
  var cacheWillUpdate: js.UndefOr[CacheWillUpdateCallback] = js.native
  var cachedResponseWillBeUsed: js.UndefOr[CachedResponseWillBeUsedCallback] = js.native
  var fetchDidFail: js.UndefOr[FetchDidFailCallback] = js.native
  var fetchDidSucceed: js.UndefOr[FetchDidSucceedCallback] = js.native
  var requestWillFetch: js.UndefOr[RequestWillFetchCallback] = js.native
}

object WorkboxPlugin {
  @scala.inline
  def apply(): WorkboxPlugin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkboxPlugin]
  }
  @scala.inline
  implicit class WorkboxPluginOps[Self <: WorkboxPlugin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCacheDidUpdate(value: /* param */ CacheDidUpdateCallbackParam => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheDidUpdate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCacheDidUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheDidUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withCacheKeyWillBeUsed(value: /* param */ CacheKeyWillBeUsedCallbackParam => js.Promise[Request | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheKeyWillBeUsed")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCacheKeyWillBeUsed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheKeyWillBeUsed")(js.undefined)
        ret
    }
    @scala.inline
    def withCacheWillUpdate(value: /* param */ CacheWillUpdateCallbackParamParam => js.Promise[js.UndefOr[Response]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheWillUpdate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCacheWillUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheWillUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withCachedResponseWillBeUsed(value: /* param */ CachedResponseWillBeUsedCallbackParam => js.Promise[js.UndefOr[Response]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cachedResponseWillBeUsed")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCachedResponseWillBeUsed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cachedResponseWillBeUsed")(js.undefined)
        ret
    }
    @scala.inline
    def withFetchDidFail(value: /* param */ FetchDidFailCallbackParam => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchDidFail")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFetchDidFail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchDidFail")(js.undefined)
        ret
    }
    @scala.inline
    def withFetchDidSucceed(value: /* param */ FetchDidSucceedCallbackParam => js.Promise[Response]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchDidSucceed")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFetchDidSucceed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchDidSucceed")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestWillFetch(value: /* param */ RequestWillFetchCallbackParam => js.Promise[js.UndefOr[Request]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestWillFetch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRequestWillFetch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestWillFetch")(js.undefined)
        ret
    }
  }
  
}

