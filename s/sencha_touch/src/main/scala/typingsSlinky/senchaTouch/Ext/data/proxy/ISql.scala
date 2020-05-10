package typingsSlinky.senchaTouch.Ext.data.proxy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISql extends IClient {
  /** [Method] Performs the given create operation
  		* @param operation Object
  		* @param callback Object
  		* @param scope Object
  		*/
  @JSName("create")
  var create_ISql: js.UndefOr[
    js.Function3[
      /* operation */ js.UndefOr[js.Any], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  /** [Config Option] (String) */
  var database: js.UndefOr[String] = js.native
  /** [Method] Performs the given destroy operation
  		* @param operation Object
  		* @param callback Object
  		* @param scope Object
  		*/
  @JSName("destroy")
  var destroy_ISql: js.UndefOr[
    js.Function3[
      /* operation */ js.UndefOr[js.Any], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  /** [Method] Returns the value of columns
  		* @returns String
  		*/
  var getColumns: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of database
  		* @returns String
  		*/
  var getDatabase: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of defaultDateFormat
  		* @returns String
  		*/
  var getDefaultDateFormat: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Formats the data for each record before sending it to the server
  		* @param record Object The record that we are writing to the server.
  		* @returns Object An object literal of name/value keys to be written to the server. By default this method returns the data property on the record.
  		*/
  var getRecordData: js.UndefOr[js.Function1[/* record */ js.UndefOr[js.Any], _]] = js.native
  /** [Method] Returns the value of table
  		* @returns String
  		*/
  var getTable: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of tableExists
  		* @returns Boolean
  		*/
  var getTableExists: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of uniqueIdStrategy
  		* @returns Boolean
  		*/
  var getUniqueIdStrategy: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Performs the given read operation
  		* @param operation Object
  		* @param callback Object
  		* @param scope Object
  		*/
  @JSName("read")
  var read_ISql: js.UndefOr[
    js.Function3[
      /* operation */ js.UndefOr[js.Any], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  /** [Method] Sets the value of columns
  		* @param columns String The new value.
  		*/
  var setColumns: js.UndefOr[js.Function1[/* columns */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of database
  		* @param database String The new value.
  		*/
  var setDatabase: js.UndefOr[js.Function1[/* database */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of defaultDateFormat
  		* @param defaultDateFormat String The new value.
  		*/
  var setDefaultDateFormat: js.UndefOr[js.Function1[/* defaultDateFormat */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of table
  		* @param table String The new value.
  		*/
  var setTable: js.UndefOr[js.Function1[/* table */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of tableExists
  		* @param tableExists Boolean The new value.
  		*/
  var setTableExists: js.UndefOr[js.Function1[/* tableExists */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of uniqueIdStrategy
  		* @param uniqueIdStrategy Boolean The new value.
  		*/
  var setUniqueIdStrategy: js.UndefOr[js.Function1[/* uniqueIdStrategy */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Config Option] (String) */
  var table: js.UndefOr[String] = js.native
  /** [Method] Performs the given update operation
  		* @param operation Object
  		* @param callback Object
  		* @param scope Object
  		*/
  @JSName("update")
  var update_ISql: js.UndefOr[
    js.Function3[
      /* operation */ js.UndefOr[js.Any], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
}

object ISql {
  @scala.inline
  def apply(): ISql = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISql]
  }
  @scala.inline
  implicit class ISqlOps[Self <: ISql] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withDatabase(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("database")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatabase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("database")(js.undefined)
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
    def withGetColumns(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getColumns")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withGetDatabase(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDatabase")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetDatabase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDatabase")(js.undefined)
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
    def withGetRecordData(value: /* record */ js.UndefOr[js.Any] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRecordData")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetRecordData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRecordData")(js.undefined)
        ret
    }
    @scala.inline
    def withGetTable(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetTable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTable")(js.undefined)
        ret
    }
    @scala.inline
    def withGetTableExists(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTableExists")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetTableExists: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTableExists")(js.undefined)
        ret
    }
    @scala.inline
    def withGetUniqueIdStrategy(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUniqueIdStrategy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetUniqueIdStrategy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUniqueIdStrategy")(js.undefined)
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
    def withSetColumns(value: /* columns */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setColumns")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withSetDatabase(value: /* database */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDatabase")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetDatabase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDatabase")(js.undefined)
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
    def withSetTable(value: /* table */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTable")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetTable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTable")(js.undefined)
        ret
    }
    @scala.inline
    def withSetTableExists(value: /* tableExists */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTableExists")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetTableExists: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTableExists")(js.undefined)
        ret
    }
    @scala.inline
    def withSetUniqueIdStrategy(value: /* uniqueIdStrategy */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setUniqueIdStrategy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetUniqueIdStrategy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setUniqueIdStrategy")(js.undefined)
        ret
    }
    @scala.inline
    def withTable(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("table")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("table")(js.undefined)
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

