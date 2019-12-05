package typingsSlinky.stringDashPixelDashWidth.stringDashPixelDashWidthMod

import typingsSlinky.stringDashPixelDashWidth.stringDashPixelDashWidthStrings.`andale mono`
import typingsSlinky.stringDashPixelDashWidth.stringDashPixelDashWidthStrings.`avenir next`
import typingsSlinky.stringDashPixelDashWidth.stringDashPixelDashWidthStrings.`comic sans ms`
import typingsSlinky.stringDashPixelDashWidth.stringDashPixelDashWidthStrings.`courier new`
import typingsSlinky.stringDashPixelDashWidth.stringDashPixelDashWidthStrings.`open sans`
import typingsSlinky.stringDashPixelDashWidth.stringDashPixelDashWidthStrings.`times new roman`
import typingsSlinky.stringDashPixelDashWidth.stringDashPixelDashWidthStrings.`trebuchet ms`
import typingsSlinky.stringDashPixelDashWidth.stringDashPixelDashWidthStrings.arial
import typingsSlinky.stringDashPixelDashWidth.stringDashPixelDashWidthStrings.avenir
import typingsSlinky.stringDashPixelDashWidth.stringDashPixelDashWidthStrings.georgia
import typingsSlinky.stringDashPixelDashWidth.stringDashPixelDashWidthStrings.impact
import typingsSlinky.stringDashPixelDashWidth.stringDashPixelDashWidthStrings.tahoma
import typingsSlinky.stringDashPixelDashWidth.stringDashPixelDashWidthStrings.verdana
import typingsSlinky.stringDashPixelDashWidth.stringDashPixelDashWidthStrings.webdings
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

