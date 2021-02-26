package typingsSlinky.word

import typingsSlinky.cfb.mod.CFBContainer
import typingsSlinky.node.Buffer
import typingsSlinky.word.typesMod.WJSDoc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object docMod {
  
  @JSImport("word/dist/typings/codecs/DOC", "parse_cfb")
  @js.native
  def parseCfb(file: CFBContainer): WJSDoc = js.native
  
  @JSImport("word/dist/typings/codecs/DOC", "read")
  @js.native
  def read(data: Buffer): WJSDoc = js.native
  
  @JSImport("word/dist/typings/codecs/DOC", "readFile")
  @js.native
  def readFile(filePath: String): WJSDoc = js.native
}
