package typingsSlinky.whatInput

import typingsSlinky.whatInput.whatInputStrings.intent
import typingsSlinky.whatInput.whatInputStrings.keyboard
import typingsSlinky.whatInput.whatInputStrings.mouse
import typingsSlinky.whatInput.whatInputStrings.pointer
import typingsSlinky.whatInput.whatInputStrings.touch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("what-input", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  object default extends js.Object {
    def ask(): pointer | keyboard | mouse | touch = js.native
    @JSName("ask")
    def ask_intent(strategy: intent): pointer | keyboard | mouse | touch = js.native
    def clearStorage(): Unit = js.native
    def element(): String | Null = js.native
    def ignoreKeys(keyCodes: js.Array[Double]): Unit = js.native
    def registerOnChange(callback: js.Function0[Unit]): Unit = js.native
    @JSName("registerOnChange")
    def registerOnChange_intent(callback: js.Function0[Unit], strategy: intent): Unit = js.native
    def specificKeys(keyCodes: js.Array[Double]): Unit = js.native
    def unRegisterOnChange(callback: js.Function0[Unit]): Unit = js.native
  }
  
}

