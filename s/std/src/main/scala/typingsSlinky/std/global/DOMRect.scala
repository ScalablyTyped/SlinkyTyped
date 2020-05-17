package typingsSlinky.std.global

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import typingsSlinky.std.DOMRectInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DOMRect")
@js.native
class DOMRect ()
  extends typingsSlinky.std.DOMRect {
  def this(x: Double) = this()
  def this(x: Double, y: Double) = this()
  def this(x: Double, y: Double, width: Double) = this()
  def this(x: Double, y: Double, width: Double, height: Double) = this()
}

@JSGlobal("DOMRect")
@js.native
object DOMRect
  extends Instantiable0[typingsSlinky.std.DOMRect]
     with Instantiable1[/* x */ Double, typingsSlinky.std.DOMRect]
     with Instantiable2[/* x */ Double, /* y */ Double, typingsSlinky.std.DOMRect]
     with Instantiable3[/* x */ Double, /* y */ Double, /* width */ Double, typingsSlinky.std.DOMRect]
     with Instantiable4[
      /* x */ Double, 
      /* y */ Double, 
      /* width */ Double, 
      /* height */ Double, 
      typingsSlinky.std.DOMRect
    ] {
  def fromRect(): typingsSlinky.std.DOMRect = js.native
  def fromRect(other: DOMRectInit): typingsSlinky.std.DOMRect = js.native
}

