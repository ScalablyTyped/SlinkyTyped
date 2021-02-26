package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The Web Audio API events that occur when a ScriptProcessorNode input buffer is ready to be processed. */
@js.native
trait AudioProcessingEvent extends Event {
  
  val inputBuffer: org.scalajs.dom.raw.AudioBuffer = js.native
  
  val outputBuffer: org.scalajs.dom.raw.AudioBuffer = js.native
  
  val playbackTime: Double = js.native
}
