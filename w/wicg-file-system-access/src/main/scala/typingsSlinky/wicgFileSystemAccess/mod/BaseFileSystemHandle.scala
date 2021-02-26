package typingsSlinky.wicgFileSystemAccess.mod

import typingsSlinky.std.PermissionState
import typingsSlinky.wicgFileSystemAccess.mod.global.FileSystemHandle
import typingsSlinky.wicgFileSystemAccess.mod.global.FileSystemHandleKind
import typingsSlinky.wicgFileSystemAccess.mod.global.FileSystemHandlePermissionDescriptor
import typingsSlinky.wicgFileSystemAccess.wicgFileSystemAccessBooleans.`false`
import typingsSlinky.wicgFileSystemAccess.wicgFileSystemAccessBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseFileSystemHandle extends StObject {
  
  /**
    * @deprecated Old property just for Chromium <=85. Use `kind` property in the new API.
    */
  val isDirectory: `false` | `true` = js.native
  
  /**
    * @deprecated Old property just for Chromium <=85. Use `kind` property in the new API.
    */
  val isFile: `false` | `true` = js.native
  
  def isSameEntry(other: FileSystemHandle): js.Promise[Boolean] = js.native
  
  val kind: FileSystemHandleKind = js.native
  
  val name: String = js.native
  
  def queryPermission(): js.Promise[PermissionState] = js.native
  def queryPermission(descriptor: FileSystemHandlePermissionDescriptor): js.Promise[PermissionState] = js.native
  
  def requestPermission(): js.Promise[PermissionState] = js.native
  def requestPermission(descriptor: FileSystemHandlePermissionDescriptor): js.Promise[PermissionState] = js.native
}
