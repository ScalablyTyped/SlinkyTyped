package typingsSlinky.wicgFileSystemAccess.mod.global

import typingsSlinky.std.PermissionDescriptor
import typingsSlinky.std.PermissionName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileSystemPermissionDescriptor extends PermissionDescriptor {
  
  var handle: FileSystemHandle = js.native
  
  var mode: js.UndefOr[FileSystemPermissionMode] = js.native
}
object FileSystemPermissionDescriptor {
  
  @scala.inline
  def apply(handle: FileSystemHandle, name: PermissionName): FileSystemPermissionDescriptor = {
    val __obj = js.Dynamic.literal(handle = handle.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileSystemPermissionDescriptor]
  }
  
  @scala.inline
  implicit class FileSystemPermissionDescriptorMutableBuilder[Self <: FileSystemPermissionDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHandle(value: FileSystemHandle): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMode(value: FileSystemPermissionMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
  }
}
