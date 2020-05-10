package typingsSlinky.svgSprite.mod

import typingsSlinky.svgSprite.AnonAttributes
import typingsSlinky.svgSprite.AnonBox
import typingsSlinky.svgSprite.AnonGenerator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * All settings affecting the SVG shapes of the sprite
  */
@js.native
trait Shape extends js.Object {
  /**
    * Path to YAML file with extended alignment data
    */
  var align: js.UndefOr[String] = js.native
  /**
    * Output directory for optimized intermediate SVG shapes
    */
  var dest: js.UndefOr[String] = js.native
  /**
    * Dimension related options
    */
  var dimension: js.UndefOr[AnonAttributes] = js.native
  /**
    * SVG shape ID related options
    */
  var id: js.UndefOr[AnonGenerator] = js.native
  /**
    * Path to YAML file with meta / accessibility data
    */
  var meta: js.UndefOr[String] = js.native
  /**
    * Spacing related options
    */
  var spacing: js.UndefOr[AnonBox] = js.native
  /**
    * List of transformations / optimizations
    */
  var transform: js.UndefOr[js.Array[String | CustomConfigurationTransform | CustomCallbackTransform]] = js.native
}

object Shape {
  @scala.inline
  def apply(): Shape = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Shape]
  }
  @scala.inline
  implicit class ShapeOps[Self <: Shape] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlign(value: String): Self = {
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
    def withDest(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dest")(js.undefined)
        ret
    }
    @scala.inline
    def withDimension(value: AnonAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDimension: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimension")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: AnonGenerator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withMeta(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeta: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meta")(js.undefined)
        ret
    }
    @scala.inline
    def withSpacing(value: AnonBox): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpacing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spacing")(js.undefined)
        ret
    }
    @scala.inline
    def withTransform(value: js.Array[String | CustomConfigurationTransform | CustomCallbackTransform]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(js.undefined)
        ret
    }
  }
  
}

