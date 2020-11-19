package typingsSlinky.wicgNativeFileSystem

import typingsSlinky.std.AsyncIterable
import typingsSlinky.wicgNativeFileSystem.wicgNativeFileSystemBooleans.`false`
import typingsSlinky.wicgNativeFileSystem.wicgNativeFileSystemBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileSystemDirectoryHandle
  extends BaseFileSystemHandle
     with FileSystemHandle {
  
  def entries(): AsyncIterable[js.Tuple2[String, FileSystemHandle]] = js.native
  
  def getDirectory(name: String): js.Promise[FileSystemDirectoryHandle] = js.native
  def getDirectory(name: String, options: FileSystemGetDirectoryOptions): js.Promise[FileSystemDirectoryHandle] = js.native
  
  def getEntries(): AsyncIterable[FileSystemHandle] = js.native
  
  def getFile(name: String): js.Promise[FileSystemFileHandle] = js.native
  def getFile(name: String, options: FileSystemGetFileOptions): js.Promise[FileSystemFileHandle] = js.native
  
  @JSName("isDirectory")
  val isDirectory_FileSystemDirectoryHandle: `true` = js.native
  
  @JSName("isFile")
  val isFile_FileSystemDirectoryHandle: `false` = js.native
  
  def isSameEntry(other: FileSystemFileHandle): js.Promise[`false`] = js.native
  
  def keys(): AsyncIterable[String] = js.native
  
  def removeEntry(name: String): js.Promise[Unit] = js.native
  def removeEntry(name: String, options: FileSystemRemoveOptions): js.Promise[Unit] = js.native
  
  def resolve(possibleDescendant: FileSystemHandle): js.Promise[js.Array[String] | Null] = js.native
  
  def values(): AsyncIterable[FileSystemHandle] = js.native
}
