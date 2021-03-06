package typingsSlinky.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlobalWorkflow extends StObject {
  
  var globalWorkflow: scala.Double = js.native
  
  var workItemType: scala.Double = js.native
}
object GlobalWorkflow {
  
  @scala.inline
  def apply(globalWorkflow: scala.Double, workItemType: scala.Double): GlobalWorkflow = {
    val __obj = js.Dynamic.literal(globalWorkflow = globalWorkflow.asInstanceOf[js.Any], workItemType = workItemType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalWorkflow]
  }
  
  @scala.inline
  implicit class GlobalWorkflowMutableBuilder[Self <: GlobalWorkflow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGlobalWorkflow(value: scala.Double): Self = StObject.set(x, "globalWorkflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkItemType(value: scala.Double): Self = StObject.set(x, "workItemType", value.asInstanceOf[js.Any])
  }
}
