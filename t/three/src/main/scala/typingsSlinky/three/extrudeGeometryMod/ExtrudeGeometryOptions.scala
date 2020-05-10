package typingsSlinky.three.extrudeGeometryMod

import typingsSlinky.three.curveMod.Curve
import typingsSlinky.three.vector3Mod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtrudeGeometryOptions extends js.Object {
  var UVGenerator: js.UndefOr[typingsSlinky.three.extrudeGeometryMod.UVGenerator] = js.native
  var bevelEnabled: js.UndefOr[Boolean] = js.native
  var bevelOffset: js.UndefOr[Double] = js.native
  var bevelSegments: js.UndefOr[Double] = js.native
  var bevelSize: js.UndefOr[Double] = js.native
  var bevelThickness: js.UndefOr[Double] = js.native
  var curveSegments: js.UndefOr[Double] = js.native
  var depth: js.UndefOr[Double] = js.native
  var extrudePath: js.UndefOr[Curve[Vector3]] = js.native
  var steps: js.UndefOr[Double] = js.native
}

object ExtrudeGeometryOptions {
  @scala.inline
  def apply(): ExtrudeGeometryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtrudeGeometryOptions]
  }
  @scala.inline
  implicit class ExtrudeGeometryOptionsOps[Self <: ExtrudeGeometryOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUVGenerator(value: UVGenerator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UVGenerator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUVGenerator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UVGenerator")(js.undefined)
        ret
    }
    @scala.inline
    def withBevelEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bevelEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBevelEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bevelEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withBevelOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bevelOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBevelOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bevelOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withBevelSegments(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bevelSegments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBevelSegments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bevelSegments")(js.undefined)
        ret
    }
    @scala.inline
    def withBevelSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bevelSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBevelSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bevelSize")(js.undefined)
        ret
    }
    @scala.inline
    def withBevelThickness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bevelThickness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBevelThickness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bevelThickness")(js.undefined)
        ret
    }
    @scala.inline
    def withCurveSegments(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("curveSegments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurveSegments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("curveSegments")(js.undefined)
        ret
    }
    @scala.inline
    def withDepth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDepth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depth")(js.undefined)
        ret
    }
    @scala.inline
    def withExtrudePath(value: Curve[Vector3]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extrudePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtrudePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extrudePath")(js.undefined)
        ret
    }
    @scala.inline
    def withSteps(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("steps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSteps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("steps")(js.undefined)
        ret
    }
  }
  
}

