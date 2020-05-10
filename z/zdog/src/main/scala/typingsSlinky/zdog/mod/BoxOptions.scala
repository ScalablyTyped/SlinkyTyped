package typingsSlinky.zdog.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BoxOptions extends RectOptions {
  /** @default true */
  val bottomFace: js.UndefOr[Boolean | String] = js.native
  /** @default 1 */
  val depth: js.UndefOr[Double] = js.native
  /** @default true */
  val frontFace: js.UndefOr[Boolean | String] = js.native
  /** @default true */
  val leftFace: js.UndefOr[Boolean | String] = js.native
  /** @default true */
  val rearFace: js.UndefOr[Boolean | String] = js.native
  /** @default true */
  val rightFace: js.UndefOr[Boolean | String] = js.native
  /** @default true */
  val topFace: js.UndefOr[Boolean | String] = js.native
}

object BoxOptions {
  @scala.inline
  def apply(): BoxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BoxOptions]
  }
  @scala.inline
  implicit class BoxOptionsOps[Self <: BoxOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBottomFace(value: Boolean | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomFace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBottomFace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomFace")(js.undefined)
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
    def withFrontFace(value: Boolean | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frontFace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrontFace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frontFace")(js.undefined)
        ret
    }
    @scala.inline
    def withLeftFace(value: Boolean | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftFace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeftFace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftFace")(js.undefined)
        ret
    }
    @scala.inline
    def withRearFace(value: Boolean | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rearFace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRearFace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rearFace")(js.undefined)
        ret
    }
    @scala.inline
    def withRightFace(value: Boolean | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightFace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRightFace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightFace")(js.undefined)
        ret
    }
    @scala.inline
    def withTopFace(value: Boolean | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topFace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopFace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topFace")(js.undefined)
        ret
    }
  }
  
}

