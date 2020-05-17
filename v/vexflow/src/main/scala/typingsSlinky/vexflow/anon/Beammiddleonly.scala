package typingsSlinky.vexflow.anon

import typingsSlinky.vexflow.Vex.Flow.Fraction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Beammiddleonly extends js.Object {
  var beam_middle_only: js.UndefOr[Boolean] = js.native
  var beam_rests: js.UndefOr[Boolean] = js.native
  var groups: js.UndefOr[js.Array[Fraction]] = js.native
  var maintain_stem_directions: js.UndefOr[Boolean] = js.native
  var show_stemlets: js.UndefOr[Boolean] = js.native
  var stem_direction: js.UndefOr[Double] = js.native
}

object Beammiddleonly {
  @scala.inline
  def apply(): Beammiddleonly = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Beammiddleonly]
  }
  @scala.inline
  implicit class BeammiddleonlyOps[Self <: Beammiddleonly] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBeam_middle_only(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beam_middle_only")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeam_middle_only: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beam_middle_only")(js.undefined)
        ret
    }
    @scala.inline
    def withBeam_rests(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beam_rests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeam_rests: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beam_rests")(js.undefined)
        ret
    }
    @scala.inline
    def withGroups(value: js.Array[Fraction]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groups")(js.undefined)
        ret
    }
    @scala.inline
    def withMaintain_stem_directions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maintain_stem_directions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaintain_stem_directions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maintain_stem_directions")(js.undefined)
        ret
    }
    @scala.inline
    def withShow_stemlets(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show_stemlets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShow_stemlets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show_stemlets")(js.undefined)
        ret
    }
    @scala.inline
    def withStem_direction(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stem_direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStem_direction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stem_direction")(js.undefined)
        ret
    }
  }
  
}

