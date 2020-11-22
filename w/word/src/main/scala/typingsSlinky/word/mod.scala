package typingsSlinky.word

import typingsSlinky.node.Buffer
import typingsSlinky.word.typesMod.WJSDoc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("word", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def read(data: Buffer): WJSDoc = js.native
  
  def readFile(path: String): WJSDoc = js.native
  
  @JSName("to_text")
  def toText(doc: WJSDoc): String = js.native
  @JSName("to_text")
  def toText(doc: WJSDoc, opts: js.Any): String = js.native
}
