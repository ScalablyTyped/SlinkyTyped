package typingsSlinky.winrt.Windows.UI.Input.Inking

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
