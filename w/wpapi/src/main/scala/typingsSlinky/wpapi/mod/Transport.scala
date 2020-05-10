package typingsSlinky.wpapi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transport extends js.Object {
  var delete: js.UndefOr[TransportFunction] = js.native
  var get: js.UndefOr[TransportFunction] = js.native
  var head: js.UndefOr[TransportFunction] = js.native
  var post: js.UndefOr[TransportFunction] = js.native
  var put: js.UndefOr[TransportFunction] = js.native
}

object Transport {
  @scala.inline
  def apply(): Transport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Transport]
  }
  @scala.inline
  implicit class TransportOps[Self <: Transport] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelete(value: (/* wpreq */ WPRequest, /* cb */ js.UndefOr[WPRequestCallback]) => js.Promise[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDelete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.undefined)
        ret
    }
    @scala.inline
    def withGet(value: (/* wpreq */ WPRequest, /* cb */ js.UndefOr[WPRequestCallback]) => js.Promise[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.undefined)
        ret
    }
    @scala.inline
    def withHead(value: (/* wpreq */ WPRequest, /* cb */ js.UndefOr[WPRequestCallback]) => js.Promise[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("head")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutHead: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("head")(js.undefined)
        ret
    }
    @scala.inline
    def withPost(value: (/* wpreq */ WPRequest, /* cb */ js.UndefOr[WPRequestCallback]) => js.Promise[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("post")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutPost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("post")(js.undefined)
        ret
    }
    @scala.inline
    def withPut(value: (/* wpreq */ WPRequest, /* cb */ js.UndefOr[WPRequestCallback]) => js.Promise[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("put")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutPut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("put")(js.undefined)
        ret
    }
  }
  
}

