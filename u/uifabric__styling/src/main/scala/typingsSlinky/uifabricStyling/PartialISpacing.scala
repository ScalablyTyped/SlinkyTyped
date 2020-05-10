package typingsSlinky.uifabricStyling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@uifabric/styling.@uifabric/styling/lib/interfaces/ISpacing.ISpacing> */
@js.native
trait PartialISpacing extends js.Object {
  var l1: js.UndefOr[String] = js.native
  var l2: js.UndefOr[String] = js.native
  var m: js.UndefOr[String] = js.native
  var s1: js.UndefOr[String] = js.native
  var s2: js.UndefOr[String] = js.native
}

object PartialISpacing {
  @scala.inline
  def apply(): PartialISpacing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialISpacing]
  }
  @scala.inline
  implicit class PartialISpacingOps[Self <: PartialISpacing] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withL1(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("l1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutL1: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("l1")(js.undefined)
        ret
    }
    @scala.inline
    def withL2(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("l2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutL2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("l2")(js.undefined)
        ret
    }
    @scala.inline
    def withM(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("m")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutM: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("m")(js.undefined)
        ret
    }
    @scala.inline
    def withS1(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS1: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s1")(js.undefined)
        ret
    }
    @scala.inline
    def withS2(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s2")(js.undefined)
        ret
    }
  }
  
}

