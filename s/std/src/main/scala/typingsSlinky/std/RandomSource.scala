package typingsSlinky.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RandomSource extends js.Object {
  def getRandomValues(array: js.typedarray.Int16Array): js.typedarray.Int16Array = js.native
  def getRandomValues(array: js.typedarray.Int32Array): js.typedarray.Int32Array = js.native
  def getRandomValues(array: js.typedarray.Int8Array): js.typedarray.Int8Array = js.native
  def getRandomValues(array: js.typedarray.Uint16Array): js.typedarray.Uint16Array = js.native
  def getRandomValues(array: js.typedarray.Uint32Array): js.typedarray.Uint32Array = js.native
  def getRandomValues(array: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  def getRandomValues(array: js.typedarray.Uint8ClampedArray): js.typedarray.Uint8ClampedArray = js.native
}

@JSGlobal("RandomSource")
@js.native
object RandomSource extends Instantiable0[RandomSource]

