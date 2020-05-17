package typingsSlinky.tensorflowTfjsData.lazyIteratorMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ZipMismatchMode extends js.Object

@JSImport("@tensorflow/tfjs-data/dist/iterators/lazy_iterator", "ZipMismatchMode")
@js.native
object ZipMismatchMode extends js.Object {
  @js.native
  sealed trait FAIL extends ZipMismatchMode
  
  @js.native
  sealed trait LONGEST extends ZipMismatchMode
  
  @js.native
  sealed trait SHORTEST extends ZipMismatchMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ZipMismatchMode with Double] = js.native
  /* 0 */ @js.native
  object FAIL extends TopLevel[FAIL with Double]
  
  /* 2 */ @js.native
  object LONGEST extends TopLevel[LONGEST with Double]
  
  /* 1 */ @js.native
  object SHORTEST extends TopLevel[SHORTEST with Double]
  
}

