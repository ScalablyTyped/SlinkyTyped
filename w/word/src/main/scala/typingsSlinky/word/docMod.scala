package typingsSlinky.word

import typingsSlinky.cfb.mod.CFBContainer
import typingsSlinky.node.Buffer
import typingsSlinky.word.typesMod.WJSDoc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("word/dist/typings/codecs/DOC", JSImport.Namespace)
@js.native
object docMod extends js.Object {
  
  @JSName("parse_cfb")
  def parseCfb(file: CFBContainer): WJSDoc = js.native
  
  def read(data: Buffer): WJSDoc = js.native
  
  def readFile(filePath: String): WJSDoc = js.native
}
