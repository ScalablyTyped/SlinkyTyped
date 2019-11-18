package typingsSlinky.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creates the watch that generates program using the root files and compiler options
  */
trait WatchOfFilesAndCompilerOptions[T] extends Watch[T] {
  /** Updates the root files in the program, only if this is not config file compilation */
  def updateRootFileNames(fileNames: js.Array[String]): Unit
}

object WatchOfFilesAndCompilerOptions {
  @scala.inline
  def apply[T](close: () => Unit, getProgram: () => T, updateRootFileNames: js.Array[String] => Unit): WatchOfFilesAndCompilerOptions[T] = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), getProgram = js.Any.fromFunction0(getProgram), updateRootFileNames = js.Any.fromFunction1(updateRootFileNames))
  
    __obj.asInstanceOf[WatchOfFilesAndCompilerOptions[T]]
  }
}

