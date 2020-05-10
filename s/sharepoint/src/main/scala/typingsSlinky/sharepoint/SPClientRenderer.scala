package typingsSlinky.sharepoint

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SPClientRenderer extends js.Object {
  var AddCallStackInfoToErrors: Boolean = js.native
  var GlobalDebugMode: Boolean = js.native
  var RenderErrors: Boolean = js.native
  def AddPostRenderCallback(context: js.Any, callback: js.Function0[Unit]): Unit = js.native
  def CoreRender(): Unit = js.native
  def IsDebugMode(): Boolean = js.native
  def ParseTemplateString(template: String): js.Function0[String] = js.native
  def ParseTemplateStringWorker(template: String): js.Function0[String] = js.native
  def Render(): Unit = js.native
  def RenderCore(): Unit = js.native
  def RenderReplace(): Unit = js.native
  def ReplaceUrlTokens(url: String): js.Function0[String] = js.native
  def _ExecuteRenderCallbacks(): Unit = js.native
  def _ExecuteRenderCallbacksWorker(): Unit = js.native
}

@JSGlobal("SPClientRenderer")
@js.native
object SPClientRenderer extends TopLevel[SPClientRenderer]

