package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An AudioNode that performs a Linear Convolution on a given AudioBuffer, often used to achieve a reverb effect. A ConvolverNode always has exactly one input and one output. */
@js.native
trait ConvolverNode extends AudioNode {
  
  var buffer: org.scalajs.dom.raw.AudioBuffer | Null = js.native
  
  var normalize: scala.Boolean = js.native
}
