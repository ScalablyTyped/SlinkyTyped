package typingsSlinky.vexflow.Vex.Flow

import typingsSlinky.vexflow.Vex.IRenderContext
import typingsSlinky.vexflow.anon.FillStyle_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NoteHead extends Note {
  
  def applyStyle(context: IRenderContext): NoteHead = js.native
  
  def draw(): Unit = js.native
  
  def getLine(): Double = js.native
  
  def getStyle(): FillStyle_ = js.native
  
  def getY(): Double = js.native
  
  def isDisplaced(): Boolean = js.native
  
  def setLine(line: Double): NoteHead = js.native
  
  def setStyle(style: FillStyle_): NoteHead = js.native
  
  def setX(x: Double): NoteHead = js.native
  
  def setY(y: Double): NoteHead = js.native
}
