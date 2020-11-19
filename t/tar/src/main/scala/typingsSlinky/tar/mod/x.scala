package typingsSlinky.tar.mod

import typingsSlinky.node.streamMod.Writable
import typingsSlinky.tar.anon.ExtractOptionsFileOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tar", "x")
@js.native
object x extends js.Object {
  
  def apply(
    options: ExtractOptions with FileOptions,
    fileList: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
  ): Unit = js.native
  def apply(
    options: ExtractOptions with FileOptions,
    fileList: js.Array[String],
    callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
  ): Unit = js.native
  def apply(options: ExtractOptionsFileOptions): Unit = js.native
  def apply(options: ExtractOptionsFileOptions, fileList: js.Array[String]): Unit = js.native
  def apply(options: ExtractOptions): Writable = js.native
  def apply(options: ExtractOptions, fileList: js.Array[String]): Writable = js.native
}
