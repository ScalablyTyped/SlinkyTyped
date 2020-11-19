package typingsSlinky.vexflow.Vex.Flow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimeSignature extends StaveModifier {
  
  def addEndModifier(stave: Stave): Unit = js.native
  
  def addModifier(stave: Stave): Unit = js.native
  
  def getTimeSig(): typingsSlinky.vexflow.anon.Glyph = js.native
  
  def makeTimeSignatureGlyph(topNums: js.Array[Double], botNums: js.Array[Double]): Glyph = js.native
  
  def parseTimeSpec(timeSpec: String): typingsSlinky.vexflow.anon.Glyph = js.native
}
