package typingsSlinky.xlsx.mod.CFB

import typingsSlinky.cfb.mod.CFBBlob
import typingsSlinky.cfb.mod.CFBContainer
import typingsSlinky.cfb.mod.CFBParsingOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xlsx", "CFB.read")
@js.native
object read extends js.Object {
  def apply(f: String): CFBContainer = js.native
  def apply(f: String, options: CFBParsingOptions): CFBContainer = js.native
  def apply(f: CFBBlob): CFBContainer = js.native
  def apply(f: CFBBlob, options: CFBParsingOptions): CFBContainer = js.native
}

