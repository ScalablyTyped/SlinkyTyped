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
  def this(array: js.typedarray.Uint8ClampedArray, width: Double) = this()
  def this(width: Double, height: Double) = this()
  def this(array: js.typedarray.Uint8ClampedArray, width: Double, height: Double) = this()
}
@JSGlobal("ImageData")
@js.native
object ImageData
  extends Instantiable2[
      (/* width */ Double) | (/* array */ js.typedarray.Uint8ClampedArray), 
      /* width */ Double, 
      org.scalajs.dom.raw.ImageData
    ]
     with Instantiable3[
      /* array */ js.typedarray.Uint8ClampedArray, 
      /* width */ Double, 
      /* height */ Double, 
      org.scalajs.dom.raw.ImageData
    ]
