package typingsSlinky.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Simple object for specifying options to [openMusicLibrary](Titanium.Media.openMusicLibrary).
  */
@js.native
trait MusicLibraryOptionsType extends js.Object {
  /**
  	 * Set to `true` to allow the user to select multiple items from the library.
  	 */
  var allowMultipleSelections: js.UndefOr[Boolean] = js.native
  /**
  	 * Boolean if the dialog should be animated when showing and hiding.
  	 */
  var animated: js.UndefOr[Boolean] = js.native
  /**
  	 * Specifies that the library should be hidden automatically after media selection is completed.
  	 */
  var autohide: js.UndefOr[Boolean] = js.native
  /**
  	 * Function to call if the user presses the cancel button.
  	 */
  var cancel: js.UndefOr[js.Function1[/* param0 */ FailureResponse, Unit]] = js.native
  /**
  	 * Function to call upon receiving an error.
  	 */
  var error: js.UndefOr[js.Function1[/* param0 */ FailureResponse, Unit]] = js.native
  /**
  	 * An array of media type constants defining selectable media.
  	 */
  var mediaTypes: js.UndefOr[Double | js.Array[Double]] = js.native
  /**
  	 * Function to call when the music library selection is made.
  	 */
  var success: js.UndefOr[js.Function1[/* param0 */ MusicLibraryResponseType, Unit]] = js.native
}

object MusicLibraryOptionsType {
  @scala.inline
  def apply(): MusicLibraryOptionsType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MusicLibraryOptionsType]
  }
  @scala.inline
  implicit class MusicLibraryOptionsTypeOps[Self <: MusicLibraryOptionsType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowMultipleSelections(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowMultipleSelections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowMultipleSelections: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowMultipleSelections")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animated")(js.undefined)
        ret
    }
    @scala.inline
    def withAutohide(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autohide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutohide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autohide")(js.undefined)
        ret
    }
    @scala.inline
    def withCancel(value: /* param0 */ FailureResponse => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.undefined)
        ret
    }
    @scala.inline
    def withError(value: /* param0 */ FailureResponse => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
    @scala.inline
    def withMediaTypes(value: Double | js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMediaTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccess(value: /* param0 */ MusicLibraryResponseType => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.undefined)
        ret
    }
  }
  
}

