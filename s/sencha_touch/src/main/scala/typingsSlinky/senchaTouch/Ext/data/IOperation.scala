package typingsSlinky.senchaTouch.Ext.data

import typingsSlinky.senchaTouch.Ext.Array
import typingsSlinky.senchaTouch.Ext.IBase
import typingsSlinky.senchaTouch.Ext.util.IGrouper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOperation extends IBase {
  /** [Config Option] (String) */
  var action: js.UndefOr[String] = js.native
  /** [Method] Checks whether this operation should cause writing to occur
  		* @returns Boolean Whether the operation should cause a write to occur.
  		*/
  var allowWrite: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Config Option] (Ext.data.Batch) */
  var batch: js.UndefOr[IBatch] = js.native
  /** [Config Option] (Function) */
  var callback: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Ext.util.Filter[]) */
  var filters: js.UndefOr[Array] = js.native
  /** [Method] Returns the value of action
  		* @returns String
  		*/
  var getAction: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of addRecords
  		* @returns Boolean
  		*/
  var getAddRecords: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of batch
  		* @returns Ext.data.Batch
  		*/
  var getBatch: js.UndefOr[js.Function0[IBatch]] = js.native
  /** [Method] Returns the value of callback
  		* @returns Function
  		*/
  var getCallback: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the error string or object that was set using setException
  		* @returns String/Object The error object.
  		*/
  var getError: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of filters
  		* @returns Ext.util.Filter[]
  		*/
  var getFilters: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Returns the value of grouper
  		* @returns Ext.util.Grouper
  		*/
  var getGrouper: js.UndefOr[js.Function0[IGrouper]] = js.native
  /** [Method] Returns the value of limit
  		* @returns Number
  		*/
  var getLimit: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of model
  		* @returns Ext.data.Model
  		*/
  var getModel: js.UndefOr[js.Function0[IModel]] = js.native
  /** [Method] Returns the value of node
  		* @returns Object
  		*/
  var getNode: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of page
  		* @returns Object
  		*/
  var getPage: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of params
  		* @returns Object
  		*/
  var getParams: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of request
  		* @returns Ext.data.Request
  		*/
  var getRequest: js.UndefOr[js.Function0[IRequest]] = js.native
  /** [Method] Returns the value of response
  		* @returns Object
  		*/
  var getResponse: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of resultSet
  		* @returns Ext.data.ResultSet
  		*/
  var getResultSet: js.UndefOr[js.Function0[IResultSet]] = js.native
  /** [Method] Returns the value of scope
  		* @returns Object
  		*/
  var getScope: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of sorters
  		* @returns Ext.util.Sorter[]
  		*/
  var getSorters: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Returns the value of start
  		* @returns Number
  		*/
  var getStart: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of synchronous
  		* @returns Boolean
  		*/
  var getSynchronous: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of url
  		* @returns Object
  		*/
  var getUrl: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of withCredentials
  		* @returns Boolean
  		*/
  var getWithCredentials: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Config Option] (Boolean) */
  var group: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Ext.util.Grouper) */
  var grouper: js.UndefOr[IGrouper] = js.native
  /** [Method] Returns true if this Operation encountered an exception see also getError
  		* @returns Boolean true if there was an exception.
  		*/
  var hasException: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns true if the Operation has been completed
  		* @returns Boolean true if the Operation is complete
  		*/
  var isComplete: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns true if the Operation has been started but has not yet completed
  		* @returns Boolean true if the Operation is currently running
  		*/
  var isRunning: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns true if the Operation has been started
  		* @returns Boolean true if the Operation has started
  		*/
  var isStarted: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Config Option] (Number) */
  var limit: js.UndefOr[Double] = js.native
  /** [Config Option] (Ext.data.Model) */
  var model: js.UndefOr[IModel] = js.native
  /** [Config Option] (Object) */
  var params: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Array) */
  var records: js.UndefOr[Array] = js.native
  /** [Config Option] (Ext.data.Request) */
  var request: js.UndefOr[IRequest] = js.native
  /** [Config Option] (Object) */
  var response: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Ext.data.ResultSet) */
  var resultSet: js.UndefOr[IResultSet] = js.native
  /** [Config Option] (Object) */
  var scope: js.UndefOr[js.Any] = js.native
  /** [Method] Sets the value of action
  		* @param action String The new value.
  		*/
  var setAction: js.UndefOr[js.Function1[/* action */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of addRecords
  		* @param addRecords Boolean The new value.
  		*/
  var setAddRecords: js.UndefOr[js.Function1[/* addRecords */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of batch
  		* @param batch Ext.data.Batch The new value.
  		*/
  var setBatch: js.UndefOr[js.Function1[/* batch */ js.UndefOr[IBatch], Unit]] = js.native
  /** [Method] Sets the value of callback
  		* @param callback Function The new value.
  		*/
  var setCallback: js.UndefOr[js.Function1[/* callback */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Marks the Operation as completed  */
  var setCompleted: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Marks the Operation as having experienced an exception
  		* @param error String/Object error string/object
  		*/
  var setException: js.UndefOr[js.Function1[/* error */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of filters
  		* @param filters Ext.util.Filter[] The new value.
  		*/
  var setFilters: js.UndefOr[js.Function1[/* filters */ js.UndefOr[Array], Unit]] = js.native
  /** [Method] Sets the value of grouper
  		* @param grouper Ext.util.Grouper The new value.
  		*/
  var setGrouper: js.UndefOr[js.Function1[/* grouper */ js.UndefOr[IGrouper], Unit]] = js.native
  /** [Method] Sets the value of limit
  		* @param limit Number The new value.
  		*/
  var setLimit: js.UndefOr[js.Function1[/* limit */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of model
  		* @param model Ext.data.Model The new value.
  		*/
  var setModel: js.UndefOr[js.Function1[/* model */ js.UndefOr[IModel], Unit]] = js.native
  /** [Method] Sets the value of node
  		* @param node Object The new value.
  		*/
  var setNode: js.UndefOr[js.Function1[/* node */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of page
  		* @param page Object The new value.
  		*/
  var setPage: js.UndefOr[js.Function1[/* page */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of params
  		* @param params Object The new value.
  		*/
  var setParams: js.UndefOr[js.Function1[/* params */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of records
  		* @param records Array The new value.
  		*/
  var setRecords: js.UndefOr[js.Function1[/* records */ js.UndefOr[Array], Unit]] = js.native
  /** [Method] Sets the value of request
  		* @param request Ext.data.Request The new value.
  		*/
  var setRequest: js.UndefOr[js.Function1[/* request */ js.UndefOr[IRequest], Unit]] = js.native
  /** [Method] Sets the value of response
  		* @param response Object The new value.
  		*/
  var setResponse: js.UndefOr[js.Function1[/* response */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of resultSet
  		* @param resultSet Ext.data.ResultSet The new value.
  		*/
  var setResultSet: js.UndefOr[js.Function1[/* resultSet */ js.UndefOr[IResultSet], Unit]] = js.native
  /** [Method] Sets the value of scope
  		* @param scope Object The new value.
  		*/
  var setScope: js.UndefOr[js.Function1[/* scope */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of sorters
  		* @param sorters Ext.util.Sorter[] The new value.
  		*/
  var setSorters: js.UndefOr[js.Function1[/* sorters */ js.UndefOr[Array], Unit]] = js.native
  /** [Method] Sets the value of start
  		* @param start Number The new value.
  		*/
  var setStart: js.UndefOr[js.Function1[/* start */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Marks the Operation as started  */
  var setStarted: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Marks the Operation as successful  */
  var setSuccessful: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Sets the value of synchronous
  		* @param synchronous Boolean The new value.
  		*/
  var setSynchronous: js.UndefOr[js.Function1[/* synchronous */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of url
  		* @param url Object The new value.
  		*/
  var setUrl: js.UndefOr[js.Function1[/* url */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of withCredentials
  		* @param withCredentials Boolean The new value.
  		*/
  var setWithCredentials: js.UndefOr[js.Function1[/* withCredentials */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Config Option] (Ext.util.Sorter[]) */
  var sorters: js.UndefOr[Array] = js.native
  /** [Config Option] (Number) */
  var start: js.UndefOr[Double] = js.native
  /** [Config Option] (Boolean) */
  var synchronous: js.UndefOr[Boolean] = js.native
  /** [Method] Returns true if the Operation has completed and was successful
  		* @returns Boolean true if successful
  		*/
  var wasSuccessful: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Config Option] (Boolean) */
  var withCredentials: js.UndefOr[Boolean] = js.native
}

object IOperation {
  @scala.inline
  def apply(): IOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOperation]
  }
  @scala.inline
  implicit class IOperationOps[Self <: IOperation] (val x: Self) extends AnyVal {
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
    def withAllowWrite(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowWrite")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutAllowWrite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowWrite")(js.undefined)
        ret
    }
    @scala.inline
    def withBatch(value: IBatch): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batch")(js.undefined)
        ret
    }
    @scala.inline
    def withCallback(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.undefined)
        ret
    }
    @scala.inline
    def withFilters(value: Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(js.undefined)
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
    def withGetAddRecords(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAddRecords")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetAddRecords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAddRecords")(js.undefined)
        ret
    }
    @scala.inline
    def withGetBatch(value: () => IBatch): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBatch")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetBatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBatch")(js.undefined)
        ret
    }
    @scala.inline
    def withGetCallback(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCallback")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withGetError(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getError")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getError")(js.undefined)
        ret
    }
    @scala.inline
    def withGetFilters(value: () => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFilters")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFilters")(js.undefined)
        ret
    }
    @scala.inline
    def withGetGrouper(value: () => IGrouper): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGrouper")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetGrouper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGrouper")(js.undefined)
        ret
    }
    @scala.inline
    def withGetLimit(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLimit")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withGetModel(value: () => IModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getModel")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getModel")(js.undefined)
        ret
    }
    @scala.inline
    def withGetNode(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNode")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNode")(js.undefined)
        ret
    }
    @scala.inline
    def withGetPage(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPage")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPage")(js.undefined)
        ret
    }
    @scala.inline
    def withGetParams(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getParams")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getParams")(js.undefined)
        ret
    }
    @scala.inline
    def withGetRequest(value: () => IRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRequest")(js.undefined)
        ret
    }
    @scala.inline
    def withGetResponse(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getResponse")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetResponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getResponse")(js.undefined)
        ret
    }
    @scala.inline
    def withGetResultSet(value: () => IResultSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getResultSet")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetResultSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getResultSet")(js.undefined)
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
    def withGetSorters(value: () => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSorters")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetSorters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSorters")(js.undefined)
        ret
    }
    @scala.inline
    def withGetStart(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStart")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStart")(js.undefined)
        ret
    }
    @scala.inline
    def withGetSynchronous(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSynchronous")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetSynchronous: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSynchronous")(js.undefined)
        ret
    }
    @scala.inline
    def withGetUrl(value: () => _): Self = {
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
    def withGetWithCredentials(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWithCredentials")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetWithCredentials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWithCredentials")(js.undefined)
        ret
    }
    @scala.inline
    def withGroup(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(js.undefined)
        ret
    }
    @scala.inline
    def withGrouper(value: IGrouper): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grouper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrouper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grouper")(js.undefined)
        ret
    }
    @scala.inline
    def withHasException(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasException")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutHasException: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasException")(js.undefined)
        ret
    }
    @scala.inline
    def withIsComplete(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isComplete")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutIsComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isComplete")(js.undefined)
        ret
    }
    @scala.inline
    def withIsRunning(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRunning")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutIsRunning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRunning")(js.undefined)
        ret
    }
    @scala.inline
    def withIsStarted(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isStarted")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutIsStarted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isStarted")(js.undefined)
        ret
    }
    @scala.inline
    def withLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(js.undefined)
        ret
    }
    @scala.inline
    def withModel(value: IModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(js.undefined)
        ret
    }
    @scala.inline
    def withParams(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(js.undefined)
        ret
    }
    @scala.inline
    def withRecords(value: Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("records")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("records")(js.undefined)
        ret
    }
    @scala.inline
    def withRequest(value: IRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(js.undefined)
        ret
    }
    @scala.inline
    def withResponse(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("response")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("response")(js.undefined)
        ret
    }
    @scala.inline
    def withResultSet(value: IResultSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResultSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultSet")(js.undefined)
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
    def withSetAddRecords(value: /* addRecords */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAddRecords")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetAddRecords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAddRecords")(js.undefined)
        ret
    }
    @scala.inline
    def withSetBatch(value: /* batch */ js.UndefOr[IBatch] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBatch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetBatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBatch")(js.undefined)
        ret
    }
    @scala.inline
    def withSetCallback(value: /* callback */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCallback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withSetCompleted(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCompleted")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutSetCompleted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCompleted")(js.undefined)
        ret
    }
    @scala.inline
    def withSetException(value: /* error */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setException")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetException: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setException")(js.undefined)
        ret
    }
    @scala.inline
    def withSetFilters(value: /* filters */ js.UndefOr[Array] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFilters")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFilters")(js.undefined)
        ret
    }
    @scala.inline
    def withSetGrouper(value: /* grouper */ js.UndefOr[IGrouper] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setGrouper")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetGrouper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setGrouper")(js.undefined)
        ret
    }
    @scala.inline
    def withSetLimit(value: /* limit */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLimit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withSetModel(value: /* model */ js.UndefOr[IModel] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setModel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setModel")(js.undefined)
        ret
    }
    @scala.inline
    def withSetNode(value: /* node */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setNode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setNode")(js.undefined)
        ret
    }
    @scala.inline
    def withSetPage(value: /* page */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPage")(js.undefined)
        ret
    }
    @scala.inline
    def withSetParams(value: /* params */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setParams")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setParams")(js.undefined)
        ret
    }
    @scala.inline
    def withSetRecords(value: /* records */ js.UndefOr[Array] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRecords")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetRecords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRecords")(js.undefined)
        ret
    }
    @scala.inline
    def withSetRequest(value: /* request */ js.UndefOr[IRequest] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRequest")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRequest")(js.undefined)
        ret
    }
    @scala.inline
    def withSetResponse(value: /* response */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setResponse")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetResponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setResponse")(js.undefined)
        ret
    }
    @scala.inline
    def withSetResultSet(value: /* resultSet */ js.UndefOr[IResultSet] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setResultSet")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetResultSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setResultSet")(js.undefined)
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
    def withSetSorters(value: /* sorters */ js.UndefOr[Array] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSorters")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetSorters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSorters")(js.undefined)
        ret
    }
    @scala.inline
    def withSetStart(value: /* start */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStart")(js.undefined)
        ret
    }
    @scala.inline
    def withSetStarted(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStarted")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutSetStarted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStarted")(js.undefined)
        ret
    }
    @scala.inline
    def withSetSuccessful(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSuccessful")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutSetSuccessful: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSuccessful")(js.undefined)
        ret
    }
    @scala.inline
    def withSetSynchronous(value: /* synchronous */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSynchronous")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetSynchronous: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSynchronous")(js.undefined)
        ret
    }
    @scala.inline
    def withSetUrl(value: /* url */ js.UndefOr[js.Any] => Unit): Self = {
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
    def withSetWithCredentials(value: /* withCredentials */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setWithCredentials")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetWithCredentials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setWithCredentials")(js.undefined)
        ret
    }
    @scala.inline
    def withSorters(value: Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sorters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSorters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sorters")(js.undefined)
        ret
    }
    @scala.inline
    def withStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.undefined)
        ret
    }
    @scala.inline
    def withSynchronous(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("synchronous")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSynchronous: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("synchronous")(js.undefined)
        ret
    }
    @scala.inline
    def withWasSuccessful(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wasSuccessful")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutWasSuccessful: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wasSuccessful")(js.undefined)
        ret
    }
    @scala.inline
    def withWithCredentials(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withCredentials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWithCredentials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withCredentials")(js.undefined)
        ret
    }
  }
  
}

