package typingsSlinky.twilsock

import typingsSlinky.std.ArrayBufferLike
import typingsSlinky.twilsock.protocolMod.Protocol.Header
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parserMod {
  
  @JSImport("twilsock/lib/parser", "Parser")
  @js.native
  class Parser () extends StObject
  object Parser {
    
    /* static member */
    @JSImport("twilsock/lib/parser", "Parser.createPacket")
    @js.native
    def createPacket(header: Header): js.typedarray.ArrayBuffer = js.native
    @JSImport("twilsock/lib/parser", "Parser.createPacket")
    @js.native
    def createPacket(header: Header, payloadString: String): js.typedarray.ArrayBuffer = js.native
    
    /* static member */
    @JSImport("twilsock/lib/parser", "Parser.parse")
    @js.native
    def parse(message: ArrayBufferLike): js.Any = js.native
  }
}
