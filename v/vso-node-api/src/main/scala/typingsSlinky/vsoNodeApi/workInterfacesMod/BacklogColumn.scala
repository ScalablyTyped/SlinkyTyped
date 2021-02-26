package typingsSlinky.vsoNodeApi.workInterfacesMod

import typingsSlinky.vsoNodeApi.workItemTrackingInterfacesMod.WorkItemFieldReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BacklogColumn extends StObject {
  
  var columnFieldReference: WorkItemFieldReference = js.native
  
  var width: Double = js.native
}
object BacklogColumn {
  
  @scala.inline
  def apply(columnFieldReference: WorkItemFieldReference, width: Double): BacklogColumn = {
    val __obj = js.Dynamic.literal(columnFieldReference = columnFieldReference.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[BacklogColumn]
  }
  
  @scala.inline
  implicit class BacklogColumnMutableBuilder[Self <: BacklogColumn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnFieldReference(value: WorkItemFieldReference): Self = StObject.set(x, "columnFieldReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
