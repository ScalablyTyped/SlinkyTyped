package typingsSlinky.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrinterOptions extends StObject {
  
  var newLine: js.UndefOr[NewLineKind] = js.native
  
  var noEmitHelpers: js.UndefOr[Boolean] = js.native
  
  var omitTrailingSemicolon: js.UndefOr[Boolean] = js.native
  
  var removeComments: js.UndefOr[Boolean] = js.native
}
object PrinterOptions {
  
  @scala.inline
  def apply(): PrinterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrinterOptions]
  }
  
  @scala.inline
  implicit class PrinterOptionsMutableBuilder[Self <: PrinterOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewLine(value: NewLineKind): Self = StObject.set(x, "newLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewLineUndefined: Self = StObject.set(x, "newLine", js.undefined)
    
    @scala.inline
    def setNoEmitHelpers(value: Boolean): Self = StObject.set(x, "noEmitHelpers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoEmitHelpersUndefined: Self = StObject.set(x, "noEmitHelpers", js.undefined)
    
    @scala.inline
    def setOmitTrailingSemicolon(value: Boolean): Self = StObject.set(x, "omitTrailingSemicolon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOmitTrailingSemicolonUndefined: Self = StObject.set(x, "omitTrailingSemicolon", js.undefined)
    
    @scala.inline
    def setRemoveComments(value: Boolean): Self = StObject.set(x, "removeComments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveCommentsUndefined: Self = StObject.set(x, "removeComments", js.undefined)
  }
}
