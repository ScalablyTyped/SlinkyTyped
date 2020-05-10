package typingsSlinky.senchaTouch.Ext.app

import typingsSlinky.senchaTouch.Ext.Array
import typingsSlinky.senchaTouch.Ext.mixin.IObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IController extends IObservable {
  /** [Config Option] (Ext.app.Application) */
  var application: js.UndefOr[IApplication] = js.native
  /** [Config Option] (Object) */
  var before: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Object) */
  var control: js.UndefOr[js.Any] = js.native
  /** [Method] Returns the value of application
  		* @returns Ext.app.Application
  		*/
  var getApplication: js.UndefOr[js.Function0[IApplication]] = js.native
  /** [Method] Returns the value of before
  		* @returns Object
  		*/
  var getBefore: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of control
  		* @returns Object
  		*/
  var getControl: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns a reference to another Controller
  		* @param controllerName String
  		* @param profile String
  		* @returns Object
  		*/
  var getController: js.UndefOr[
    js.Function2[/* controllerName */ js.UndefOr[String], /* profile */ js.UndefOr[String], _]
  ] = js.native
  /** [Method] Returns a reference to a Model
  		* @param modelName String
  		* @returns Object
  		*/
  var getModel: js.UndefOr[js.Function1[/* modelName */ js.UndefOr[String], _]] = js.native
  /** [Method] Returns the value of models
  		* @returns String[]
  		*/
  var getModels: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Returns the value of refs
  		* @returns Object
  		*/
  var getRefs: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of routes
  		* @returns Object
  		*/
  var getRoutes: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of stores
  		* @returns String[]
  		*/
  var getStores: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Returns the value of views
  		* @returns Array
  		*/
  var getViews: js.UndefOr[js.Function0[Array]] = js.native
  /** [Config Option] (Function) */
  var init: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Function) */
  var launch: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String[]) */
  var models: js.UndefOr[Array] = js.native
  /** [Method] Convenient way to redirect to a new url
  		* @param place Object
  		* @returns Object
  		*/
  var redirectTo: js.UndefOr[js.Function1[/* place */ js.UndefOr[js.Any], _]] = js.native
  /** [Config Option] (Object) */
  var refs: js.UndefOr[js.Any] = js.native
  /** [Method] Relays selected events from the specified Observable as if the events were fired by this
  		* @param object Object The Observable whose events this object is to relay.
  		* @param events String/Array/Object Array of event names to relay.
  		* @returns Ext.mixin.Observable this
  		*/
  @JSName("relayEvents")
  var relayEvents_IController: js.UndefOr[
    js.Function2[/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any], IObservable]
  ] = js.native
  /** [Config Option] (Object) */
  var routes: js.UndefOr[js.Any] = js.native
  /** [Method] Sets the value of application
  		* @param application Ext.app.Application The new value.
  		*/
  var setApplication: js.UndefOr[js.Function1[/* application */ js.UndefOr[IApplication], Unit]] = js.native
  /** [Method] Sets the value of before
  		* @param before Object The new value.
  		*/
  var setBefore: js.UndefOr[js.Function1[/* before */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of control
  		* @param control Object The new value.
  		*/
  var setControl: js.UndefOr[js.Function1[/* control */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of models
  		* @param models String[] The new value.
  		*/
  var setModels: js.UndefOr[js.Function1[/* models */ js.UndefOr[Array], Unit]] = js.native
  /** [Method] Sets the value of refs
  		* @param refs Object The new value.
  		*/
  var setRefs: js.UndefOr[js.Function1[/* refs */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of routes
  		* @param routes Object The new value.
  		*/
  var setRoutes: js.UndefOr[js.Function1[/* routes */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of stores
  		* @param stores String[] The new value.
  		*/
  var setStores: js.UndefOr[js.Function1[/* stores */ js.UndefOr[Array], Unit]] = js.native
  /** [Method] Sets the value of views
  		* @param views Array The new value.
  		*/
  var setViews: js.UndefOr[js.Function1[/* views */ js.UndefOr[Array], Unit]] = js.native
  /** [Config Option] (String[]) */
  var stores: js.UndefOr[Array] = js.native
  /** [Config Option] (Array) */
  var views: js.UndefOr[Array] = js.native
}

object IController {
  @scala.inline
  def apply(): IController = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IController]
  }
  @scala.inline
  implicit class IControllerOps[Self <: IController] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplication(value: IApplication): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplication: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("application")(js.undefined)
        ret
    }
    @scala.inline
    def withBefore(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(js.undefined)
        ret
    }
    @scala.inline
    def withControl(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("control")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("control")(js.undefined)
        ret
    }
    @scala.inline
    def withGetApplication(value: () => IApplication): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getApplication")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetApplication: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getApplication")(js.undefined)
        ret
    }
    @scala.inline
    def withGetBefore(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBefore")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBefore")(js.undefined)
        ret
    }
    @scala.inline
    def withGetControl(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getControl")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getControl")(js.undefined)
        ret
    }
    @scala.inline
    def withGetController(value: (/* controllerName */ js.UndefOr[String], /* profile */ js.UndefOr[String]) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getController")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGetController: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getController")(js.undefined)
        ret
    }
    @scala.inline
    def withGetModel(value: /* modelName */ js.UndefOr[String] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getModel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getModel")(js.undefined)
        ret
    }
    @scala.inline
    def withGetModels(value: () => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getModels")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetModels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getModels")(js.undefined)
        ret
    }
    @scala.inline
    def withGetRefs(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRefs")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetRefs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRefs")(js.undefined)
        ret
    }
    @scala.inline
    def withGetRoutes(value: () => _): Self = {
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
    def withGetStores(value: () => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStores")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetStores: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStores")(js.undefined)
        ret
    }
    @scala.inline
    def withGetViews(value: () => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getViews")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetViews: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getViews")(js.undefined)
        ret
    }
    @scala.inline
    def withInit(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.undefined)
        ret
    }
    @scala.inline
    def withLaunch(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("launch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLaunch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("launch")(js.undefined)
        ret
    }
    @scala.inline
    def withModels(value: Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("models")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("models")(js.undefined)
        ret
    }
    @scala.inline
    def withRedirectTo(value: /* place */ js.UndefOr[js.Any] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirectTo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRedirectTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirectTo")(js.undefined)
        ret
    }
    @scala.inline
    def withRefs(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refs")(js.undefined)
        ret
    }
    @scala.inline
    def withRelayEvents(value: (/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any]) => IObservable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relayEvents")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRelayEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relayEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withRoutes(value: js.Any): Self = {
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
    def withSetApplication(value: /* application */ js.UndefOr[IApplication] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setApplication")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetApplication: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setApplication")(js.undefined)
        ret
    }
    @scala.inline
    def withSetBefore(value: /* before */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBefore")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBefore")(js.undefined)
        ret
    }
    @scala.inline
    def withSetControl(value: /* control */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setControl")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setControl")(js.undefined)
        ret
    }
    @scala.inline
    def withSetModels(value: /* models */ js.UndefOr[Array] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setModels")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetModels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setModels")(js.undefined)
        ret
    }
    @scala.inline
    def withSetRefs(value: /* refs */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRefs")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetRefs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRefs")(js.undefined)
        ret
    }
    @scala.inline
    def withSetRoutes(value: /* routes */ js.UndefOr[js.Any] => Unit): Self = {
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
    @scala.inline
    def withSetStores(value: /* stores */ js.UndefOr[Array] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStores")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetStores: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStores")(js.undefined)
        ret
    }
    @scala.inline
    def withSetViews(value: /* views */ js.UndefOr[Array] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setViews")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetViews: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setViews")(js.undefined)
        ret
    }
    @scala.inline
    def withStores(value: Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stores")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStores: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stores")(js.undefined)
        ret
    }
    @scala.inline
    def withViews(value: Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("views")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViews: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("views")(js.undefined)
        ret
    }
  }
  
}

