package typingsSlinky.yog2Kernel.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.expressServeStaticCore.mod.NextFunction
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionObject
  extends /* key */ StringDictionary[js.Any] {
  var copy: js.UndefOr[RequestHandler[ParamsDictionary, _, _, Query]] = js.native
  var del: js.UndefOr[RequestHandler[ParamsDictionary, _, _, Query]] = js.native
  var delete: js.UndefOr[RequestHandler[ParamsDictionary, _, _, Query]] = js.native
  var get: js.UndefOr[RequestHandler[ParamsDictionary, _, _, Query]] = js.native
  var head: js.UndefOr[RequestHandler[ParamsDictionary, _, _, Query]] = js.native
  var link: js.UndefOr[RequestHandler[ParamsDictionary, _, _, Query]] = js.native
  var lock: js.UndefOr[RequestHandler[ParamsDictionary, _, _, Query]] = js.native
  var options: js.UndefOr[RequestHandler[ParamsDictionary, _, _, Query]] = js.native
  var patch: js.UndefOr[RequestHandler[ParamsDictionary, _, _, Query]] = js.native
  var post: js.UndefOr[RequestHandler[ParamsDictionary, _, _, Query]] = js.native
  var propfind: js.UndefOr[RequestHandler[ParamsDictionary, _, _, Query]] = js.native
  var purge: js.UndefOr[RequestHandler[ParamsDictionary, _, _, Query]] = js.native
  var put: js.UndefOr[RequestHandler[ParamsDictionary, _, _, Query]] = js.native
  var unlick: js.UndefOr[RequestHandler[ParamsDictionary, _, _, Query]] = js.native
  var unlock: js.UndefOr[RequestHandler[ParamsDictionary, _, _, Query]] = js.native
  var view: js.UndefOr[RequestHandler[ParamsDictionary, _, _, Query]] = js.native
}

object ActionObject {
  @scala.inline
  def apply(): ActionObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionObject]
  }
  @scala.inline
  implicit class ActionObjectOps[Self <: ActionObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCopy(
      value: (/* req */ typingsSlinky.expressServeStaticCore.mod.Request[ParamsDictionary, _, _, Query], /* res */ typingsSlinky.expressServeStaticCore.mod.Response[_], /* next */ NextFunction) => js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copy")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutCopy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copy")(js.undefined)
        ret
    }
    @scala.inline
    def withDel(
      value: (/* req */ typingsSlinky.expressServeStaticCore.mod.Request[ParamsDictionary, _, _, Query], /* res */ typingsSlinky.expressServeStaticCore.mod.Response[_], /* next */ NextFunction) => js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("del")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutDel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("del")(js.undefined)
        ret
    }
    @scala.inline
    def withDelete(
      value: (/* req */ typingsSlinky.expressServeStaticCore.mod.Request[ParamsDictionary, _, _, Query], /* res */ typingsSlinky.expressServeStaticCore.mod.Response[_], /* next */ NextFunction) => js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutDelete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.undefined)
        ret
    }
    @scala.inline
    def withGet(
      value: (/* req */ typingsSlinky.expressServeStaticCore.mod.Request[ParamsDictionary, _, _, Query], /* res */ typingsSlinky.expressServeStaticCore.mod.Response[_], /* next */ NextFunction) => js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutGet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.undefined)
        ret
    }
    @scala.inline
    def withHead(
      value: (/* req */ typingsSlinky.expressServeStaticCore.mod.Request[ParamsDictionary, _, _, Query], /* res */ typingsSlinky.expressServeStaticCore.mod.Response[_], /* next */ NextFunction) => js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("head")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutHead: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("head")(js.undefined)
        ret
    }
    @scala.inline
    def withLink(
      value: (/* req */ typingsSlinky.expressServeStaticCore.mod.Request[ParamsDictionary, _, _, Query], /* res */ typingsSlinky.expressServeStaticCore.mod.Response[_], /* next */ NextFunction) => js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(js.undefined)
        ret
    }
    @scala.inline
    def withLock(
      value: (/* req */ typingsSlinky.expressServeStaticCore.mod.Request[ParamsDictionary, _, _, Query], /* res */ typingsSlinky.expressServeStaticCore.mod.Response[_], /* next */ NextFunction) => js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lock")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutLock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lock")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(
      value: (/* req */ typingsSlinky.expressServeStaticCore.mod.Request[ParamsDictionary, _, _, Query], /* res */ typingsSlinky.expressServeStaticCore.mod.Response[_], /* next */ NextFunction) => js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
    @scala.inline
    def withPatch(
      value: (/* req */ typingsSlinky.expressServeStaticCore.mod.Request[ParamsDictionary, _, _, Query], /* res */ typingsSlinky.expressServeStaticCore.mod.Response[_], /* next */ NextFunction) => js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutPatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.undefined)
        ret
    }
    @scala.inline
    def withPost(
      value: (/* req */ typingsSlinky.expressServeStaticCore.mod.Request[ParamsDictionary, _, _, Query], /* res */ typingsSlinky.expressServeStaticCore.mod.Response[_], /* next */ NextFunction) => js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("post")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutPost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("post")(js.undefined)
        ret
    }
    @scala.inline
    def withPropfind(
      value: (/* req */ typingsSlinky.expressServeStaticCore.mod.Request[ParamsDictionary, _, _, Query], /* res */ typingsSlinky.expressServeStaticCore.mod.Response[_], /* next */ NextFunction) => js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propfind")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutPropfind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propfind")(js.undefined)
        ret
    }
    @scala.inline
    def withPurge(
      value: (/* req */ typingsSlinky.expressServeStaticCore.mod.Request[ParamsDictionary, _, _, Query], /* res */ typingsSlinky.expressServeStaticCore.mod.Response[_], /* next */ NextFunction) => js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("purge")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutPurge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("purge")(js.undefined)
        ret
    }
    @scala.inline
    def withPut(
      value: (/* req */ typingsSlinky.expressServeStaticCore.mod.Request[ParamsDictionary, _, _, Query], /* res */ typingsSlinky.expressServeStaticCore.mod.Response[_], /* next */ NextFunction) => js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("put")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutPut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("put")(js.undefined)
        ret
    }
    @scala.inline
    def withUnlick(
      value: (/* req */ typingsSlinky.expressServeStaticCore.mod.Request[ParamsDictionary, _, _, Query], /* res */ typingsSlinky.expressServeStaticCore.mod.Response[_], /* next */ NextFunction) => js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unlick")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutUnlick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unlick")(js.undefined)
        ret
    }
    @scala.inline
    def withUnlock(
      value: (/* req */ typingsSlinky.expressServeStaticCore.mod.Request[ParamsDictionary, _, _, Query], /* res */ typingsSlinky.expressServeStaticCore.mod.Response[_], /* next */ NextFunction) => js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unlock")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutUnlock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unlock")(js.undefined)
        ret
    }
    @scala.inline
    def withView(
      value: (/* req */ typingsSlinky.expressServeStaticCore.mod.Request[ParamsDictionary, _, _, Query], /* res */ typingsSlinky.expressServeStaticCore.mod.Response[_], /* next */ NextFunction) => js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(js.undefined)
        ret
    }
  }
  
}

