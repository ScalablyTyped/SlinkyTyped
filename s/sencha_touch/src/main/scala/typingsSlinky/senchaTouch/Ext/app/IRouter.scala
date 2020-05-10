package typingsSlinky.senchaTouch.Ext.app

import typingsSlinky.senchaTouch.Ext.Array
import typingsSlinky.senchaTouch.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRouter extends IBase {
  /** [Method] Connects a url based route to a controller action pair plus additional params
  		* @param url String The url to recognize.
  		* @param params Object Additional parameters.
  		*/
  var connect: js.UndefOr[
    js.Function2[/* url */ js.UndefOr[String], /* params */ js.UndefOr[js.Any], Unit]
  ] = js.native
  /** [Config Option] (Object) */
  var defaults: js.UndefOr[js.Any] = js.native
  /** [Method] Convenience method which just calls the supplied function with the Router instance
  		* @param fn Function The fn to call
  		*/
  var draw: js.UndefOr[js.Function1[/* fn */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Returns the value of defaults
  		* @returns Object
  		*/
  var getDefaults: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of routes
  		* @returns Array
  		*/
  var getRoutes: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Recognizes a url string connected to the Router return the controller action pair plus any additional config associa
  		* @param url String The url to recognize.
  		* @returns Object/undefined If the url was recognized, the controller and action to call, else undefined.
  		*/
  var recognize: js.UndefOr[js.Function1[/* url */ js.UndefOr[String], _]] = js.native
  /** [Config Option] (Array) */
  var routes: js.UndefOr[Array] = js.native
  /** [Method] Sets the value of defaults
  		* @param defaults Object The new value.
  		*/
  var setDefaults: js.UndefOr[js.Function1[/* defaults */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of routes
  		* @param routes Array The new value.
  		*/
  var setRoutes: js.UndefOr[js.Function1[/* routes */ js.UndefOr[Array], Unit]] = js.native
}

object IRouter {
  @scala.inline
  def apply(): IRouter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRouter]
  }
  @scala.inline
  implicit class IRouterOps[Self <: IRouter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnect(value: (/* url */ js.UndefOr[String], /* params */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connect")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutConnect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connect")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaults(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaults")(js.undefined)
        ret
    }
    @scala.inline
    def withDraw(value: /* fn */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draw")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDraw: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draw")(js.undefined)
        ret
    }
    @scala.inline
    def withGetDefaults(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDefaults")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetDefaults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDefaults")(js.undefined)
        ret
    }
    @scala.inline
    def withGetRoutes(value: () => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRoutes")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetRoutes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRoutes")(js.undefined)
        ret
    }
    @scala.inline
    def withRecognize(value: /* url */ js.UndefOr[String] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recognize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRecognize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recognize")(js.undefined)
        ret
    }
    @scala.inline
    def withRoutes(value: Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoutes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routes")(js.undefined)
        ret
    }
    @scala.inline
    def withSetDefaults(value: /* defaults */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDefaults")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetDefaults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDefaults")(js.undefined)
        ret
    }
    @scala.inline
    def withSetRoutes(value: /* routes */ js.UndefOr[Array] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRoutes")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetRoutes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRoutes")(js.undefined)
        ret
    }
  }
  
}

