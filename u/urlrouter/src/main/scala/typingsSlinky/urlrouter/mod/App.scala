package typingsSlinky.urlrouter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait App extends js.Object {
  def all(urlpattern: String, handler: HttpHandler): Unit = js.native
  def checkout(urlpattern: String, handler: HttpHandler): Unit = js.native
  def copy(urlpattern: String, handler: HttpHandler): Unit = js.native
  def delete(urlpattern: String, handler: HttpHandler): Unit = js.native
  // https://github.com/visionmedia/node-methods/blob/master/index.js
  def get(urlpattern: String, handler: HttpHandler): Unit = js.native
  def head(urlpattern: String, handler: HttpHandler): Unit = js.native
  def lock(urlpattern: String, handler: HttpHandler): Unit = js.native
  def `m-search`(urlpattern: String, handler: HttpHandler): Unit = js.native
  def merge(urlpattern: String, handler: HttpHandler): Unit = js.native
  def mkactivity(urlpattern: String, handler: HttpHandler): Unit = js.native
  def mkcol(urlpattern: String, handler: HttpHandler): Unit = js.native
  def move(urlpattern: String, handler: HttpHandler): Unit = js.native
  def notify(urlpattern: String, handler: HttpHandler): Unit = js.native
  def options(urlpattern: String, handler: HttpHandler): Unit = js.native
  def patch(urlpattern: String, handler: HttpHandler): Unit = js.native
  def post(urlpattern: String, handler: HttpHandler): Unit = js.native
  def propfind(urlpattern: String, handler: HttpHandler): Unit = js.native
  def proppatch(urlpattern: String, handler: HttpHandler): Unit = js.native
  def put(urlpattern: String, handler: HttpHandler): Unit = js.native
  def redirect(urlpattern: String, to: String): Unit = js.native
  def report(urlpattern: String, handler: HttpHandler): Unit = js.native
  def search(urlpattern: String, handler: HttpHandler): Unit = js.native
  def subscribe(urlpattern: String, handler: HttpHandler): Unit = js.native
  def trace(urlpattern: String, handler: HttpHandler): Unit = js.native
  def unlock(urlpattern: String, handler: HttpHandler): Unit = js.native
  def unsubscribe(urlpattern: String, handler: HttpHandler): Unit = js.native
}

object App {
  @scala.inline
  def apply(
    all: (String, HttpHandler) => Unit,
    checkout: (String, HttpHandler) => Unit,
    copy: (String, HttpHandler) => Unit,
    delete: (String, HttpHandler) => Unit,
    get: (String, HttpHandler) => Unit,
    head: (String, HttpHandler) => Unit,
    lock: (String, HttpHandler) => Unit,
    `m-search`: (String, HttpHandler) => Unit,
    merge: (String, HttpHandler) => Unit,
    mkactivity: (String, HttpHandler) => Unit,
    mkcol: (String, HttpHandler) => Unit,
    move: (String, HttpHandler) => Unit,
    notify: (String, HttpHandler) => Unit,
    options: (String, HttpHandler) => Unit,
    patch: (String, HttpHandler) => Unit,
    post: (String, HttpHandler) => Unit,
    propfind: (String, HttpHandler) => Unit,
    proppatch: (String, HttpHandler) => Unit,
    put: (String, HttpHandler) => Unit,
    redirect: (String, String) => Unit,
    report: (String, HttpHandler) => Unit,
    search: (String, HttpHandler) => Unit,
    subscribe: (String, HttpHandler) => Unit,
    trace: (String, HttpHandler) => Unit,
    unlock: (String, HttpHandler) => Unit,
    unsubscribe: (String, HttpHandler) => Unit
  ): App = {
    val __obj = js.Dynamic.literal(all = js.Any.fromFunction2(all), checkout = js.Any.fromFunction2(checkout), copy = js.Any.fromFunction2(copy), delete = js.Any.fromFunction2(delete), get = js.Any.fromFunction2(get), head = js.Any.fromFunction2(head), lock = js.Any.fromFunction2(lock), merge = js.Any.fromFunction2(merge), mkactivity = js.Any.fromFunction2(mkactivity), mkcol = js.Any.fromFunction2(mkcol), move = js.Any.fromFunction2(move), notify = js.Any.fromFunction2(notify), options = js.Any.fromFunction2(options), patch = js.Any.fromFunction2(patch), post = js.Any.fromFunction2(post), propfind = js.Any.fromFunction2(propfind), proppatch = js.Any.fromFunction2(proppatch), put = js.Any.fromFunction2(put), redirect = js.Any.fromFunction2(redirect), report = js.Any.fromFunction2(report), search = js.Any.fromFunction2(search), subscribe = js.Any.fromFunction2(subscribe), trace = js.Any.fromFunction2(trace), unlock = js.Any.fromFunction2(unlock), unsubscribe = js.Any.fromFunction2(unsubscribe))
    __obj.updateDynamic("m-search")(js.Any.fromFunction2(`m-search`))
    __obj.asInstanceOf[App]
  }
  @scala.inline
  implicit class AppOps[Self <: App] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAll(value: (String, HttpHandler) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("all")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCheckout(value: (String, HttpHandler) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkout")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCopy(value: (String, HttpHandler) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copy")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDelete(value: (String, HttpHandler) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGet(value: (String, HttpHandler) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withHead(value: (String, HttpHandler) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("head")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withLock(value: (String, HttpHandler) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lock")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def `withM-search`(value: (String, HttpHandler) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("m-search")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withMerge(value: (String, HttpHandler) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merge")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withMkactivity(value: (String, HttpHandler) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mkactivity")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withMkcol(value: (String, HttpHandler) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mkcol")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withMove(value: (String, HttpHandler) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("move")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withNotify(value: (String, HttpHandler) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notify")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOptions(value: (String, HttpHandler) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withPatch(value: (String, HttpHandler) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withPost(value: (String, HttpHandler) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("post")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withPropfind(value: (String, HttpHandler) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propfind")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withProppatch(value: (String, HttpHandler) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proppatch")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withPut(value: (String, HttpHandler) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("put")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRedirect(value: (String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirect")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withReport(value: (String, HttpHandler) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("report")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSearch(value: (String, HttpHandler) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSubscribe(value: (String, HttpHandler) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscribe")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withTrace(value: (String, HttpHandler) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trace")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withUnlock(value: (String, HttpHandler) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unlock")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withUnsubscribe(value: (String, HttpHandler) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsubscribe")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

