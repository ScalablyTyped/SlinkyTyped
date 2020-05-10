package typingsSlinky.titanium

import typingsSlinky.titanium.Titanium.Blob
import typingsSlinky.titanium.Titanium.Filesystem.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Object describing a button bar or tabbed bar item.
  */
@js.native
trait BarItemType extends js.Object {
  /**
  	 * A succint label associated with the bar item for the device's accessibility service.
  	 */
  var accessibilityLabel: js.UndefOr[java.lang.String] = js.native
  /**
  	 * Whether the button is enabled initially.
  	 */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
  	 * Button icon. If specified, takes precedence over `title`.
  	 */
  var image: js.UndefOr[java.lang.String | Blob | File] = js.native
  /**
  	 * Button title, used if no `image` is specified.
  	 */
  var title: js.UndefOr[java.lang.String] = js.native
  /**
  	 * Width for this button.
  	 */
  var width: js.UndefOr[Double] = js.native
}

object BarItemType {
  @scala.inline
  def apply(): BarItemType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BarItemType]
  }
  @scala.inline
  implicit class BarItemTypeOps[Self <: BarItemType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessibilityLabel(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibilityLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessibilityLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibilityLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withImage(value: java.lang.String | Blob | File): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

