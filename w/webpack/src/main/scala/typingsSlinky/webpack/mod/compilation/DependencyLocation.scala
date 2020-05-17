package typingsSlinky.webpack.mod.compilation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.webpack.mod.compilation.SynteticDependencyLocation
  - typingsSlinky.webpack.mod.compilation.RealDependencyLocation
*/
trait DependencyLocation extends js.Object

object DependencyLocation {
  @scala.inline
  implicit def apply(value: RealDependencyLocation): DependencyLocation = value.asInstanceOf[DependencyLocation]
  @scala.inline
  implicit def apply(value: SynteticDependencyLocation): DependencyLocation = value.asInstanceOf[DependencyLocation]
}

