package typingsSlinky.tsLoader.interfacesMod

import typingsSlinky.typescript.mod.CompilerOptions
import typingsSlinky.typescript.mod.DirectoryWatcherCallback
import typingsSlinky.typescript.mod.FileWatcher
import typingsSlinky.typescript.mod.FileWatcherCallback
import typingsSlinky.typescript.mod.FileWatcherEventKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WatchFactory extends js.Object {
  
  def invokeDirectoryWatcher(directory: String, fileAddedOrRemoved: String): Unit = js.native
  
  def invokeFileWatcher(fileName: String, eventKind: FileWatcherEventKind): Unit = js.native
  
  /** Used to watch resolved module's failed lookup locations, config file specs, type roots where auto type reference directives are added */
  def watchDirectory(path: String, callback: DirectoryWatcherCallback): FileWatcher = js.native
  def watchDirectory(
    path: String,
    callback: DirectoryWatcherCallback,
    recursive: js.UndefOr[scala.Nothing],
    options: CompilerOptions
  ): FileWatcher = js.native
  def watchDirectory(path: String, callback: DirectoryWatcherCallback, recursive: Boolean): FileWatcher = js.native
  def watchDirectory(path: String, callback: DirectoryWatcherCallback, recursive: Boolean, options: CompilerOptions): FileWatcher = js.native
  
  /** Used to watch changes in source files, missing files needed to update the program or config file */
  def watchFile(path: String, callback: FileWatcherCallback): FileWatcher = js.native
  def watchFile(
    path: String,
    callback: FileWatcherCallback,
    pollingInterval: js.UndefOr[scala.Nothing],
    options: CompilerOptions
  ): FileWatcher = js.native
  def watchFile(path: String, callback: FileWatcherCallback, pollingInterval: Double): FileWatcher = js.native
  def watchFile(path: String, callback: FileWatcherCallback, pollingInterval: Double, options: CompilerOptions): FileWatcher = js.native
  
  var watchedDirectories: WatchCallbacks[DirectoryWatcherCallback] = js.native
  
  var watchedDirectoriesRecursive: WatchCallbacks[DirectoryWatcherCallback] = js.native
  
  var watchedFiles: WatchCallbacks[FileWatcherCallback] = js.native
}
