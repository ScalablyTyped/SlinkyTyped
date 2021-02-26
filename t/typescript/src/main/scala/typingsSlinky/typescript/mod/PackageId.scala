package typingsSlinky.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PackageId extends StObject {
  
  /**
    * Name of the package.
    * Should not include `@types`.
    * If accessing a non-index file, this should include its name e.g. "foo/bar".
    */
  var name: java.lang.String = js.native
  
  /**
    * Name of a submodule within this package.
    * May be "".
    */
  var subModuleName: java.lang.String = js.native
  
  /** Version of the package, e.g. "1.2.3" */
  var version: java.lang.String = js.native
}
object PackageId {
  
  @scala.inline
  def apply(name: java.lang.String, subModuleName: java.lang.String, version: java.lang.String): PackageId = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], subModuleName = subModuleName.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackageId]
  }
  
  @scala.inline
  implicit class PackageIdMutableBuilder[Self <: PackageId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubModuleName(value: java.lang.String): Self = StObject.set(x, "subModuleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: java.lang.String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
