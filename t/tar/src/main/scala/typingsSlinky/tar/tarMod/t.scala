package typingsSlinky.tar.tarMod

import typingsSlinky.node.streamMod.Writable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tar", "t")
@js.native
object t extends js.Object {
  def apply(): Writable = js.native
  def apply(options: ListOptions): Writable = js.native
  def apply(options: ListOptions, fileList: js.Array[String]): Writable = js.native
  def apply(
    options: ListOptions,
    fileList: js.Array[String],
    callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
  ): Writable = js.native
}

