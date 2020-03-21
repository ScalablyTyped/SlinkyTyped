package typingsSlinky.wonderJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015", "ElementBuffer")
@js.native
class ElementBuffer ()
  extends typingsSlinky.wonderJs.elementBufferMod.ElementBuffer

/* static members */
@JSImport("wonder.js/dist/es2015", "ElementBuffer")
@js.native
object ElementBuffer extends js.Object {
  def create(data: js.Array[Double]): typingsSlinky.wonderJs.elementBufferMod.ElementBuffer = js.native
  def create(data: js.Array[Double], `type`: typingsSlinky.wonderJs.ebuffertypeMod.EBufferType): typingsSlinky.wonderJs.elementBufferMod.ElementBuffer = js.native
  def create(
    data: js.Array[Double],
    `type`: typingsSlinky.wonderJs.ebuffertypeMod.EBufferType,
    usage: typingsSlinky.wonderJs.ebufferusageMod.EBufferUsage
  ): typingsSlinky.wonderJs.elementBufferMod.ElementBuffer = js.native
}

