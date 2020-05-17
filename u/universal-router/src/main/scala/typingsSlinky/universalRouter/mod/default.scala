package typingsSlinky.universalRouter.mod

import typingsSlinky.pathToRegexp.mod.Key
import typingsSlinky.pathToRegexp.mod.ParseOptions
import typingsSlinky.pathToRegexp.mod.Path
import typingsSlinky.pathToRegexp.mod.RegExpOptions
import typingsSlinky.universalRouter.anon.Call
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("universal-router", JSImport.Default)
@js.native
class default[C /* <: Context */, R] protected () extends UniversalRouter[C, R] {
  def this(routes: Route[C, R]) = this()
  def this(routes: Routes[C, R]) = this()
  def this(routes: Route[C, R], options: Options[C, R]) = this()
  def this(routes: Routes[C, R], options: Options[C, R]) = this()
}

/* static members */
@JSImport("universal-router", JSImport.Default)
@js.native
object default extends js.Object {
  @JSName("pathToRegexp")
  var pathToRegexp_Original: Call = js.native
  def pathToRegexp(path: Path): js.RegExp = js.native
  def pathToRegexp(path: Path, keys: js.Array[Key]): js.RegExp = js.native
  def pathToRegexp(path: Path, keys: js.Array[Key], options: RegExpOptions with ParseOptions): js.RegExp = js.native
}

