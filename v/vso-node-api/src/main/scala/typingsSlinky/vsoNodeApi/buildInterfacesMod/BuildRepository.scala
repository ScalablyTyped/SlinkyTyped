package typingsSlinky.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildRepository extends StObject {
  
  /**
    * Indicates whether to checkout submodules.
    */
  var checkoutSubmodules: Boolean = js.native
  
  /**
    * Indicates whether to clean the target folder when getting code from the repository.
    */
  var clean: String = js.native
  
  /**
    * The name of the default branch.
    */
  var defaultBranch: String = js.native
  
  /**
    * The ID of the repository.
    */
  var id: String = js.native
  
  /**
    * The friendly name of the repository.
    */
  var name: String = js.native
  
  var properties: StringDictionary[String] = js.native
  
  /**
    * The root folder.
    */
  var rootFolder: String = js.native
  
  /**
    * The type of the repository.
    */
  var `type`: String = js.native
  
  /**
    * The URL of the repository.
    */
  var url: String = js.native
}
object BuildRepository {
  
  @scala.inline
  def apply(
    checkoutSubmodules: Boolean,
    clean: String,
    defaultBranch: String,
    id: String,
    name: String,
    properties: StringDictionary[String],
    rootFolder: String,
    `type`: String,
    url: String
  ): BuildRepository = {
    val __obj = js.Dynamic.literal(checkoutSubmodules = checkoutSubmodules.asInstanceOf[js.Any], clean = clean.asInstanceOf[js.Any], defaultBranch = defaultBranch.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], rootFolder = rootFolder.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildRepository]
  }
  
  @scala.inline
  implicit class BuildRepositoryMutableBuilder[Self <: BuildRepository] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCheckoutSubmodules(value: Boolean): Self = StObject.set(x, "checkoutSubmodules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClean(value: String): Self = StObject.set(x, "clean", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultBranch(value: String): Self = StObject.set(x, "defaultBranch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: StringDictionary[String]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootFolder(value: String): Self = StObject.set(x, "rootFolder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
