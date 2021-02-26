package typingsSlinky.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait YamlProcess extends BuildProcess {
  
  var errors: js.Array[String] = js.native
  
  /**
    * The resources used by the build definition.
    */
  var resources: BuildProcessResources = js.native
  
  /**
    * The YAML filename.
    */
  var yamlFilename: String = js.native
}
object YamlProcess {
  
  @scala.inline
  def apply(errors: js.Array[String], resources: BuildProcessResources, `type`: Double, yamlFilename: String): YamlProcess = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], yamlFilename = yamlFilename.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[YamlProcess]
  }
  
  @scala.inline
  implicit class YamlProcessMutableBuilder[Self <: YamlProcess] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrors(value: js.Array[String]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsVarargs(value: String*): Self = StObject.set(x, "errors", js.Array(value :_*))
    
    @scala.inline
    def setResources(value: BuildProcessResources): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYamlFilename(value: String): Self = StObject.set(x, "yamlFilename", value.asInstanceOf[js.Any])
  }
}
