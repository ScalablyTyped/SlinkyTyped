package typingsSlinky.sharepoint.SP

import typingsSlinky.microsoftAjax.Sys.Net.WebRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageRequest extends js.Object {
  def add_failed(value: js.Function2[/* sender */ js.Any, /* args */ PageRequestFailedEventArgs, Unit]): Unit = js.native
  def add_succeeded(value: js.Function2[/* sender */ js.Any, /* args */ PageRequestSucceededEventArgs, Unit]): Unit = js.native
  def get(): Unit = js.native
  def get_expectedContentType(): String = js.native
  def get_request(): WebRequest = js.native
  def get_url(): String = js.native
  def post(body: String): Unit = js.native
  def remove_failed(value: js.Function2[/* sender */ js.Any, /* args */ PageRequestFailedEventArgs, Unit]): Unit = js.native
  def remove_succeeded(value: js.Function2[/* sender */ js.Any, /* args */ PageRequestSucceededEventArgs, Unit]): Unit = js.native
  def set_expectedContentType(value: String): Unit = js.native
  def set_url(value: String): Unit = js.native
}

object PageRequest {
  @scala.inline
  def apply(
    add_failed: js.Function2[/* sender */ js.Any, /* args */ PageRequestFailedEventArgs, Unit] => Unit,
    add_succeeded: js.Function2[/* sender */ js.Any, /* args */ PageRequestSucceededEventArgs, Unit] => Unit,
    get: () => Unit,
    get_expectedContentType: () => String,
    get_request: () => WebRequest,
    get_url: () => String,
    post: String => Unit,
    remove_failed: js.Function2[/* sender */ js.Any, /* args */ PageRequestFailedEventArgs, Unit] => Unit,
    remove_succeeded: js.Function2[/* sender */ js.Any, /* args */ PageRequestSucceededEventArgs, Unit] => Unit,
    set_expectedContentType: String => Unit,
    set_url: String => Unit
  ): PageRequest = {
    val __obj = js.Dynamic.literal(add_failed = js.Any.fromFunction1(add_failed), add_succeeded = js.Any.fromFunction1(add_succeeded), get = js.Any.fromFunction0(get), get_expectedContentType = js.Any.fromFunction0(get_expectedContentType), get_request = js.Any.fromFunction0(get_request), get_url = js.Any.fromFunction0(get_url), post = js.Any.fromFunction1(post), remove_failed = js.Any.fromFunction1(remove_failed), remove_succeeded = js.Any.fromFunction1(remove_succeeded), set_expectedContentType = js.Any.fromFunction1(set_expectedContentType), set_url = js.Any.fromFunction1(set_url))
    __obj.asInstanceOf[PageRequest]
  }
  @scala.inline
  implicit class PageRequestOps[Self <: PageRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd_failed(value: js.Function2[/* sender */ js.Any, /* args */ PageRequestFailedEventArgs, Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add_failed")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAdd_succeeded(value: js.Function2[/* sender */ js.Any, /* args */ PageRequestSucceededEventArgs, Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add_succeeded")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_expectedContentType(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_expectedContentType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_request(value: () => WebRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_request")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_url(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_url")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPost(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("post")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemove_failed(value: js.Function2[/* sender */ js.Any, /* args */ PageRequestFailedEventArgs, Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove_failed")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemove_succeeded(value: js.Function2[/* sender */ js.Any, /* args */ PageRequestSucceededEventArgs, Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove_succeeded")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSet_expectedContentType(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set_expectedContentType")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSet_url(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set_url")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

