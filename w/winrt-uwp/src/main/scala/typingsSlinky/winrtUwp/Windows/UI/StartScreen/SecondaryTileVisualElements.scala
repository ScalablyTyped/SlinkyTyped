package typingsSlinky.winrtUwp.Windows.UI.StartScreen

import typingsSlinky.winrtUwp.Windows.Foundation.Uri
import typingsSlinky.winrtUwp.Windows.UI.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains properties through which you can get or set a secondary tile's background color, foreground text, tile images, and app name display options. The properties in this class replace these SecondaryTile properties: */
@js.native
trait SecondaryTileVisualElements extends js.Object {
  /** Gets or sets the secondary tile's background color. */
  var backgroundColor: Color = js.native
  /** Specifies whether the tile should use dark or light text. */
  var foregroundText: ForegroundText = js.native
  /** Specifies whether the display name should be shown on the medium secondary tile. */
  var showNameOnSquare150x150Logo: Boolean = js.native
  /** Specifies whether the display name should be shown on the large secondary tile. */
  var showNameOnSquare310x310Logo: Boolean = js.native
  /** Specifies whether the display name should be shown on the wide secondary tile. */
  var showNameOnWide310x150Logo: Boolean = js.native
  /** Gets or sets the medium secondary tile image. */
  var square150x150Logo: Uri = js.native
  /** Gets or sets the square30x30 secondary tile image. */
  var square30x30Logo: Uri = js.native
  /** Gets or sets the large secondary tile image. */
  var square310x310Logo: Uri = js.native
  /** Gets or sets the square44x44 secondary tile image. */
  var square44x44Logo: Uri = js.native
  /** Gets or sets the small secondary tile image. */
  var square70x70Logo: Uri = js.native
  /** Gets or sets the small secondary tile image. */
  var square71x71Logo: Uri = js.native
  /** Gets or sets the wide secondary tile image. */
  var wide310x150Logo: Uri = js.native
}

object SecondaryTileVisualElements {
  @scala.inline
  def apply(
    backgroundColor: Color,
    foregroundText: ForegroundText,
    showNameOnSquare150x150Logo: Boolean,
    showNameOnSquare310x310Logo: Boolean,
    showNameOnWide310x150Logo: Boolean,
    square150x150Logo: Uri,
    square30x30Logo: Uri,
    square310x310Logo: Uri,
    square44x44Logo: Uri,
    square70x70Logo: Uri,
    square71x71Logo: Uri,
    wide310x150Logo: Uri
  ): SecondaryTileVisualElements = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], foregroundText = foregroundText.asInstanceOf[js.Any], showNameOnSquare150x150Logo = showNameOnSquare150x150Logo.asInstanceOf[js.Any], showNameOnSquare310x310Logo = showNameOnSquare310x310Logo.asInstanceOf[js.Any], showNameOnWide310x150Logo = showNameOnWide310x150Logo.asInstanceOf[js.Any], square150x150Logo = square150x150Logo.asInstanceOf[js.Any], square30x30Logo = square30x30Logo.asInstanceOf[js.Any], square310x310Logo = square310x310Logo.asInstanceOf[js.Any], square44x44Logo = square44x44Logo.asInstanceOf[js.Any], square70x70Logo = square70x70Logo.asInstanceOf[js.Any], square71x71Logo = square71x71Logo.asInstanceOf[js.Any], wide310x150Logo = wide310x150Logo.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecondaryTileVisualElements]
  }
  @scala.inline
  implicit class SecondaryTileVisualElementsOps[Self <: SecondaryTileVisualElements] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackgroundColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForegroundText(value: ForegroundText): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foregroundText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowNameOnSquare150x150Logo(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showNameOnSquare150x150Logo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowNameOnSquare310x310Logo(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showNameOnSquare310x310Logo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowNameOnWide310x150Logo(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showNameOnWide310x150Logo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSquare150x150Logo(value: Uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("square150x150Logo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSquare30x30Logo(value: Uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("square30x30Logo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSquare310x310Logo(value: Uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("square310x310Logo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSquare44x44Logo(value: Uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("square44x44Logo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSquare70x70Logo(value: Uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("square70x70Logo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSquare71x71Logo(value: Uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("square71x71Logo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWide310x150Logo(value: Uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wide310x150Logo")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

