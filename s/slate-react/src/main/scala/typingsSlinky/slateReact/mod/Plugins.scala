package typingsSlinky.slateReact.mod

import typingsSlinky.slate.mod.Controller
import typingsSlinky.std.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Plugins[T /* <: Controller */]
  extends Array[PluginOrPlugins[T]]
     with PluginOrPlugins[T]

