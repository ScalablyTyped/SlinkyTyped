package typingsSlinky.senchaTouch.Ext.draw.modifier

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHighlight extends IModifier {
  /** [Config Option] (Boolean) */
  var enabled: js.UndefOr[Boolean] = js.native
  /** [Method] Filter modifier changes if overriding source attributes
  		* @param attr Object The source attributes.
  		* @param changes Object The modifier changes.
  		* @returns * The filtered changes.
  		*/
  var filterChanges: js.UndefOr[js.Function2[/* attr */ js.UndefOr[js.Any], /* changes */ js.UndefOr[js.Any], _]] = js.native
  /** [Method] Returns the value of enabled
  		* @returns Boolean
  		*/
  var getEnabled: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of highlightStyle
  		* @returns Object
  		*/
  var getHighlightStyle: js.UndefOr[js.Function0[_]] = js.native
  /** [Config Option] (Object) */
  var highlightStyle: js.UndefOr[js.Any] = js.native
  /** [Method] Sets the value of enabled
  		* @param enabled Boolean The new value.
  		*/
  var setEnabled: js.UndefOr[js.Function1[/* enabled */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of highlightStyle
  		* @param highlightStyle Object The new value.
  		*/
  var setHighlightStyle: js.UndefOr[js.Function1[/* highlightStyle */ js.UndefOr[js.Any], Unit]] = js.native
}

object IHighlight {
  @scala.inline
  def apply(): IHighlight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHighlight]
  }
  @scala.inline
  implicit class IHighlightOps[Self <: IHighlight] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterChanges(value: (/* attr */ js.UndefOr[js.Any], /* changes */ js.UndefOr[js.Any]) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterChanges")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFilterChanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterChanges")(js.undefined)
        ret
    }
    @scala.inline
    def withGetEnabled(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEnabled")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withGetHighlightStyle(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHighlightStyle")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetHighlightStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHighlightStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlightStyle(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlightStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withSetEnabled(value: /* enabled */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setEnabled")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withSetHighlightStyle(value: /* highlightStyle */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHighlightStyle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetHighlightStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHighlightStyle")(js.undefined)
        ret
    }
  }
  
}

