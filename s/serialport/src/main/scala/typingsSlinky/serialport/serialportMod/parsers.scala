package typingsSlinky.serialport.serialportMod

import typingsSlinky.node.streamMod.Transform
import typingsSlinky.serialport.Anon_Ascii
import typingsSlinky.serialport.Anon_Delimiter
import typingsSlinky.serialport.Anon_DelimiterArray
import typingsSlinky.serialport.Anon_Length
import typingsSlinky.serialport.Anon_Regex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("serialport", "parsers")
@js.native
object parsers extends js.Object {
  @js.native
  class ByteLength protected () extends Transform {
    def this(options: Anon_Length) = this()
  }
  
  @js.native
  class CCTalk () extends Transform
  
  @js.native
  class Delimiter protected () extends Transform {
    def this(options: Anon_Delimiter) = this()
  }
  
  @js.native
  class Readline protected () extends Delimiter {
    def this(options: Anon_Ascii) = this()
  }
  
  @js.native
  class Ready protected () extends Transform {
    def this(options: Anon_DelimiterArray) = this()
  }
  
  @js.native
  class Regex protected () extends Transform {
    def this(options: Anon_Regex) = this()
  }
  
}

