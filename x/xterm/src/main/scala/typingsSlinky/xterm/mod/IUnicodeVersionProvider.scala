package typingsSlinky.xterm.mod

import typingsSlinky.xterm.xtermNumbers.`0`
import typingsSlinky.xterm.xtermNumbers.`1`
import typingsSlinky.xterm.xtermNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IUnicodeVersionProvider extends js.Object {
  /**
    * String indicating the Unicode version provided.
    */
  val version: String = js.native
  /**
    * Unicode version dependent wcwidth implementation.
    */
  def wcwidth(codepoint: Double): `0` | `1` | `2` = js.native
}

object IUnicodeVersionProvider {
  @scala.inline
  def apply(version: String, wcwidth: Double => `0` | `1` | `2`): IUnicodeVersionProvider = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any], wcwidth = js.Any.fromFunction1(wcwidth))
    __obj.asInstanceOf[IUnicodeVersionProvider]
  }
  @scala.inline
  implicit class IUnicodeVersionProviderOps[Self <: IUnicodeVersionProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWcwidth(value: Double => `0` | `1` | `2`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wcwidth")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

