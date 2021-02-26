package typingsSlinky.twilio.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaskRoutingConfigurationOptions extends StObject {
  
  var defaultFilter: js.UndefOr[WorkflowRuleOptions] = js.native
  
  var default_filter: js.UndefOr[WorkflowRuleOptions] = js.native
  
  var filters: js.Array[WorkflowRuleOptions] = js.native
}
object TaskRoutingConfigurationOptions {
  
  @scala.inline
  def apply(filters: js.Array[WorkflowRuleOptions]): TaskRoutingConfigurationOptions = {
    val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskRoutingConfigurationOptions]
  }
  
  @scala.inline
  implicit class TaskRoutingConfigurationOptionsMutableBuilder[Self <: TaskRoutingConfigurationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultFilter(value: WorkflowRuleOptions): Self = StObject.set(x, "defaultFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultFilterUndefined: Self = StObject.set(x, "defaultFilter", js.undefined)
    
    @scala.inline
    def setDefault_filter(value: WorkflowRuleOptions): Self = StObject.set(x, "default_filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefault_filterUndefined: Self = StObject.set(x, "default_filter", js.undefined)
    
    @scala.inline
    def setFilters(value: js.Array[WorkflowRuleOptions]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersVarargs(value: WorkflowRuleOptions*): Self = StObject.set(x, "filters", js.Array(value :_*))
  }
}
