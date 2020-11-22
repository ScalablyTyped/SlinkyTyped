package typingsSlinky.tsLoader.interfacesMod

import typingsSlinky.typescript.mod.CompilerOptions
import typingsSlinky.typescript.mod.DirectoryWatcherCallback
import typingsSlinky.typescript.mod.EmitAndSemanticDiagnosticsBuilderProgram
import typingsSlinky.typescript.mod.FileWatcher
import typingsSlinky.typescript.mod.FileWatcherCallback
import typingsSlinky.typescript.mod.SolutionBuilderHostBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SolutionBuilderWithWatchHost
  extends SolutionBuilderHostBase[EmitAndSemanticDiagnosticsBuilderProgram]
     with typingsSlinky.typescript.mod.WatchHost
     with WatchFactory {
  
  var diagnostics: SolutionDiagnostics = js.native
  
  /** Used to watch resolved module's failed lookup locations, config file specs, type roots where auto type reference directives are added */
  /* InferMemberOverrides */
  override def watchDirectory(path: String, callback: DirectoryWatcherCallback): FileWatcher = js.native
  /* InferMemberOverrides */
  override def watchDirectory(
    path: String,
    callback: DirectoryWatcherCallback,
    recursive: js.UndefOr[scala.Nothing],
    options: CompilerOptions
  ): FileWatcher = js.native
  /* InferMemberOverrides */
  override def watchDirectory(path: String, callback: DirectoryWatcherCallback, recursive: Boolean): FileWatcher = js.native
  /* InferMemberOverrides */
  override def watchDirectory(path: String, callback: DirectoryWatcherCallback, recursive: Boolean, options: CompilerOptions): FileWatcher = js.native
  
  /** Used to watch changes in source files, missing files needed to update the program or config file */
  /* InferMemberOverrides */
  override def watchFile(path: String, callback: FileWatcherCallback): FileWatcher = js.native
  /* InferMemberOverrides */
  override def watchFile(
    path: String,
    callback: FileWatcherCallback,
    pollingInterval: js.UndefOr[scala.Nothing],
    options: CompilerOptions
  ): FileWatcher = js.native
  /* InferMemberOverrides */
  override def watchFile(path: String, callback: FileWatcherCallback, pollingInterval: Double): FileWatcher = js.native
  /* InferMemberOverrides */
  override def watchFile(path: String, callback: FileWatcherCallback, pollingInterval: Double, options: CompilerOptions): FileWatcher = js.native
}
