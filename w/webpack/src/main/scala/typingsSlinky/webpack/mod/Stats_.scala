package typingsSlinky.webpack.mod

import typingsSlinky.webpack.mod.Stats.ToJsonOptions
import typingsSlinky.webpack.mod.Stats.ToJsonOutput
import typingsSlinky.webpack.mod.Stats.ToStringOptions
import typingsSlinky.webpack.mod.compilation.Compilation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack", "Stats")
@js.native
class Stats_ protected () extends js.Object {
  def this(compilation: Compilation) = this()
  var compilation: Compilation = js.native
  var endTime: js.UndefOr[Double] = js.native
  var hash: js.UndefOr[String] = js.native
  var startTime: js.UndefOr[Double] = js.native
  def formatFilePath(filePath: String): String = js.native
  /** Returns true if there were errors while compiling. */
  def hasErrors(): Boolean = js.native
  /** Returns true if there were warnings while compiling. */
  def hasWarnings(): Boolean = js.native
  /** Remove a prefixed "!" that can be specified to reverse sort order */
  def normalizeFieldKey(field: String): String = js.native
  /** if a field is prefixed by a "!" reverse sort order */
  def sortOrderRegular(field: String): Boolean = js.native
  /** Returns compilation information as a JSON object. */
  def toJson(): ToJsonOutput = js.native
  def toJson(options: ToJsonOptions): ToJsonOutput = js.native
  def toJson(options: ToJsonOptions, forToString: Boolean): ToJsonOutput = js.native
  def toString(options: ToStringOptions): String = js.native
}

