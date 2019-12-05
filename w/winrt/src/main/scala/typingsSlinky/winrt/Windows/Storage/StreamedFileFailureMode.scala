package typingsSlinky.winrt.Windows.Storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait StreamedFileFailureMode extends js.Object

@JSGlobal("Windows.Storage.StreamedFileFailureMode")
@js.native
object StreamedFileFailureMode extends js.Object {
  @js.native
  sealed trait currentlyUnavailable extends StreamedFileFailureMode
  
  @js.native
  sealed trait failed extends StreamedFileFailureMode
  
  @js.native
  sealed trait incomplete extends StreamedFileFailureMode
  
  /* 1 */ val currentlyUnavailable: typingsSlinky.winrt.Windows.Storage.StreamedFileFailureMode.currentlyUnavailable with Double = js.native
  /* 0 */ val failed: typingsSlinky.winrt.Windows.Storage.StreamedFileFailureMode.failed with Double = js.native
  /* 2 */ val incomplete: typingsSlinky.winrt.Windows.Storage.StreamedFileFailureMode.incomplete with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[StreamedFileFailureMode with Double] = js.native
}

