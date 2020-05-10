package typingsSlinky.sequelize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
//  Query Types
// ~~~~~~~~~~~~~
//
//  https://github.com/sequelize/sequelize/blob/v3.4.1/lib/query-types.js
//
@js.native
trait QueryTypes extends js.Object {
   // 'BULKUPDATE'
  var BULKDELETE: String = js.native
   // 'UPDATE'
  var BULKUPDATE: String = js.native
   // 'BULKDELETE'
  var DELETE: String = js.native
   // 'SHOWINDEXES'
  var DESCRIBE: String = js.native
   // 'RAW'
  var FOREIGNKEYS: String = js.native
   // 'SELECT'
  var INSERT: String = js.native
   // 'DESCRIBE'
  var RAW: String = js.native
  var SELECT: String = js.native
   // 'SHOWTABLES'
  var SHOWINDEXES: String = js.native
   // 'VERSION'
  var SHOWTABLES: String = js.native
   // 'INSERT'
  var UPDATE: String = js.native
   // 'DELETE'
  var UPSERT: String = js.native
   // 'UPSERT'
  var VERSION: String = js.native
}

object QueryTypes {
  @scala.inline
  def apply(
    BULKDELETE: String,
    BULKUPDATE: String,
    DELETE: String,
    DESCRIBE: String,
    FOREIGNKEYS: String,
    INSERT: String,
    RAW: String,
    SELECT: String,
    SHOWINDEXES: String,
    SHOWTABLES: String,
    UPDATE: String,
    UPSERT: String,
    VERSION: String
  ): QueryTypes = {
    val __obj = js.Dynamic.literal(BULKDELETE = BULKDELETE.asInstanceOf[js.Any], BULKUPDATE = BULKUPDATE.asInstanceOf[js.Any], DELETE = DELETE.asInstanceOf[js.Any], DESCRIBE = DESCRIBE.asInstanceOf[js.Any], FOREIGNKEYS = FOREIGNKEYS.asInstanceOf[js.Any], INSERT = INSERT.asInstanceOf[js.Any], RAW = RAW.asInstanceOf[js.Any], SELECT = SELECT.asInstanceOf[js.Any], SHOWINDEXES = SHOWINDEXES.asInstanceOf[js.Any], SHOWTABLES = SHOWTABLES.asInstanceOf[js.Any], UPDATE = UPDATE.asInstanceOf[js.Any], UPSERT = UPSERT.asInstanceOf[js.Any], VERSION = VERSION.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryTypes]
  }
  @scala.inline
  implicit class QueryTypesOps[Self <: QueryTypes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBULKDELETE(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BULKDELETE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBULKUPDATE(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BULKUPDATE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDELETE(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DELETE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDESCRIBE(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DESCRIBE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFOREIGNKEYS(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FOREIGNKEYS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withINSERT(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("INSERT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRAW(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RAW")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSELECT(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SELECT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSHOWINDEXES(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SHOWINDEXES")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSHOWTABLES(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SHOWTABLES")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUPDATE(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UPDATE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUPSERT(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UPSERT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVERSION(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VERSION")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

