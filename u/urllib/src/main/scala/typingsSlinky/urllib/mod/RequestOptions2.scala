package typingsSlinky.urllib.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestOptions2 extends RequestOptions {
  var isRetry: js.UndefOr[js.Function1[/* res */ HttpClientResponse[_], Boolean]] = js.native
  var retry: js.UndefOr[Double] = js.native
  var retryDelay: js.UndefOr[Double] = js.native
}

object RequestOptions2 {
  @scala.inline
  def apply(): RequestOptions2 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestOptions2]
  }
  @scala.inline
  implicit class RequestOptions2Ops[Self <: RequestOptions2] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsRetry(value: /* res */ HttpClientResponse[_] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRetry")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutIsRetry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRetry")(js.undefined)
        ret
    }
    @scala.inline
    def withRetry(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retry")(js.undefined)
        ret
    }
    @scala.inline
    def withRetryDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retryDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetryDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retryDelay")(js.undefined)
        ret
    }
  }
  
}

