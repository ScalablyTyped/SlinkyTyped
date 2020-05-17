package typingsSlinky.std.global

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.std.DOMMatrixInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WebKitCSSMatrix")
@js.native
class WebKitCSSMatrix ()
  extends typingsSlinky.std.DOMMatrix {
  def this(init: java.lang.String) = this()
  def this(init: js.Array[Double]) = this()
}

@JSGlobal("WebKitCSSMatrix")
@js.native
object WebKitCSSMatrix
  extends Instantiable0[typingsSlinky.std.DOMMatrix]
     with Instantiable1[
      (/* init */ js.Array[Double]) | (/* init */ java.lang.String), 
      typingsSlinky.std.DOMMatrix
    ] {
  def fromFloat32Array(array32: js.typedarray.Float32Array): typingsSlinky.std.DOMMatrix = js.native
  def fromFloat64Array(array64: js.typedarray.Float64Array): typingsSlinky.std.DOMMatrix = js.native
  def fromMatrix(): typingsSlinky.std.DOMMatrix = js.native
  def fromMatrix(other: DOMMatrixInit): typingsSlinky.std.DOMMatrix = js.native
}

