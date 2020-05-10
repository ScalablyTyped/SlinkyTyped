package typingsSlinky.senchaTouch.Ext.form

import typingsSlinky.senchaTouch.Ext.IContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFieldSet extends IContainer {
  /** [Method] A convenient method to disable all fields in this FieldSet
  		* @param newDisabled Object
  		* @returns Ext.form.FieldSet This FieldSet
  		*/
  var doSetDisabled: js.UndefOr[js.Function1[/* newDisabled */ js.UndefOr[js.Any], this.type]] = js.native
  /** [Config Option] (String) */
  var instructions: js.UndefOr[String] = js.native
  /** [Method] Sets the value of instructions
  		* @param instructions String The new value.
  		*/
  var setInstructions: js.UndefOr[js.Function1[/* instructions */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of title
  		* @param title String The new value.
  		*/
  var setTitle: js.UndefOr[js.Function1[/* title */ js.UndefOr[String], Unit]] = js.native
  /** [Config Option] (String) */
  var title: js.UndefOr[String] = js.native
}

object IFieldSet {
  @scala.inline
  def apply(): IFieldSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFieldSet]
  }
  @scala.inline
  implicit class IFieldSetOps[Self <: IFieldSet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDoSetDisabled(value: /* newDisabled */ js.UndefOr[js.Any] => IFieldSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doSetDisabled")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDoSetDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doSetDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withInstructions(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instructions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstructions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instructions")(js.undefined)
        ret
    }
    @scala.inline
    def withSetInstructions(value: /* instructions */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setInstructions")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetInstructions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setInstructions")(js.undefined)
        ret
    }
    @scala.inline
    def withSetTitle(value: /* title */ js.UndefOr[String] => Unit): Self = {
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
    def withTitle(value: String): Self = {
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

