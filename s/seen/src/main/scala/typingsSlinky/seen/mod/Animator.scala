package typingsSlinky.seen.mod

import typingsSlinky.seen.mod.Events.Dispatcher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("seen", "Animator")
@js.native
class Animator () extends StObject {
  
  def animateFrame(): this.type = js.native
  
  var dispatch: Dispatcher = js.native
  
  def frame(): this.type = js.native
  def frame(t: Boolean): this.type = js.native
  
  var frameDelay: Double | Null = js.native
  
  def onAfter(handler: FrameHandler): this.type = js.native
  
  def onBefore(handler: FrameHandler): this.type = js.native
  
  def onFrame(handler: FrameHandler): this.type = js.native
  
  def start(): this.type = js.native
  
  def stop(): this.type = js.native
  
  var timestamp: Double = js.native
}
