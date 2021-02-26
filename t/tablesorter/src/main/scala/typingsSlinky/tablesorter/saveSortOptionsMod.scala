package typingsSlinky.tablesorter

import typingsSlinky.tablesorter.storageTypeMod.StorageType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object saveSortOptionsMod {
  
  @js.native
  trait SaveSortOptions extends StObject {
    
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
    implicit class SaveSortOptionsMutableBuilder[Self <: SaveSortOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSaveSort(value: Boolean): Self = StObject.set(x, "saveSort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSaveSortUndefined: Self = StObject.set(x, "saveSort", js.undefined)
      
      @scala.inline
      def setStorage_fixedUrl(value: String): Self = StObject.set(x, "storage_fixedUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorage_fixedUrlUndefined: Self = StObject.set(x, "storage_fixedUrl", js.undefined)
      
      @scala.inline
      def setStorage_group(value: String): Self = StObject.set(x, "storage_group", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorage_groupUndefined: Self = StObject.set(x, "storage_group", js.undefined)
      
      @scala.inline
      def setStorage_page(value: String): Self = StObject.set(x, "storage_page", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorage_pageUndefined: Self = StObject.set(x, "storage_page", js.undefined)
      
      @scala.inline
      def setStorage_storageType(value: StorageType): Self = StObject.set(x, "storage_storageType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorage_storageTypeUndefined: Self = StObject.set(x, "storage_storageType", js.undefined)
      
      @scala.inline
      def setStorage_tableId(value: String): Self = StObject.set(x, "storage_tableId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorage_tableIdUndefined: Self = StObject.set(x, "storage_tableId", js.undefined)
    }
  }
}
