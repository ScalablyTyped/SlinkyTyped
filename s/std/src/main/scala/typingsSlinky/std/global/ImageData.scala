package typingsSlinky.std.global

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ImageData")
@js.native
class ImageData protected ()
  extends typingsSlinky.std.ImageData {
  def this(data: js.typedarray.Uint8ClampedArray, sw: Double) = this()
  def this(sw: Double, sh: Double) = this()
  def this(data: js.typedarray.Uint8ClampedArray, sw: Double, sh: Double) = this()
}
@JSGlobal("ImageData")
@js.native
object ImageData
  extends Instantiable2[
      (/* sw */ Double) | (/* data */ js.typedarray.Uint8ClampedArray), 
      /* sw */ Double, 
      org.scalajs.dom.raw.ImageData
    ]
     with Instantiable3[
      /* data */ js.typedarray.Uint8ClampedArray, 
      /* sw */ Double, 
      /* sh */ Double, 
      org.scalajs.dom.raw.ImageData
    ]
