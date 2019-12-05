package typingsSlinky.textDashEncoding.TextEncoding

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.textDashEncoding.TextDecoderOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TextEncoding.TextDecoder")
@js.native
class TextDecoder ()
  extends typingsSlinky.textDashEncoding.TextDecoder {
  def this(label: String) = this()
  def this(label: String, options: TextDecoderOptions) = this()
}

@JSGlobal("TextEncoding.TextDecoder")
@js.native
object TextDecoder
  extends Instantiable0[typingsSlinky.textDashEncoding.TextDecoder]
     with Instantiable1[/* label */ String, typingsSlinky.textDashEncoding.TextDecoder]
     with Instantiable2[
      /* label */ String, 
      /* options */ TextDecoderOptions, 
      typingsSlinky.textDashEncoding.TextDecoder
    ] {
  var encoding: String = js.native
  def apply(): typingsSlinky.textDashEncoding.TextDecoder = js.native
  def apply(label: String): typingsSlinky.textDashEncoding.TextDecoder = js.native
  def apply(label: String, options: TextDecoderOptions): typingsSlinky.textDashEncoding.TextDecoder = js.native
}

