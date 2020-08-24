package typingsSlinky.scryptJs

import typingsSlinky.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("scrypt-js", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def scrypt(
    password: ArrayLike[Double],
    salt: ArrayLike[Double],
    N: Double,
    r: Double,
    p: Double,
    dkLen: Double
  ): js.Promise[js.typedarray.Uint8Array] = js.native
  def scrypt(
    password: ArrayLike[Double],
    salt: ArrayLike[Double],
    N: Double,
    r: Double,
    p: Double,
    dkLen: Double,
    callback: ProgressCallback
  ): js.Promise[js.typedarray.Uint8Array] = js.native
  def syncScrypt(
    password: ArrayLike[Double],
    salt: ArrayLike[Double],
    N: Double,
    r: Double,
    p: Double,
    dkLen: Double
  ): js.typedarray.Uint8Array = js.native
  type ProgressCallback = js.Function1[/* progress */ Double, Boolean | Unit]
}

