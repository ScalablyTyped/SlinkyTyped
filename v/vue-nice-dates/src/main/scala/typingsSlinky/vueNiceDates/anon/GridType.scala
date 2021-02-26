package typingsSlinky.vueNiceDates.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridType extends StObject {
  
  var gridType: String = js.native
  
  var receivedInitialDate: js.Date | Null = js.native
}
object GridType {
  
  @scala.inline
  def apply(gridType: String): GridType = {
    val __obj = js.Dynamic.literal(gridType = gridType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridType]
  }
  
  @scala.inline
  implicit class GridTypeMutableBuilder[Self <: GridType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGridType(value: String): Self = StObject.set(x, "gridType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceivedInitialDate(value: js.Date): Self = StObject.set(x, "receivedInitialDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceivedInitialDateNull: Self = StObject.set(x, "receivedInitialDate", null)
  }
}
