package typingsSlinky.scrypt.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("scrypt", "params")
@js.native
object params extends js.Object {
  
  def apply(maxtime: Double): js.Promise[Params_] = js.native
  def apply(maxtime: Double, cb: js.Function2[/* err */ js.Error | Null, /* obj */ Params_, Unit]): Unit = js.native
  def apply(maxtime: Double, maxmem: js.UndefOr[scala.Nothing], maxmemfrac: Double): js.Promise[Params_] = js.native
  def apply(maxtime: Double, maxmem: Double): js.Promise[Params_] = js.native
  def apply(
    maxtime: Double,
    maxmem: Double,
    cb: js.Function2[/* err */ js.Error | Null, /* obj */ Params_, Unit]
  ): Unit = js.native
  def apply(maxtime: Double, maxmem: Double, maxmemfrac: Double): js.Promise[Params_] = js.native
  def apply(
    maxtime: Double,
    maxmem: Double,
    maxmemfrac: Double,
    cb: js.Function2[/* err */ js.Error | Null, /* obj */ Params_, Unit]
  ): Unit = js.native
}
