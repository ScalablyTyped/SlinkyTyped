package typingsSlinky.streamDemux

import typingsSlinky.writableConsumableStream.consumerMod.ConsumerStats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("stream-demux", JSImport.Namespace)
  @js.native
  class ^[T] () extends StreamDemux[T]
  
  @js.native
  trait StreamDemux[T] extends StObject {
    
    def close(streamName: String): Unit = js.native
    def close(streamName: String, value: T): Unit = js.native
    
    def closeAll(): Unit = js.native
    def closeAll(value: T): Unit = js.native
    
    def closeConsumer(consumerId: Double, value: T): Unit = js.native
    
    def createConsumer(streamName: String): typingsSlinky.writableConsumableStream.consumerMod.^[T] = js.native
    def createConsumer(streamName: String, timeout: Double): typingsSlinky.writableConsumableStream.consumerMod.^[T] = js.native
    
    def getBackpressure(streamName: String): Double = js.native
    
    def getBackpressureAll(): Double = js.native
    
    def getConsumerBackpressure(consumerId: Double): Double = js.native
    
    def getConsumerStats(consumerId: Double): ConsumerStats = js.native
    
    def getConsumerStatsList(streamName: String): js.Array[ConsumerStats] = js.native
    
    def getConsumerStatsListAll(): js.Array[ConsumerStats] = js.native
    
    def hasConsumer(streamName: String, consumerId: Double): Boolean = js.native
    
    def hasConsumerAll(consumerId: Double): Boolean = js.native
    
    def kill(streamName: String): Unit = js.native
    def kill(streamName: String, value: T): Unit = js.native
    
    def killAll(): Unit = js.native
    def killAll(value: T): Unit = js.native
    
    def killConsumer(consumerId: Double): Unit = js.native
    def killConsumer(consumerId: Double, value: T): Unit = js.native
    
    def stream(streamName: String): typingsSlinky.streamDemux.demuxedConsumableStreamMod.^[T] = js.native
    
    def write(streamName: String, value: T): Unit = js.native
    
    def writeToConsumer(consumerId: Double, value: T): Unit = js.native
  }
}
