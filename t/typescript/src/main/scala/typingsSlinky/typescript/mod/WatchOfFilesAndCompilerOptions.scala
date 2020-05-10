package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creates the watch that generates program using the root files and compiler options
  */
@js.native
trait WatchOfFilesAndCompilerOptions[T] extends Watch[T] {
  /** Updates the root files in the program, only if this is not config file compilation */
  def updateRootFileNames(fileNames: js.Array[java.lang.String]): Unit = js.native
}

object WatchOfFilesAndCompilerOptions {
  @scala.inline
  def apply[T](close: () => Unit, getProgram: () => T, updateRootFileNames: js.Array[java.lang.String] => Unit): WatchOfFilesAndCompilerOptions[T] = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), getProgram = js.Any.fromFunction0(getProgram), updateRootFileNames = js.Any.fromFunction1(updateRootFileNames))
    __obj.asInstanceOf[WatchOfFilesAndCompilerOptions[T]]
  }
  @scala.inline
  implicit class WatchOfFilesAndCompilerOptionsOps[Self[t] <: WatchOfFilesAndCompilerOptions[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withUpdateRootFileNames(value: js.Array[java.lang.String] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateRootFileNames")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

