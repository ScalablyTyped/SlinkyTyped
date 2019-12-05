package typingsSlinky.tspromise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object tspromiseMod {
  import typingsSlinky.tspromise.Thenable

  type Promise[T] = Thenable[T]
}
