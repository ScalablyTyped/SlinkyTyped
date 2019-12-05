package typingsSlinky.textDashEncoding.TextEncoding

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TextEncoding.TextEncoder")
@js.native
class TextEncoder ()
  extends typingsSlinky.textDashEncoding.TextEncoder {
  def this(utfLabel: String) = this()
  def this(utfLabel: String, options: TextEncoderOptions) = this()
}

@JSGlobal("TextEncoding.TextEncoder")
@js.native
object TextEncoder
  extends Instantiable0[typingsSlinky.textDashEncoding.TextEncoder]
     with Instantiable1[/* utfLabel */ String, typingsSlinky.textDashEncoding.TextEncoder]
     with Instantiable2[
      /* utfLabel */ String, 
      /* options */ TextEncoderOptions, 
      typingsSlinky.textDashEncoding.TextEncoder
    ] {
  var encoding: String = js.native
  def apply(): typingsSlinky.textDashEncoding.TextEncoder = js.native
  def apply(utfLabel: String): typingsSlinky.textDashEncoding.TextEncoder = js.native
  def apply(utfLabel: String, options: TextEncoderOptions): typingsSlinky.textDashEncoding.TextEncoder = js.native
}

