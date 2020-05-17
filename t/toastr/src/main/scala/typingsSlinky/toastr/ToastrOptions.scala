package typingsSlinky.toastr

import typingsSlinky.jquery.JQueryMouseEventObject
import typingsSlinky.toastr.anon.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToastrOptions extends js.Object {
  /**
  	 * Should a close button be shown?
  	 * @default undefined
  	 */
  var closeButton: js.UndefOr[Boolean] = js.native
  /**
  	 * CSS class the close button will be given.
  	 * @default toast-close-button
  	 */
  var closeClass: js.UndefOr[String] = js.native
  /**
  	 * Time in milliseconds the toast should take to hide, when the close button is clicked.
  	 * Falls back to hide configuration.
  	 * @default false
  	 */
  var closeDuration: js.UndefOr[Double] = js.native
  /**
  	 * The animation easing while hiding the toast, when the close button is clicked.
  	 * Falls back to hide configuration.
  	 * swing and linear are built into jQuery.
  	 * @default false
  	 */
  var closeEasing: js.UndefOr[String] = js.native
  /**
  	 * Html for the close button.
  	 */
  var closeHtml: js.UndefOr[String] = js.native
  /**
  	 * Use the jQuery show/hide method of your choice, when the close button is clicked.
  	 * Falls back to hide configuration.
  	 * The methods fadeIn/fadeOut, slideDown/slideUp, and show/hide are built into jQuery.
  	 * @default false
  	 */
  var closeMethod: js.UndefOr[String] = js.native
  /**
  	 * Set to false so that the toast hides event if hovered.
  	 * @default true
  	 */
  var closeOnHover: js.UndefOr[Boolean] = js.native
  /**
  	 * Id toast container will be given.
  	 * @default toast-container
  	 */
  var containerId: js.UndefOr[String] = js.native
  /**
  	 * Should debug details be outputted to the console?
  	 * @default false
  	 */
  var debug: js.UndefOr[Boolean] = js.native
  /**
  	 * Should the title and message text be escaped?
  	 * @default false
  	 */
  var escapeHtml: js.UndefOr[Boolean] = js.native
  /**
  	 * Time in milliseconds the toast should be displayed after leaving mouse over.
  	 * Set timeOut and extendedTimeOut to 0 to make it sticky.
  	 * @default 1000
  	 */
  var extendedTimeOut: js.UndefOr[Double] = js.native
  /**
  	 * Time in milliseconds the toast should take to hide.
  	 * @default 1000
  	 */
  var hideDuration: js.UndefOr[Double] = js.native
  /**
  	 * Optionally override the animation easing to show or hide the toasts.
  	 * swing and linear are built into jQuery.
  	 * @default swing
  	 */
  var hideEasing: js.UndefOr[String] = js.native
  /**
  	 * Use the jQuery hide method of your choice.
  	 * The methods fadeIn/fadeOut, slideDown/slideUp, and show/hide are built into jQuery.
  	 * @default fadeOut
  	 */
  var hideMethod: js.UndefOr[String] = js.native
  /**
  	 * Icon to use for toast.
  	 * @default toast-info
  	 */
  var iconClass: js.UndefOr[String] = js.native
  /**
  	 * If specified, you must provide all classes.
  	 */
  var iconClasses: js.UndefOr[Error] = js.native
  /**
  	 * CSS class the message element will be given.
  	 * @default toast-message
  	 */
  var messageClass: js.UndefOr[String] = js.native
  /**
  	 * Set newest toast to appear on top.
  	 * @default true
  	 */
  var newestOnTop: js.UndefOr[Boolean] = js.native
  /**
  	 * onCloseClick function callback, fired when the close button is clicked.
  	 * Closing cannot be prevented by ev.stopPropagation() etc.
  	 * @default undefined
  	 */
  var onCloseClick: js.UndefOr[js.Function1[/* ev */ JQueryMouseEventObject, Unit]] = js.native
  /**
  	 * onHidden function callback.
  	 * @default undefined
  	 */
  var onHidden: js.UndefOr[js.Function0[Unit]] = js.native
  /**
  	 * onShown function callback.
  	 * @default undefined
  	 */
  var onShown: js.UndefOr[js.Function0[Unit]] = js.native
  /**
  	 * Function to execute on toast click. Closing cannot be prevented by ev.stopPropagation() etc.
  	 * @default undefined
  	 */
  var onclick: js.UndefOr[js.Function1[/* ev */ JQueryMouseEventObject, Unit]] = js.native
  /**
  	 * Where toast should be displayed.
  	 * The default stylesheet covers:
  	 * toast-top-left, toast-top-center, toast-top-right, toast-top-full-width,
  	 * toast-bottom-left, toast-bottom-center, toast-bottom-right, toast-bottom-full-width
  	 * @default toast-top-right
  	 */
  var positionClass: js.UndefOr[String] = js.native
  /**
  	 * Rather than having identical toasts stack, set the preventDuplicates property to true.
  	 * Duplicates are matched to the previous toast based on their message content.
  	 * @default false
  	 */
  var preventDuplicates: js.UndefOr[Boolean] = js.native
  /**
  	 * Visually indicates how long before a toast expires.
  	 * @default false
  	 */
  var progressBar: js.UndefOr[Boolean] = js.native
  /**
  	 * CSS class the progressbar element will be given.
  	 * @default toast-progress
  	 */
  var progressClass: js.UndefOr[String] = js.native
  /**
  	 * Flip the toastr to be displayed properly for right-to-left languages.
  	 * @default false
  	 */
  var rtl: js.UndefOr[Boolean] = js.native
  /**
  	 * Time in milliseconds the toast should take to show.
  	 * @default 300
  	 */
  var showDuration: js.UndefOr[Double] = js.native
  /**
  	 * Optionally override the animation easing to show or hide the toasts.
  	 * swing and linear are built into jQuery.
  	 * @default swing
  	 */
  var showEasing: js.UndefOr[String] = js.native
  /**
  	 * Use the jQuery show method of your choice.
  	 * The methods fadeIn/fadeOut, slideDown/slideUp, and show/hide are built into jQuery.
  	 * @default fadeIn
  	 */
  var showMethod: js.UndefOr[String] = js.native
  /**
  	 * Should clicking on toast dismiss it?
  	 * @default true
  	 */
  var tapToDismiss: js.UndefOr[Boolean] = js.native
  /**
  	 * The element to put the toastr container
  	 * @default body
  	 */
  var target: js.UndefOr[String] = js.native
  /**
  	 * Time in milliseconds that the toast should be displayed.
  	 * Set timeOut and extendedTimeOut to 0 to make it sticky.
  	 * @default 5000
  	 */
  var timeOut: js.UndefOr[Double] = js.native
  /**
  	 * CSS class the title element will be given.
  	 * @default toast-title
  	 */
  var titleClass: js.UndefOr[String] = js.native
  /**
  	 * CSS class the toast element will be given.
  	 * @default toast
  	 */
  var toastClass: js.UndefOr[String] = js.native
}

