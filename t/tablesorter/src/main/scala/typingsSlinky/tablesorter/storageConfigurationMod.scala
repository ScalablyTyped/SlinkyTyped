package typingsSlinky.tablesorter

import typingsSlinky.tablesorter.storageTypeMod.StorageType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storageConfigurationMod {
  
  @js.native
  trait StorageConfiguration extends StObject {
    
    /**
      * The `data-attribute`-name to automatically get the id of the table from.
      */
    var group: js.UndefOr[String] = js.native
    
    /**
      * The id of the storage to save to.
      */
    var id: js.UndefOr[String] = js.native
    
    /**
      * The `data-attribute`-name to automatically get the url of the table from.
      */
    var page: js.UndefOr[String] = js.native
    
    /**
      * The medium to save the storage to.
      */
    var storageType: js.UndefOr[StorageType] = js.native
    
    /**
      * The url to save the storage to.
      */
    var url: js.UndefOr[String] = js.native
  }
  object StorageConfiguration {
    
    @scala.inline
    def apply(): StorageConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StorageConfiguration]
    }
    
    @scala.inline
    implicit class StorageConfigurationMutableBuilder[Self <: StorageConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setPage(value: String): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
      
      @scala.inline
      def setStorageType(value: StorageType): Self = StObject.set(x, "storageType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorageTypeUndefined: Self = StObject.set(x, "storageType", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
}
