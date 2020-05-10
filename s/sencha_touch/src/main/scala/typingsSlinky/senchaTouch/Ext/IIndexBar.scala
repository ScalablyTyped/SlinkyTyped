package typingsSlinky.senchaTouch.Ext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IIndexBar extends IComponent {
  /** [Config Option] (Boolean) */
  var alphabet: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  var direction: js.UndefOr[java.lang.String] = js.native
  /** [Method] Returns the value of direction
  		* @returns String
  		*/
  var getDirection: js.UndefOr[js.Function0[java.lang.String]] = js.native
  /** [Method] Returns the value of letters
  		* @returns Array
  		*/
  var getLetters: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Returns the value of listPrefix
  		* @returns String
  		*/
  var getListPrefix: js.UndefOr[js.Function0[java.lang.String]] = js.native
  /** [Method] Returns true when direction is horizontal  */
  var isHorizontal: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Returns true when direction is vertical  */
  var isVertical: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (Boolean) */
  var itemSelector: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Array) */
  var letters: js.UndefOr[Array] = js.native
  /** [Config Option] (String) */
  var listPrefix: js.UndefOr[java.lang.String] = js.native
  /** [Method] Refreshes the view by reloading the data from the store and re rendering the template  */
  var refresh: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Sets the value of direction
  		* @param direction String The new value.
  		*/
  var setDirection: js.UndefOr[js.Function1[/* direction */ js.UndefOr[java.lang.String], Unit]] = js.native
  /** [Method] Sets the value of letters
  		* @param letters Array The new value.
  		*/
  var setLetters: js.UndefOr[js.Function1[/* letters */ js.UndefOr[Array], Unit]] = js.native
  /** [Method] Sets the value of listPrefix
  		* @param listPrefix String The new value.
  		*/
  var setListPrefix: js.UndefOr[js.Function1[/* listPrefix */ js.UndefOr[java.lang.String], Unit]] = js.native
  /** [Config Option] (Boolean) */
  var store: js.UndefOr[Boolean] = js.native
}

object IIndexBar {
  @scala.inline
  def apply(): IIndexBar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IIndexBar]
  }
  @scala.inline
  implicit class IIndexBarOps[Self <: IIndexBar] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlphabet(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alphabet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlphabet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alphabet")(js.undefined)
        ret
    }
    @scala.inline
    def withDirection(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(js.undefined)
        ret
    }
    @scala.inline
    def withGetDirection(value: () => java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDirection")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDirection")(js.undefined)
        ret
    }
    @scala.inline
    def withGetLetters(value: () => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLetters")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetLetters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLetters")(js.undefined)
        ret
    }
    @scala.inline
    def withGetListPrefix(value: () => java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getListPrefix")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetListPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getListPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withIsHorizontal(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHorizontal")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutIsHorizontal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHorizontal")(js.undefined)
        ret
    }
    @scala.inline
    def withIsVertical(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVertical")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutIsVertical: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVertical")(js.undefined)
        ret
    }
    @scala.inline
    def withItemSelector(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemSelector")(js.undefined)
        ret
    }
    @scala.inline
    def withLetters(value: Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("letters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLetters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("letters")(js.undefined)
        ret
    }
    @scala.inline
    def withListPrefix(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withRefresh(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refresh")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutRefresh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refresh")(js.undefined)
        ret
    }
    @scala.inline
    def withSetDirection(value: /* direction */ js.UndefOr[java.lang.String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDirection")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDirection")(js.undefined)
        ret
    }
    @scala.inline
    def withSetLetters(value: /* letters */ js.UndefOr[Array] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLetters")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetLetters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLetters")(js.undefined)
        ret
    }
    @scala.inline
    def withSetListPrefix(value: /* listPrefix */ js.UndefOr[java.lang.String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setListPrefix")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetListPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setListPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withStore(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("store")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("store")(js.undefined)
        ret
    }
  }
  
}

