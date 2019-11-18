package typingsSlinky

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object styledDashComponents {
  import typingsSlinky.std.Exclude
  import typingsSlinky.std.Pick

  // Helper type operators
  type Omit[T, K /* <: String */] = Pick[T, Exclude[String, K]]
}
