package typingsSlinky.sharepoint

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CalloutOptions extends js.Object {
  /** Some unique id for the callout. */
  var ID: String = js.native
  /** One of the following: "topBottom" (default) or "leftRight". */
  var beakOrientation: String = js.native
  /** If defined, callout will be inscribed into the bounding element. */
  var boundingBox: HTMLElement = js.native
  /** String (HTML allowed) that represents contents of the callout window. */
  var content: String = js.native
  /** HTML element that represents contents of the callout window. */
  var contentElement: HTMLElement = js.native
  /** Content element's width in pixels. By default = 350. */
  var contentWidth: Double = js.native
  /** Element on that the callout is shown. */
  var launchPoint: HTMLElement = js.native
  /** Defines opening behavior */
  var openOptions: CalloutOpenOptions = js.native
  /** Title for the callout */
  var title: String = js.native
  /** Fires right after the callout is closed */
  def onClosedCallback(callout: Callout): Unit = js.native
  /** Fires right before the callout is closed */
  def onClosingCallback(callout: Callout): Unit = js.native
  /** Fires right after the callout is shown */
  def onOpenedCallback(callout: Callout): Unit = js.native
  /** Fires after the callout is rendered but before it is positioned and shown */
  def onOpeningCallback(callout: Callout): Unit = js.native
  /** Sets the position of the callout during its opening phase. For an example of a position algorithm function, please explore defaultPositionAlgorithm function from the callout.debug.js file */
  def positionAlgorithm(callout: Callout): Unit = js.native
}

object CalloutOptions {
  @scala.inline
  def apply(
    ID: String,
    beakOrientation: String,
    boundingBox: HTMLElement,
    content: String,
    contentElement: HTMLElement,
    contentWidth: Double,
    launchPoint: HTMLElement,
    onClosedCallback: Callout => Unit,
    onClosingCallback: Callout => Unit,
    onOpenedCallback: Callout => Unit,
    onOpeningCallback: Callout => Unit,
    openOptions: CalloutOpenOptions,
    positionAlgorithm: Callout => Unit,
    title: String
  ): CalloutOptions = {
    val __obj = js.Dynamic.literal(ID = ID.asInstanceOf[js.Any], beakOrientation = beakOrientation.asInstanceOf[js.Any], boundingBox = boundingBox.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], contentElement = contentElement.asInstanceOf[js.Any], contentWidth = contentWidth.asInstanceOf[js.Any], launchPoint = launchPoint.asInstanceOf[js.Any], onClosedCallback = js.Any.fromFunction1(onClosedCallback), onClosingCallback = js.Any.fromFunction1(onClosingCallback), onOpenedCallback = js.Any.fromFunction1(onOpenedCallback), onOpeningCallback = js.Any.fromFunction1(onOpeningCallback), openOptions = openOptions.asInstanceOf[js.Any], positionAlgorithm = js.Any.fromFunction1(positionAlgorithm), title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalloutOptions]
  }
  @scala.inline
  implicit class CalloutOptionsOps[Self <: CalloutOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeakOrientation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beakOrientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBoundingBox(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundingBox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLaunchPoint(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("launchPoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnClosedCallback(value: Callout => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClosedCallback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnClosingCallback(value: Callout => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClosingCallback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnOpenedCallback(value: Callout => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpenedCallback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnOpeningCallback(value: Callout => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpeningCallback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOpenOptions(value: CalloutOpenOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPositionAlgorithm(value: Callout => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionAlgorithm")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

