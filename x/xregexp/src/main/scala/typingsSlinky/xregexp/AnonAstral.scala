package typingsSlinky.xregexp

import typingsSlinky.xregexp.mod.FeatureOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAstral extends FeatureOptions {
  var astral: js.UndefOr[Boolean] = js.native
  var namespacing: js.UndefOr[Boolean] = js.native
}

object AnonAstral {
  @scala.inline
  def apply(): AnonAstral = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAstral]
  }
  @scala.inline
  implicit class AnonAstralOps[Self <: AnonAstral] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAstral(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("astral")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAstral: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("astral")(js.undefined)
        ret
    }
    @scala.inline
    def withNamespacing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamespacing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespacing")(js.undefined)
        ret
    }
  }
  
}

