package typingsSlinky.textEncoding

import typingsSlinky.textEncoding.TextEncoding.TextEncoderOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object TextEncoding {
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("TextEncoding.TextDecoder")
    @js.native
    class TextDecoder ()
      extends typingsSlinky.textEncoding.TextDecoder {
      def this(label: String) = this()
      def this(label: js.UndefOr[scala.Nothing], options: TextDecoderOptions) = this()
      def this(label: String, options: TextDecoderOptions) = this()
    }
    object TextDecoder {
      
      @JSGlobal("TextEncoding.TextDecoder")
      @js.native
      def apply(): typingsSlinky.textEncoding.TextDecoder = js.native
      @JSGlobal("TextEncoding.TextDecoder")
      @js.native
      def apply(label: js.UndefOr[scala.Nothing], options: TextDecoderOptions): typingsSlinky.textEncoding.TextDecoder = js.native
      @JSGlobal("TextEncoding.TextDecoder")
      @js.native
      def apply(label: String): typingsSlinky.textEncoding.TextDecoder = js.native
      @JSGlobal("TextEncoding.TextDecoder")
      @js.native
      def apply(label: String, options: TextDecoderOptions): typingsSlinky.textEncoding.TextDecoder = js.native
      @JSGlobal("TextEncoding.TextDecoder")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("TextEncoding.TextDecoder.encoding")
      @js.native
      def encoding: String = js.native
      @scala.inline
      def encoding_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("encoding")(x.asInstanceOf[js.Any])
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("TextEncoding.TextEncoder")
    @js.native
    class TextEncoder ()
      extends typingsSlinky.textEncoding.TextEncoder {
      def this(utfLabel: String) = this()
      def this(utfLabel: js.UndefOr[scala.Nothing], options: TextEncoderOptions) = this()
      def this(utfLabel: String, options: TextEncoderOptions) = this()
    }
    object TextEncoder {
      
      @JSGlobal("TextEncoding.TextEncoder")
      @js.native
      def apply(): typingsSlinky.textEncoding.TextEncoder = js.native
      @JSGlobal("TextEncoding.TextEncoder")
      @js.native
      def apply(utfLabel: js.UndefOr[scala.Nothing], options: TextEncoderOptions): typingsSlinky.textEncoding.TextEncoder = js.native
      @JSGlobal("TextEncoding.TextEncoder")
      @js.native
      def apply(utfLabel: String): typingsSlinky.textEncoding.TextEncoder = js.native
      @JSGlobal("TextEncoding.TextEncoder")
      @js.native
      def apply(utfLabel: String, options: TextEncoderOptions): typingsSlinky.textEncoding.TextEncoder = js.native
      @JSGlobal("TextEncoding.TextEncoder")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("TextEncoding.TextEncoder.encoding")
      @js.native
      def encoding: String = js.native
      @scala.inline
      def encoding_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("encoding")(x.asInstanceOf[js.Any])
    }
  }
}
