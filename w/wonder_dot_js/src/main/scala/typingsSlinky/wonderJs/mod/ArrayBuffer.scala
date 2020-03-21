package typingsSlinky.wonderJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015", "ArrayBuffer")
@js.native
class ArrayBuffer ()
  extends typingsSlinky.wonderJs.arrayBufferMod.ArrayBuffer

/* static members */
@JSImport("wonder.js/dist/es2015", "ArrayBuffer")
@js.native
object ArrayBuffer extends js.Object {
  def create(data: js.Array[Double], size: Double): typingsSlinky.wonderJs.arrayBufferMod.ArrayBuffer = js.native
  def create(data: js.Array[Double], size: Double, `type`: typingsSlinky.wonderJs.ebuffertypeMod.EBufferType): typingsSlinky.wonderJs.arrayBufferMod.ArrayBuffer = js.native
  def create(
    data: js.Array[Double],
    size: Double,
    `type`: typingsSlinky.wonderJs.ebuffertypeMod.EBufferType,
    usage: typingsSlinky.wonderJs.ebufferusageMod.EBufferUsage
  ): typingsSlinky.wonderJs.arrayBufferMod.ArrayBuffer = js.native
}

