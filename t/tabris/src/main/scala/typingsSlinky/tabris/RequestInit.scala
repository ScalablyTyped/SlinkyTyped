package typingsSlinky.tabris

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.tabris.tabrisStrings.`force-cache`
import typingsSlinky.tabris.tabrisStrings.`no-cache`
import typingsSlinky.tabris.tabrisStrings.`no-cors`
import typingsSlinky.tabris.tabrisStrings.`no-store`
import typingsSlinky.tabris.tabrisStrings.`only-if-cached`
import typingsSlinky.tabris.tabrisStrings.`same-origin`
import typingsSlinky.tabris.tabrisStrings.cors
import typingsSlinky.tabris.tabrisStrings.default
import typingsSlinky.tabris.tabrisStrings.include
import typingsSlinky.tabris.tabrisStrings.omit
import typingsSlinky.tabris.tabrisStrings.reload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// RequestInit
@js.native
trait RequestInit extends js.Object {
  /**
    * The body of the request. GET or HEAD requests can not have a body.
    */
  var body: js.UndefOr[Blob | FormData | String] = js.native
  var cache: js.UndefOr[default | `force-cache` | `no-cache` | `no-store` | `only-if-cached` | reload] = js.native
  var credentials: js.UndefOr[include | omit | `same-origin`] = js.native
  /**
    * The headers to add to the request.
    */
  var headers: js.UndefOr[Headers | (js.Array[js.Tuple2[String, String]]) | StringDictionary[String]] = js.native
  /**
    * The request method, e.g., `'GET'`, `'POST'`.
    */
  var method: js.UndefOr[String] = js.native
  var mode: js.UndefOr[cors | `no-cors` | `same-origin`] = js.native
}

object RequestInit {
  @scala.inline
  def apply(): RequestInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestInit]
  }
  @scala.inline
  implicit class RequestInitOps[Self <: RequestInit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBody(value: Blob | FormData | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(js.undefined)
        ret
    }
    @scala.inline
    def withCache(value: default | `force-cache` | `no-cache` | `no-store` | `only-if-cached` | reload): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(js.undefined)
        ret
    }
    @scala.inline
    def withCredentials(value: include | omit | `same-origin`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credentials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCredentials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credentials")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaders(value: Headers | (js.Array[js.Tuple2[String, String]]) | StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.undefined)
        ret
    }
    @scala.inline
    def withMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: cors | `no-cors` | `same-origin`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
  }
  
}

