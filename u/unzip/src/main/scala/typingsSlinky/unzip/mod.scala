package typingsSlinky.unzip

import typingsSlinky.node.NodeJS.WritableStream
import typingsSlinky.node.streamMod.Transform
import typingsSlinky.unzip.unzipStrings.Directory
import typingsSlinky.unzip.unzipStrings.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("unzip", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  trait Entry extends Transform {
    var path: String = js.native
    var size: Double = js.native
    var `type`: Directory | File = js.native
    def autodrain(): Unit = js.native
  }
  
  def Extract(options: AnonPath): WritableStream = js.native
  def Parse(): WritableStream = js.native
}

