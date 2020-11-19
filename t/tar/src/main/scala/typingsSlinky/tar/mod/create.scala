package typingsSlinky.tar.mod

import typingsSlinky.tar.anon.CreateOptionsFileOptionss
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tar", "create")
@js.native
object create extends js.Object {
  
  def apply(options: CreateOptions with FileOptions, fileList: js.Array[String]): js.Promise[Unit] = js.native
  def apply(
    options: CreateOptions with FileOptions,
    fileList: js.Array[String],
    callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
  ): Unit = js.native
  def apply(options: CreateOptionsFileOptionss, fileList: js.Array[String]): Unit = js.native
}
