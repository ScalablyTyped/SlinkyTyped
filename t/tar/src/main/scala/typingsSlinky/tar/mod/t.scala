package typingsSlinky.tar.mod

import typingsSlinky.node.streamMod.Writable
import typingsSlinky.tar.anon.ListOptionsFileOptionssyn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tar", "t")
@js.native
object t extends js.Object {
  
  def apply(): Writable = js.native
  def apply(options: ListOptions with FileOptions): Writable = js.native
  def apply(
    options: ListOptions with FileOptions,
    fileList: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
  ): Writable = js.native
  def apply(options: ListOptions with FileOptions, fileList: js.Array[String]): Writable = js.native
  def apply(
    options: ListOptions with FileOptions,
    fileList: js.Array[String],
    callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
  ): Writable = js.native
  def apply(
    options: js.UndefOr[scala.Nothing],
    fileList: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
  ): Writable = js.native
  def apply(options: js.UndefOr[scala.Nothing], fileList: js.Array[String]): Writable = js.native
  def apply(
    options: js.UndefOr[scala.Nothing],
    fileList: js.Array[String],
    callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
  ): Writable = js.native
  def apply(options: ListOptionsFileOptionssyn): Unit = js.native
  def apply(options: ListOptionsFileOptionssyn, fileList: js.Array[String]): Unit = js.native
}
