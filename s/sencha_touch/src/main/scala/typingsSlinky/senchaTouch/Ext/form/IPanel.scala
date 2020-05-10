package typingsSlinky.senchaTouch.Ext.form

import typingsSlinky.senchaTouch.Ext.data.IConnection
import typingsSlinky.senchaTouch.Ext.data.IModel
import typingsSlinky.senchaTouch.Ext.dom.IElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPanel
  extends typingsSlinky.senchaTouch.Ext.IPanel {
  /** [Config Option] (Object) */
  var api: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Object) */
  var baseParams: js.UndefOr[js.Any] = js.native
  /** [Method] A convenient method to disable all fields in this form
  		* @param newDisabled Object
  		* @returns Ext.form.Panel This form.
  		*/
  var doSetDisabled: js.UndefOr[js.Function1[/* newDisabled */ js.UndefOr[js.Any], this.type]] = js.native
  /** [Config Option] (Boolean) */
  var enableSubmissionForm: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Object) */
  var enctype: js.UndefOr[js.Any] = js.native
  /** [Method] Returns the value of api
  		* @returns Object
  		*/
  var getApi: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of baseParams
  		* @returns Object
  		*/
  var getBaseParams: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of enableSubmissionForm
  		* @returns Boolean
  		*/
  var getEnableSubmissionForm: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of enctype
  		* @returns Object
  		*/
  var getEnctype: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of method
  		* @returns String
  		*/
  var getMethod: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of multipartDetection
  		* @returns Boolean
  		*/
  var getMultipartDetection: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of paramOrder
  		* @returns String/String[]
  		*/
  var getParamOrder: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of paramsAsHash
  		* @returns Boolean
  		*/
  var getParamsAsHash: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of standardSubmit
  		* @returns Boolean
  		*/
  var getStandardSubmit: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of submitOnAction
  		* @returns Object
  		*/
  var getSubmitOnAction: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of timeout
  		* @returns Number
  		*/
  var getTimeout: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of trackResetOnLoad
  		* @returns Boolean
  		*/
  var getTrackResetOnLoad: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of url
  		* @returns String
  		*/
  var getUrl: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns an object containing the value of each field in the form keyed to the field s name
  		* @param enabled Boolean true to return only enabled fields.
  		* @param all Boolean true to return all fields even if they don't have a name configured.
  		* @returns Object Object mapping field name to its value.
  		*/
  var getValues: js.UndefOr[
    js.Function2[/* enabled */ js.UndefOr[Boolean], /* all */ js.UndefOr[Boolean], _]
  ] = js.native
  /** [Method] Hides a previously shown wait mask See showMask
  		* @returns Ext.form.Panel this
  		*/
  var hideMask: js.UndefOr[js.Function0[this.type]] = js.native
  /** [Method] Performs an Ajax or Ext Direct call to load values for this form
  		* @param options Object The configuration when loading this form. The following are the configurations when loading via Ajax only:
  		* @returns Ext.data.Connection The request object.
  		*/
  var load: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], IConnection]] = js.native
  /** [Method] Loads matching fields from a model instance into this form
  		* @param record Ext.data.Model The model instance.
  		* @returns Ext.form.Panel This form.
  		*/
  var loadModel: js.UndefOr[js.Function1[/* record */ js.UndefOr[IModel], this.type]] = js.native
  /** [Method] Loads matching fields from a model instance into this form
  		* @param record Ext.data.Model The model instance.
  		* @returns Ext.form.Panel This form.
  		*/
  var loadRecord: js.UndefOr[js.Function1[/* record */ js.UndefOr[IModel], this.type]] = js.native
  /** [Config Option] (String) */
  var method: js.UndefOr[String] = js.native
  /** [Config Option] (Boolean) */
  var multipartDetection: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String/String[]) */
  var paramOrder: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Boolean) */
  var paramsAsHash: js.UndefOr[Boolean] = js.native
  /** [Method] Resets all fields in the form back to their original values
  		* @returns Ext.form.Panel This form.
  		*/
  var reset: js.UndefOr[js.Function0[this.type]] = js.native
  /** [Method] Sets the value of api
  		* @param api Object The new value.
  		*/
  var setApi: js.UndefOr[js.Function1[/* api */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of baseParams
  		* @param baseParams Object The new value.
  		*/
  var setBaseParams: js.UndefOr[js.Function1[/* baseParams */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of enableSubmissionForm
  		* @param enableSubmissionForm Boolean The new value.
  		*/
  var setEnableSubmissionForm: js.UndefOr[js.Function1[/* enableSubmissionForm */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of enctype
  		* @param enctype Object The new value.
  		*/
  var setEnctype: js.UndefOr[js.Function1[/* enctype */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of method
  		* @param method String The new value.
  		*/
  var setMethod: js.UndefOr[js.Function1[/* method */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of multipartDetection
  		* @param multipartDetection Boolean The new value.
  		*/
  var setMultipartDetection: js.UndefOr[js.Function1[/* multipartDetection */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of paramOrder
  		* @param paramOrder String/String[] The new value.
  		*/
  var setParamOrder: js.UndefOr[js.Function1[/* paramOrder */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of paramsAsHash
  		* @param paramsAsHash Boolean The new value.
  		*/
  var setParamsAsHash: js.UndefOr[js.Function1[/* paramsAsHash */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of standardSubmit
  		* @param standardSubmit Boolean The new value.
  		*/
  var setStandardSubmit: js.UndefOr[js.Function1[/* standardSubmit */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of submitOnAction
  		* @param submitOnAction Object The new value.
  		*/
  var setSubmitOnAction: js.UndefOr[js.Function1[/* submitOnAction */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of timeout
  		* @param timeout Number The new value.
  		*/
  var setTimeout: js.UndefOr[js.Function1[/* timeout */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of trackResetOnLoad
  		* @param trackResetOnLoad Boolean The new value.
  		*/
  var setTrackResetOnLoad: js.UndefOr[js.Function1[/* trackResetOnLoad */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of url
  		* @param url String The new value.
  		*/
  var setUrl: js.UndefOr[js.Function1[/* url */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the values of form fields in bulk
  		* @param values Object field name => value mapping object.
  		* @returns Ext.form.Panel This form.
  		*/
  var setValues: js.UndefOr[js.Function1[/* values */ js.UndefOr[js.Any], this.type]] = js.native
  /** [Method] Shows a generic custom mask over a designated Element
  		* @param cfg String/Object Either a string message or a configuration object supporting the following options: {  message : 'Please Wait',  cls : 'form-mask' }
  		* @param target Object
  		* @returns Ext.form.Panel This form
  		*/
  var showMask: js.UndefOr[
    js.Function2[/* cfg */ js.UndefOr[js.Any], /* target */ js.UndefOr[js.Any], this.type]
  ] = js.native
  /** [Config Option] (Boolean) */
  var standardSubmit: js.UndefOr[Boolean] = js.native
  /** [Method] Performs a Ajax based submission of form values if standardSubmit is false or otherwise executes a standard HTML Fo
  		* @param options Object The configuration when submitting this form. The following are the configurations when submitting via Ajax only:
  		* @returns Ext.data.Connection The request object if the standardSubmit config is false. If the standardSubmit config is true, then the return value is undefined.
  		*/
  var submit: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], IConnection]] = js.native
  /** [Config Option] (Object) */
  var submitOnAction: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Number) */
  var timeout: js.UndefOr[Double] = js.native
  /** [Config Option] (Boolean) */
  var trackResetOnLoad: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  var url: js.UndefOr[String] = js.native
  /** [Config Option] (Ext.dom.Element) */
  var waitMsgTarget: js.UndefOr[IElement] = js.native
  /** [Config Option] (Ext.XTemplate/String/String[]) */
  var waitTpl: js.UndefOr[js.Any] = js.native
}

object IPanel {
  @scala.inline
  def apply(): IPanel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPanel]
  }
  @scala.inline
  implicit class IPanelOps[Self <: IPanel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApi(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("api")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApi: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("api")(js.undefined)
        ret
    }
    @scala.inline
    def withBaseParams(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseParams")(js.undefined)
        ret
    }
    @scala.inline
    def withDoSetDisabled(value: /* newDisabled */ js.UndefOr[js.Any] => IPanel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doSetDisabled")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDoSetDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doSetDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableSubmissionForm(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableSubmissionForm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableSubmissionForm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableSubmissionForm")(js.undefined)
        ret
    }
    @scala.inline
    def withEnctype(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enctype")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnctype: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enctype")(js.undefined)
        ret
    }
    @scala.inline
    def withGetApi(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getApi")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetApi: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getApi")(js.undefined)
        ret
    }
    @scala.inline
    def withGetBaseParams(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBaseParams")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetBaseParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBaseParams")(js.undefined)
        ret
    }
    @scala.inline
    def withGetEnableSubmissionForm(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEnableSubmissionForm")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetEnableSubmissionForm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEnableSubmissionForm")(js.undefined)
        ret
    }
    @scala.inline
    def withGetEnctype(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEnctype")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetEnctype: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEnctype")(js.undefined)
        ret
    }
    @scala.inline
    def withGetMethod(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMethod")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withGetMultipartDetection(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMultipartDetection")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetMultipartDetection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMultipartDetection")(js.undefined)
        ret
    }
    @scala.inline
    def withGetParamOrder(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getParamOrder")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetParamOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getParamOrder")(js.undefined)
        ret
    }
    @scala.inline
    def withGetParamsAsHash(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getParamsAsHash")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetParamsAsHash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getParamsAsHash")(js.undefined)
        ret
    }
    @scala.inline
    def withGetStandardSubmit(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStandardSubmit")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetStandardSubmit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStandardSubmit")(js.undefined)
        ret
    }
    @scala.inline
    def withGetSubmitOnAction(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSubmitOnAction")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetSubmitOnAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSubmitOnAction")(js.undefined)
        ret
    }
    @scala.inline
    def withGetTimeout(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTimeout")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withGetTrackResetOnLoad(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTrackResetOnLoad")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetTrackResetOnLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTrackResetOnLoad")(js.undefined)
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
    def withGetValues(value: (/* enabled */ js.UndefOr[Boolean], /* all */ js.UndefOr[Boolean]) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValues")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGetValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValues")(js.undefined)
        ret
    }
    @scala.inline
    def withHideMask(value: () => IPanel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideMask")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutHideMask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideMask")(js.undefined)
        ret
    }
    @scala.inline
    def withLoad(value: /* options */ js.UndefOr[js.Any] => IConnection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadModel(value: /* record */ js.UndefOr[IModel] => IPanel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadModel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLoadModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadModel")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadRecord(value: /* record */ js.UndefOr[IModel] => IPanel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadRecord")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLoadRecord: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadRecord")(js.undefined)
        ret
    }
    @scala.inline
    def withMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(js.undefined)
        ret
    }
    @scala.inline
    def withMultipartDetection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multipartDetection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultipartDetection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multipartDetection")(js.undefined)
        ret
    }
    @scala.inline
    def withParamOrder(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paramOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParamOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paramOrder")(js.undefined)
        ret
    }
    @scala.inline
    def withParamsAsHash(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paramsAsHash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParamsAsHash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paramsAsHash")(js.undefined)
        ret
    }
    @scala.inline
    def withReset(value: () => IPanel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutReset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(js.undefined)
        ret
    }
    @scala.inline
    def withSetApi(value: /* api */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setApi")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetApi: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setApi")(js.undefined)
        ret
    }
    @scala.inline
    def withSetBaseParams(value: /* baseParams */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBaseParams")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetBaseParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBaseParams")(js.undefined)
        ret
    }
    @scala.inline
    def withSetEnableSubmissionForm(value: /* enableSubmissionForm */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setEnableSubmissionForm")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetEnableSubmissionForm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setEnableSubmissionForm")(js.undefined)
        ret
    }
    @scala.inline
    def withSetEnctype(value: /* enctype */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setEnctype")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetEnctype: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setEnctype")(js.undefined)
        ret
    }
    @scala.inline
    def withSetMethod(value: /* method */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMethod")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withSetMultipartDetection(value: /* multipartDetection */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMultipartDetection")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetMultipartDetection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMultipartDetection")(js.undefined)
        ret
    }
    @scala.inline
    def withSetParamOrder(value: /* paramOrder */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setParamOrder")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetParamOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setParamOrder")(js.undefined)
        ret
    }
    @scala.inline
    def withSetParamsAsHash(value: /* paramsAsHash */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setParamsAsHash")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetParamsAsHash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setParamsAsHash")(js.undefined)
        ret
    }
    @scala.inline
    def withSetStandardSubmit(value: /* standardSubmit */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStandardSubmit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetStandardSubmit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStandardSubmit")(js.undefined)
        ret
    }
    @scala.inline
    def withSetSubmitOnAction(value: /* submitOnAction */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSubmitOnAction")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetSubmitOnAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSubmitOnAction")(js.undefined)
        ret
    }
    @scala.inline
    def withSetTimeout(value: /* timeout */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTimeout")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withSetTrackResetOnLoad(value: /* trackResetOnLoad */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTrackResetOnLoad")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetTrackResetOnLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTrackResetOnLoad")(js.undefined)
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
    def withSetValues(value: /* values */ js.UndefOr[js.Any] => IPanel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setValues")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setValues")(js.undefined)
        ret
    }
    @scala.inline
    def withShowMask(value: (/* cfg */ js.UndefOr[js.Any], /* target */ js.UndefOr[js.Any]) => IPanel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMask")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutShowMask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMask")(js.undefined)
        ret
    }
    @scala.inline
    def withStandardSubmit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("standardSubmit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStandardSubmit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("standardSubmit")(js.undefined)
        ret
    }
    @scala.inline
    def withSubmit(value: /* options */ js.UndefOr[js.Any] => IConnection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSubmit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submit")(js.undefined)
        ret
    }
    @scala.inline
    def withSubmitOnAction(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submitOnAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubmitOnAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submitOnAction")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
    @scala.inline
    def withTrackResetOnLoad(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackResetOnLoad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackResetOnLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackResetOnLoad")(js.undefined)
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
    @scala.inline
    def withWaitMsgTarget(value: IElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitMsgTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWaitMsgTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitMsgTarget")(js.undefined)
        ret
    }
    @scala.inline
    def withWaitTpl(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitTpl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWaitTpl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitTpl")(js.undefined)
        ret
    }
  }
  
}

