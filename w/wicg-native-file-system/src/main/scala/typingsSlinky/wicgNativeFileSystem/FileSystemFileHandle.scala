package typingsSlinky.wicgNativeFileSystem

import org.scalajs.dom.raw.File
import typingsSlinky.wicgNativeFileSystem.wicgNativeFileSystemBooleans.`false`
import typingsSlinky.wicgNativeFileSystem.wicgNativeFileSystemBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileSystemFileHandle
  extends BaseFileSystemHandle
     with FileSystemHandle {
  
  def createWritable(): js.Promise[FileSystemWritableFileStream] = js.native
  def createWritable(options: FileSystemCreateWritableOptions): js.Promise[FileSystemWritableFileStream] = js.native
  
  def getFile(): js.Promise[File] = js.native
  
  @JSName("isDirectory")
  val isDirectory_FileSystemFileHandle: `false` = js.native
  
  @JSName("isFile")
  val isFile_FileSystemFileHandle: `true` = js.native
  
  def isSameEntry(other: FileSystemDirectoryHandle): js.Promise[`false`] = js.native
}
