package typingsSlinky.three.raycasterMod

import typingsSlinky.three.AnonThreshold
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RaycasterParameters extends js.Object {
  var LOD: js.UndefOr[js.Any] = js.native
  var Line: js.UndefOr[js.Any] = js.native
  var Mesh: js.UndefOr[js.Any] = js.native
  var Points: js.UndefOr[AnonThreshold] = js.native
  var Sprite: js.UndefOr[js.Any] = js.native
}

object RaycasterParameters {
  @scala.inline
  def apply(): RaycasterParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RaycasterParameters]
  }
  @scala.inline
  implicit class RaycasterParametersOps[Self <: RaycasterParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLOD(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LOD")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLOD: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LOD")(js.undefined)
        ret
    }
    @scala.inline
    def withLine(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Line")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Line")(js.undefined)
        ret
    }
    @scala.inline
    def withMesh(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Mesh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMesh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Mesh")(js.undefined)
        ret
    }
    @scala.inline
    def withPoints(value: AnonThreshold): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Points")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Points")(js.undefined)
        ret
    }
    @scala.inline
    def withSprite(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Sprite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSprite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Sprite")(js.undefined)
        ret
    }
  }
  
}

