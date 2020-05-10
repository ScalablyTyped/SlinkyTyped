package typingsSlinky.senchaTouch.Ext.app

import typingsSlinky.senchaTouch.Ext.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IApplication extends IController {
  /** [Config Option] (String) */
  var appFolder: js.UndefOr[String] = js.native
  /** [Config Option] (Array) */
  var controllers: js.UndefOr[Array] = js.native
  /** [Config Option] (Ext.app.Profile) */
  var currentProfile: js.UndefOr[IProfile] = js.native
  /** [Method] Dispatches a given Ext app Action to the relevant Controller instance
  		* @param action Ext.app.Action The action to dispatch.
  		* @param addToHistory Boolean Sets the browser's url to the action's url.
  		*/
  var dispatch: js.UndefOr[
    js.Function2[/* action */ js.UndefOr[IAction], /* addToHistory */ js.UndefOr[Boolean], Unit]
  ] = js.native
  /** [Method] Returns the value of appFolder
  		* @returns String
  		*/
  var getAppFolder: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the Controller instance for the given controller name
  		* @param name String The name of the Controller.
  		* @param profileName String Optional profile name. If passed, this is the same as calling getController('profileName.controllerName').
  		* @returns Ext.app.Controller controller instance or undefined.
  		*/
  @JSName("getController")
  var getController_IApplication: js.UndefOr[
    js.Function2[/* name */ js.UndefOr[String], /* profileName */ js.UndefOr[String], IController]
  ] = js.native
  /** [Method] Returns the value of controllers
  		* @returns Array
  		*/
  var getControllers: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Returns the value of currentProfile
  		* @returns Ext.app.Profile
  		*/
  var getCurrentProfile: js.UndefOr[js.Function0[IProfile]] = js.native
  /** [Method] Returns the value of history
  		* @returns Ext.app.History
  		*/
  var getHistory: js.UndefOr[js.Function0[IHistory]] = js.native
  /** [Method] Returns the value of launch
  		* @returns Function
  		*/
  var getLaunch: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of name
  		* @returns String
  		*/
  var getName: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of profiles
  		* @returns Array
  		*/
  var getProfiles: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Returns the value of requires
  		* @returns String[]
  		*/
  var getRequires: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Returns the value of router
  		* @returns Ext.app.Router
  		*/
  var getRouter: js.UndefOr[js.Function0[IRouter]] = js.native
  /** [Method] Returns the value of themeVariation
  		* @returns String/Function
  		*/
  var getThemeVariation: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of themeVariationPrefix
  		* @returns String
  		*/
  var getThemeVariationPrefix: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of themeVariationTransitionCls
  		* @returns String
  		*/
  var getThemeVariationTransitionCls: js.UndefOr[js.Function0[String]] = js.native
  /** [Config Option] (Boolean) */
  var glossOnIcon: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Ext.app.History) */
  var history: js.UndefOr[IHistory] = js.native
  /** [Config Option] (String/Object) */
  var icon: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Boolean) */
  var isIconPrecomposed: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  var name: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var phoneIcon: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var phoneStartupScreen: js.UndefOr[String] = js.native
  /** [Config Option] (Array) */
  var profiles: js.UndefOr[Array] = js.native
  /** [Method] Redirects the browser to the given url
  		* @param url String/Ext.data.Model The String url to redirect to.
  		*/
  @JSName("redirectTo")
  var redirectTo_IApplication: js.UndefOr[js.Function1[/* url */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Config Option] (String[]) */
  var requires: js.UndefOr[Array] = js.native
  /** [Config Option] (Ext.app.Router) */
  var router: js.UndefOr[IRouter] = js.native
  /** [Method] Sets the value of appFolder
  		* @param appFolder String The new value.
  		*/
  var setAppFolder: js.UndefOr[js.Function1[/* appFolder */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of controllers
  		* @param controllers Array The new value.
  		*/
  var setControllers: js.UndefOr[js.Function1[/* controllers */ js.UndefOr[Array], Unit]] = js.native
  /** [Method] Sets the value of currentProfile
  		* @param currentProfile Ext.app.Profile The new value.
  		*/
  var setCurrentProfile: js.UndefOr[js.Function1[/* currentProfile */ js.UndefOr[IProfile], Unit]] = js.native
  /** [Method] Sets the value of history
  		* @param history Ext.app.History The new value.
  		*/
  var setHistory: js.UndefOr[js.Function1[/* history */ js.UndefOr[IHistory], Unit]] = js.native
  /** [Method] Sets the value of launch
  		* @param launch Function The new value.
  		*/
  var setLaunch: js.UndefOr[js.Function1[/* launch */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of name
  		* @param name String The new value.
  		*/
  var setName: js.UndefOr[js.Function1[/* name */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of profiles
  		* @param profiles Array The new value.
  		*/
  var setProfiles: js.UndefOr[js.Function1[/* profiles */ js.UndefOr[Array], Unit]] = js.native
  /** [Method] Sets the value of requires
  		* @param requires String[] The new value.
  		*/
  var setRequires: js.UndefOr[js.Function1[/* requires */ js.UndefOr[Array], Unit]] = js.native
  /** [Method] Sets the value of router
  		* @param router Ext.app.Router The new value.
  		*/
  var setRouter: js.UndefOr[js.Function1[/* router */ js.UndefOr[IRouter], Unit]] = js.native
  /** [Method] Sets the value of themeVariation
  		* @param themeVariation String/Function The new value.
  		*/
  var setThemeVariation: js.UndefOr[js.Function1[/* themeVariation */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of themeVariationPrefix
  		* @param themeVariationPrefix String The new value.
  		*/
  var setThemeVariationPrefix: js.UndefOr[js.Function1[/* themeVariationPrefix */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of themeVariationTransitionCls
  		* @param themeVariationTransitionCls String The new value.
  		*/
  var setThemeVariationTransitionCls: js.UndefOr[js.Function1[/* themeVariationTransitionCls */ js.UndefOr[String], Unit]] = js.native
  /** [Config Option] (Object) */
  var startupImage: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String) */
  var statusBarStyle: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var tabletIcon: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var tabletStartupScreen: js.UndefOr[String] = js.native
  /** [Config Option] (String/Function) */
  var themeVariation: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String) */
  var themeVariationPrefix: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var themeVariationTransitionCls: js.UndefOr[String] = js.native
}

object IApplication {
  @scala.inline
  def apply(): IApplication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IApplication]
  }
  @scala.inline
  implicit class IApplicationOps[Self <: IApplication] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppFolder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appFolder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppFolder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appFolder")(js.undefined)
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
    def withCurrentProfile(value: IProfile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentProfile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentProfile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentProfile")(js.undefined)
        ret
    }
    @scala.inline
    def withDispatch(value: (/* action */ js.UndefOr[IAction], /* addToHistory */ js.UndefOr[Boolean]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispatch")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDispatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispatch")(js.undefined)
        ret
    }
    @scala.inline
    def withGetAppFolder(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAppFolder")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetAppFolder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAppFolder")(js.undefined)
        ret
    }
    @scala.inline
    def withGetController(value: (/* name */ js.UndefOr[String], /* profileName */ js.UndefOr[String]) => IController): Self = {
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
    def withGetCurrentProfile(value: () => IProfile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCurrentProfile")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetCurrentProfile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCurrentProfile")(js.undefined)
        ret
    }
    @scala.inline
    def withGetHistory(value: () => IHistory): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHistory")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetHistory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHistory")(js.undefined)
        ret
    }
    @scala.inline
    def withGetLaunch(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLaunch")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetLaunch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLaunch")(js.undefined)
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
    def withGetProfiles(value: () => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getProfiles")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetProfiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getProfiles")(js.undefined)
        ret
    }
    @scala.inline
    def withGetRequires(value: () => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRequires")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetRequires: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRequires")(js.undefined)
        ret
    }
    @scala.inline
    def withGetRouter(value: () => IRouter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRouter")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetRouter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRouter")(js.undefined)
        ret
    }
    @scala.inline
    def withGetThemeVariation(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getThemeVariation")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetThemeVariation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getThemeVariation")(js.undefined)
        ret
    }
    @scala.inline
    def withGetThemeVariationPrefix(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getThemeVariationPrefix")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetThemeVariationPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getThemeVariationPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withGetThemeVariationTransitionCls(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getThemeVariationTransitionCls")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetThemeVariationTransitionCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getThemeVariationTransitionCls")(js.undefined)
        ret
    }
    @scala.inline
    def withGlossOnIcon(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glossOnIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlossOnIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glossOnIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withHistory(value: IHistory): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("history")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHistory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("history")(js.undefined)
        ret
    }
    @scala.inline
    def withIcon(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(js.undefined)
        ret
    }
    @scala.inline
    def withIsIconPrecomposed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isIconPrecomposed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsIconPrecomposed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isIconPrecomposed")(js.undefined)
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
    def withPhoneIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phoneIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhoneIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phoneIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withPhoneStartupScreen(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phoneStartupScreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhoneStartupScreen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phoneStartupScreen")(js.undefined)
        ret
    }
    @scala.inline
    def withProfiles(value: Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProfiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profiles")(js.undefined)
        ret
    }
    @scala.inline
    def withRedirectTo(value: /* url */ js.UndefOr[js.Any] => Unit): Self = {
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
    def withRequires(value: Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requires")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequires: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requires")(js.undefined)
        ret
    }
    @scala.inline
    def withRouter(value: IRouter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("router")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRouter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("router")(js.undefined)
        ret
    }
    @scala.inline
    def withSetAppFolder(value: /* appFolder */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAppFolder")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetAppFolder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAppFolder")(js.undefined)
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
    def withSetCurrentProfile(value: /* currentProfile */ js.UndefOr[IProfile] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCurrentProfile")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetCurrentProfile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCurrentProfile")(js.undefined)
        ret
    }
    @scala.inline
    def withSetHistory(value: /* history */ js.UndefOr[IHistory] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHistory")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetHistory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHistory")(js.undefined)
        ret
    }
    @scala.inline
    def withSetLaunch(value: /* launch */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLaunch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetLaunch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLaunch")(js.undefined)
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
    def withSetProfiles(value: /* profiles */ js.UndefOr[Array] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setProfiles")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetProfiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setProfiles")(js.undefined)
        ret
    }
    @scala.inline
    def withSetRequires(value: /* requires */ js.UndefOr[Array] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRequires")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetRequires: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRequires")(js.undefined)
        ret
    }
    @scala.inline
    def withSetRouter(value: /* router */ js.UndefOr[IRouter] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRouter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetRouter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRouter")(js.undefined)
        ret
    }
    @scala.inline
    def withSetThemeVariation(value: /* themeVariation */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setThemeVariation")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetThemeVariation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setThemeVariation")(js.undefined)
        ret
    }
    @scala.inline
    def withSetThemeVariationPrefix(value: /* themeVariationPrefix */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setThemeVariationPrefix")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetThemeVariationPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setThemeVariationPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withSetThemeVariationTransitionCls(value: /* themeVariationTransitionCls */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setThemeVariationTransitionCls")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetThemeVariationTransitionCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setThemeVariationTransitionCls")(js.undefined)
        ret
    }
    @scala.inline
    def withStartupImage(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startupImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartupImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startupImage")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusBarStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusBarStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusBarStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusBarStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withTabletIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabletIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabletIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabletIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withTabletStartupScreen(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabletStartupScreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabletStartupScreen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabletStartupScreen")(js.undefined)
        ret
    }
    @scala.inline
    def withThemeVariation(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("themeVariation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThemeVariation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("themeVariation")(js.undefined)
        ret
    }
    @scala.inline
    def withThemeVariationPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("themeVariationPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThemeVariationPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("themeVariationPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withThemeVariationTransitionCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("themeVariationTransitionCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThemeVariationTransitionCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("themeVariationTransitionCls")(js.undefined)
        ret
    }
  }
  
}

