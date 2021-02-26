package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextEvent extends UIEvent {
  
  val DOM_INPUT_METHOD_DROP: Double = js.native
  
  val DOM_INPUT_METHOD_HANDWRITING: Double = js.native
  
  val DOM_INPUT_METHOD_IME: Double = js.native
  
  val DOM_INPUT_METHOD_KEYBOARD: Double = js.native
  
  val DOM_INPUT_METHOD_MULTIMODAL: Double = js.native
  
  val DOM_INPUT_METHOD_OPTION: Double = js.native
  
  val DOM_INPUT_METHOD_PASTE: Double = js.native
  
  val DOM_INPUT_METHOD_SCRIPT: Double = js.native
  
  val DOM_INPUT_METHOD_UNKNOWN: Double = js.native
  
  val DOM_INPUT_METHOD_VOICE: Double = js.native
  
  val data: java.lang.String = js.native
  
  def initTextEvent(
    typeArg: java.lang.String,
    canBubbleArg: scala.Boolean,
    cancelableArg: scala.Boolean,
    viewArg: org.scalajs.dom.raw.Window,
    dataArg: java.lang.String,
    inputMethod: Double,
    locale: java.lang.String
  ): Unit = js.native
}
