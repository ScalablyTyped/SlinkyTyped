package typingsSlinky.textEncoding

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.textEncoding.TextEncoding.TextEncoderOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  object TextEncoding extends js.Object {
    @js.native
    class TextDecoder ()
      extends typingsSlinky.textEncoding.TextDecoder {
      def this(label: String) = this()
      def this(label: String, options: TextDecoderOptions) = this()
    }
    
    @js.native
    class TextEncoder ()
      extends typingsSlinky.textEncoding.TextEncoder {
      def this(utfLabel: String) = this()
      def this(utfLabel: String, options: TextEncoderOptions) = this()
    }
    
    @js.native
    object TextDecoder
      extends Instantiable0[typingsSlinky.textEncoding.TextDecoder]
         with Instantiable1[/* label */ String, typingsSlinky.textEncoding.TextDecoder]
         with Instantiable2[
              /* label */ String, 
              /* options */ TextDecoderOptions, 
              typingsSlinky.textEncoding.TextDecoder
            ] {
      var encoding: String = js.native
      def apply(): typingsSlinky.textEncoding.TextDecoder = js.native
      def apply(label: String): typingsSlinky.textEncoding.TextDecoder = js.native
      def apply(label: String, options: TextDecoderOptions): typingsSlinky.textEncoding.TextDecoder = js.native
    }
    
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
    
  }
  
}

