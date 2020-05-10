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
  def SynteticDependencyLocation(name: String): DependencyLocation = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DependencyLocation]
  }
  @scala.inline
  def RealDependencyLocation(start: SourcePosition): DependencyLocation = {
    val __obj = js.Dynamic.literal(start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[DependencyLocation]
  }
}

