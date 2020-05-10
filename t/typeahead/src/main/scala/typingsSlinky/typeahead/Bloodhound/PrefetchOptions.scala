package typingsSlinky.typeahead.Bloodhound

import typingsSlinky.jquery.JQueryAjaxSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Prefetched data is fetched and processed on initialization. If the browser
  * supports local storage, the processed data will be cached there to prevent
  * additional network requests on subsequent page loads.
  *
  * WARNING: While it's possible to get away with it for smaller data sets,
  * prefetched data isn't meant to contain entire sets of data. Rather, it should
  * act as a first-level cache. Ignoring this warning means you'll run the risk
  * of hitting local storage limits.
  */
@js.native
trait PrefetchOptions[T] extends js.Object {
  /**
    * If false, will not attempt to read or write to local storage and
    * will always load prefetch data from url on initialization. Defaults to true.
    */
  var cache: js.UndefOr[Boolean] = js.native
  /**
    * The key that data will be stored in local storage under.
    * Defaults to value of url.
    */
  var cacheKey: js.UndefOr[String] = js.native
  /**
    * A function that provides a hook to allow you to prepare the settings
    * object passed to transport when a request is about to be made.
    * Defaults to the identity function.
    *
    * @param settings The default settings object created internally by the Bloodhound instance.
    * @returns A settings object.
    */
  var prepare: js.UndefOr[js.Function1[/* settings */ JQueryAjaxSettings, JQueryAjaxSettings]] = js.native
  /**
    * A string used for thumbprinting prefetched data. If this doesn't
    * match what's stored in local storage, the data will be refetched.
    */
  var thumbprint: js.UndefOr[String] = js.native
  /**
    * A function with the signature transform(response) that allows you to
    * transform the prefetch response before the Bloodhound instance operates
    * on it. Defaults to the identity function.
    *
    * @param response Prefetch response.
    * @returns Transform response.
    */
  var transform: js.UndefOr[js.Function1[/* response */ T, T]] = js.native
  /**
    * The time (in milliseconds) the prefetched data should be cached in
    * local storage. Defaults to 86400000 (1 day).
    */
  var ttl: js.UndefOr[Double] = js.native
  /**
    * The URL prefetch data should be loaded from.
    */
  var url: String = js.native
}

object PrefetchOptions {
  @scala.inline
  def apply[T](url: String): PrefetchOptions[T] = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrefetchOptions[T]]
  }
  @scala.inline
  implicit class PrefetchOptionsOps[Self[t] <: PrefetchOptions[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withUrl(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCache(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCache: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(js.undefined)
        ret
    }
    @scala.inline
    def withCacheKey(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheKey: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheKey")(js.undefined)
        ret
    }
    @scala.inline
    def withPrepare(value: /* settings */ JQueryAjaxSettings => JQueryAjaxSettings): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prepare")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPrepare: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prepare")(js.undefined)
        ret
    }
    @scala.inline
    def withThumbprint(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbprint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThumbprint: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbprint")(js.undefined)
        ret
    }
    @scala.inline
    def withTransform(value: /* response */ T => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTransform: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(js.undefined)
        ret
    }
    @scala.inline
    def withTtl(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ttl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTtl: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ttl")(js.undefined)
        ret
    }
  }
  
}

