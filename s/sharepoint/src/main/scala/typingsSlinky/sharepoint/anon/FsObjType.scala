package typingsSlinky.sharepoint.anon

import typingsSlinky.sharepoint.SP.FileSystemObjectType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FsObjType extends StObject {
  
  var fsObjType: FileSystemObjectType = js.native
  
  var id: Double = js.native
}
object FsObjType {
  
  @scala.inline
  def apply(fsObjType: FileSystemObjectType, id: Double): FsObjType = {
    val __obj = js.Dynamic.literal(fsObjType = fsObjType.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[FsObjType]
  }
  
  @scala.inline
  implicit class FsObjTypeMutableBuilder[Self <: FsObjType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFsObjType(value: FileSystemObjectType): Self = StObject.set(x, "fsObjType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
