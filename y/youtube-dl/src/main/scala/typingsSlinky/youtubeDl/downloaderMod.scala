package typingsSlinky.youtubeDl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("youtube-dl/lib/downloader", JSImport.Namespace)
@js.native
object downloaderMod extends js.Object {
  
  def apply(): js.Promise[String] = js.native
  def apply(binDir: String): js.Promise[String] = js.native
  /**
    * Place the `youtube-dl` binary in a specific directory and control when it gets updates.
    */
  def apply(
    binDir: String,
    callback: js.Function2[/* err */ js.Error | String | Null, /* message */ js.UndefOr[String], Unit]
  ): Unit = js.native
  def apply(
    binDir: Null,
    callback: js.Function2[/* err */ js.Error | String | Null, /* message */ js.UndefOr[String], Unit]
  ): Unit = js.native
  def apply(callback: js.Function2[/* err */ js.Error | String | Null, /* message */ js.UndefOr[String], Unit]): Unit = js.native
}
