package typingsSlinky.senchaTouch.Ext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.senchaTouch.Ext.IClass because Already inherited
- typingsSlinky.senchaTouch.Ext.IBase because Already inherited
- typingsSlinky.senchaTouch.Ext.mixin.IProgressable because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, destroy, extend, getInitialConfig, inheritableStatics, initConfig, mixins, platformConfig, self, singleton, statics, uses. Inlined dynamic, maxProgressInput, maxProgressOutput, minProgressInput, minProgressOutput, state, getDynamic, getMaxProgressInput, getMaxProgressOutput, getMinProgressInput, getMinProgressOutput, getState, setDynamic, setMaxProgressInput, setMaxProgressOutput, setMinProgressInput, setMinProgressOutput, setState */ @js.native
trait IProgressIndicator extends IContainer {
  /** [Config Option] (Boolean) */
  var dynamic: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String/Object) */
  var fallbackText: js.UndefOr[js.Any] = js.native
  /** [Method] Returns the value of dynamic
  		* @returns Boolean
  		*/
  var getDynamic: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of maxProgressInput
  		* @returns Number
  		*/
  var getMaxProgressInput: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of maxProgressOutput
  		* @returns Number
  		*/
  var getMaxProgressOutput: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of minProgressInput
  		* @returns Number
  		*/
  var getMinProgressInput: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of minProgressOutput
  		* @returns Number
  		*/
  var getMinProgressOutput: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of monitoredStates
  		* @returns Object
  		*/
  var getMonitoredStates: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of state
  		* @returns String
  		*/
  var getState: js.UndefOr[js.Function0[java.lang.String]] = js.native
  /** [Config Option] (String/Ext.XTemplate/Object) */
  var loadingText: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Number) */
  var maxProgressInput: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var maxProgressOutput: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var minProgressInput: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var minProgressOutput: js.UndefOr[Double] = js.native
  /** [Config Option] (Object) */
  var monitoredStates: js.UndefOr[js.Any] = js.native
  /** [Method] Sets the value of dynamic
  		* @param dynamic Boolean The new value.
  		*/
  var setDynamic: js.UndefOr[js.Function1[js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of fallbackText
  		* @param fallbackText String/Object The new value.
  		*/
  var setFallbackText: js.UndefOr[js.Function1[/* fallbackText */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of loadingText
  		* @param loadingText String/Ext.XTemplate/Object The new value.
  		*/
  var setLoadingText: js.UndefOr[js.Function1[/* loadingText */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of maxProgressInput
  		* @param maxProgressInput Number The new value.
  		*/
  var setMaxProgressInput: js.UndefOr[js.Function1[js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of maxProgressOutput
  		* @param maxProgressOutput Number The new value.
  		*/
  var setMaxProgressOutput: js.UndefOr[js.Function1[/* maxProgressOutput */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of minProgressInput
  		* @param minProgressInput Number The new value.
  		*/
  var setMinProgressInput: js.UndefOr[js.Function1[js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of minProgressOutput
  		* @param minProgressOutput Number The new value.
  		*/
  var setMinProgressOutput: js.UndefOr[js.Function1[/* minProgressOutput */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of monitoredStates
  		* @param monitoredStates Object The new value.
  		*/
  var setMonitoredStates: js.UndefOr[js.Function1[/* monitoredStates */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of state
  		* @param state String The new value.
  		*/
  var setState: js.UndefOr[js.Function1[/* state */ js.UndefOr[java.lang.String], Unit]] = js.native
  /** [Config Option] (String) */
  var state: js.UndefOr[java.lang.String] = js.native
}

object IProgressIndicator {
  @scala.inline
  def apply(): IProgressIndicator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IProgressIndicator]
  }
  @scala.inline
  implicit class IProgressIndicatorOps[Self <: IProgressIndicator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDynamic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDynamic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamic")(js.undefined)
        ret
    }
    @scala.inline
    def withFallbackText(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbackText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFallbackText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbackText")(js.undefined)
        ret
    }
    @scala.inline
    def withGetDynamic(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDynamic")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetDynamic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDynamic")(js.undefined)
        ret
    }
    @scala.inline
    def withGetMaxProgressInput(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMaxProgressInput")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetMaxProgressInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMaxProgressInput")(js.undefined)
        ret
    }
    @scala.inline
    def withGetMaxProgressOutput(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMaxProgressOutput")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetMaxProgressOutput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMaxProgressOutput")(js.undefined)
        ret
    }
    @scala.inline
    def withGetMinProgressInput(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMinProgressInput")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetMinProgressInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMinProgressInput")(js.undefined)
        ret
    }
    @scala.inline
    def withGetMinProgressOutput(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMinProgressOutput")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetMinProgressOutput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMinProgressOutput")(js.undefined)
        ret
    }
    @scala.inline
    def withGetMonitoredStates(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMonitoredStates")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetMonitoredStates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMonitoredStates")(js.undefined)
        ret
    }
    @scala.inline
    def withGetState(value: () => java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getState")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getState")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadingText(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadingText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingText")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxProgressInput(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxProgressInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxProgressInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxProgressInput")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxProgressOutput(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxProgressOutput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxProgressOutput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxProgressOutput")(js.undefined)
        ret
    }
    @scala.inline
    def withMinProgressInput(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minProgressInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinProgressInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minProgressInput")(js.undefined)
        ret
    }
    @scala.inline
    def withMinProgressOutput(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minProgressOutput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinProgressOutput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minProgressOutput")(js.undefined)
        ret
    }
    @scala.inline
    def withMonitoredStates(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monitoredStates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonitoredStates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monitoredStates")(js.undefined)
        ret
    }
    @scala.inline
    def withSetDynamic(value: js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDynamic")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetDynamic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDynamic")(js.undefined)
        ret
    }
    @scala.inline
    def withSetFallbackText(value: /* fallbackText */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFallbackText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetFallbackText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFallbackText")(js.undefined)
        ret
    }
    @scala.inline
    def withSetLoadingText(value: /* loadingText */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLoadingText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetLoadingText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLoadingText")(js.undefined)
        ret
    }
    @scala.inline
    def withSetMaxProgressInput(value: js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMaxProgressInput")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetMaxProgressInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMaxProgressInput")(js.undefined)
        ret
    }
    @scala.inline
    def withSetMaxProgressOutput(value: /* maxProgressOutput */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMaxProgressOutput")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetMaxProgressOutput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMaxProgressOutput")(js.undefined)
        ret
    }
    @scala.inline
    def withSetMinProgressInput(value: js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMinProgressInput")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetMinProgressInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMinProgressInput")(js.undefined)
        ret
    }
    @scala.inline
    def withSetMinProgressOutput(value: /* minProgressOutput */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMinProgressOutput")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetMinProgressOutput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMinProgressOutput")(js.undefined)
        ret
    }
    @scala.inline
    def withSetMonitoredStates(value: /* monitoredStates */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMonitoredStates")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetMonitoredStates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMonitoredStates")(js.undefined)
        ret
    }
    @scala.inline
    def withSetState(value: /* state */ js.UndefOr[java.lang.String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setState")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setState")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
  }
  
}

