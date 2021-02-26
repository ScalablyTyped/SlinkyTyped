package typingsSlinky.vsoNodeApi.testInterfacesMod

import typingsSlinky.vsoNodeApi.vssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestConfiguration extends StObject {
  
  /**
    * Area of the configuration
    */
  var area: ShallowReference = js.native
  
  /**
    * Description of the configuration
    */
  var description: String = js.native
  
  /**
    * Id of the configuration
    */
  var id: Double = js.native
  
  /**
    * Is the configuration a default for the test plans
    */
  var isDefault: Boolean = js.native
  
  /**
    * Last Updated By  Reference
    */
  var lastUpdatedBy: IdentityRef = js.native
  
  /**
    * Last Updated Data
    */
  var lastUpdatedDate: js.Date = js.native
  
  /**
    * Name of the configuration
    */
  var name: String = js.native
  
  /**
    * Project to which the configuration belongs
    */
  var project: ShallowReference = js.native
  
  /**
    * Revision of the the configuration
    */
  var revision: Double = js.native
  
  /**
    * State of the configuration
    */
  var state: TestConfigurationState = js.native
  
  /**
    * Url of Configuration Resource
    */
  var url: String = js.native
  
  /**
    * Dictionary of Test Variable, Selected Value
    */
  var values: js.Array[NameValuePair] = js.native
}
object TestConfiguration {
  
  @scala.inline
  def apply(
    area: ShallowReference,
    description: String,
    id: Double,
    isDefault: Boolean,
    lastUpdatedBy: IdentityRef,
    lastUpdatedDate: js.Date,
    name: String,
    project: ShallowReference,
    revision: Double,
    state: TestConfigurationState,
    url: String,
    values: js.Array[NameValuePair]
  ): TestConfiguration = {
    val __obj = js.Dynamic.literal(area = area.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isDefault = isDefault.asInstanceOf[js.Any], lastUpdatedBy = lastUpdatedBy.asInstanceOf[js.Any], lastUpdatedDate = lastUpdatedDate.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestConfiguration]
  }
  
  @scala.inline
  implicit class TestConfigurationMutableBuilder[Self <: TestConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArea(value: ShallowReference): Self = StObject.set(x, "area", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDefault(value: Boolean): Self = StObject.set(x, "isDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedBy(value: IdentityRef): Self = StObject.set(x, "lastUpdatedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedDate(value: js.Date): Self = StObject.set(x, "lastUpdatedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProject(value: ShallowReference): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevision(value: Double): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: TestConfigurationState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValues(value: js.Array[NameValuePair]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: NameValuePair*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
