package typingsSlinky.ydnDb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatabaseSchemaJson extends js.Object {
  var fullTextCatalogs: js.UndefOr[js.Array[FullTextCatalog]] = js.native
  var stores: js.Array[StoreSchemaJson] = js.native
  var version: js.UndefOr[Double] = js.native
}

object DatabaseSchemaJson {
  @scala.inline
  def apply(stores: js.Array[StoreSchemaJson]): DatabaseSchemaJson = {
    val __obj = js.Dynamic.literal(stores = stores.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatabaseSchemaJson]
  }
  @scala.inline
  implicit class DatabaseSchemaJsonOps[Self <: DatabaseSchemaJson] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStores(value: js.Array[StoreSchemaJson]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stores")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFullTextCatalogs(value: js.Array[FullTextCatalog]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullTextCatalogs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullTextCatalogs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullTextCatalogs")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

