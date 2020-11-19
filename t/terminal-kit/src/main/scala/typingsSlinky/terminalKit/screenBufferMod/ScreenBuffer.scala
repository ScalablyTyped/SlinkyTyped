package typingsSlinky.terminalKit.screenBufferMod

import typingsSlinky.terminalKit.anon.Attr
import typingsSlinky.terminalKit.anon.Char
import typingsSlinky.terminalKit.anon.Dst
import typingsSlinky.terminalKit.anon.X
import typingsSlinky.terminalKit.screenBufferHDMod.IsBlending
import typingsSlinky.terminalKit.terminalMod.Terminal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScreenBuffer
  extends typingsSlinky.nextgenEvents.mod.^ {
  
  def attr2object(attrFlags: Double): Unit = js.native
  
  val blending: Boolean | IsBlending = js.native
  
  def clear(): Unit = js.native
  
  def draw(): Unit = js.native
  def draw(options: DrawOptions): Unit = js.native
  
  def drawCursor(): Unit = js.native
  def drawCursor(options: Dst): Unit = js.native
  
  val dst: Terminal | ScreenBuffer = js.native
  
  def dumpChars(): String = js.native
  
  def fill(): Unit = js.native
  def fill(options: Attr): Unit = js.native
  
  def get(): Char = js.native
  def get(options: X): Char = js.native
  
  def moveTo(x: Double, y: Double): Unit = js.native
  
  def object2attr(attrObject: Attributes): Unit = js.native
  
  def put(options: PutOptions, format: String, formatArgumets: js.Any*): Unit = js.native
  
  def resize(fromRect: typingsSlinky.terminalKit.rectMod.Options): Unit = js.native
  def resize(fromRect: typingsSlinky.terminalKit.rectMod.^): Unit = js.native
  
  def saveSync(filepath: String): Unit = js.native
  
  def vScroll(offset: Double, drawToTerminal: Boolean): Unit = js.native
  
  val x: Double = js.native
  
  val y: Double = js.native
}
