package typingsSlinky.varuintBitcoin

import typingsSlinky.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("varuint-bitcoin", "decode")
  @js.native
  val decode: Decode_ = js.native
  
  @JSImport("varuint-bitcoin", "encode")
  @js.native
  val encode: Encode_ = js.native
  
  @JSImport("varuint-bitcoin", "encodingLength")
  @js.native
  def encodingLength(num: Double): Double = js.native
  
  @js.native
  trait Decode_ extends StObject {
    
    def apply(buffer: Buffer): Double = js.native
    def apply(buffer: Buffer, offset: Double): Double = js.native
    
    var bytes: Double = js.native
  }
  
  @js.native
  trait Encode_ extends StObject {
    
    def apply(num: Double): Buffer = js.native
    def apply(num: Double, buffer: js.UndefOr[scala.Nothing], offset: Double): Buffer = js.native
    def apply(num: Double, buffer: Buffer): Buffer = js.native
    def apply(num: Double, buffer: Buffer, offset: Double): Buffer = js.native
    
    var bytes: Double = js.native
  }
}
