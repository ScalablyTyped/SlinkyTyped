package typingsSlinky.tableau.tableau

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VizCreateOptions
  extends /**
  * Apply a filter that you specify to the view when it is first rendered.
  * For example, if you have an Academic Year filter and only want to display data for 2017,
  * you might enter "Academic Year": "2016". For more information, see Filtering.
  */
/* filter */ StringDictionary[js.Any] {
  /**
    * Specifies a device layout for a dashboard, if it exists.
    * Values can be desktop, tablet, or phone.
    * If not specified, defaults to loading a layout based on the smallest dimension of the hosting iframe element.
    */
  var device: js.UndefOr[String] = js.native
  /** Can be any valid CSS size specifier. If not specified, defaults to the published height of the view. */
  var height: js.UndefOr[String] = js.native
  /** Undoes action on sheet, defaults to a single undo unless optional parameters is specified. */
  var hideTabs: js.UndefOr[Boolean] = js.native
  /** Indicates whether the toolbar is hidden or shown. */
  var hideToolbar: js.UndefOr[Boolean] = js.native
  /**
    * Specifies the ID of an existing instance to make a copy (clone) of.
    * This is useful if the user wants to continue analysis of an existing visualization without losing the state of the original.
    * If the ID does not refer to an existing visualization, the cloned version is derived from the original visualization.
    */
  var instanceIdToClone: js.UndefOr[String] = js.native
  /**
    * Callback function that is invoked when the Viz object first becomes interactive.
    * This is only called once, but it’s guaranteed to be called.
    * If the Viz object is already interactive, it will be called immediately, but on a separate "thread."
    */
  var onFirstInteractive: js.UndefOr[js.Function1[/* e */ TableauEvent, Unit]] = js.native
  /**
    * Callback function that's invoked when the size of the Viz object is known.
    * You can use this callback to perform tasks such as resizing the elements surrounding the Viz object once the object's size has been established.
    */
  var onFirstVizSizeKnown: js.UndefOr[js.Function1[/* e */ VizResizeEvent, Unit]] = js.native
  /** Can be any valid CSS size specifier. If not specified, defaults to the published height of the view. */
  var width: js.UndefOr[String] = js.native
}

object VizCreateOptions {
  @scala.inline
  def apply(): VizCreateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VizCreateOptions]
  }
  @scala.inline
  implicit class VizCreateOptionsOps[Self <: VizCreateOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDevice(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("device")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDevice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("device")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withHideTabs(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideTabs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideTabs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideTabs")(js.undefined)
        ret
    }
    @scala.inline
    def withHideToolbar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideToolbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideToolbar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideToolbar")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceIdToClone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceIdToClone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceIdToClone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceIdToClone")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFirstInteractive(value: /* e */ TableauEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFirstInteractive")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnFirstInteractive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFirstInteractive")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFirstVizSizeKnown(value: /* e */ VizResizeEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFirstVizSizeKnown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnFirstVizSizeKnown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFirstVizSizeKnown")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: String): Self = {
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

