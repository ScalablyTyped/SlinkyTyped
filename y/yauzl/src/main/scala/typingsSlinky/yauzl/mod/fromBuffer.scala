package typingsSlinky.yauzl.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yauzl", "fromBuffer")
@js.native
object fromBuffer extends js.Object {
  
  def apply(buffer: Buffer): Unit = js.native
  def apply(
    buffer: Buffer,
    callback: js.Function2[/* err */ js.UndefOr[js.Error], /* zipfile */ js.UndefOr[ZipFile], Unit]
  ): Unit = js.native
  def apply(buffer: Buffer, options: Options): Unit = js.native
  def apply(
    buffer: Buffer,
    options: Options,
    callback: js.Function2[/* err */ js.UndefOr[js.Error], /* zipfile */ js.UndefOr[ZipFile], Unit]
  ): Unit = js.native
}
