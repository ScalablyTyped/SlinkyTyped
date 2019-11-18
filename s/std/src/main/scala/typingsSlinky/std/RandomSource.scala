package typingsSlinky.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RandomSource extends js.Object {
  def getRandomValues(array: Int16Array): scala.scalajs.js.typedarray.Int16Array = js.native
  def getRandomValues(array: Int32Array): scala.scalajs.js.typedarray.Int32Array = js.native
  def getRandomValues(array: Int8Array): scala.scalajs.js.typedarray.Int8Array = js.native
  def getRandomValues(array: Uint16Array): scala.scalajs.js.typedarray.Uint16Array = js.native
  def getRandomValues(array: Uint32Array): scala.scalajs.js.typedarray.Uint32Array = js.native
  def getRandomValues(array: Uint8Array): scala.scalajs.js.typedarray.Uint8Array = js.native
  def getRandomValues(array: Uint8ClampedArray): scala.scalajs.js.typedarray.Uint8ClampedArray = js.native
}

@JSGlobal("RandomSource")
@js.native
object RandomSource extends Instantiable0[RandomSource]

