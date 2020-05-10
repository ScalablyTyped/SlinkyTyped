package typingsSlinky.std

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DOMRectReadOnly extends js.Object {
  val bottom: Double = js.native
  val height: Double = js.native
  val left: Double = js.native
  val right: Double = js.native
  val top: Double = js.native
  val width: Double = js.native
  val x: Double = js.native
  val y: Double = js.native
  def toJSON(): js.Any = js.native
}

@JSGlobal("DOMRectReadOnly")
@js.native
object DOMRectReadOnly
  extends Instantiable0[DOMRectReadOnly]
     with Instantiable1[/* x */ Double, DOMRectReadOnly]
     with Instantiable2[/* x */ Double, /* y */ Double, DOMRectReadOnly]
     with Instantiable3[/* x */ Double, /* y */ Double, /* width */ Double, DOMRectReadOnly]
     with Instantiable4[/* x */ Double, /* y */ Double, /* width */ Double, /* height */ Double, DOMRectReadOnly] {
  def fromRect(): DOMRectReadOnly = js.native
  def fromRect(other: DOMRectInit): DOMRectReadOnly = js.native
}

