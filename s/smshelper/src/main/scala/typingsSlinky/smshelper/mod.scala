package typingsSlinky.smshelper

import typingsSlinky.smshelper.smshelperStrings.GSM_7BIT
import typingsSlinky.smshelper.smshelperStrings.GSM_7BIT_EX
import typingsSlinky.smshelper.smshelperStrings.UTF16
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("smshelper", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def count(text: String): Double = js.native
  def detectEncoding(text: String): GSM_7BIT | GSM_7BIT_EX | UTF16 = js.native
  def parts(text: String): Double = js.native
}

