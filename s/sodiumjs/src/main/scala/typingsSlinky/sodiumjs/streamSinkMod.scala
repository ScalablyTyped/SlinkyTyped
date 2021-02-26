package typingsSlinky.sodiumjs

import typingsSlinky.sodiumjs.lambdaMod.Lambda2_
import typingsSlinky.sodiumjs.streamMod.StreamWithSend
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object streamSinkMod {
  
  @JSImport("sodiumjs/dist/typings/sodium/StreamSink", "StreamSink")
  @js.native
  class StreamSink[A] () extends StreamWithSend[A] {
    def this(f: js.Function2[/* l */ A, /* r */ A, A]) = this()
    def this(f: Lambda2_[A, A, A]) = this()
    
    var coalescer: js.Any = js.native
    
    var disableListenCheck: js.Any = js.native
    
    def send(a: A): Unit = js.native
  }
}
