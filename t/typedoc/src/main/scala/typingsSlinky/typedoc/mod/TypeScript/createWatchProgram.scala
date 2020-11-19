package typingsSlinky.typedoc.mod.TypeScript

import typingsSlinky.typescript.mod.BuilderProgram
import typingsSlinky.typescript.mod.WatchCompilerHostOfConfigFile
import typingsSlinky.typescript.mod.WatchCompilerHostOfFilesAndCompilerOptions
import typingsSlinky.typescript.mod.WatchOfConfigFile
import typingsSlinky.typescript.mod.WatchOfFilesAndCompilerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.createWatchProgram")
@js.native
object createWatchProgram extends js.Object {
  
  /**
    * Creates the watch from the host for config file
    */
  def apply[T /* <: BuilderProgram */](host: WatchCompilerHostOfConfigFile[T]): WatchOfConfigFile[T] = js.native
  /**
    * Creates the watch from the host for root files and compiler options
    */
  def apply[T /* <: BuilderProgram */](host: WatchCompilerHostOfFilesAndCompilerOptions[T]): WatchOfFilesAndCompilerOptions[T] = js.native
}
