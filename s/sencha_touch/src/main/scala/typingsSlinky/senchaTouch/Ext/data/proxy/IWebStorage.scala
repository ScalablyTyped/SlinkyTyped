package typingsSlinky.senchaTouch.Ext.data.proxy

import typingsSlinky.senchaTouch.Ext.data.IModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IWebStorage extends IClient {
  /** [Property] (Object) */
  var cache: js.UndefOr[js.Any] = js.native
  /** [Method] inherit docs
  		* @param operation Object
  		* @param callback Object
  		* @param scope Object
  		*/
  @JSName("create")
  var create_IWebStorage: js.UndefOr[
    js.Function3[
      /* operation */ js.UndefOr[js.Any], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  /** [Method] inherit
  		* @param operation Object
  		* @param callback Object
  		* @param scope Object
  		*/
  @JSName("destroy")
  var destroy_IWebStorage: js.UndefOr[
    js.Function3[
      /* operation */ js.UndefOr[js.Any], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  /** [Config Option] (Boolean) */
  var enablePagingParams: js.UndefOr[Boolean] = js.native
  /** [Method] Returns the value of defaultDateFormat
  		* @returns String
  		*/
  var getDefaultDateFormat: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of enablePagingParams
  		* @returns Boolean
  		*/
  var getEnablePagingParams: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of id
  		* @returns String
  		*/
  @JSName("getId")
  var getId_IWebStorage: js.UndefOr[js.Function0[String]] = js.native
  /** [Config Option] (String) */
  var id: js.UndefOr[String] = js.native
  /** [Method] inherit docs
  		* @param operation Object
  		* @param callback Object
  		* @param scope Object
  		*/
  @JSName("read")
  var read_IWebStorage: js.UndefOr[
    js.Function3[
      /* operation */ js.UndefOr[js.Any], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  /** [Method] Sets the value of defaultDateFormat
  		* @param defaultDateFormat String The new value.
  		*/
  var setDefaultDateFormat: js.UndefOr[js.Function1[/* defaultDateFormat */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of enablePagingParams
  		* @param enablePagingParams Boolean The new value.
  		*/
  var setEnablePagingParams: js.UndefOr[js.Function1[/* enablePagingParams */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of id
  		* @param id String The new value.
  		*/
  var setId: js.UndefOr[js.Function1[/* id */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Saves the given record in the Proxy
  		* @param record Ext.data.Model The model instance
  		* @param id String The id to save the record under (defaults to the value of the record's getId() function)
  		*/
  var setRecord: js.UndefOr[js.Function2[/* record */ js.UndefOr[IModel], /* id */ js.UndefOr[String], Unit]] = js.native
  /** [Method] inherit docs
  		* @param operation Object
  		* @param callback Object
  		* @param scope Object
  		*/
  @JSName("update")
  var update_IWebStorage: js.UndefOr[
    js.Function3[
      /* operation */ js.UndefOr[js.Any], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
}

object IWebStorage {
  @scala.inline
  def apply(): IWebStorage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IWebStorage]
  }
  @scala.inline
  implicit class IWebStorageOps[Self <: IWebStorage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCache(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(js.undefined)
        ret
    }
    @scala.inline
    def withCreate(
      value: (/* operation */ js.UndefOr[js.Any], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutCreate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.undefined)
        ret
    }
    @scala.inline
    def withDestroy(
      value: (/* operation */ js.UndefOr[js.Any], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutDestroy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.undefined)
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
    def withGetDefaultDateFormat(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDefaultDateFormat")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetDefaultDateFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDefaultDateFormat")(js.undefined)
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
    def withGetId(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getId")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withRead(
      value: (/* operation */ js.UndefOr[js.Any], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutRead: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read")(js.undefined)
        ret
    }
    @scala.inline
    def withSetDefaultDateFormat(value: /* defaultDateFormat */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDefaultDateFormat")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetDefaultDateFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDefaultDateFormat")(js.undefined)
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
    def withSetId(value: /* id */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setId")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setId")(js.undefined)
        ret
    }
    @scala.inline
    def withSetRecord(value: (/* record */ js.UndefOr[IModel], /* id */ js.UndefOr[String]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRecord")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSetRecord: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRecord")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdate(
      value: (/* operation */ js.UndefOr[js.Any], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.undefined)
        ret
    }
  }
  
}

