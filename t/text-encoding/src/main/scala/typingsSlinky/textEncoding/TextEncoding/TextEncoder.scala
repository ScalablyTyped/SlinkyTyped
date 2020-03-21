package typingsSlinky.textEncoding.TextEncoding

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TextEncoding.TextEncoder")
@js.native
class TextEncoder ()
  extends typingsSlinky.textEncoding.TextEncoder {
  def this(utfLabel: String) = this()
  def this(utfLabel: String, options: TextEncoderOptions) = this()
}

@JSGlobal("TextEncoding.TextEncoder")
@js.native
object TextEncoder
  extends Instantiable0[typingsSlinky.textEncoding.TextEncoder]
     with Instantiable1[/* utfLabel */ String, typingsSlinky.textEncoding.TextEncoder]
     with Instantiable2[
      /* utfLabel */ String, 
      /* options */ TextEncoderOptions, 
      typingsSlinky.textEncoding.TextEncoder
    ] {
  var encoding: String = js.native
  def apply(): typingsSlinky.textEncoding.TextEncoder = js.native
  def apply(utfLabel: String): typingsSlinky.textEncoding.TextEncoder = js.native
  def apply(utfLabel: String, options: TextEncoderOptions): typingsSlinky.textEncoding.TextEncoder = js.native
}

