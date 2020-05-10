package typingsSlinky.senchaTouch.Ext.data

import typingsSlinky.senchaTouch.Ext.Array
import typingsSlinky.senchaTouch.Ext.mixin.IObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IModel extends IObservable {
  /** [Config Option] (Object[]) */
  var associations: js.UndefOr[Array] = js.native
  /** [Method] Begins an edit  */
  var beginEdit: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (String/Object/String[]/Object[]) */
  var belongsTo: js.UndefOr[js.Any] = js.native
  /** [Method] Cancels all changes made in the current edit operation  */
  var cancelEdit: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (String) */
  var clientIdProperty: js.UndefOr[String] = js.native
  /** [Method] Usually called by the Ext data Store which owns the model instance
  		* @param silent Boolean true to skip notification of the owning store of the change.
  		*/
  var commit: js.UndefOr[js.Function1[/* silent */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Creates a copy clone of this Model instance
  		* @param id String A new id. If you don't specify this a new id will be generated for you. To generate a phantom instance with a new id use: var rec = record.copy(); // clone the record with a new id
  		* @returns Ext.data.Model
  		*/
  var copy: js.UndefOr[js.Function1[/* id */ js.UndefOr[String], this.type]] = js.native
  /** [Property] (Boolean) */
  var dirty: js.UndefOr[Boolean] = js.native
  /** [Property] (Boolean) */
  var editing: js.UndefOr[Boolean] = js.native
  /** [Method] Ends an edit
  		* @param silent Boolean true to not notify the store of the change.
  		* @param modifiedFieldNames String[] Array of field names changed during edit.
  		*/
  var endEdit: js.UndefOr[
    js.Function2[/* silent */ js.UndefOr[Boolean], /* modifiedFieldNames */ js.UndefOr[Array], Unit]
  ] = js.native
  /** [Method] Destroys the record using the configured proxy
  		* @param options Object/Function Options to pass to the proxy. Config object for Ext.data.Operation. If you pass a function, this will automatically become the callback method. For convenience the config object may also contain success and failure methods in addition to callback - they will all be invoked with the Model and Operation as arguments.
  		* @param scope Object The scope to run your callback method in. This is only used if you passed a function as the first argument.
  		* @returns Ext.data.Model The Model instance.
  		*/
  var erase: js.UndefOr[
    js.Function2[/* options */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], this.type]
  ] = js.native
  /** [Config Option] (Object[]/String[]) */
  var fields: js.UndefOr[js.Any] = js.native
  /** [Method] Returns the value of the given field
  		* @param fieldName String The field to fetch the value for.
  		* @returns Object The value.
  		*/
  var get: js.UndefOr[js.Function1[/* fieldName */ js.UndefOr[String], _]] = js.native
  /** [Method] Gets all of the data from this Models loaded associations
  		* @returns Object The nested data set for the Model's loaded associations.
  		*/
  var getAssociatedData: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of associations
  		* @returns Object[]
  		*/
  var getAssociations: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Returns the value of belongsTo
  		* @returns String/Object/String[]/Object[]
  		*/
  var getBelongsTo: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Gets a hash of only the fields that have been modified since this Model was created or committed
  		* @returns Object
  		*/
  var getChanges: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of clientIdProperty
  		* @returns String
  		*/
  var getClientIdProperty: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns an object containing the data set on this record
  		* @param includeAssociated Boolean true to include the associated data.
  		* @returns Object The data.
  		*/
  var getData: js.UndefOr[js.Function1[/* includeAssociated */ js.UndefOr[Boolean], _]] = js.native
  /** [Method] Returns the value of fields
  		* @returns Object[]/String[]
  		*/
  var getFields: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of hasMany
  		* @returns String/Object/String[]/Object[]
  		*/
  var getHasMany: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of hasOne
  		* @returns String/Object/String[]/Object[]
  		*/
  var getHasOne: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of idProperty
  		* @returns String
  		*/
  var getIdProperty: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of identifier
  		* @returns Object/String
  		*/
  var getIdentifier: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns true if the record has been erased on the server  */
  var getIsErased: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Returns the value of proxy
  		* @returns Object/Ext.data.Proxy
  		*/
  var getProxy: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of useCache
  		* @returns Boolean
  		*/
  var getUseCache: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of validations
  		* @returns Object[]
  		*/
  var getValidations: js.UndefOr[js.Function0[Array]] = js.native
  /** [Config Option] (String/Object/String[]/Object[]) */
  var hasMany: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String/Object/String[]/Object[]) */
  var hasOne: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String) */
  var idProperty: js.UndefOr[String] = js.native
  /** [Config Option] (Object/String) */
  var identifier: js.UndefOr[js.Any] = js.native
  /** [Method] Returns true if the passed field name has been modified since the load or last commit
  		* @param fieldName String Ext.data.Field.name
  		* @returns Boolean
  		*/
  var isModified: js.UndefOr[js.Function1[/* fieldName */ js.UndefOr[String], Boolean]] = js.native
  /** [Method] Checks if the model is valid
  		* @returns Boolean true if the model is valid.
  		*/
  var isValid: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] By joining this model to an instance of a class this model will automatically try to call certain template methods o
  		* @param store Ext.data.Store The store to which this model has been added.
  		*/
  var join: js.UndefOr[js.Function1[/* store */ js.UndefOr[IStore], Unit]] = js.native
  /** [Property] (Object) */
  var modified: js.UndefOr[js.Any] = js.native
  /** [Property] (Boolean) */
  var phantom: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Object/Ext.data.Proxy) */
  var proxy: js.UndefOr[js.Any] = js.native
  /** [Property] (Object) */
  var raw: js.UndefOr[js.Any] = js.native
  /** [Method] Usually called by the Ext data Store to which this model instance has been joined
  		* @param silent Boolean true to skip notification of the owning store of the change.
  		*/
  var reject: js.UndefOr[js.Function1[/* silent */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Relays selected events from the specified Observable as if the events were fired by this
  		* @param object Object The Observable whose events this object is to relay.
  		* @param events String/Array/Object Array of event names to relay.
  		* @returns Ext.mixin.Observable this
  		*/
  @JSName("relayEvents")
  var relayEvents_IModel: js.UndefOr[
    js.Function2[/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any], IObservable]
  ] = js.native
  /** [Method] Saves the model instance using the configured proxy
  		* @param options Object/Function Options to pass to the proxy. Config object for Ext.data.Operation. If you pass a function, this will automatically become the callback method. For convenience the config object may also contain success and failure methods in addition to callback - they will all be invoked with the Model and Operation as arguments.
  		* @param scope Object The scope to run your callback method in. This is only used if you passed a function as the first argument.
  		* @returns Ext.data.Model The Model instance
  		*/
  var save: js.UndefOr[
    js.Function2[/* options */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], this.type]
  ] = js.native
  /** [Method] Sets the given field to the given value marks the instance as dirty
  		* @param fieldName String/Object The field to set, or an object containing key/value pairs.
  		* @param value Object The value to set.
  		*/
  var set: js.UndefOr[
    js.Function2[/* fieldName */ js.UndefOr[js.Any], /* value */ js.UndefOr[js.Any], Unit]
  ] = js.native
  /** [Method] Sets the value of associations
  		* @param associations Object[] The new value.
  		*/
  var setAssociations: js.UndefOr[js.Function1[/* associations */ js.UndefOr[Array], Unit]] = js.native
  /** [Method] Sets the value of belongsTo
  		* @param belongsTo String/Object/String[]/Object[] The new value.
  		*/
  var setBelongsTo: js.UndefOr[js.Function1[/* belongsTo */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of clientIdProperty
  		* @param clientIdProperty String The new value.
  		*/
  var setClientIdProperty: js.UndefOr[js.Function1[/* clientIdProperty */ js.UndefOr[String], Unit]] = js.native
  /** [Method] This sets the data directly without converting and applying default values
  		* @param data Object
  		* @returns Ext.data.Model This Record.
  		*/
  var setConvertedData: js.UndefOr[js.Function1[/* data */ js.UndefOr[js.Any], this.type]] = js.native
  /** [Method] This method is used to set the data for this Record instance
  		* @param rawData Object
  		* @returns Ext.data.Model This record.
  		*/
  var setData: js.UndefOr[js.Function1[/* rawData */ js.UndefOr[js.Any], this.type]] = js.native
  /** [Method] Marks this Record as dirty  */
  var setDirty: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Updates the collection of Fields that all instances of this Model use
  		* @param fields Array
  		* @returns any
  		*/
  var setFields: js.UndefOr[js.Function1[/* fields */ js.UndefOr[Array], _]] = js.native
  /** [Method] Sets the value of hasMany
  		* @param hasMany String/Object/String[]/Object[] The new value.
  		*/
  var setHasMany: js.UndefOr[js.Function1[/* hasMany */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of hasOne
  		* @param hasOne String/Object/String[]/Object[] The new value.
  		*/
  var setHasOne: js.UndefOr[js.Function1[/* hasOne */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the model instance s id field to the given id
  		* @param id Number/String The new id
  		*/
  var setId: js.UndefOr[js.Function1[/* id */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of idProperty
  		* @param idProperty String The new value.
  		*/
  var setIdProperty: js.UndefOr[js.Function1[/* idProperty */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of identifier
  		* @param identifier Object/String The new value.
  		*/
  var setIdentifier: js.UndefOr[js.Function1[/* identifier */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of proxy
  		* @param proxy Object/Ext.data.Proxy The new value.
  		*/
  var setProxy: js.UndefOr[js.Function1[/* proxy */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of useCache
  		* @param useCache Boolean The new value.
  		*/
  var setUseCache: js.UndefOr[js.Function1[/* useCache */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of validations
  		* @param validations Object[] The new value.
  		*/
  var setValidations: js.UndefOr[js.Function1[/* validations */ js.UndefOr[Array], Unit]] = js.native
  /** [Property] (Array) */
  var stores: js.UndefOr[Array] = js.native
  /** [Method] Returns a url suitable string for this model instance
  		* @returns String The url string for this model instance.
  		*/
  var toUrl: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] This un joins this record from an instance of a class
  		* @param store Ext.data.Store The store from which this model has been removed.
  		*/
  var unjoin: js.UndefOr[js.Function1[/* store */ js.UndefOr[IStore], Unit]] = js.native
  /** [Config Option] (Boolean) */
  var useCache: js.UndefOr[Boolean] = js.native
  /** [Method] Validates the current data against all of its configured validations
  		* @returns Ext.data.Errors The errors object.
  		*/
  var validate: js.UndefOr[js.Function0[IErrors]] = js.native
  /** [Config Option] (Object[]) */
  var validations: js.UndefOr[Array] = js.native
}

object IModel {
  @scala.inline
  def apply(): IModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IModel]
  }
  @scala.inline
  implicit class IModelOps[Self <: IModel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssociations(value: Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("associations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssociations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("associations")(js.undefined)
        ret
    }
    @scala.inline
    def withBeginEdit(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beginEdit")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutBeginEdit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beginEdit")(js.undefined)
        ret
    }
    @scala.inline
    def withBelongsTo(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("belongsTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBelongsTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("belongsTo")(js.undefined)
        ret
    }
    @scala.inline
    def withCancelEdit(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelEdit")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutCancelEdit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelEdit")(js.undefined)
        ret
    }
    @scala.inline
    def withClientIdProperty(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientIdProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientIdProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientIdProperty")(js.undefined)
        ret
    }
    @scala.inline
    def withCommit(value: /* silent */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCommit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commit")(js.undefined)
        ret
    }
    @scala.inline
    def withCopy(value: /* id */ js.UndefOr[String] => IModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCopy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copy")(js.undefined)
        ret
    }
    @scala.inline
    def withDirty(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dirty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dirty")(js.undefined)
        ret
    }
    @scala.inline
    def withEditing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editing")(js.undefined)
        ret
    }
    @scala.inline
    def withEndEdit(value: (/* silent */ js.UndefOr[Boolean], /* modifiedFieldNames */ js.UndefOr[Array]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endEdit")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutEndEdit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endEdit")(js.undefined)
        ret
    }
    @scala.inline
    def withErase(value: (/* options */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => IModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("erase")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutErase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("erase")(js.undefined)
        ret
    }
    @scala.inline
    def withFields(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(js.undefined)
        ret
    }
    @scala.inline
    def withGet(value: /* fieldName */ js.UndefOr[String] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.undefined)
        ret
    }
    @scala.inline
    def withGetAssociatedData(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAssociatedData")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetAssociatedData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAssociatedData")(js.undefined)
        ret
    }
    @scala.inline
    def withGetAssociations(value: () => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAssociations")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetAssociations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAssociations")(js.undefined)
        ret
    }
    @scala.inline
    def withGetBelongsTo(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBelongsTo")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetBelongsTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBelongsTo")(js.undefined)
        ret
    }
    @scala.inline
    def withGetChanges(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getChanges")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetChanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getChanges")(js.undefined)
        ret
    }
    @scala.inline
    def withGetClientIdProperty(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getClientIdProperty")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetClientIdProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getClientIdProperty")(js.undefined)
        ret
    }
    @scala.inline
    def withGetData(value: /* includeAssociated */ js.UndefOr[Boolean] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getData")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getData")(js.undefined)
        ret
    }
    @scala.inline
    def withGetFields(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFields")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFields")(js.undefined)
        ret
    }
    @scala.inline
    def withGetHasMany(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHasMany")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetHasMany: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHasMany")(js.undefined)
        ret
    }
    @scala.inline
    def withGetHasOne(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHasOne")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetHasOne: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHasOne")(js.undefined)
        ret
    }
    @scala.inline
    def withGetIdProperty(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIdProperty")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetIdProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIdProperty")(js.undefined)
        ret
    }
    @scala.inline
    def withGetIdentifier(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIdentifier")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withGetIsErased(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIsErased")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetIsErased: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIsErased")(js.undefined)
        ret
    }
    @scala.inline
    def withGetProxy(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getProxy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetProxy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getProxy")(js.undefined)
        ret
    }
    @scala.inline
    def withGetUseCache(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUseCache")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetUseCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUseCache")(js.undefined)
        ret
    }
    @scala.inline
    def withGetValidations(value: () => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValidations")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetValidations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValidations")(js.undefined)
        ret
    }
    @scala.inline
    def withHasMany(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasMany")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasMany: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasMany")(js.undefined)
        ret
    }
    @scala.inline
    def withHasOne(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasOne")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasOne: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasOne")(js.undefined)
        ret
    }
    @scala.inline
    def withIdProperty(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idProperty")(js.undefined)
        ret
    }
    @scala.inline
    def withIdentifier(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identifier")(js.undefined)
        ret
    }
    @scala.inline
    def withIsModified(value: /* fieldName */ js.UndefOr[String] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isModified")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutIsModified: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isModified")(js.undefined)
        ret
    }
    @scala.inline
    def withIsValid(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isValid")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutIsValid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isValid")(js.undefined)
        ret
    }
    @scala.inline
    def withJoin(value: /* store */ js.UndefOr[IStore] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("join")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutJoin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("join")(js.undefined)
        ret
    }
    @scala.inline
    def withModified(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModified: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modified")(js.undefined)
        ret
    }
    @scala.inline
    def withPhantom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phantom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhantom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phantom")(js.undefined)
        ret
    }
    @scala.inline
    def withProxy(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProxy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxy")(js.undefined)
        ret
    }
    @scala.inline
    def withRaw(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRaw: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw")(js.undefined)
        ret
    }
    @scala.inline
    def withReject(value: /* silent */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reject")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutReject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reject")(js.undefined)
        ret
    }
    @scala.inline
    def withRelayEvents(value: (/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any]) => IObservable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relayEvents")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRelayEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relayEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withSave(value: (/* options */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => IModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("save")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("save")(js.undefined)
        ret
    }
    @scala.inline
    def withSet(value: (/* fieldName */ js.UndefOr[js.Any], /* value */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.undefined)
        ret
    }
    @scala.inline
    def withSetAssociations(value: /* associations */ js.UndefOr[Array] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAssociations")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetAssociations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAssociations")(js.undefined)
        ret
    }
    @scala.inline
    def withSetBelongsTo(value: /* belongsTo */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBelongsTo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetBelongsTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBelongsTo")(js.undefined)
        ret
    }
    @scala.inline
    def withSetClientIdProperty(value: /* clientIdProperty */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setClientIdProperty")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetClientIdProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setClientIdProperty")(js.undefined)
        ret
    }
    @scala.inline
    def withSetConvertedData(value: /* data */ js.UndefOr[js.Any] => IModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setConvertedData")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetConvertedData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setConvertedData")(js.undefined)
        ret
    }
    @scala.inline
    def withSetData(value: /* rawData */ js.UndefOr[js.Any] => IModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setData")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setData")(js.undefined)
        ret
    }
    @scala.inline
    def withSetDirty(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDirty")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutSetDirty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDirty")(js.undefined)
        ret
    }
    @scala.inline
    def withSetFields(value: /* fields */ js.UndefOr[Array] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFields")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFields")(js.undefined)
        ret
    }
    @scala.inline
    def withSetHasMany(value: /* hasMany */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHasMany")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetHasMany: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHasMany")(js.undefined)
        ret
    }
    @scala.inline
    def withSetHasOne(value: /* hasOne */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHasOne")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetHasOne: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHasOne")(js.undefined)
        ret
    }
    @scala.inline
    def withSetId(value: /* id */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setId")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setId")(js.undefined)
        ret
    }
    @scala.inline
    def withSetIdProperty(value: /* idProperty */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIdProperty")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetIdProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIdProperty")(js.undefined)
        ret
    }
    @scala.inline
    def withSetIdentifier(value: /* identifier */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIdentifier")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withSetProxy(value: /* proxy */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setProxy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetProxy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setProxy")(js.undefined)
        ret
    }
    @scala.inline
    def withSetUseCache(value: /* useCache */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setUseCache")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetUseCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setUseCache")(js.undefined)
        ret
    }
    @scala.inline
    def withSetValidations(value: /* validations */ js.UndefOr[Array] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setValidations")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetValidations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setValidations")(js.undefined)
        ret
    }
    @scala.inline
    def withStores(value: Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stores")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStores: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stores")(js.undefined)
        ret
    }
    @scala.inline
    def withToUrl(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toUrl")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutToUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withUnjoin(value: /* store */ js.UndefOr[IStore] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unjoin")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutUnjoin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unjoin")(js.undefined)
        ret
    }
    @scala.inline
    def withUseCache(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useCache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useCache")(js.undefined)
        ret
    }
    @scala.inline
    def withValidate(value: () => IErrors): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutValidate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validate")(js.undefined)
        ret
    }
    @scala.inline
    def withValidations(value: Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validations")(js.undefined)
        ret
    }
  }
  
}

