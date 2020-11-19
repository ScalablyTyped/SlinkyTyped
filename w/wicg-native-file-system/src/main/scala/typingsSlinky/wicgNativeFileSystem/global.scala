package typingsSlinky.wicgNativeFileSystem

import typingsSlinky.wicgNativeFileSystem.anon.ChooseFileSystemEntriesFi
import typingsSlinky.wicgNativeFileSystem.anon.ChooseFileSystemEntriesFiAccepts
import typingsSlinky.wicgNativeFileSystem.anon.ChooseFileSystemEntriesFiExcludeAcceptAllOption
import typingsSlinky.wicgNativeFileSystem.anon.OpenFilePickerOptionsmult
import typingsSlinky.wicgNativeFileSystem.anon.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  def chooseFileSystemEntries(): js.Promise[FileSystemFileHandle] = js.native
  def chooseFileSystemEntries(options: ChooseFileSystemEntriesFi): js.Promise[FileSystemFileHandle] = js.native
  def chooseFileSystemEntries(options: ChooseFileSystemEntriesFiAccepts): js.Promise[js.Array[FileSystemFileHandle]] = js.native
  def chooseFileSystemEntries(options: ChooseFileSystemEntriesFiExcludeAcceptAllOption): js.Promise[FileSystemFileHandle] = js.native
  def chooseFileSystemEntries(options: Type): js.Promise[FileSystemDirectoryHandle] = js.native
  
  def getOriginPrivateDirectory(): js.Promise[FileSystemDirectoryHandle] = js.native
  
  def showDirectoryPicker(): js.Promise[FileSystemDirectoryHandle] = js.native
  def showDirectoryPicker(options: DirectoryPickerOptions): js.Promise[FileSystemDirectoryHandle] = js.native
  
  def showOpenFilePicker(): js.Promise[js.Array[FileSystemFileHandle]] = js.native
  def showOpenFilePicker(options: OpenFilePickerOptions): js.Promise[js.Array[FileSystemFileHandle]] = js.native
  def showOpenFilePicker(options: OpenFilePickerOptionsmult): js.Promise[js.Array[FileSystemFileHandle]] = js.native
  
  def showSaveFilePicker(): js.Promise[FileSystemFileHandle] = js.native
  def showSaveFilePicker(options: SaveFilePickerOptions): js.Promise[FileSystemFileHandle] = js.native
  
  @js.native
  object FileSystemDirectoryHandle extends js.Object {
    
    def getSystemDirectory(options: GetSystemDirectoryOptions): js.Promise[typingsSlinky.wicgNativeFileSystem.FileSystemDirectoryHandle] = js.native
  }
}
