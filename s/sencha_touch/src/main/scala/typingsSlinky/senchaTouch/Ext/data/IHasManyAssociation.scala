package typingsSlinky.senchaTouch.Ext.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHasManyAssociation
  extends typingsSlinky.senchaTouch.Ext.data.association.IAssociation {
  /** [Config Option] (Boolean) */
  var autoLoad: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var autoSync: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  var filterProperty: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var foreignKey: js.UndefOr[String] = js.native
  /** [Method] Returns the value of autoLoad
  		* @returns Boolean
  		*/
  var getAutoLoad: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of autoSync
  		* @returns Boolean
  		*/
  var getAutoSync: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of filterProperty
  		* @returns String
  		*/
  var getFilterProperty: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of foreignKey
  		* @returns String
  		*/
  var getForeignKey: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of store
  		* @returns Object
  		*/
  var getStore: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of storeName
  		* @returns String
  		*/
  var getStoreName: js.UndefOr[js.Function0[String]] = js.native
  /** [Config Option] (String) */
  var name: js.UndefOr[String] = js.native
  /** [Method] Sets the value of autoLoad
  		* @param autoLoad Boolean The new value.
  		*/
  var setAutoLoad: js.UndefOr[js.Function1[/* autoLoad */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of autoSync
  		* @param autoSync Boolean The new value.
  		*/
  var setAutoSync: js.UndefOr[js.Function1[/* autoSync */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of filterProperty
  		* @param filterProperty String The new value.
  		*/
  var setFilterProperty: js.UndefOr[js.Function1[/* filterProperty */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of foreignKey
  		* @param foreignKey String The new value.
  		*/
  var setForeignKey: js.UndefOr[js.Function1[/* foreignKey */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of store
  		* @param store Object The new value.
  		*/
  var setStore: js.UndefOr[js.Function1[/* store */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of storeName
  		* @param storeName String The new value.
  		*/
  var setStoreName: js.UndefOr[js.Function1[/* storeName */ js.UndefOr[String], Unit]] = js.native
  /** [Config Option] (Object) */
  var store: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Object) */
  var storeConfig: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String) */
  var storeName: js.UndefOr[String] = js.native
}

object IHasManyAssociation {
  @scala.inline
  def apply(): IHasManyAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHasManyAssociation]
  }
  @scala.inline
  implicit class IHasManyAssociationOps[Self <: IHasManyAssociation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoLoad(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoLoad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoSync(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoSync")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoSync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoSync")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterProperty(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterProperty")(js.undefined)
        ret
    }
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
    def withGetAutoLoad(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAutoLoad")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetAutoLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAutoLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withGetAutoSync(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAutoSync")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetAutoSync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAutoSync")(js.undefined)
        ret
    }
    @scala.inline
    def withGetFilterProperty(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFilterProperty")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetFilterProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFilterProperty")(js.undefined)
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
    def withGetStore(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStore")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetStore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStore")(js.undefined)
        ret
    }
    @scala.inline
    def withGetStoreName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStoreName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetStoreName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStoreName")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withSetAutoLoad(value: /* autoLoad */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAutoLoad")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetAutoLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAutoLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withSetAutoSync(value: /* autoSync */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAutoSync")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetAutoSync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAutoSync")(js.undefined)
        ret
    }
    @scala.inline
    def withSetFilterProperty(value: /* filterProperty */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFilterProperty")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetFilterProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFilterProperty")(js.undefined)
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
    def withSetStore(value: /* store */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStore")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetStore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStore")(js.undefined)
        ret
    }
    @scala.inline
    def withSetStoreName(value: /* storeName */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStoreName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetStoreName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStoreName")(js.undefined)
        ret
    }
    @scala.inline
    def withStore(value: js.Any): Self = {
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
    @scala.inline
    def withStoreConfig(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storeConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStoreConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storeConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withStoreName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStoreName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storeName")(js.undefined)
        ret
    }
  }
  
}

