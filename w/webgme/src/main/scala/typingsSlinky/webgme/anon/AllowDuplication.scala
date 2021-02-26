package typingsSlinky.webgme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AllowDuplication extends StObject {
  
  /**
    * Enables duplication of entire project with 
    * full history (requires at least mongodb 2.6).
    *   config.seedProjects.allowDuplication = true;
    */
  var allowDuplication: Boolean = js.native
  
  /**
    * List of directories where project seeds are stored.
    *   config.seedProjects.basePaths = ['./seeds'];
    */
  var basePaths: js.Array[String] = js.native
  
  /**
    * Used by the GUI when highlighting/selecting
    * the default project to seed from.
    *   config.seedProjects.defaultProject = 'EmptyProject';
    */
  var defaultProject: String = js.native
  
  /**
    * Enables creation of new projects using seeds.
    *   config.seedProjects.enable = true;
    */
  var enable: Boolean = js.native
}
object AllowDuplication {
  
  @scala.inline
  def apply(allowDuplication: Boolean, basePaths: js.Array[String], defaultProject: String, enable: Boolean): AllowDuplication = {
    val __obj = js.Dynamic.literal(allowDuplication = allowDuplication.asInstanceOf[js.Any], basePaths = basePaths.asInstanceOf[js.Any], defaultProject = defaultProject.asInstanceOf[js.Any], enable = enable.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowDuplication]
  }
  
  @scala.inline
  implicit class AllowDuplicationMutableBuilder[Self <: AllowDuplication] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowDuplication(value: Boolean): Self = StObject.set(x, "allowDuplication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBasePaths(value: js.Array[String]): Self = StObject.set(x, "basePaths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBasePathsVarargs(value: String*): Self = StObject.set(x, "basePaths", js.Array(value :_*))
    
    @scala.inline
    def setDefaultProject(value: String): Self = StObject.set(x, "defaultProject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
  }
}
