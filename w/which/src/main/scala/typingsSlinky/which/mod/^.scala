package typingsSlinky.which.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("which", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /** Finds the first instance of a specified executable in the PATH environment variable */
  def apply(cmd: String): js.Promise[String] = js.native
  /** Finds the first instance of a specified executable in the PATH environment variable */
  def apply(cmd: String, cb: js.Function2[/* err */ js.Error | Null, /* path */ js.UndefOr[String], Unit]): Unit = js.native
  /** Finds the first instance of a specified executable in the PATH environment variable */
  def apply(cmd: String, options: AsyncOptions with OptionsAll with OptionsFirst): js.Promise[js.Array[String]] = js.native
  /** Finds the first instance of a specified executable in the PATH environment variable */
  def apply(
    cmd: String,
    options: (AsyncOptions with OptionsAll with OptionsFirst) | AsyncOptions,
    cb: js.Function2[js.Error | Null, js.UndefOr[js.Array[String] | String], Unit]
  ): Unit = js.native
}
