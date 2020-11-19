package typingsSlinky.sourcemappedStacktrace.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sourcemapped-stacktrace", "mapStackTrace")
@js.native
object mapStackTrace extends js.Object {
  
  def apply(stack: js.UndefOr[scala.Nothing], done: js.Function1[/* mappedStack */ js.Array[String], Unit]): Unit = js.native
  def apply(
    stack: js.UndefOr[scala.Nothing],
    done: js.Function1[/* mappedStack */ js.Array[String], Unit],
    opts: MapStackTraceOptions
  ): Unit = js.native
  def apply(stack: String, done: js.Function1[/* mappedStack */ js.Array[String], Unit]): Unit = js.native
  def apply(
    stack: String,
    done: js.Function1[/* mappedStack */ js.Array[String], Unit],
    opts: MapStackTraceOptions
  ): Unit = js.native
}
