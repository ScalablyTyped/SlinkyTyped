package typingsSlinky.storybookUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Path extends StObject {
  
  var path: js.Array[String] = js.native
  
  var refId: String = js.native
}
object Path {
  
  @scala.inline
  def apply(path: js.Array[String], refId: String): Path = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], refId = refId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Path]
  }
  
  @scala.inline
  implicit class PathMutableBuilder[Self <: Path] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPath(value: js.Array[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathVarargs(value: String*): Self = StObject.set(x, "path", js.Array(value :_*))
    
    @scala.inline
    def setRefId(value: String): Self = StObject.set(x, "refId", value.asInstanceOf[js.Any])
  }
}
