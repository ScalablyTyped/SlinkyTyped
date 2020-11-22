package typingsSlinky.wicgFileSystemAccess.mod.global

import typingsSlinky.wicgFileSystemAccess.anon.ChooseFileSystemEntriesFi
import typingsSlinky.wicgFileSystemAccess.anon.ChooseFileSystemEntriesFiAccepts
import typingsSlinky.wicgFileSystemAccess.anon.ChooseFileSystemEntriesFiExcludeAcceptAllOption
import typingsSlinky.wicgFileSystemAccess.anon.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("chooseFileSystemEntries")
@js.native
object chooseFileSystemEntries extends js.Object {
  
  /**
    * @deprecated Old method just for Chromium <=85. Use `showOpenFilePicker()` in the new API.
    */
  def apply(): js.Promise[FileSystemFileHandle] = js.native
  def apply(options: ChooseFileSystemEntriesFi): js.Promise[FileSystemFileHandle] = js.native
  /**
    * @deprecated Old method just for Chromium <=85. Use `showOpenFilePicker()` in the new API.
    */
  def apply(options: ChooseFileSystemEntriesFiAccepts): js.Promise[js.Array[FileSystemFileHandle]] = js.native
  /**
    * @deprecated Old method just for Chromium <=85. Use `showSaveFilePicker()` in the new API.
    */
  def apply(options: ChooseFileSystemEntriesFiExcludeAcceptAllOption): js.Promise[FileSystemFileHandle] = js.native
  /**
    * @deprecated Old method just for Chromium <=85. Use `showDirectoryPicker()` in the new API.
    */
  def apply(options: Type): js.Promise[FileSystemDirectoryHandle] = js.native
}
