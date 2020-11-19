package typingsSlinky.vscodeLanguageserver.progressMod

import typingsSlinky.vscodeJsonrpc.cancellationMod.CancellationToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkDoneProgress extends js.Object {
  
  def begin(title: String): Unit = js.native
  def begin(
    title: String,
    percentage: js.UndefOr[scala.Nothing],
    message: js.UndefOr[scala.Nothing],
    cancellable: Boolean
  ): Unit = js.native
  def begin(title: String, percentage: js.UndefOr[scala.Nothing], message: String): Unit = js.native
  def begin(title: String, percentage: js.UndefOr[scala.Nothing], message: String, cancellable: Boolean): Unit = js.native
  def begin(title: String, percentage: Double): Unit = js.native
  def begin(title: String, percentage: Double, message: js.UndefOr[scala.Nothing], cancellable: Boolean): Unit = js.native
  def begin(title: String, percentage: Double, message: String): Unit = js.native
  def begin(title: String, percentage: Double, message: String, cancellable: Boolean): Unit = js.native
  
  def done(): Unit = js.native
  
  def report(message: String): Unit = js.native
  def report(percentage: Double): Unit = js.native
  def report(percentage: Double, message: String): Unit = js.native
  
  val token: CancellationToken = js.native
}
