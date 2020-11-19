package typingsSlinky.xmlbuilder.mod

import typingsSlinky.node.streamMod.Writable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xmlbuilder", "streamWriter")
@js.native
object streamWriter extends js.Object {
  
  /**
    * Creates and returns a default stream writer.
    * 
    * @param stream - a writeable stream
    * @param options - writer options
    */
  def apply(stream: Writable): XMLWriter = js.native
  def apply(stream: Writable, options: WriterOptions): XMLWriter = js.native
}
