package typingsSlinky.universalDashRouter.srcUniversalRouterSyncMod

import typingsSlinky.pathDashToDashRegexp.pathDashToDashRegexpMod.Key
import typingsSlinky.pathDashToDashRegexp.pathDashToDashRegexpMod.ParseOptions
import typingsSlinky.pathDashToDashRegexp.pathDashToDashRegexpMod.Path
import typingsSlinky.pathDashToDashRegexp.pathDashToDashRegexpMod.RegExpOptions
import typingsSlinky.universalDashRouter.Anon_Compile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("universal-router/src/UniversalRouterSync", JSImport.Default)
@js.native
class default[C /* <: Context */, R] protected () extends UniversalRouter[C, R] {
  def this(routes: Route[C, R]) = this()
  def this(routes: Routes[C, R]) = this()
  def this(routes: Route[C, R], options: Options[C, R]) = this()
  def this(routes: Routes[C, R], options: Options[C, R]) = this()
}

/* static members */
@JSImport("universal-router/src/UniversalRouterSync", JSImport.Default)
@js.native
object default extends js.Object {
  @JSName("pathToRegexp")
  var pathToRegexp_Original: Anon_Compile = js.native
  def pathToRegexp(path: Path): js.RegExp = js.native
  def pathToRegexp(path: Path, keys: js.Array[Key]): js.RegExp = js.native
  def pathToRegexp(path: Path, keys: js.Array[Key], options: RegExpOptions with ParseOptions): js.RegExp = js.native
}

