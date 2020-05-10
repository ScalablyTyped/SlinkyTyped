package typingsSlinky.typeahead.Bloodhound

import typingsSlinky.jquery.JQueryAjaxSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Bloodhound only goes to the network when the internal search engine cannot
  * provide a sufficient number of results. In order to prevent an obscene
  * number of requests being made to the remote endpoint, requests are rate-limited.
  */
@js.native
trait RemoteOptions[T] extends js.Object {
  /**
    * DEPRECATED: transform the remote response before the Bloodhound instance operates on it.
    * */
  var filter: js.UndefOr[js.Function1[/* response */ T, T]] = js.native
  /**
    * A function that provides a hook to allow you to prepare the settings
    * object passed to transport when a request is about to be made.
    * The function signature should be prepare(query, settings), where query
    * is the query #search was called with and settings is the default settings
    * object created internally by the Bloodhound instance. The prepare function
    * should return a settings object. Defaults to the identity function.
    *
    * @param query The query #search was called with.
    * @param settings The default settings object created internally by Bloodhound.
    * @returns A JqueryAjaxSettings object.
    */
  var prepare: js.UndefOr[
    js.Function2[/* query */ String, /* settings */ JQueryAjaxSettings, JQueryAjaxSettings]
  ] = js.native
  /**
    * The time interval in milliseconds that will be used by rateLimitBy.
    * Defaults to 300.
    */
  var rateLimitWait: js.UndefOr[Double] = js.native
  /**
    * The method used to rate-limit network requests.
    * Can be either debounce or throttle. Defaults to debounce.
    */
  var rateLimitby: js.UndefOr[String] = js.native
  /**
    * A function with the signature transform(response) that allows you to
    * transform the remote response before the Bloodhound instance operates on it.
    * Defaults to the identity function.
    *
    * @param response Prefetch response.
    * @returns Transform response.
    */
  var transform: js.UndefOr[js.Function1[/* response */ T, T]] = js.native
  /**
    * The URL remote data should be loaded from.
    */
  var url: String = js.native
  /**
    * A convenience option for prepare. If set, prepare will be a function
    * that replaces the value of this option in url with the URI encoded query.
    */
  var wildcard: js.UndefOr[String] = js.native
}

object RemoteOptions {
  @scala.inline
  def apply[T](url: String): RemoteOptions[T] = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteOptions[T]]
  }
  @scala.inline
  implicit class RemoteOptionsOps[Self[t] <: RemoteOptions[t], T] (val x: Self[T]) extends AnyVal {
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
    def withFilter(value: /* response */ T => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFilter: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withPrepare(value: (/* query */ String, /* settings */ JQueryAjaxSettings) => JQueryAjaxSettings): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prepare")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutPrepare: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prepare")(js.undefined)
        ret
    }
    @scala.inline
    def withRateLimitWait(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rateLimitWait")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRateLimitWait: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rateLimitWait")(js.undefined)
        ret
    }
    @scala.inline
    def withRateLimitby(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rateLimitby")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRateLimitby: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rateLimitby")(js.undefined)
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
    def withWildcard(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wildcard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWildcard: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wildcard")(js.undefined)
        ret
    }
  }
  
}

