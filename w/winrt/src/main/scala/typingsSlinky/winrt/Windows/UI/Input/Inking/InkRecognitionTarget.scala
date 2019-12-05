package typingsSlinky.winrt.Windows.UI.Input.Inking

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait InkRecognitionTarget extends js.Object

@JSGlobal("Windows.UI.Input.Inking.InkRecognitionTarget")
@js.native
object InkRecognitionTarget extends js.Object {
  @js.native
  sealed trait all extends InkRecognitionTarget
  
  @js.native
  sealed trait recent extends InkRecognitionTarget
  
  @js.native
  sealed trait selected extends InkRecognitionTarget
  
  /* 0 */ val all: typingsSlinky.winrt.Windows.UI.Input.Inking.InkRecognitionTarget.all with Double = js.native
  /* 2 */ val recent: typingsSlinky.winrt.Windows.UI.Input.Inking.InkRecognitionTarget.recent with Double = js.native
  /* 1 */ val selected: typingsSlinky.winrt.Windows.UI.Input.Inking.InkRecognitionTarget.selected with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[InkRecognitionTarget with Double] = js.native
}

