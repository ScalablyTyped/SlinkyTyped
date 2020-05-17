package typingsSlinky.storybookAddonKnobs.anon

import typingsSlinky.storybookApi.urlMod.QueryParams
import typingsSlinky.storybookChannels.mod.Listener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<@storybook/api.@storybook/api.API, 'on' | 'off' | 'emit' | 'getQueryParam' | 'setQueryParams'> */
@js.native
trait PickAPIonoffemitgetQueryP extends js.Object {
  var emit: js.Function2[/* type */ String, /* repeated */ js.Any, Unit] = js.native
  var getQueryParam: js.Function1[/* key */ String, js.UndefOr[String]] = js.native
  var off: js.Function2[/* type */ String, /* cb */ Listener, Unit] = js.native
  var on: js.Function2[/* type */ String, /* cb */ Listener, js.Function0[Unit]] = js.native
  var setQueryParams: js.Function1[/* input */ QueryParams, Unit] = js.native
}

object PickAPIonoffemitgetQueryP {
  @scala.inline
  def apply(
    emit: (/* type */ String, /* repeated */ js.Any) => Unit,
    getQueryParam: /* key */ String => js.UndefOr[String],
    off: (/* type */ String, /* cb */ Listener) => Unit,
    on: (/* type */ String, /* cb */ Listener) => js.Function0[Unit],
    setQueryParams: /* input */ QueryParams => Unit
  ): PickAPIonoffemitgetQueryP = {
    val __obj = js.Dynamic.literal(emit = js.Any.fromFunction2(emit), getQueryParam = js.Any.fromFunction1(getQueryParam), off = js.Any.fromFunction2(off), on = js.Any.fromFunction2(on), setQueryParams = js.Any.fromFunction1(setQueryParams))
    __obj.asInstanceOf[PickAPIonoffemitgetQueryP]
  }
  @scala.inline
  implicit class PickAPIonoffemitgetQueryPOps[Self <: PickAPIonoffemitgetQueryP] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmit(value: (/* type */ String, /* repeated */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emit")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetQueryParam(value: /* key */ String => js.UndefOr[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getQueryParam")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOff(value: (/* type */ String, /* cb */ Listener) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("off")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOn(value: (/* type */ String, /* cb */ Listener) => js.Function0[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetQueryParams(value: /* input */ QueryParams => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setQueryParams")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

