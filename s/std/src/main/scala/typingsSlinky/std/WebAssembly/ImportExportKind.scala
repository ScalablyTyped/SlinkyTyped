package typingsSlinky.std.WebAssembly

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.function
  - typings.std.stdStrings.table
  - typings.std.stdStrings.memory
  - typings.std.stdStrings.global
*/
trait ImportExportKind extends js.Object

object ImportExportKind {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def function: typingsSlinky.std.stdStrings.function = this.cast("function")
  @scala.inline
  def global: typingsSlinky.std.stdStrings.global = this.cast("global")
  @scala.inline
  def memory: typingsSlinky.std.stdStrings.memory = this.cast("memory")
  @scala.inline
  def table: typingsSlinky.std.stdStrings.table = this.cast("table")
}

