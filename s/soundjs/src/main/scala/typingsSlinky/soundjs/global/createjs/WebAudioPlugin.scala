package typingsSlinky.soundjs.global.createjs

import org.scalajs.dom.raw.AudioContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("createjs.WebAudioPlugin")
@js.native
class WebAudioPlugin ()
  extends typingsSlinky.soundjs.createjs.WebAudioPlugin
/* static members */
@JSGlobal("createjs.WebAudioPlugin")
@js.native
object WebAudioPlugin extends js.Object {
  
  // properties
  var context: AudioContext = js.native
  
  // methods
  def isSupported(): Boolean = js.native
  
  def playEmptySound(): Unit = js.native
}
