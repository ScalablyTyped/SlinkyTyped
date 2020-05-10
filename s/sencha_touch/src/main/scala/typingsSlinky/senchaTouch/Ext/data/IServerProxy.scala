package typingsSlinky.senchaTouch.Ext.data

import typingsSlinky.senchaTouch.Ext.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IServerProxy
  extends typingsSlinky.senchaTouch.Ext.data.proxy.IProxy {
  /** [Method] Optional callback function which can be used to clean up after a request has been completed
  		* @param request Ext.data.Request The Request object
  		* @param success Boolean True if the request was successful
  		*/
  var afterRequest: js.UndefOr[
    js.Function2[/* request */ js.UndefOr[IRequest], /* success */ js.UndefOr[Boolean], Unit]
  ] = js.native
  /** [Config Option] (Object) */
  var api: js.UndefOr[js.Any] = js.native
  /** [Method] Creates and returns an Ext data Request object based on the options passed by the Store that this Proxy is attached to
  		* @param operation Ext.data.Operation The Operation object to execute
  		* @returns Ext.data.Request The request object
  		*/
  var buildRequest: js.UndefOr[js.Function1[/* operation */ js.UndefOr[IOperation], IRequest]] = js.native
  /** [Method] Generates a url based on a given Ext data Request object
  		* @param request Ext.data.Request The request object
  		* @returns String The url
  		*/
  var buildUrl: js.UndefOr[js.Function1[/* request */ js.UndefOr[IRequest], String]] = js.native
  /** [Config Option] (String) */
  var cacheString: js.UndefOr[String] = js.native
  /** [Method] in a ServerProxy all four CRUD operations are executed in the same manner so we delegate to doRequest in each case */
  @JSName("create")
  var create_IServerProxy: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (String) */
  var directionParam: js.UndefOr[String] = js.native
  /** [Method] In ServerProxy subclasses the create read update and destroy methods all pass through to doRequest
  		* @param operation Ext.data.Operation The Ext.data.Operation object
  		* @param callback Function The callback function to call when the Operation has completed
  		* @param scope Object The scope in which to execute the callback
  		*/
  var doRequest: js.UndefOr[
    js.Function3[
      /* operation */ js.UndefOr[IOperation], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  /** [Config Option] (Boolean) */
  var enablePagingParams: js.UndefOr[Boolean] = js.native
  /** [Method] Encodes the array of Ext util Filter objects into a string to be sent in the request url
  		* @param filters Ext.util.Filter[] The array of Filter objects
  		* @returns String The encoded filters
  		*/
  var encodeFilters: js.UndefOr[js.Function1[/* filters */ js.UndefOr[Array], String]] = js.native
  /** [Method] Encodes the array of Ext util Sorter objects into a string to be sent in the request url
  		* @param sorters Ext.util.Sorter[] The array of Sorter objects
  		* @returns String The encoded sorters
  		*/
  var encodeSorters: js.UndefOr[js.Function1[/* sorters */ js.UndefOr[Array], String]] = js.native
  /** [Config Option] (Object) */
  var extraParams: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String) */
  var filterParam: js.UndefOr[String] = js.native
  /** [Method] Returns the value of api
  		* @returns Object
  		*/
  var getApi: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of cacheString
  		* @returns String
  		*/
  var getCacheString: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of directionParam
  		* @returns String
  		*/
  var getDirectionParam: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of enablePagingParams
  		* @returns Boolean
  		*/
  var getEnablePagingParams: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of extraParams
  		* @returns Object
  		*/
  var getExtraParams: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of filterParam
  		* @returns String
  		*/
  var getFilterParam: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of groupParam
  		* @returns String
  		*/
  var getGroupParam: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of limitParam
  		* @returns String
  		*/
  var getLimitParam: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of noCache
  		* @returns Boolean
  		*/
  var getNoCache: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of pageParam
  		* @returns String
  		*/
  var getPageParam: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of simpleSortMode
  		* @returns Boolean
  		*/
  var getSimpleSortMode: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of sortParam
  		* @returns String
  		*/
  var getSortParam: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of startParam
  		* @returns String
  		*/
  var getStartParam: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of timeout
  		* @returns Number
  		*/
  var getTimeout: js.UndefOr[js.Function0[Double]] = js.native
  /** [Config Option] (String) */
  var groupParam: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var limitParam: js.UndefOr[String] = js.native
  /** [Config Option] (Boolean) */
  var noCache: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  var pageParam: js.UndefOr[String] = js.native
  /** [Method] This method handles the processing of the response and is usually overridden by subclasses to do additional processing
  		* @param success Boolean Whether or not this request was successful
  		* @param operation Ext.data.Operation The operation we made this request for
  		* @param request Ext.data.Request The request that was made
  		* @param response Object The response that we got
  		* @param callback Function The callback to be fired onces the response is processed
  		* @param scope Object The scope in which we call the callback
  		*/
  var processResponse: js.UndefOr[
    js.Function6[
      /* success */ js.UndefOr[Boolean], 
      /* operation */ js.UndefOr[IOperation], 
      /* request */ js.UndefOr[IRequest], 
      /* response */ js.UndefOr[js.Any], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  /** [Method] Performs the given read operation  */
  @JSName("read")
  var read_IServerProxy: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Sets the value of api
  		* @param api Object The new value.
  		*/
  var setApi: js.UndefOr[js.Function1[/* api */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of cacheString
  		* @param cacheString String The new value.
  		*/
  var setCacheString: js.UndefOr[js.Function1[/* cacheString */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of directionParam
  		* @param directionParam String The new value.
  		*/
  var setDirectionParam: js.UndefOr[js.Function1[/* directionParam */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of enablePagingParams
  		* @param enablePagingParams Boolean The new value.
  		*/
  var setEnablePagingParams: js.UndefOr[js.Function1[/* enablePagingParams */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets a value in the underlying extraParams
  		* @param name String The key for the new value
  		* @param value Object The value
  		*/
  var setExtraParam: js.UndefOr[
    js.Function2[/* name */ js.UndefOr[String], /* value */ js.UndefOr[js.Any], Unit]
  ] = js.native
  /** [Method] Sets the value of extraParams
  		* @param extraParams Object The new value.
  		*/
  var setExtraParams: js.UndefOr[js.Function1[/* extraParams */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of filterParam
  		* @param filterParam String The new value.
  		*/
  var setFilterParam: js.UndefOr[js.Function1[/* filterParam */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of groupParam
  		* @param groupParam String The new value.
  		*/
  var setGroupParam: js.UndefOr[js.Function1[/* groupParam */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of limitParam
  		* @param limitParam String The new value.
  		*/
  var setLimitParam: js.UndefOr[js.Function1[/* limitParam */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of noCache
  		* @param noCache Boolean The new value.
  		*/
  var setNoCache: js.UndefOr[js.Function1[/* noCache */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of pageParam
  		* @param pageParam String The new value.
  		*/
  var setPageParam: js.UndefOr[js.Function1[/* pageParam */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of simpleSortMode
  		* @param simpleSortMode Boolean The new value.
  		*/
  var setSimpleSortMode: js.UndefOr[js.Function1[/* simpleSortMode */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of sortParam
  		* @param sortParam String The new value.
  		*/
  var setSortParam: js.UndefOr[js.Function1[/* sortParam */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of startParam
  		* @param startParam String The new value.
  		*/
  var setStartParam: js.UndefOr[js.Function1[/* startParam */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of timeout
  		* @param timeout Number The new value.
  		*/
  var setTimeout: js.UndefOr[js.Function1[/* timeout */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of url
  		* @param url String The new value.
  		*/
  var setUrl: js.UndefOr[js.Function1[/* url */ js.UndefOr[String], Unit]] = js.native
  /** [Config Option] (Boolean) */
  var simpleSortMode: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  var sortParam: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var startParam: js.UndefOr[String] = js.native
  /** [Config Option] (Number) */
  var timeout: js.UndefOr[Double] = js.native
  /** [Method] Performs the given update operation  */
  @JSName("update")
  var update_IServerProxy: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (String) */
  var url: js.UndefOr[String] = js.native
}

object IServerProxy {
  @scala.inline
  def apply(): IServerProxy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IServerProxy]
  }
  @scala.inline
  implicit class IServerProxyOps[Self <: IServerProxy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterRequest(value: (/* request */ js.UndefOr[IRequest], /* success */ js.UndefOr[Boolean]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterRequest")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAfterRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterRequest")(js.undefined)
        ret
    }
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
    def withBuildRequest(value: /* operation */ js.UndefOr[IOperation] => IRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildRequest")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBuildRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildRequest")(js.undefined)
        ret
    }
    @scala.inline
    def withBuildUrl(value: /* request */ js.UndefOr[IRequest] => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildUrl")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBuildUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withCacheString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheString")(js.undefined)
        ret
    }
    @scala.inline
    def withCreate(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutCreate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.undefined)
        ret
    }
    @scala.inline
    def withDirectionParam(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directionParam")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectionParam: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directionParam")(js.undefined)
        ret
    }
    @scala.inline
    def withDoRequest(
      value: (/* operation */ js.UndefOr[IOperation], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doRequest")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutDoRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doRequest")(js.undefined)
        ret
    }
    @scala.inline
    def withEnablePagingParams(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePagingParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnablePagingParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePagingParams")(js.undefined)
        ret
    }
    @scala.inline
    def withEncodeFilters(value: /* filters */ js.UndefOr[Array] => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encodeFilters")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutEncodeFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encodeFilters")(js.undefined)
        ret
    }
    @scala.inline
    def withEncodeSorters(value: /* sorters */ js.UndefOr[Array] => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encodeSorters")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutEncodeSorters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encodeSorters")(js.undefined)
        ret
    }
    @scala.inline
    def withExtraParams(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtraParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraParams")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterParam(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterParam")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterParam: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterParam")(js.undefined)
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
    def withGetCacheString(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCacheString")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetCacheString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCacheString")(js.undefined)
        ret
    }
    @scala.inline
    def withGetDirectionParam(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDirectionParam")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetDirectionParam: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDirectionParam")(js.undefined)
        ret
    }
    @scala.inline
    def withGetEnablePagingParams(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEnablePagingParams")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetEnablePagingParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEnablePagingParams")(js.undefined)
        ret
    }
    @scala.inline
    def withGetExtraParams(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getExtraParams")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetExtraParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getExtraParams")(js.undefined)
        ret
    }
    @scala.inline
    def withGetFilterParam(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFilterParam")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetFilterParam: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFilterParam")(js.undefined)
        ret
    }
    @scala.inline
    def withGetGroupParam(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGroupParam")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetGroupParam: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGroupParam")(js.undefined)
        ret
    }
    @scala.inline
    def withGetLimitParam(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLimitParam")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetLimitParam: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLimitParam")(js.undefined)
        ret
    }
    @scala.inline
    def withGetNoCache(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNoCache")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetNoCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNoCache")(js.undefined)
        ret
    }
    @scala.inline
    def withGetPageParam(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPageParam")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetPageParam: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPageParam")(js.undefined)
        ret
    }
    @scala.inline
    def withGetSimpleSortMode(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSimpleSortMode")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetSimpleSortMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSimpleSortMode")(js.undefined)
        ret
    }
    @scala.inline
    def withGetSortParam(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSortParam")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetSortParam: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSortParam")(js.undefined)
        ret
    }
    @scala.inline
    def withGetStartParam(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStartParam")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetStartParam: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStartParam")(js.undefined)
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
    def withGroupParam(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupParam")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupParam: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupParam")(js.undefined)
        ret
    }
    @scala.inline
    def withLimitParam(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limitParam")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimitParam: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limitParam")(js.undefined)
        ret
    }
    @scala.inline
    def withNoCache(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noCache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noCache")(js.undefined)
        ret
    }
    @scala.inline
    def withPageParam(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageParam")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageParam: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageParam")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessResponse(
      value: (/* success */ js.UndefOr[Boolean], /* operation */ js.UndefOr[IOperation], /* request */ js.UndefOr[IRequest], /* response */ js.UndefOr[js.Any], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processResponse")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withoutProcessResponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processResponse")(js.undefined)
        ret
    }
    @scala.inline
    def withRead(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutRead: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read")(js.undefined)
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
    def withSetCacheString(value: /* cacheString */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCacheString")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetCacheString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCacheString")(js.undefined)
        ret
    }
    @scala.inline
    def withSetDirectionParam(value: /* directionParam */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDirectionParam")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetDirectionParam: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDirectionParam")(js.undefined)
        ret
    }
    @scala.inline
    def withSetEnablePagingParams(value: /* enablePagingParams */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setEnablePagingParams")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetEnablePagingParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setEnablePagingParams")(js.undefined)
        ret
    }
    @scala.inline
    def withSetExtraParam(value: (/* name */ js.UndefOr[String], /* value */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setExtraParam")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSetExtraParam: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setExtraParam")(js.undefined)
        ret
    }
    @scala.inline
    def withSetExtraParams(value: /* extraParams */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setExtraParams")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetExtraParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setExtraParams")(js.undefined)
        ret
    }
    @scala.inline
    def withSetFilterParam(value: /* filterParam */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFilterParam")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetFilterParam: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFilterParam")(js.undefined)
        ret
    }
    @scala.inline
    def withSetGroupParam(value: /* groupParam */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setGroupParam")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetGroupParam: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setGroupParam")(js.undefined)
        ret
    }
    @scala.inline
    def withSetLimitParam(value: /* limitParam */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLimitParam")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetLimitParam: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLimitParam")(js.undefined)
        ret
    }
    @scala.inline
    def withSetNoCache(value: /* noCache */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setNoCache")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetNoCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setNoCache")(js.undefined)
        ret
    }
    @scala.inline
    def withSetPageParam(value: /* pageParam */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPageParam")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetPageParam: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPageParam")(js.undefined)
        ret
    }
    @scala.inline
    def withSetSimpleSortMode(value: /* simpleSortMode */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSimpleSortMode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetSimpleSortMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSimpleSortMode")(js.undefined)
        ret
    }
    @scala.inline
    def withSetSortParam(value: /* sortParam */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSortParam")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetSortParam: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSortParam")(js.undefined)
        ret
    }
    @scala.inline
    def withSetStartParam(value: /* startParam */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStartParam")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetStartParam: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStartParam")(js.undefined)
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
    def withSimpleSortMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simpleSortMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSimpleSortMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simpleSortMode")(js.undefined)
        ret
    }
    @scala.inline
    def withSortParam(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortParam")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortParam: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortParam")(js.undefined)
        ret
    }
    @scala.inline
    def withStartParam(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startParam")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartParam: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startParam")(js.undefined)
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
    def withUpdate(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.undefined)
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

