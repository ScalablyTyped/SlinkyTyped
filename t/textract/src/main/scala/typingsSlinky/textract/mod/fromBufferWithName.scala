package typingsSlinky.textract.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("textract", "fromBufferWithName")
@js.native
object fromBufferWithName extends js.Object {
  
  def apply(
    name: String,
    buffer: Buffer,
    callback: js.Function2[/* error */ js.Error, /* text */ String, Unit]
  ): Unit = js.native
  def apply(
    name: String,
    buffer: Buffer,
    config: Config,
    callback: js.Function2[/* error */ js.Error, /* text */ String, Unit]
  ): Unit = js.native
}
