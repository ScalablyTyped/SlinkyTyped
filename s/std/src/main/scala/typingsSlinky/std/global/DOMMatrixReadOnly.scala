package typingsSlinky.std.global

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.std.DOMMatrixInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("DOMMatrixReadOnly")
@js.native
class DOMMatrixReadOnly ()
  extends typingsSlinky.std.DOMMatrixReadOnly {
  def this(init: java.lang.String) = this()
  def this(init: js.Array[Double]) = this()
}
@JSGlobal("DOMMatrixReadOnly")
@js.native
object DOMMatrixReadOnly
  extends Instantiable0[typingsSlinky.std.DOMMatrixReadOnly]
     with Instantiable1[
      (/* init */ js.Array[Double]) | (/* init */ java.lang.String), 
      typingsSlinky.std.DOMMatrixReadOnly
    ] {
  
  def fromFloat32Array(array32: js.typedarray.Float32Array): typingsSlinky.std.DOMMatrixReadOnly = js.native
  
  def fromFloat64Array(array64: js.typedarray.Float64Array): typingsSlinky.std.DOMMatrixReadOnly = js.native
  
  def fromMatrix(): typingsSlinky.std.DOMMatrixReadOnly = js.native
  def fromMatrix(other: DOMMatrixInit): typingsSlinky.std.DOMMatrixReadOnly = js.native
}
