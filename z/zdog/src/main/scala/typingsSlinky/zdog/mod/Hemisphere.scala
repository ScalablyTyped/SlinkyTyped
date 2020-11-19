package typingsSlinky.zdog.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("zdog", "Hemisphere")
@js.native
class Hemisphere () extends Ellipse {
  def this(options: HemisphereOptions) = this()
  
  def copy(options: HemisphereOptions): Hemisphere = js.native
  
  def copyGraph(options: HemisphereOptions): Hemisphere = js.native
}
