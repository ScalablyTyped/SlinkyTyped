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

trait Settings extends js.Object {
  var bold: js.UndefOr[Boolean] = js.undefined
  var font: js.UndefOr[
    (`andale mono`) | arial | (`avenir next`) | avenir | (`comic sans ms`) | (`courier new`) | georgia | impact | (`open sans`) | tahoma | (`times new roman`) | (`trebuchet ms`) | verdana | webdings
  ] = js.undefined
  var italic: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
}

object Settings {
  @scala.inline
  def apply(
    bold: js.UndefOr[Boolean] = js.undefined,
    font: (`andale mono`) | arial | (`avenir next`) | avenir | (`comic sans ms`) | (`courier new`) | georgia | impact | (`open sans`) | tahoma | (`times new roman`) | (`trebuchet ms`) | verdana | webdings = null,
    italic: js.UndefOr[Boolean] = js.undefined,
    size: Int | Double = null
  ): Settings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bold)) __obj.updateDynamic("bold")(bold.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (!js.isUndefined(italic)) __obj.updateDynamic("italic")(italic.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
}

