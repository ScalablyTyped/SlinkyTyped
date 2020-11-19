package typingsSlinky.stompit.outgoingFrameStreamMod

import typingsSlinky.node.streamMod.Writable
import typingsSlinky.node.streamMod.WritableOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OutgoingFrameStream extends js.Object {
  
  def finish(): Unit = js.native
  
  def frame(command: String): Writable = js.native
  def frame(command: String, headers: js.UndefOr[scala.Nothing], streamOptions: WritableOptions): Writable = js.native
  def frame(command: String, headers: js.Any): Writable = js.native
  def frame(command: String, headers: js.Any, streamOptions: WritableOptions): Writable = js.native
  
  def hasFinished(): Boolean = js.native
  
  def heartbeat(): Unit = js.native
  
  def setVersion(versionId: String): Boolean = js.native
}
