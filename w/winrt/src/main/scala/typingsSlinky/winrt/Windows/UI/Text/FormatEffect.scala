package typingsSlinky.winrt.Windows.UI.Text

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FormatEffect extends js.Object

@JSGlobal("Windows.UI.Text.FormatEffect")
@js.native
object FormatEffect extends js.Object {
  @js.native
  sealed trait off extends FormatEffect
  
  @js.native
  sealed trait on extends FormatEffect
  
  @js.native
  sealed trait toggle extends FormatEffect
  
  @js.native
  sealed trait undefined extends FormatEffect
  
  /* 0 */ val off: typingsSlinky.winrt.Windows.UI.Text.FormatEffect.off with Double = js.native
  /* 1 */ val on: typingsSlinky.winrt.Windows.UI.Text.FormatEffect.on with Double = js.native
  /* 2 */ val toggle: typingsSlinky.winrt.Windows.UI.Text.FormatEffect.toggle with Double = js.native
  /* 3 */ val undefined: typingsSlinky.winrt.Windows.UI.Text.FormatEffect.undefined with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FormatEffect with Double] = js.native
}

