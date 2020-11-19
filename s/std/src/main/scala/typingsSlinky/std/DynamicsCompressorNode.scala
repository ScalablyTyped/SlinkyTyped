package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Inherits properties from its parent, AudioNode. */
@js.native
trait DynamicsCompressorNode extends AudioNode {
  
  val attack: org.scalajs.dom.raw.AudioParam = js.native
  
  val knee: org.scalajs.dom.raw.AudioParam = js.native
  
  val ratio: org.scalajs.dom.raw.AudioParam = js.native
  
  val reduction: Double = js.native
  
  val release: org.scalajs.dom.raw.AudioParam = js.native
  
  val threshold: org.scalajs.dom.raw.AudioParam = js.native
}
