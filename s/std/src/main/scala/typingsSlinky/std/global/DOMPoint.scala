package typingsSlinky.std.global

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import typingsSlinky.std.DOMPointInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DOMPoint")
@js.native
class DOMPoint ()
  extends typingsSlinky.std.DOMPoint {
  def this(x: Double) = this()
  def this(x: Double, y: Double) = this()
  def this(x: Double, y: Double, z: Double) = this()
  def this(x: Double, y: Double, z: Double, w: Double) = this()
}

@JSGlobal("DOMPoint")
@js.native
object DOMPoint
  extends Instantiable0[typingsSlinky.std.DOMPoint]
     with Instantiable1[/* x */ Double, typingsSlinky.std.DOMPoint]
     with Instantiable2[/* x */ Double, /* y */ Double, typingsSlinky.std.DOMPoint]
     with Instantiable3[/* x */ Double, /* y */ Double, /* z */ Double, typingsSlinky.std.DOMPoint]
     with Instantiable4[
      /* x */ Double, 
      /* y */ Double, 
      /* z */ Double, 
      /* w */ Double, 
      typingsSlinky.std.DOMPoint
    ] {
  def fromPoint(): typingsSlinky.std.DOMPoint = js.native
  def fromPoint(other: DOMPointInit): typingsSlinky.std.DOMPoint = js.native
}

