package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MutationObserverInit extends js.Object {
  /**
    * Set to a list of attribute local names (without namespace) if not all attribute mutations need to be observed and attributes is true or omitted.
    */
  var attributeFilter: js.UndefOr[js.Array[java.lang.String]] = js.native
  /**
    * Set to true if attributes is true or omitted and target's attribute value before the mutation needs to be recorded.
    */
  var attributeOldValue: js.UndefOr[scala.Boolean] = js.native
  /**
    * Set to true if mutations to target's attributes are to be observed. Can be omitted if attributeOldValue or attributeFilter is specified.
    */
  var attributes: js.UndefOr[scala.Boolean] = js.native
  /**
    * Set to true if mutations to target's data are to be observed. Can be omitted if characterDataOldValue is specified.
    */
  var characterData: js.UndefOr[scala.Boolean] = js.native
  /**
    * Set to true if characterData is set to true or omitted and target's data before the mutation needs to be recorded.
    */
  var characterDataOldValue: js.UndefOr[scala.Boolean] = js.native
  /**
    * Set to true if mutations to target's children are to be observed.
    */
  var childList: js.UndefOr[scala.Boolean] = js.native
  /**
    * Set to true if mutations to not just target, but also target's descendants are to be observed.
    */
  var subtree: js.UndefOr[scala.Boolean] = js.native
}

object MutationObserverInit {
  @scala.inline
  def apply(): MutationObserverInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MutationObserverInit]
  }
  @scala.inline
  implicit class MutationObserverInitOps[Self <: org.scalajs.dom.raw.MutationObserverInit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributeFilter(value: js.Array[java.lang.String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributeFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributeFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributeFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withAttributeOldValue(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributeOldValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributeOldValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributeOldValue")(js.undefined)
        ret
    }
    @scala.inline
    def withAttributes(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(js.undefined)
        ret
    }
    @scala.inline
    def withCharacterData(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("characterData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCharacterData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("characterData")(js.undefined)
        ret
    }
    @scala.inline
    def withCharacterDataOldValue(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("characterDataOldValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCharacterDataOldValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("characterDataOldValue")(js.undefined)
        ret
    }
    @scala.inline
    def withChildList(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childList")(js.undefined)
        ret
    }
    @scala.inline
    def withSubtree(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtree")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubtree: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtree")(js.undefined)
        ret
    }
  }
  
}

