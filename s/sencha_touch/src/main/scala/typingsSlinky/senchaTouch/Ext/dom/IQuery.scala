package typingsSlinky.senchaTouch.Ext.dom

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.senchaTouch.Ext.Array
import typingsSlinky.senchaTouch.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IQuery extends IBase {
  /** [Method] Returns true if the passed element s match the passed simple selector e g
  		* @param el String/HTMLElement/Array An element id, element or array of elements
  		* @param selector String The simple selector to test
  		* @returns Boolean
  		*/
  var is: js.UndefOr[
    js.Function2[/* el */ js.UndefOr[js.Any], /* selector */ js.UndefOr[String], Boolean]
  ] = js.native
  /** [Method] Selects a group of elements
  		* @param selector String The selector/xpath query (can be a comma separated list of selectors)
  		* @param root HTMLElement/String The start of the query (defaults to document).
  		* @returns HTMLElement[] An Array of DOM elements which match the selector. If there are no matches, and empty Array is returned.
  		*/
  var select: js.UndefOr[
    js.Function2[/* selector */ js.UndefOr[String], /* root */ js.UndefOr[js.Any], Array]
  ] = js.native
  /** [Method] Selects a single element
  		* @param selector String The selector/xpath query
  		* @param root HTMLElement/String The start of the query (defaults to document).
  		* @returns HTMLElement The DOM element which matched the selector.
  		*/
  var selectNode: js.UndefOr[
    js.Function2[/* selector */ js.UndefOr[String], /* root */ js.UndefOr[js.Any], HTMLElement]
  ] = js.native
}

object IQuery {
  @scala.inline
  def apply(): IQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IQuery]
  }
  @scala.inline
  implicit class IQueryOps[Self <: IQuery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIs(value: (/* el */ js.UndefOr[js.Any], /* selector */ js.UndefOr[String]) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutIs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is")(js.undefined)
        ret
    }
    @scala.inline
    def withSelect(value: (/* selector */ js.UndefOr[String], /* root */ js.UndefOr[js.Any]) => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectNode(value: (/* selector */ js.UndefOr[String], /* root */ js.UndefOr[js.Any]) => HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectNode")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSelectNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectNode")(js.undefined)
        ret
    }
  }
  
}

