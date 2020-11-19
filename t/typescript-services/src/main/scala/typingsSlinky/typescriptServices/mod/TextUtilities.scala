package typingsSlinky.typescriptServices.mod

import typingsSlinky.typescriptServices.TypeScript.TextUtilities.ICharacterSequence
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "TextUtilities")
@js.native
object TextUtilities extends js.Object {
  
  def getLengthOfLineBreak(text: ICharacterSequence, index: Double): Double = js.native
  
  def getLengthOfLineBreakSlow(text: ICharacterSequence, index: Double, c: Double): Double = js.native
  
  def isAnyLineBreakCharacter(c: Double): Boolean = js.native
  
  def parseLineStarts(text: ICharacterSequence): js.Array[Double] = js.native
}
