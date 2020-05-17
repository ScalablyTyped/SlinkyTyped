package typingsSlinky.tspromise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  class Thenable[T] ()
    extends typingsSlinky.tspromise.Thenable[T]
  
  def `yield`[T](promise: typingsSlinky.tspromise.Thenable[T]): T = js.native
}

