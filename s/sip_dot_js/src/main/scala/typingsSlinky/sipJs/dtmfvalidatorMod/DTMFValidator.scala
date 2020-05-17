package typingsSlinky.sipJs.dtmfvalidatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/Session/DTMFValidator", "DTMFValidator")
@js.native
class DTMFValidator () extends js.Object

/* static members */
@JSImport("sip.js/lib/Session/DTMFValidator", "DTMFValidator")
@js.native
object DTMFValidator extends js.Object {
  var generateInvalidToneError: js.Any = js.native
  def validate(tone: ToneType): String = js.native
  def validate(tone: ToneType, moreThanOneTone: Boolean): String = js.native
}

