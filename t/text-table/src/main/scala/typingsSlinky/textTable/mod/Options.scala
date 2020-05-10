package typingsSlinky.textTable.mod

import typingsSlinky.textTable.textTableStrings.Dot
import typingsSlinky.textTable.textTableStrings.c
import typingsSlinky.textTable.textTableStrings.l
import typingsSlinky.textTable.textTableStrings.r
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /** An array of alignment types for each column, default ['l','l',...]. */
  var align: js.UndefOr[js.Array[js.UndefOr[l | r | c | Dot | Null]]] = js.native
  /** Separator to use between columns, (default: ' '). */
  var hsep: js.UndefOr[String] = js.native
  /** A callback function to use when calculating the string length. */
  var stringLength: js.UndefOr[js.Function1[/* str */ String, Double]] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlign(value: js.Array[js.UndefOr[l | r | c | Dot | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(js.undefined)
        ret
    }
    @scala.inline
    def withHsep(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hsep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHsep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hsep")(js.undefined)
        ret
    }
    @scala.inline
    def withStringLength(value: /* str */ String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringLength")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutStringLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringLength")(js.undefined)
        ret
    }
  }
  
}

