package typingsSlinky.unzip

import typingsSlinky.node.NodeJS.WritableStream
import typingsSlinky.node.streamMod.PassThrough
import typingsSlinky.unzip.anon.Path
import typingsSlinky.unzip.unzipStrings.Directory
import typingsSlinky.unzip.unzipStrings.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("unzip", "Extract")
  @js.native
  def Extract(options: Path): WritableStream = js.native
  
  @JSImport("unzip", "Parse")
  @js.native
  def Parse(): WritableStream = js.native
  
  @js.native
  trait Entry extends PassThrough {
    
    def autodrain(): Unit = js.native
    
    var path: String = js.native
    
    var size: Double = js.native
    
    var `type`: Directory | File = js.native
  }
}
