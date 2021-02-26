package typingsSlinky.xlsx.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommonOptions extends StObject {
  
  /**
    * If true, throw errors when features are not understood
    * @default false
    */
  var WTF: js.UndefOr[Boolean] = js.native
  
  /**
    * When reading a file with VBA macros, expose CFB blob to `vbaraw` field
    * When writing BIFF8/XLSB/XLSM, reseat `vbaraw` and export to file
    * @default false
    */
  var bookVBA: js.UndefOr[Boolean] = js.native
  
  /**
    * When reading a file, store dates as type d (default is n)
    * When writing XLSX/XLSM file, use native date (default uses date codes)
    * @default false
    */
  var cellDates: js.UndefOr[Boolean] = js.native
  
  /**
    * When reading a file, save style/theme info to the .s field
    * When writing a file, export style/theme info
    * @default false
    */
  var cellStyles: js.UndefOr[Boolean] = js.native
  
  /**
    * If defined and file is encrypted, use password
    * @default ''
    */
  var password: js.UndefOr[String] = js.native
  
  /**
    * Create cell objects for stub cells
    * @default false
    */
  var sheetStubs: js.UndefOr[Boolean] = js.native
}
object CommonOptions {
  
  @scala.inline
  def apply(): CommonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonOptions]
  }
  
  @scala.inline
  implicit class CommonOptionsMutableBuilder[Self <: CommonOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBookVBA(value: Boolean): Self = StObject.set(x, "bookVBA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBookVBAUndefined: Self = StObject.set(x, "bookVBA", js.undefined)
    
    @scala.inline
    def setCellDates(value: Boolean): Self = StObject.set(x, "cellDates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellDatesUndefined: Self = StObject.set(x, "cellDates", js.undefined)
    
    @scala.inline
    def setCellStyles(value: Boolean): Self = StObject.set(x, "cellStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellStylesUndefined: Self = StObject.set(x, "cellStyles", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    @scala.inline
    def setSheetStubs(value: Boolean): Self = StObject.set(x, "sheetStubs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSheetStubsUndefined: Self = StObject.set(x, "sheetStubs", js.undefined)
    
    @scala.inline
    def setWTF(value: Boolean): Self = StObject.set(x, "WTF", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWTFUndefined: Self = StObject.set(x, "WTF", js.undefined)
  }
}
