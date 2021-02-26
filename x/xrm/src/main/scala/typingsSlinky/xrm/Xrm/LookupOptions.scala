package typingsSlinky.xrm.Xrm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for options used in Xrm.Utility.lookupObjects
  */
@js.native
trait LookupOptions extends StObject {
  
  /**
    * Indicates whether the lookup allows more than one item to be selected.
    */
  var allowMultiSelect: js.UndefOr[Boolean] = js.native
  
  /**
    * The default entity type to use.
    */
  var defaultEntityType: js.UndefOr[String] = js.native
  
  /**
    * The default view to use.
    */
  var defaultViewId: js.UndefOr[String] = js.native
  
  /**
    * The entity types to display.
    */
  var entityTypes: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Indicates whether the lookup control should show the barcode scanner in mobile clients.
    */
  var showBarcodeScanner: js.UndefOr[Boolean] = js.native
  
  /**
    * The views to be available in the view picker.Only system views are supported.
    */
  var viewIds: js.UndefOr[js.Array[String]] = js.native
}
object LookupOptions {
  
  @scala.inline
  def apply(): LookupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LookupOptions]
  }
  
  @scala.inline
  implicit class LookupOptionsMutableBuilder[Self <: LookupOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowMultiSelect(value: Boolean): Self = StObject.set(x, "allowMultiSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowMultiSelectUndefined: Self = StObject.set(x, "allowMultiSelect", js.undefined)
    
    @scala.inline
    def setDefaultEntityType(value: String): Self = StObject.set(x, "defaultEntityType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultEntityTypeUndefined: Self = StObject.set(x, "defaultEntityType", js.undefined)
    
    @scala.inline
    def setDefaultViewId(value: String): Self = StObject.set(x, "defaultViewId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultViewIdUndefined: Self = StObject.set(x, "defaultViewId", js.undefined)
    
    @scala.inline
    def setEntityTypes(value: js.Array[String]): Self = StObject.set(x, "entityTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityTypesUndefined: Self = StObject.set(x, "entityTypes", js.undefined)
    
    @scala.inline
    def setEntityTypesVarargs(value: String*): Self = StObject.set(x, "entityTypes", js.Array(value :_*))
    
    @scala.inline
    def setShowBarcodeScanner(value: Boolean): Self = StObject.set(x, "showBarcodeScanner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowBarcodeScannerUndefined: Self = StObject.set(x, "showBarcodeScanner", js.undefined)
    
    @scala.inline
    def setViewIds(value: js.Array[String]): Self = StObject.set(x, "viewIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewIdsUndefined: Self = StObject.set(x, "viewIds", js.undefined)
    
    @scala.inline
    def setViewIdsVarargs(value: String*): Self = StObject.set(x, "viewIds", js.Array(value :_*))
  }
}
