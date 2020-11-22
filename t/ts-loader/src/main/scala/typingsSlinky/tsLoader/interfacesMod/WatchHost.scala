package typingsSlinky.tsLoader.interfacesMod

import typingsSlinky.std.Map
import typingsSlinky.typescript.mod.EmitAndSemanticDiagnosticsBuilderProgram
import typingsSlinky.typescript.mod.FileWatcherEventKind
import typingsSlinky.typescript.mod.OutputFile
import typingsSlinky.typescript.mod.WatchCompilerHostOfFilesAndCompilerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WatchHost extends WatchCompilerHostOfFilesAndCompilerOptions[EmitAndSemanticDiagnosticsBuilderProgram] {
  
  def invokeDirectoryWatcher(directory: String, fileAddedOrRemoved: String): Unit = js.native
  
  def invokeFileWatcher(fileName: String, eventKind: FileWatcherEventKind): Unit = js.native
  
  var outputFiles: Map[String, js.Array[OutputFile]] = js.native
  
  var tsbuildinfo: js.UndefOr[OutputFile] = js.native
  
  def updateRootFileNames(): Unit = js.native
}
