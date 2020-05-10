package typingsSlinky.senchaTouch.Ext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITitle extends IComponent {
  /** [Method] Returns the value of title
  		* @returns String
  		*/
  var getTitle: js.UndefOr[js.Function0[java.lang.String]] = js.native
  /** [Method] Sets the value of title
  		* @param title String The new value.
  		*/
  var setTitle: js.UndefOr[js.Function1[/* title */ js.UndefOr[java.lang.String], Unit]] = js.native
  /** [Config Option] (String) */
  var title: js.UndefOr[java.lang.String] = js.native
}

object ITitle {
  @scala.inline
  def apply(): ITitle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITitle]
  }
  @scala.inline
  implicit class ITitleOps[Self <: ITitle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetTitle(value: () => java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTitle")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withSetTitle(value: /* title */ js.UndefOr[java.lang.String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTitle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

