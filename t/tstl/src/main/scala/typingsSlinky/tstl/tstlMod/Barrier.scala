package typingsSlinky.tstl.tstlMod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "Barrier")
@js.native
class Barrier protected ()
  extends typingsSlinky.tstl.threadMod.Barrier {
  def this(size: Double) = this()
}

@JSImport("tstl", "barrier")
@js.native
object barrier
  extends TopLevel[Instantiable1[/* size */ Double, typingsSlinky.tstl.threadBarrierMod.Barrier]]

