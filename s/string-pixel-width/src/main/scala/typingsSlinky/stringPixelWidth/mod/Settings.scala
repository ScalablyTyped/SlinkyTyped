package typingsSlinky.stringPixelWidth.mod

import typingsSlinky.stringPixelWidth.stringPixelWidthStrings.`andale mono`
import typingsSlinky.stringPixelWidth.stringPixelWidthStrings.`avenir next`
import typingsSlinky.stringPixelWidth.stringPixelWidthStrings.`comic sans ms`
import typingsSlinky.stringPixelWidth.stringPixelWidthStrings.`courier new`
import typingsSlinky.stringPixelWidth.stringPixelWidthStrings.`open sans`
import typingsSlinky.stringPixelWidth.stringPixelWidthStrings.`times new roman`
import typingsSlinky.stringPixelWidth.stringPixelWidthStrings.`trebuchet ms`
import typingsSlinky.stringPixelWidth.stringPixelWidthStrings.arial
import typingsSlinky.stringPixelWidth.stringPixelWidthStrings.avenir
import typingsSlinky.stringPixelWidth.stringPixelWidthStrings.georgia
import typingsSlinky.stringPixelWidth.stringPixelWidthStrings.impact
import typingsSlinky.stringPixelWidth.stringPixelWidthStrings.tahoma
import typingsSlinky.stringPixelWidth.stringPixelWidthStrings.verdana
import typingsSlinky.stringPixelWidth.stringPixelWidthStrings.webdings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Settings extends js.Object {
  var bold: js.UndefOr[Boolean] = js.native
  var font: js.UndefOr[
    (`andale mono`) | arial | (`avenir next`) | avenir | (`comic sans ms`) | (`courier new`) | georgia | impact | (`open sans`) | tahoma | (`times new roman`) | (`trebuchet ms`) | verdana | webdings
  ] = js.native
  var italic: js.UndefOr[Boolean] = js.native
  var size: js.UndefOr[Double] = js.native
}

object Settings {
  @scala.inline
  def apply(): Settings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Settings]
  }
  @scala.inline
  implicit class SettingsOps[Self <: Settings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBold(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bold")(js.undefined)
        ret
    }
    @scala.inline
    def withFont(
      value: (`andale mono`) | arial | (`avenir next`) | avenir | (`comic sans ms`) | (`courier new`) | georgia | impact | (`open sans`) | tahoma | (`times new roman`) | (`trebuchet ms`) | verdana | webdings
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFont: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(js.undefined)
        ret
    }
    @scala.inline
    def withItalic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("italic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItalic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("italic")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
  }
  
}

