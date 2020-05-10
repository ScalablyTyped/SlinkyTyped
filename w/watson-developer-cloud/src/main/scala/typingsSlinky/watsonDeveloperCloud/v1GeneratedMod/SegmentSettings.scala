package typingsSlinky.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A list of Document Segmentation settings. */
@js.native
trait SegmentSettings extends js.Object {
  /** Enables/disables the Document Segmentation feature. */
  var enabled: js.UndefOr[Boolean] = js.native
  /** Defines the heading level that splits into document segments. Valid values are h1, h2, h3, h4, h5, h6. The content of the header field that the segmentation splits at is used as the **title** field for that segmented result. */
  var selector_tags: js.UndefOr[js.Array[String]] = js.native
}

object SegmentSettings {
  @scala.inline
  def apply(): SegmentSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SegmentSettings]
  }
  @scala.inline
  implicit class SegmentSettingsOps[Self <: SegmentSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withSelector_tags(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector_tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelector_tags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector_tags")(js.undefined)
        ret
    }
  }
  
}

