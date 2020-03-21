package typingsSlinky.wonderJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015", "ShaderManager")
@js.native
class ShaderManager protected ()
  extends typingsSlinky.wonderJs.shaderManagerMod.ShaderManager {
  def this(material: typingsSlinky.wonderJs.materialMod.Material) = this()
}

/* static members */
@JSImport("wonder.js/dist/es2015", "ShaderManager")
@js.native
object ShaderManager extends js.Object {
  def create(material: typingsSlinky.wonderJs.materialMod.Material): typingsSlinky.wonderJs.shaderManagerMod.ShaderManager = js.native
}

