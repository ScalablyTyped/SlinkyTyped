package typingsSlinky.wanakana.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.wanakana.wanakanaBooleans.`true`
  - typingsSlinky.wanakana.wanakanaBooleans.`false`
  - typingsSlinky.wanakana.wanakanaStrings.toHiragana
  - typingsSlinky.wanakana.wanakanaStrings.toKatakana
*/
trait IMEModes extends js.Object

object IMEModes {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `false`: typingsSlinky.wanakana.wanakanaBooleans.`false` = this.cast(false)
  @scala.inline
  def toHiragana: typingsSlinky.wanakana.wanakanaStrings.toHiragana = this.cast("toHiragana")
  @scala.inline
  def toKatakana: typingsSlinky.wanakana.wanakanaStrings.toKatakana = this.cast("toKatakana")
  @scala.inline
  def `true`: typingsSlinky.wanakana.wanakanaBooleans.`true` = this.cast(true)
}

