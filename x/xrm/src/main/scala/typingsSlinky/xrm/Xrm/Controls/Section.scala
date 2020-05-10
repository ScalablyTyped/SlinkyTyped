package typingsSlinky.xrm.Xrm.Controls

import typingsSlinky.xrm.Xrm.Collection.ItemCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for a form section.
  * @see {@link UiElement}
  */
@js.native
trait Section extends UiStandardElement {
  /**
    * A reference to the collection of controls within this tab.
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/collections External Link: Collections (Client API reference)}
    */
  var controls: ItemCollection[Control] = js.native
  /**
    * Gets the name of the section.
    * @returns The name.
    */
  def getName(): String = js.native
  /**
    * Gets a reference to the parent {@link Tab}.
    * @returns The parent.
    */
  def getParent(): Tab = js.native
}

object Section {
  @scala.inline
  def apply(
    controls: ItemCollection[Control],
    getLabel: () => String,
    getName: () => String,
    getParent: () => Tab,
    getVisible: () => Boolean,
    setLabel: String => Unit,
    setVisible: Boolean => Unit
  ): Section = {
    val __obj = js.Dynamic.literal(controls = controls.asInstanceOf[js.Any], getLabel = js.Any.fromFunction0(getLabel), getName = js.Any.fromFunction0(getName), getParent = js.Any.fromFunction0(getParent), getVisible = js.Any.fromFunction0(getVisible), setLabel = js.Any.fromFunction1(setLabel), setVisible = js.Any.fromFunction1(setVisible))
    __obj.asInstanceOf[Section]
  }
  @scala.inline
  implicit class SectionOps[Self <: Section] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withControls(value: ItemCollection[Control]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetParent(value: () => Tab): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getParent")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

