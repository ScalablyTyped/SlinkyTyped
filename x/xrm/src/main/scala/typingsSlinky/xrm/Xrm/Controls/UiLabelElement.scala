package typingsSlinky.xrm.Xrm.Controls

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for UI elements with labels.
  */
@js.native
trait UiLabelElement extends js.Object {
  /**
    * Gets the label.
    * @returns The label.
    */
  def getLabel(): String = js.native
  /**
    * Sets the label.
    * @param label The label.
    */
  def setLabel(label: String): Unit = js.native
}

object UiLabelElement {
  @scala.inline
  def apply(getLabel: () => String, setLabel: String => Unit): UiLabelElement = {
    val __obj = js.Dynamic.literal(getLabel = js.Any.fromFunction0(getLabel), setLabel = js.Any.fromFunction1(setLabel))
    __obj.asInstanceOf[UiLabelElement]
  }
  @scala.inline
  implicit class UiLabelElementOps[Self <: UiLabelElement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetLabel(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLabel")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetLabel(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLabel")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

