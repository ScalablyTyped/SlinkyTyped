package typingsSlinky.slateReact

import typingsSlinky.immutable.Immutable.List
import typingsSlinky.slate.mod.Controller
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallPathOffset extends js.Object {
  def apply(path: String): Controller = js.native
  def apply(path: String, offset: Double): Controller = js.native
  def apply(path: Double): Controller = js.native
  def apply(path: Double, offset: Double): Controller = js.native
  def apply(path: List[Double]): Controller = js.native
  def apply(path: List[Double], offset: Double): Controller = js.native
}

