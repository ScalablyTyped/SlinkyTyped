package typingsSlinky.vscode.mod

import typingsSlinky.vscode.Thenable
import typingsSlinky.vscode.anon.UseTrash
import typingsSlinky.vscode.anon.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileSystem extends js.Object {
  
  /**
    * Copy files or folders.
    *
    * @param source The existing file.
    * @param destination The destination location.
    * @param options Defines if existing files should be overwritten.
    */
  def copy(source: Uri, target: Uri): Thenable[Unit] = js.native
  def copy(source: Uri, target: Uri, options: `0`): Thenable[Unit] = js.native
  
  /**
    * Create a new directory (Note, that new files are created via `write`-calls).
    *
    * *Note* that missing directories are created automatically, e.g this call has
    * `mkdirp` semantics.
    *
    * @param uri The uri of the new folder.
    */
  def createDirectory(uri: Uri): Thenable[Unit] = js.native
  
  /**
    * Delete a file.
    *
    * @param uri The resource that is to be deleted.
    * @param options Defines if trash can should be used and if deletion of folders is recursive
    */
  def delete(uri: Uri): Thenable[Unit] = js.native
  def delete(uri: Uri, options: UseTrash): Thenable[Unit] = js.native
  
  /**
    * Retrieve all entries of a [directory](#FileType.Directory).
    *
    * @param uri The uri of the folder.
    * @return An array of name/type-tuples or a thenable that resolves to such.
    */
  def readDirectory(uri: Uri): Thenable[js.Array[js.Tuple2[String, FileType]]] = js.native
  
  /**
    * Read the entire contents of a file.
    *
    * @param uri The uri of the file.
    * @return An array of bytes or a thenable that resolves to such.
    */
  def readFile(uri: Uri): Thenable[js.typedarray.Uint8Array] = js.native
  
  /**
    * Rename a file or folder.
    *
    * @param oldUri The existing file.
    * @param newUri The new location.
    * @param options Defines if existing files should be overwritten.
    */
  def rename(source: Uri, target: Uri): Thenable[Unit] = js.native
  def rename(source: Uri, target: Uri, options: `0`): Thenable[Unit] = js.native
  
  /**
    * Retrieve metadata about a file.
    *
    * @param uri The uri of the file to retrieve metadata about.
    * @return The file metadata about the file.
    */
  def stat(uri: Uri): Thenable[FileStat] = js.native
  
  /**
    * Write data to a file, replacing its entire contents.
    *
    * @param uri The uri of the file.
    * @param content The new content of the file.
    */
  def writeFile(uri: Uri, content: js.typedarray.Uint8Array): Thenable[Unit] = js.native
}
