package typingsSlinky.wicgFileSystemAccess.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object global {
  
  type FileSystemWriteChunkType = typingsSlinky.std.BufferSource | org.scalajs.dom.raw.Blob | java.lang.String | typingsSlinky.wicgFileSystemAccess.mod.global.WriteParams
  
  // tslint:disable-next-line:no-empty-interface
  type SaveFilePickerOptions = typingsSlinky.wicgFileSystemAccess.mod.global.FilePickerOptions
  
  /**
    * @deprecated Old method just for Chromium <=85. Use `showOpenFilePicker()` in the new API.
    */
  @scala.inline
  def chooseFileSystemEntries(): js.Promise[typingsSlinky.wicgFileSystemAccess.mod.global.FileSystemFileHandle] = js.Dynamic.global.applyDynamic("chooseFileSystemEntries")().asInstanceOf[js.Promise[typingsSlinky.wicgFileSystemAccess.mod.global.FileSystemFileHandle]]
  @scala.inline
  def chooseFileSystemEntries(options: typingsSlinky.wicgFileSystemAccess.anon.ChooseFileSystemEntriesFi): js.Promise[typingsSlinky.wicgFileSystemAccess.mod.global.FileSystemFileHandle] = js.Dynamic.global.applyDynamic("chooseFileSystemEntries")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsSlinky.wicgFileSystemAccess.mod.global.FileSystemFileHandle]]
  /**
    * @deprecated Old method just for Chromium <=85. Use `showOpenFilePicker()` in the new API.
    */
  @scala.inline
  def chooseFileSystemEntries(options: typingsSlinky.wicgFileSystemAccess.anon.ChooseFileSystemEntriesFiAccepts): js.Promise[js.Array[typingsSlinky.wicgFileSystemAccess.mod.global.FileSystemFileHandle]] = js.Dynamic.global.applyDynamic("chooseFileSystemEntries")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[typingsSlinky.wicgFileSystemAccess.mod.global.FileSystemFileHandle]]]
  /**
    * @deprecated Old method just for Chromium <=85. Use `showSaveFilePicker()` in the new API.
    */
  @scala.inline
  def chooseFileSystemEntries(options: typingsSlinky.wicgFileSystemAccess.anon.ChooseFileSystemEntriesFiExcludeAcceptAllOption): js.Promise[typingsSlinky.wicgFileSystemAccess.mod.global.FileSystemFileHandle] = js.Dynamic.global.applyDynamic("chooseFileSystemEntries")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsSlinky.wicgFileSystemAccess.mod.global.FileSystemFileHandle]]
  /**
    * @deprecated Old method just for Chromium <=85. Use `showDirectoryPicker()` in the new API.
    */
  @scala.inline
  def chooseFileSystemEntries(options: typingsSlinky.wicgFileSystemAccess.anon.Type): js.Promise[typingsSlinky.wicgFileSystemAccess.mod.global.FileSystemDirectoryHandle] = js.Dynamic.global.applyDynamic("chooseFileSystemEntries")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsSlinky.wicgFileSystemAccess.mod.global.FileSystemDirectoryHandle]]
  
  @scala.inline
  def showDirectoryPicker(): js.Promise[typingsSlinky.wicgFileSystemAccess.mod.global.FileSystemDirectoryHandle] = js.Dynamic.global.applyDynamic("showDirectoryPicker")().asInstanceOf[js.Promise[typingsSlinky.wicgFileSystemAccess.mod.global.FileSystemDirectoryHandle]]
  @scala.inline
  def showDirectoryPicker(options: typingsSlinky.wicgFileSystemAccess.mod.global.DirectoryPickerOptions): js.Promise[typingsSlinky.wicgFileSystemAccess.mod.global.FileSystemDirectoryHandle] = js.Dynamic.global.applyDynamic("showDirectoryPicker")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsSlinky.wicgFileSystemAccess.mod.global.FileSystemDirectoryHandle]]
  
  @scala.inline
  def showOpenFilePicker(): js.Promise[js.Array[typingsSlinky.wicgFileSystemAccess.mod.global.FileSystemFileHandle]] = js.Dynamic.global.applyDynamic("showOpenFilePicker")().asInstanceOf[js.Promise[js.Array[typingsSlinky.wicgFileSystemAccess.mod.global.FileSystemFileHandle]]]
  @scala.inline
  def showOpenFilePicker(options: typingsSlinky.wicgFileSystemAccess.anon.OpenFilePickerOptionsmult): js.Promise[js.Array[typingsSlinky.wicgFileSystemAccess.mod.global.FileSystemFileHandle]] = js.Dynamic.global.applyDynamic("showOpenFilePicker")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[typingsSlinky.wicgFileSystemAccess.mod.global.FileSystemFileHandle]]]
  @scala.inline
  def showOpenFilePicker(options: typingsSlinky.wicgFileSystemAccess.mod.global.OpenFilePickerOptions): js.Promise[js.Array[typingsSlinky.wicgFileSystemAccess.mod.global.FileSystemFileHandle]] = js.Dynamic.global.applyDynamic("showOpenFilePicker")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[typingsSlinky.wicgFileSystemAccess.mod.global.FileSystemFileHandle]]]
  
  @scala.inline
  def showSaveFilePicker(): js.Promise[typingsSlinky.wicgFileSystemAccess.mod.global.FileSystemFileHandle] = js.Dynamic.global.applyDynamic("showSaveFilePicker")().asInstanceOf[js.Promise[typingsSlinky.wicgFileSystemAccess.mod.global.FileSystemFileHandle]]
  @scala.inline
  def showSaveFilePicker(options: typingsSlinky.wicgFileSystemAccess.mod.global.SaveFilePickerOptions): js.Promise[typingsSlinky.wicgFileSystemAccess.mod.global.FileSystemFileHandle] = js.Dynamic.global.applyDynamic("showSaveFilePicker")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsSlinky.wicgFileSystemAccess.mod.global.FileSystemFileHandle]]
}
