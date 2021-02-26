package typingsSlinky.vsoNodeApi.taskAgentInterfacesMod

import typingsSlinky.vsoNodeApi.formInputInterfacesMod.InputDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceEndpointType extends StObject {
  
  var authenticationSchemes: js.Array[ServiceEndpointAuthenticationScheme] = js.native
  
  var dataSources: js.Array[DataSource] = js.native
  
  var dependencyData: js.Array[DependencyData] = js.native
  
  var description: String = js.native
  
  var displayName: String = js.native
  
  var endpointUrl: EndpointUrl = js.native
  
  var helpLink: HelpLink = js.native
  
  var helpMarkDown: String = js.native
  
  var iconUrl: String = js.native
  
  var inputDescriptors: js.Array[InputDescriptor] = js.native
  
  var name: String = js.native
}
object ServiceEndpointType {
  
  @scala.inline
  def apply(
    authenticationSchemes: js.Array[ServiceEndpointAuthenticationScheme],
    dataSources: js.Array[DataSource],
    dependencyData: js.Array[DependencyData],
    description: String,
    displayName: String,
    endpointUrl: EndpointUrl,
    helpLink: HelpLink,
    helpMarkDown: String,
    iconUrl: String,
    inputDescriptors: js.Array[InputDescriptor],
    name: String
  ): ServiceEndpointType = {
    val __obj = js.Dynamic.literal(authenticationSchemes = authenticationSchemes.asInstanceOf[js.Any], dataSources = dataSources.asInstanceOf[js.Any], dependencyData = dependencyData.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], endpointUrl = endpointUrl.asInstanceOf[js.Any], helpLink = helpLink.asInstanceOf[js.Any], helpMarkDown = helpMarkDown.asInstanceOf[js.Any], iconUrl = iconUrl.asInstanceOf[js.Any], inputDescriptors = inputDescriptors.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceEndpointType]
  }
  
  @scala.inline
  implicit class ServiceEndpointTypeMutableBuilder[Self <: ServiceEndpointType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthenticationSchemes(value: js.Array[ServiceEndpointAuthenticationScheme]): Self = StObject.set(x, "authenticationSchemes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthenticationSchemesVarargs(value: ServiceEndpointAuthenticationScheme*): Self = StObject.set(x, "authenticationSchemes", js.Array(value :_*))
    
    @scala.inline
    def setDataSources(value: js.Array[DataSource]): Self = StObject.set(x, "dataSources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourcesVarargs(value: DataSource*): Self = StObject.set(x, "dataSources", js.Array(value :_*))
    
    @scala.inline
    def setDependencyData(value: js.Array[DependencyData]): Self = StObject.set(x, "dependencyData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDependencyDataVarargs(value: DependencyData*): Self = StObject.set(x, "dependencyData", js.Array(value :_*))
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointUrl(value: EndpointUrl): Self = StObject.set(x, "endpointUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHelpLink(value: HelpLink): Self = StObject.set(x, "helpLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHelpMarkDown(value: String): Self = StObject.set(x, "helpMarkDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUrl(value: String): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputDescriptors(value: js.Array[InputDescriptor]): Self = StObject.set(x, "inputDescriptors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputDescriptorsVarargs(value: InputDescriptor*): Self = StObject.set(x, "inputDescriptors", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
