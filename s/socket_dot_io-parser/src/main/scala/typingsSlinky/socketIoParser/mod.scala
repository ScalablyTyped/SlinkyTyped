package typingsSlinky.socketIoParser

import org.scalajs.dom.raw.Blob
import typingsSlinky.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("socket.io-parser", "ACK")
  @js.native
  val ACK: Double = js.native
  
  @JSImport("socket.io-parser", "BINARY_ACK")
  @js.native
  val BINARY_ACK: Double = js.native
  
  @JSImport("socket.io-parser", "BINARY_EVENT")
  @js.native
  val BINARY_EVENT: Double = js.native
  
  @JSImport("socket.io-parser", "CONNECT")
  @js.native
  val CONNECT: Double = js.native
  
  @JSImport("socket.io-parser", "DISCONNECT")
  @js.native
  val DISCONNECT: Double = js.native
  
  @JSImport("socket.io-parser", "Decoder")
  @js.native
  class Decoder () extends StObject {
    
    def add(encodedPacket: EncodedPacket): Unit = js.native
    
    def destroy(): Unit = js.native
    
    def on(event: String, callback: js.Function1[/* decodedPacket */ Packet, Unit]): Unit = js.native
  }
  
  @JSImport("socket.io-parser", "ERROR")
  @js.native
  val ERROR: Double = js.native
  
  @JSImport("socket.io-parser", "EVENT")
  @js.native
  val EVENT: Double = js.native
  
  @JSImport("socket.io-parser", "Encoder")
  @js.native
  class Encoder () extends StObject {
    
    def encode(packet: Packet, callback: js.Function1[/* encodedPackets */ js.Array[EncodedPacket], Unit]): Unit = js.native
  }
  
  @JSImport("socket.io-parser", "types")
  @js.native
  val types: js.Array[String] = js.native
  
  type EncodedPacket = String | Buffer | js.typedarray.ArrayBuffer | Blob
  
  @js.native
  trait Packet extends StObject {
    
    var data: js.Any = js.native
    
    var id: Double = js.native
    
    var `type`: Double = js.native
  }
  object Packet {
    
    @scala.inline
    def apply(data: js.Any, id: Double, `type`: Double): Packet = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Packet]
    }
    
    @scala.inline
    implicit class PacketMutableBuilder[Self <: Packet] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
