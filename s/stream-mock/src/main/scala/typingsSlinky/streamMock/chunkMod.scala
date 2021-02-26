package typingsSlinky.streamMock

import typingsSlinky.node.Buffer
import typingsSlinky.node.BufferEncoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chunkMod {
  
  @js.native
  trait IChunk extends StObject {
    
    var chunk: Buffer | String = js.native
    
    var encoding: BufferEncoding = js.native
  }
  object IChunk {
    
    @scala.inline
    def apply(chunk: Buffer | String, encoding: BufferEncoding): IChunk = {
      val __obj = js.Dynamic.literal(chunk = chunk.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any])
      __obj.asInstanceOf[IChunk]
    }
    
    @scala.inline
    implicit class IChunkMutableBuilder[Self <: IChunk] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChunk(value: Buffer | String): Self = StObject.set(x, "chunk", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncoding(value: BufferEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    }
  }
}
