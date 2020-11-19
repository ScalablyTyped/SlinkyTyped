package typingsSlinky.textract.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("textract", "fromFileWithPath")
@js.native
object fromFileWithPath extends js.Object {
  
  def apply(filePath: String, callback: js.Function2[/* error */ js.Error, /* text */ String, Unit]): Unit = js.native
  def apply(
    filePath: String,
    config: Config,
    callback: js.Function2[/* error */ js.Error, /* text */ String, Unit]
  ): Unit = js.native
}
