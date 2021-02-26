package typingsSlinky.streamDemux

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object demuxedConsumableStreamMod {
  
  @JSImport("stream-demux/demuxed-consumable-stream", JSImport.Namespace)
  @js.native
  class ^[T] protected () extends DemuxedConsumableStream[T] {
    def this(streamDemux: typingsSlinky.streamDemux.mod.^[T], name: String) = this()
  }
  
  @js.native
  trait DemuxedConsumableStream[T]
    extends typingsSlinky.consumableStream.mod.^[T] {
    
    var name: String = js.native
  }
}
