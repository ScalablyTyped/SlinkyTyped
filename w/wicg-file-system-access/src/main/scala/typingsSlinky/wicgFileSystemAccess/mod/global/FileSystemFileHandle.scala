package typingsSlinky.wicgFileSystemAccess.mod.global

import org.scalajs.dom.raw.File
import typingsSlinky.wicgFileSystemAccess.wicgFileSystemAccessStrings.file
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("FileSystemFileHandle")
@js.native
class FileSystemFileHandle protected () extends FileSystemHandle {
  
  def createWritable(): js.Promise[FileSystemWritableFileStream] = js.native
  def createWritable(options: FileSystemCreateWritableOptions): js.Promise[FileSystemWritableFileStream] = js.native
  
  def getFile(): js.Promise[File] = js.native
  
  @JSName("kind")
  val kind_FileSystemFileHandle: file = js.native
}
