package typingsSlinky.senchaTouch.Ext.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHasOneAssociation
  extends typingsSlinky.senchaTouch.Ext.data.association.IAssociation {
  /** [Config Option] (String) */
  var foreignKey: js.UndefOr[String] = js.native
  /** [Method] Returns the value of foreignKey
  		* @returns String
  		*/
  var getForeignKey: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of getterName
  		* @returns String
  		*/
  var getGetterName: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of instanceName
  		* @returns Object
  		*/
  var getInstanceName: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of setterName
  		* @returns String
  		*/
  var getSetterName: js.UndefOr[js.Function0[String]] = js.native
  /** [Config Option] (String) */
  var getterName: js.UndefOr[String] = js.native
  /** [Method] Sets the value of foreignKey
  		* @param foreignKey String The new value.
  		*/
  var setForeignKey: js.UndefOr[js.Function1[/* foreignKey */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of getterName
  		* @param getterName String The new value.
  		*/
  var setGetterName: js.UndefOr[js.Function1[/* getterName */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of instanceName
  		* @param instanceName Object The new value.
  		*/
  var setInstanceName: js.UndefOr[js.Function1[/* instanceName */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of setterName
  		* @param setterName String The new value.
  		*/
  var setSetterName: js.UndefOr[js.Function1[/* setterName */ js.UndefOr[String], Unit]] = js.native
  /** [Config Option] (String) */
  var setterName: js.UndefOr[String] = js.native
}

object IHasOneAssociation {
  @scala.inline
  def apply(): IHasOneAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHasOneAssociation]
  }
  @scala.inline
  implicit class IHasOneAssociationOps[Self <: IHasOneAssociation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withForeignKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foreignKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForeignKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foreignKey")(js.undefined)
        ret
    }
    @scala.inline
    def withGetForeignKey(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getForeignKey")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetForeignKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getForeignKey")(js.undefined)
        ret
    }
    @scala.inline
    def withGetGetterName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGetterName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetGetterName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGetterName")(js.undefined)
        ret
    }
    @scala.inline
    def withGetInstanceName(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInstanceName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetInstanceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInstanceName")(js.undefined)
        ret
    }
    @scala.inline
    def withGetSetterName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSetterName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetSetterName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSetterName")(js.undefined)
        ret
    }
    @scala.inline
    def withGetterName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getterName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetterName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getterName")(js.undefined)
        ret
    }
    @scala.inline
    def withSetForeignKey(value: /* foreignKey */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setForeignKey")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetForeignKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setForeignKey")(js.undefined)
        ret
    }
    @scala.inline
    def withSetGetterName(value: /* getterName */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setGetterName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetGetterName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setGetterName")(js.undefined)
        ret
    }
    @scala.inline
    def withSetInstanceName(value: /* instanceName */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setInstanceName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetInstanceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setInstanceName")(js.undefined)
        ret
    }
    @scala.inline
    def withSetSetterName(value: /* setterName */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSetterName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetSetterName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSetterName")(js.undefined)
        ret
    }
    @scala.inline
    def withSetterName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setterName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetterName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setterName")(js.undefined)
        ret
    }
  }
  
}

