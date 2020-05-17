package typingsSlinky.yargs.anon

import typingsSlinky.yargs.yargsBooleans.`true`
import typingsSlinky.yargs.yargsStrings.array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Normalize extends js.Object {
  var normalize: `true` = js.native
  var `type`: array = js.native
}

object Normalize {
  @scala.inline
  def apply(normalize: `true`, `type`: array): Normalize = {
    val __obj = js.Dynamic.literal(normalize = normalize.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Normalize]
  }
  @scala.inline
  implicit class NormalizeOps[Self <: Normalize] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNormalize(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

