package typingsSlinky.streamFork.mod

import typingsSlinky.node.streamMod.Writable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fork extends Writable {
  
  /**
    * It returns true if outputs property is empty, and false otherwise. If isEmpty() is true, it means that the stream do not duplicate data.
    */
  def isEmpty(): Boolean = js.native
}
