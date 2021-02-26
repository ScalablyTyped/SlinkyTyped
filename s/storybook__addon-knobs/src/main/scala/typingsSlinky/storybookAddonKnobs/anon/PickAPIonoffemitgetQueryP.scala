package typingsSlinky.storybookAddonKnobs.anon

import typingsSlinky.storybookApi.urlMod.QueryParams
import typingsSlinky.storybookChannels.mod.Listener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@storybook/api.@storybook/api.API, 'on' | 'off' | 'emit' | 'getQueryParam' | 'setQueryParams'> */
@js.native
trait PickAPIonoffemitgetQueryP extends StObject {
  
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
  implicit class PickAPIonoffemitgetQueryPMutableBuilder[Self <: PickAPIonoffemitgetQueryP] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmit(value: (/* type */ String, /* repeated */ js.Any) => Unit): Self = StObject.set(x, "emit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetQueryParam(value: /* key */ String => js.UndefOr[String]): Self = StObject.set(x, "getQueryParam", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOff(value: (/* type */ String, /* cb */ Listener) => Unit): Self = StObject.set(x, "off", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOn(value: (/* type */ String, /* cb */ Listener) => js.Function0[Unit]): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetQueryParams(value: /* input */ QueryParams => Unit): Self = StObject.set(x, "setQueryParams", js.Any.fromFunction1(value))
  }
}
