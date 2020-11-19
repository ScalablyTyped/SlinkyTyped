package typingsSlinky.vsoNodeApi.distributedTaskCommonInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataSourceBindingBase extends js.Object {
  
  var dataSourceName: String = js.native
  
  var endpointId: String = js.native
  
  var endpointUrl: String = js.native
  
  var parameters: StringDictionary[String] = js.native
  
  var resultSelector: String = js.native
  
  var resultTemplate: String = js.native
  
  var target: String = js.native
}
object DataSourceBindingBase {
  
  @scala.inline
  def apply(
    dataSourceName: String,
    endpointId: String,
    endpointUrl: String,
    parameters: StringDictionary[String],
    resultSelector: String,
    resultTemplate: String,
    target: String
  ): DataSourceBindingBase = {
    val __obj = js.Dynamic.literal(dataSourceName = dataSourceName.asInstanceOf[js.Any], endpointId = endpointId.asInstanceOf[js.Any], endpointUrl = endpointUrl.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], resultSelector = resultSelector.asInstanceOf[js.Any], resultTemplate = resultTemplate.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSourceBindingBase]
  }
  
  @scala.inline
  implicit class DataSourceBindingBaseOps[Self <: DataSourceBindingBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDataSourceName(value: String): Self = this.set("dataSourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointId(value: String): Self = this.set("endpointId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointUrl(value: String): Self = this.set("endpointUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameters(value: StringDictionary[String]): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultSelector(value: String): Self = this.set("resultSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultTemplate(value: String): Self = this.set("resultTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
  }
}
