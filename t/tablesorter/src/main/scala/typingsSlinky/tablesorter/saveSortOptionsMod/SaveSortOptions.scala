package typingsSlinky.tablesorter.saveSortOptionsMod

import typingsSlinky.tablesorter.storageTypeMod.StorageType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SaveSortOptions extends js.Object {
  /**
    * A value indicating whether the sorting should be saved locally.
    */
  var saveSort: js.UndefOr[Boolean] = js.native
  /**
    * A url to a table for grouping settings together.
    */
  var storage_fixedUrl: js.UndefOr[String] = js.native
  /**
    * The name of the data-attribute to obtain an id for the table which allows grouping multiple tables together.
    */
  var storage_group: js.UndefOr[String] = js.native
  /**
    * The name of the data-attribute to obtain a table url which allows grouping tables together across pages.
    */
  var storage_page: js.UndefOr[String] = js.native
  /**
    * The storage-type to use.
    */
  var storage_storageType: js.UndefOr[StorageType] = js.native
  /**
    * The id of the `saveSort`-settings.
    */
  var storage_tableId: js.UndefOr[String] = js.native
}

object SaveSortOptions {
  @scala.inline
  def apply(): SaveSortOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SaveSortOptions]
  }
  @scala.inline
  implicit class SaveSortOptionsOps[Self <: SaveSortOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSaveSort(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveSort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSaveSort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveSort")(js.undefined)
        ret
    }
    @scala.inline
    def withStorage_fixedUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storage_fixedUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStorage_fixedUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storage_fixedUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withStorage_group(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storage_group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStorage_group: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storage_group")(js.undefined)
        ret
    }
    @scala.inline
    def withStorage_page(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storage_page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStorage_page: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storage_page")(js.undefined)
        ret
    }
    @scala.inline
    def withStorage_storageType(value: StorageType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storage_storageType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStorage_storageType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storage_storageType")(js.undefined)
        ret
    }
    @scala.inline
    def withStorage_tableId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storage_tableId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStorage_tableId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storage_tableId")(js.undefined)
        ret
    }
  }
  
}

