package typingsSlinky.senchaTouch.Ext.app

import typingsSlinky.senchaTouch.Ext.Array
import typingsSlinky.senchaTouch.Ext.mixin.IObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IProfile extends IObservable {
  /** [Config Option] (Ext.app.Application) */
  var application: js.UndefOr[IApplication] = js.native
  /** [Config Option] (Array) */
  var controllers: js.UndefOr[Array] = js.native
  /** [Method] Returns the value of application
  		* @returns Ext.app.Application
  		*/
  var getApplication: js.UndefOr[js.Function0[IApplication]] = js.native
  /** [Method] Returns the value of controllers
  		* @returns Array
  		*/
  var getControllers: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Returns the value of models
  		* @returns Array
  		*/
  var getModels: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Returns the value of name
  		* @returns String
  		*/
  var getName: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of namespace
  		* @returns String
  		*/
  var getNamespace: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of stores
  		* @returns Array
  		*/
  var getStores: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Returns the value of views
  		* @returns Array
  		*/
  var getViews: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Determines whether or not this Profile is active on the device isActive is executed on
  		* @returns Boolean True if this Profile should be activated on the device it is running on, false otherwise
  		*/
  var isActive: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] The launch function is called by the Application if this Profile s isActive function returned true  */
  var launch: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (Array) */
  var models: js.UndefOr[Array] = js.native
  /** [Config Option] (String) */
  var name: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var namespace: js.UndefOr[String] = js.native
  /** [Method] Relays selected events from the specified Observable as if the events were fired by this
  		* @param object Object The Observable whose events this object is to relay.
  		* @param events String/Array/Object Array of event names to relay.
  		* @returns Ext.mixin.Observable this
  		*/
  @JSName("relayEvents")
  var relayEvents_IProfile: js.UndefOr[
    js.Function2[/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any], IObservable]
  ] = js.native
  /** [Method] Sets the value of application
  		* @param application Ext.app.Application The new value.
  		*/
  var setApplication: js.UndefOr[js.Function1[/* application */ js.UndefOr[IApplication], Unit]] = js.native
  /** [Method] Sets the value of controllers
  		* @param controllers Array The new value.
  		*/
  var setControllers: js.UndefOr[js.Function1[/* controllers */ js.UndefOr[Array], Unit]] = js.native
  /** [Method] Sets the value of models
  		* @param models Array The new value.
  		*/
  var setModels: js.UndefOr[js.Function1[/* models */ js.UndefOr[Array], Unit]] = js.native
  /** [Method] Sets the value of name
  		* @param name String The new value.
  		*/
  var setName: js.UndefOr[js.Function1[/* name */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of namespace
  		* @param namespace String The new value.
  		*/
  var setNamespace: js.UndefOr[js.Function1[/* namespace */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of stores
  		* @param stores Array The new value.
  		*/
  var setStores: js.UndefOr[js.Function1[/* stores */ js.UndefOr[Array], Unit]] = js.native
  /** [Method] Sets the value of views
  		* @param views Array The new value.
  		*/
  var setViews: js.UndefOr[js.Function1[/* views */ js.UndefOr[Array], Unit]] = js.native
  /** [Config Option] (Array) */
  var stores: js.UndefOr[Array] = js.native
  /** [Config Option] (Array) */
  var views: js.UndefOr[Array] = js.native
}

object IProfile {
  @scala.inline
  def apply(): IProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IProfile]
  }
  @scala.inline
  implicit class IProfileOps[Self <: IProfile] (val x: Self) extends AnyVal {
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
    def withControllers(value: Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controllers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutControllers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controllers")(js.undefined)
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
    def withGetControllers(value: () => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getControllers")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetControllers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getControllers")(js.undefined)
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
    def withGetName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getName")(js.undefined)
        ret
    }
    @scala.inline
    def withGetNamespace(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNamespace")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetNamespace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNamespace")(js.undefined)
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
    def withIsActive(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isActive")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutIsActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isActive")(js.undefined)
        ret
    }
    @scala.inline
    def withLaunch(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("launch")(js.Any.fromFunction0(value))
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
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withNamespace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamespace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespace")(js.undefined)
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
    def withSetControllers(value: /* controllers */ js.UndefOr[Array] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setControllers")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetControllers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setControllers")(js.undefined)
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
    def withSetName(value: /* name */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setName")(js.undefined)
        ret
    }
    @scala.inline
    def withSetNamespace(value: /* namespace */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setNamespace")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetNamespace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setNamespace")(js.undefined)
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