object ToastrOptions {
  @scala.inline
  def apply(): ToastrOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToastrOptions]
  }
  @scala.inline
  implicit class ToastrOptionsOps[Self <: ToastrOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCloseButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeButton")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeClass")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseEasing(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeEasing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseEasing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeEasing")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseHtml(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeHtml")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseHtml: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeHtml")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseOnHover(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnHover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseOnHover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnHover")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerId")(js.undefined)
        ret
    }
    @scala.inline
    def withDebug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebug: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.undefined)
        ret
    }
    @scala.inline
    def withEscapeHtml(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escapeHtml")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEscapeHtml: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escapeHtml")(js.undefined)
        ret
    }
    @scala.inline
    def withExtendedTimeOut(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extendedTimeOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtendedTimeOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extendedTimeOut")(js.undefined)
        ret
    }
    @scala.inline
    def withHideDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withHideEasing(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideEasing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideEasing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideEasing")(js.undefined)
        ret
    }
    @scala.inline
    def withHideMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withIconClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconClass")(js.undefined)
        ret
    }
    @scala.inline
    def withIconClasses(value: Error): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconClasses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconClasses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconClasses")(js.undefined)
        ret
    }
    @scala.inline
    def withMessageClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageClass")(js.undefined)
        ret
    }
    @scala.inline
    def withNewestOnTop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newestOnTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewestOnTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newestOnTop")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCloseClick(value: /* ev */ JQueryMouseEventObject => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCloseClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCloseClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCloseClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnHidden(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHidden")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHidden")(js.undefined)
        ret
    }
    @scala.inline
    def withOnShown(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShown")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnShown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShown")(js.undefined)
        ret
    }
    @scala.inline
    def withOnclick(value: /* ev */ JQueryMouseEventObject => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onclick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnclick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onclick")(js.undefined)
        ret
    }
    @scala.inline
    def withPositionClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPositionClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionClass")(js.undefined)
        ret
    }
    @scala.inline
    def withPreventDuplicates(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventDuplicates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreventDuplicates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventDuplicates")(js.undefined)
        ret
    }
    @scala.inline
    def withProgressBar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressBar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgressBar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressBar")(js.undefined)
        ret
    }
    @scala.inline
    def withProgressClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgressClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressClass")(js.undefined)
        ret
    }
    @scala.inline
    def withRtl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rtl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRtl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rtl")(js.undefined)
        ret
    }
    @scala.inline
    def withShowDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withShowEasing(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showEasing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowEasing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showEasing")(js.undefined)
        ret
    }
    @scala.inline
    def withShowMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withTapToDismiss(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tapToDismiss")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTapToDismiss: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tapToDismiss")(js.undefined)
        ret
    }
    @scala.inline
    def withTarget(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeOut(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeOut")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleClass")(js.undefined)
        ret
    }
    @scala.inline
    def withToastClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toastClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToastClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toastClass")(js.undefined)
        ret
    }
  }
  
}

