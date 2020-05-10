package typingsSlinky.senchaTouch.Ext.app

import typingsSlinky.senchaTouch.Ext.Array
import typingsSlinky.senchaTouch.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAction extends IBase {
  /** [Config Option] (String) */
  var action: js.UndefOr[String] = js.native
  /** [Config Option] (Ext.app.Application) */
  var application: js.UndefOr[IApplication] = js.native
  /** [Config Option] (Array) */
  var args: js.UndefOr[Array] = js.native
  /** [Config Option] (Array) */
  var beforeFilters: js.UndefOr[Array] = js.native
  /** [Config Option] (Ext.app.Controller) */
  var controller: js.UndefOr[IController] = js.native
  /** [Method] Starts execution of this Action by calling each of the beforeFilters in turn if any are specified  before calling t  */
  var execute: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Returns the value of action
  		* @returns String
  		*/
  var getAction: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of application
  		* @returns Ext.app.Application
  		*/
  var getApplication: js.UndefOr[js.Function0[IApplication]] = js.native
  /** [Method] Returns the value of args
  		* @returns Array
  		*/
  var getArgs: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Returns the value of beforeFilters
  		* @returns Array
  		*/
  var getBeforeFilters: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Returns the value of controller
  		* @returns Ext.app.Controller
  		*/
  var getController: js.UndefOr[js.Function0[IController]] = js.native
  /** [Method] Returns the value of data
  		* @returns Object
  		*/
  var getData: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of scope
  		* @returns Object
  		*/
  var getScope: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of title
  		* @returns Object
  		*/
  var getTitle: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of url
  		* @returns String
  		*/
  var getUrl: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Resumes the execution of this Action or starts it if it had not been started already */
  var resume: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (Object) */
  var scope: js.UndefOr[js.Any] = js.native
  /** [Method] Sets the value of action
  		* @param action String The new value.
  		*/
  var setAction: js.UndefOr[js.Function1[/* action */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of application
  		* @param application Ext.app.Application The new value.
  		*/
  var setApplication: js.UndefOr[js.Function1[/* application */ js.UndefOr[IApplication], Unit]] = js.native
  /** [Method] Sets the value of args
  		* @param args Array The new value.
  		*/
  var setArgs: js.UndefOr[js.Function1[/* args */ js.UndefOr[Array], Unit]] = js.native
  /** [Method] Sets the value of beforeFilters
  		* @param beforeFilters Array The new value.
  		*/
  var setBeforeFilters: js.UndefOr[js.Function1[/* beforeFilters */ js.UndefOr[Array], Unit]] = js.native
  /** [Method] Sets the value of controller
  		* @param controller Ext.app.Controller The new value.
  		*/
  var setController: js.UndefOr[js.Function1[/* controller */ js.UndefOr[IController], Unit]] = js.native
  /** [Method] Sets the value of data
  		* @param data Object The new value.
  		*/
  var setData: js.UndefOr[js.Function1[/* data */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of scope
  		* @param scope Object The new value.
  		*/
  var setScope: js.UndefOr[js.Function1[/* scope */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of title
  		* @param title Object The new value.
  		*/
  var setTitle: js.UndefOr[js.Function1[/* title */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of url
  		* @param url String The new value.
  		*/
  var setUrl: js.UndefOr[js.Function1[/* url */ js.UndefOr[String], Unit]] = js.native
  /** [Config Option] (String) */
  var url: js.UndefOr[String] = js.native
}

object IAction {
  @scala.inline
  def apply(): IAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAction]
  }
  @scala.inline
  implicit class IActionOps[Self <: IAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(js.undefined)
        ret
    }
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
    def withArgs(value: Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArgs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeFilters(value: Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeFilters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeforeFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeFilters")(js.undefined)
        ret
    }
    @scala.inline
    def withController(value: IController): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controller")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutController: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controller")(js.undefined)
        ret
    }
    @scala.inline
    def withExecute(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("execute")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutExecute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("execute")(js.undefined)
        ret
    }
    @scala.inline
    def withGetAction(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAction")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAction")(js.undefined)
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
    def withGetArgs(value: () => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getArgs")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetArgs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getArgs")(js.undefined)
        ret
    }
    @scala.inline
    def withGetBeforeFilters(value: () => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBeforeFilters")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetBeforeFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBeforeFilters")(js.undefined)
        ret
    }
    @scala.inline
    def withGetController(value: () => IController): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getController")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetController: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getController")(js.undefined)
        ret
    }
    @scala.inline
    def withGetData(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getData")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getData")(js.undefined)
        ret
    }
    @scala.inline
    def withGetScope(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScope")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScope")(js.undefined)
        ret
    }
    @scala.inline
    def withGetTitle(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTitle")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withGetUrl(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUrl")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withResume(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resume")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutResume: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resume")(js.undefined)
        ret
    }
    @scala.inline
    def withScope(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(js.undefined)
        ret
    }
    @scala.inline
    def withSetAction(value: /* action */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAction")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAction")(js.undefined)
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
    def withSetArgs(value: /* args */ js.UndefOr[Array] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setArgs")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetArgs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setArgs")(js.undefined)
        ret
    }
    @scala.inline
    def withSetBeforeFilters(value: /* beforeFilters */ js.UndefOr[Array] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBeforeFilters")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetBeforeFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBeforeFilters")(js.undefined)
        ret
    }
    @scala.inline
    def withSetController(value: /* controller */ js.UndefOr[IController] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setController")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetController: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setController")(js.undefined)
        ret
    }
    @scala.inline
    def withSetData(value: /* data */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setData")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setData")(js.undefined)
        ret
    }
    @scala.inline
    def withSetScope(value: /* scope */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setScope")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setScope")(js.undefined)
        ret
    }
    @scala.inline
    def withSetTitle(value: /* title */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTitle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withSetUrl(value: /* url */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setUrl")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

