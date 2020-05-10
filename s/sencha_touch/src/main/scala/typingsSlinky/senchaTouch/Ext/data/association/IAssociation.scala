package typingsSlinky.senchaTouch.Ext.data.association

import typingsSlinky.senchaTouch.Ext.IBase
import typingsSlinky.senchaTouch.Ext.data.reader.IReader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAssociation extends IBase {
  /** [Config Option] (String) */
  var associatedModel: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var associatedName: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var associationKey: js.UndefOr[String] = js.native
  /** [Method] Returns the value of associatedModel
  		* @returns String
  		*/
  var getAssociatedModel: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of associatedName
  		* @returns String
  		*/
  var getAssociatedName: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of associationKey
  		* @returns String
  		*/
  var getAssociationKey: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of name
  		* @returns Object
  		*/
  var getName: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of ownerModel
  		* @returns Ext.data.Model/String
  		*/
  var getOwnerModel: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of ownerName
  		* @returns String
  		*/
  var getOwnerName: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of primaryKey
  		* @returns String
  		*/
  var getPrimaryKey: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of reader
  		* @returns Ext.data.reader.Reader
  		*/
  var getReader: js.UndefOr[js.Function0[IReader]] = js.native
  /** [Method] Returns the value of type
  		* @returns String
  		*/
  var getType: js.UndefOr[js.Function0[String]] = js.native
  /** [Config Option] (Ext.data.Model/String) */
  var ownerModel: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String) */
  var primaryKey: js.UndefOr[String] = js.native
  /** [Config Option] (Ext.data.reader.Reader) */
  var reader: js.UndefOr[IReader] = js.native
  /** [Method] Sets the value of associatedModel
  		* @param associatedModel String The new value.
  		*/
  var setAssociatedModel: js.UndefOr[js.Function1[/* associatedModel */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of associatedName
  		* @param associatedName String The new value.
  		*/
  var setAssociatedName: js.UndefOr[js.Function1[/* associatedName */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of associationKey
  		* @param associationKey String The new value.
  		*/
  var setAssociationKey: js.UndefOr[js.Function1[/* associationKey */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of name
  		* @param name Object The new value.
  		*/
  var setName: js.UndefOr[js.Function1[/* name */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of ownerModel
  		* @param ownerModel Ext.data.Model/String The new value.
  		*/
  var setOwnerModel: js.UndefOr[js.Function1[/* ownerModel */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of ownerName
  		* @param ownerName String The new value.
  		*/
  var setOwnerName: js.UndefOr[js.Function1[/* ownerName */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of primaryKey
  		* @param primaryKey String The new value.
  		*/
  var setPrimaryKey: js.UndefOr[js.Function1[/* primaryKey */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of reader
  		* @param reader Ext.data.reader.Reader The new value.
  		*/
  var setReader: js.UndefOr[js.Function1[/* reader */ js.UndefOr[IReader], Unit]] = js.native
  /** [Method] Sets the value of type
  		* @param type String The new value.
  		*/
  var setType: js.UndefOr[js.Function1[/* type */ js.UndefOr[String], Unit]] = js.native
  /** [Config Option] (String) */
  var `type`: js.UndefOr[String] = js.native
}

object IAssociation {
  @scala.inline
  def apply(): IAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAssociation]
  }
  @scala.inline
  implicit class IAssociationOps[Self <: IAssociation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssociatedModel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("associatedModel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssociatedModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("associatedModel")(js.undefined)
        ret
    }
    @scala.inline
    def withAssociatedName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("associatedName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssociatedName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("associatedName")(js.undefined)
        ret
    }
    @scala.inline
    def withAssociationKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("associationKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssociationKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("associationKey")(js.undefined)
        ret
    }
    @scala.inline
    def withGetAssociatedModel(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAssociatedModel")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetAssociatedModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAssociatedModel")(js.undefined)
        ret
    }
    @scala.inline
    def withGetAssociatedName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAssociatedName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetAssociatedName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAssociatedName")(js.undefined)
        ret
    }
    @scala.inline
    def withGetAssociationKey(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAssociationKey")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetAssociationKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAssociationKey")(js.undefined)
        ret
    }
    @scala.inline
    def withGetName(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getName")(js.undefined)
        ret
    }
    @scala.inline
    def withGetOwnerModel(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOwnerModel")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetOwnerModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOwnerModel")(js.undefined)
        ret
    }
    @scala.inline
    def withGetOwnerName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOwnerName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetOwnerName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOwnerName")(js.undefined)
        ret
    }
    @scala.inline
    def withGetPrimaryKey(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPrimaryKey")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetPrimaryKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPrimaryKey")(js.undefined)
        ret
    }
    @scala.inline
    def withGetReader(value: () => IReader): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getReader")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetReader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getReader")(js.undefined)
        ret
    }
    @scala.inline
    def withGetType(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getType")(js.undefined)
        ret
    }
    @scala.inline
    def withOwnerModel(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerModel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwnerModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerModel")(js.undefined)
        ret
    }
    @scala.inline
    def withPrimaryKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimaryKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryKey")(js.undefined)
        ret
    }
    @scala.inline
    def withReader(value: IReader): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reader")(js.undefined)
        ret
    }
    @scala.inline
    def withSetAssociatedModel(value: /* associatedModel */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAssociatedModel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetAssociatedModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAssociatedModel")(js.undefined)
        ret
    }
    @scala.inline
    def withSetAssociatedName(value: /* associatedName */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAssociatedName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetAssociatedName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAssociatedName")(js.undefined)
        ret
    }
    @scala.inline
    def withSetAssociationKey(value: /* associationKey */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAssociationKey")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetAssociationKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAssociationKey")(js.undefined)
        ret
    }
    @scala.inline
    def withSetName(value: /* name */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setName")(js.undefined)
        ret
    }
    @scala.inline
    def withSetOwnerModel(value: /* ownerModel */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOwnerModel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetOwnerModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOwnerModel")(js.undefined)
        ret
    }
    @scala.inline
    def withSetOwnerName(value: /* ownerName */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOwnerName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetOwnerName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOwnerName")(js.undefined)
        ret
    }
    @scala.inline
    def withSetPrimaryKey(value: /* primaryKey */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPrimaryKey")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetPrimaryKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPrimaryKey")(js.undefined)
        ret
    }
    @scala.inline
    def withSetReader(value: /* reader */ js.UndefOr[IReader] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setReader")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetReader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setReader")(js.undefined)
        ret
    }
    @scala.inline
    def withSetType(value: /* type */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setType")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setType")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

