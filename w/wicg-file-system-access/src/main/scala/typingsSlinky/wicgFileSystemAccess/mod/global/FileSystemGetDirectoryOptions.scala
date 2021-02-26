package typingsSlinky.wicgFileSystemAccess.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileSystemGetDirectoryOptions extends StObject {
  
  var create: js.UndefOr[Boolean] = js.native
}
object FileSystemGetDirectoryOptions {
  
  @scala.inline
  def apply(): FileSystemGetDirectoryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileSystemGetDirectoryOptions]
  }
  
  @scala.inline
  implicit class FileSystemGetDirectoryOptionsMutableBuilder[Self <: FileSystemGetDirectoryOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreate(value: Boolean): Self = StObject.set(x, "create", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
  }
}
