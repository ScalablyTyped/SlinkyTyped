package typingsSlinky.senchaTouch.Ext.data

import typingsSlinky.senchaTouch.Ext.mixin.IObservable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reader {
  
  @js.native
  trait IArray extends IJson {
    
    /** [Method] Sets the value of successProperty
      * @param successProperty Object The new value.
      */
    @JSName("setSuccessProperty")
    var setSuccessProperty_IArray: js.UndefOr[js.Function1[/* successProperty */ js.UndefOr[js.Any], Unit]] = js.native
    
    /** [Method] Sets the value of totalProperty
      * @param totalProperty Object The new value.
      */
    @JSName("setTotalProperty")
    var setTotalProperty_IArray: js.UndefOr[js.Function1[/* totalProperty */ js.UndefOr[js.Any], Unit]] = js.native
  }
  object IArray {
    
    @scala.inline
    def apply(): IArray = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IArray]
    }
    
    @scala.inline
    implicit class IArrayMutableBuilder[Self <: IArray] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSetSuccessProperty(value: /* successProperty */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setSuccessProperty", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetSuccessPropertyUndefined: Self = StObject.set(x, "setSuccessProperty", js.undefined)
      
      @scala.inline
      def setSetTotalProperty(value: /* totalProperty */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setTotalProperty", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetTotalPropertyUndefined: Self = StObject.set(x, "setTotalProperty", js.undefined)
    }
  }
  
  @js.native
  trait IJson
    extends typingsSlinky.senchaTouch.Ext.data.reader.IReader {
    
    /** [Method] Returns the value of record
      * @returns String
      */
    var getRecord: js.UndefOr[js.Function0[String]] = js.native
    
    /** [Method] Returns the value of useSimpleAccessors
      * @returns Boolean
      */
    var getUseSimpleAccessors: js.UndefOr[js.Function0[Boolean]] = js.native
    
    /** [Config Option] (String) */
    var record: js.UndefOr[String] = js.native
    
    /** [Method] Sets the value of record
      * @param record String The new value.
      */
    var setRecord: js.UndefOr[js.Function1[/* record */ js.UndefOr[String], Unit]] = js.native
    
    /** [Method] Sets the value of useSimpleAccessors
      * @param useSimpleAccessors Boolean The new value.
      */
    var setUseSimpleAccessors: js.UndefOr[js.Function1[/* useSimpleAccessors */ js.UndefOr[Boolean], Unit]] = js.native
    
    /** [Config Option] (Boolean) */
    var useSimpleAccessors: js.UndefOr[Boolean] = js.native
  }
  object IJson {
    
    @scala.inline
    def apply(): IJson = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IJson]
    }
    
    @scala.inline
    implicit class IJsonMutableBuilder[Self <: IJson] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetRecord(value: () => String): Self = StObject.set(x, "getRecord", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetRecordUndefined: Self = StObject.set(x, "getRecord", js.undefined)
      
      @scala.inline
      def setGetUseSimpleAccessors(value: () => Boolean): Self = StObject.set(x, "getUseSimpleAccessors", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetUseSimpleAccessorsUndefined: Self = StObject.set(x, "getUseSimpleAccessors", js.undefined)
      
      @scala.inline
      def setRecord(value: String): Self = StObject.set(x, "record", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecordUndefined: Self = StObject.set(x, "record", js.undefined)
      
      @scala.inline
      def setSetRecord(value: /* record */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setRecord", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetRecordUndefined: Self = StObject.set(x, "setRecord", js.undefined)
      
      @scala.inline
      def setSetUseSimpleAccessors(value: /* useSimpleAccessors */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setUseSimpleAccessors", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetUseSimpleAccessorsUndefined: Self = StObject.set(x, "setUseSimpleAccessors", js.undefined)
      
      @scala.inline
      def setUseSimpleAccessors(value: Boolean): Self = StObject.set(x, "useSimpleAccessors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseSimpleAccessorsUndefined: Self = StObject.set(x, "useSimpleAccessors", js.undefined)
    }
  }
  
  @js.native
  trait IReader extends IObservable {
    
    /** [Config Option] (String) */
    var clientIdProperty: js.UndefOr[String] = js.native
    
    /** [Method] Returns the value of clientIdProperty
      * @returns String
      */
    var getClientIdProperty: js.UndefOr[js.Function0[String]] = js.native
    
    /** [Method] Returns the value of idProperty
      * @returns String
      */
    var getIdProperty: js.UndefOr[js.Function0[String]] = js.native
    
    /** [Method] Returns the value of implicitIncludes
      * @returns Boolean
      */
    var getImplicitIncludes: js.UndefOr[js.Function0[Boolean]] = js.native
    
    /** [Method] Returns the value of messageProperty
      * @returns String
      */
    var getMessageProperty: js.UndefOr[js.Function0[String]] = js.native
    
    /** [Method] Returns the value of model
      * @returns Object
      */
    var getModel: js.UndefOr[js.Function0[_]] = js.native
    
    /** [Method] Takes a raw response object as passed to this read and returns the useful data segment of it
      * @param response Object The response object
      * @returns Object The useful data from the response
      */
    var getResponseData: js.UndefOr[js.Function1[/* response */ js.UndefOr[js.Any], _]] = js.native
    
    /** [Method] Returns the value of rootProperty
      * @returns String
      */
    var getRootProperty: js.UndefOr[js.Function0[String]] = js.native
    
    /** [Method] Returns the value of successProperty
      * @returns any
      */
    var getSuccessProperty: js.UndefOr[js.Function0[_]] = js.native
    
    /** [Method] Returns the value of totalProperty
      * @returns any
      */
    var getTotalProperty: js.UndefOr[js.Function0[_]] = js.native
    
    /** [Config Option] (String) */
    var idProperty: js.UndefOr[String] = js.native
    
    /** [Config Option] (Boolean) */
    var implicitIncludes: js.UndefOr[Boolean] = js.native
    
    /** [Config Option] (String) */
    var messageProperty: js.UndefOr[String] = js.native
    
    /** [Property] (Object) */
    var metaData: js.UndefOr[js.Any] = js.native
    
    /** [Property] (Object) */
    var rawData: js.UndefOr[js.Any] = js.native
    
    /** [Method] Reads the given response object
      * @param response Object The response object. This may be either an XMLHttpRequest object or a plain JS object
      * @returns Ext.data.ResultSet The parsed ResultSet object
      */
    var read: js.UndefOr[js.Function1[/* response */ js.UndefOr[js.Any], IResultSet]] = js.native
    
    /** [Method] Abstracts common functionality used by all Reader subclasses
      * @param data Object The raw data object
      * @returns Ext.data.ResultSet A ResultSet object
      */
    var readRecords: js.UndefOr[js.Function1[/* data */ js.UndefOr[js.Any], IResultSet]] = js.native
    
    /** [Method] Relays selected events from the specified Observable as if the events were fired by this
      * @param object Object The Observable whose events this object is to relay.
      * @param events String/Array/Object Array of event names to relay.
      * @returns Ext.mixin.Observable this
      */
    @JSName("relayEvents")
    var relayEvents_IReader: js.UndefOr[
        js.Function2[/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any], IObservable]
      ] = js.native
    
    /** [Config Option] (String) */
    var root: js.UndefOr[String] = js.native
    
    /** [Config Option] (String) */
    var rootProperty: js.UndefOr[String] = js.native
    
    /** [Method] Sets the value of clientIdProperty
      * @param clientIdProperty String The new value.
      */
    var setClientIdProperty: js.UndefOr[js.Function1[/* clientIdProperty */ js.UndefOr[String], Unit]] = js.native
    
    /** [Method] Sets the value of idProperty
      * @param idProperty String The new value.
      */
    var setIdProperty: js.UndefOr[js.Function1[/* idProperty */ js.UndefOr[String], Unit]] = js.native
    
    /** [Method] Sets the value of implicitIncludes
      * @param implicitIncludes Boolean The new value.
      */
    var setImplicitIncludes: js.UndefOr[js.Function1[/* implicitIncludes */ js.UndefOr[Boolean], Unit]] = js.native
    
    /** [Method] Sets the value of messageProperty
      * @param messageProperty String The new value.
      */
    var setMessageProperty: js.UndefOr[js.Function1[/* messageProperty */ js.UndefOr[String], Unit]] = js.native
    
    /** [Method] Sets the value of model
      * @param model Object The new value.
      */
    var setModel: js.UndefOr[js.Function1[/* model */ js.UndefOr[js.Any], Unit]] = js.native
    
    /** [Method] Sets the value of rootProperty
      * @param rootProperty String The new value.
      */
    var setRootProperty: js.UndefOr[js.Function1[/* rootProperty */ js.UndefOr[String], Unit]] = js.native
    
    /** [Method] Sets the value of successProperty
      * @param successProperty String The new value.
      */
    var setSuccessProperty: js.UndefOr[js.Function1[/* successProperty */ js.UndefOr[String], Unit]] = js.native
    
    /** [Method] Sets the value of totalProperty
      * @param totalProperty String The new value.
      */
    var setTotalProperty: js.UndefOr[js.Function1[/* totalProperty */ js.UndefOr[String], Unit]] = js.native
    
    /** [Config Option] (String) */
    var successProperty: js.UndefOr[String] = js.native
    
    /** [Config Option] (String) */
    var totalProperty: js.UndefOr[String] = js.native
  }
  object IReader {
    
    @scala.inline
    def apply(): typingsSlinky.senchaTouch.Ext.data.reader.IReader = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsSlinky.senchaTouch.Ext.data.reader.IReader]
    }
    
    @scala.inline
    implicit class IReaderMutableBuilder[Self <: typingsSlinky.senchaTouch.Ext.data.reader.IReader] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClientIdProperty(value: String): Self = StObject.set(x, "clientIdProperty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientIdPropertyUndefined: Self = StObject.set(x, "clientIdProperty", js.undefined)
      
      @scala.inline
      def setGetClientIdProperty(value: () => String): Self = StObject.set(x, "getClientIdProperty", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetClientIdPropertyUndefined: Self = StObject.set(x, "getClientIdProperty", js.undefined)
      
      @scala.inline
      def setGetIdProperty(value: () => String): Self = StObject.set(x, "getIdProperty", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetIdPropertyUndefined: Self = StObject.set(x, "getIdProperty", js.undefined)
      
      @scala.inline
      def setGetImplicitIncludes(value: () => Boolean): Self = StObject.set(x, "getImplicitIncludes", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetImplicitIncludesUndefined: Self = StObject.set(x, "getImplicitIncludes", js.undefined)
      
      @scala.inline
      def setGetMessageProperty(value: () => String): Self = StObject.set(x, "getMessageProperty", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetMessagePropertyUndefined: Self = StObject.set(x, "getMessageProperty", js.undefined)
      
      @scala.inline
      def setGetModel(value: () => _): Self = StObject.set(x, "getModel", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetModelUndefined: Self = StObject.set(x, "getModel", js.undefined)
      
      @scala.inline
      def setGetResponseData(value: /* response */ js.UndefOr[js.Any] => _): Self = StObject.set(x, "getResponseData", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetResponseDataUndefined: Self = StObject.set(x, "getResponseData", js.undefined)
      
      @scala.inline
      def setGetRootProperty(value: () => String): Self = StObject.set(x, "getRootProperty", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetRootPropertyUndefined: Self = StObject.set(x, "getRootProperty", js.undefined)
      
      @scala.inline
      def setGetSuccessProperty(value: () => _): Self = StObject.set(x, "getSuccessProperty", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetSuccessPropertyUndefined: Self = StObject.set(x, "getSuccessProperty", js.undefined)
      
      @scala.inline
      def setGetTotalProperty(value: () => _): Self = StObject.set(x, "getTotalProperty", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetTotalPropertyUndefined: Self = StObject.set(x, "getTotalProperty", js.undefined)
      
      @scala.inline
      def setIdProperty(value: String): Self = StObject.set(x, "idProperty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdPropertyUndefined: Self = StObject.set(x, "idProperty", js.undefined)
      
      @scala.inline
      def setImplicitIncludes(value: Boolean): Self = StObject.set(x, "implicitIncludes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImplicitIncludesUndefined: Self = StObject.set(x, "implicitIncludes", js.undefined)
      
      @scala.inline
      def setMessageProperty(value: String): Self = StObject.set(x, "messageProperty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessagePropertyUndefined: Self = StObject.set(x, "messageProperty", js.undefined)
      
      @scala.inline
      def setMetaData(value: js.Any): Self = StObject.set(x, "metaData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetaDataUndefined: Self = StObject.set(x, "metaData", js.undefined)
      
      @scala.inline
      def setRawData(value: js.Any): Self = StObject.set(x, "rawData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawDataUndefined: Self = StObject.set(x, "rawData", js.undefined)
      
      @scala.inline
      def setRead(value: /* response */ js.UndefOr[js.Any] => IResultSet): Self = StObject.set(x, "read", js.Any.fromFunction1(value))
      
      @scala.inline
      def setReadRecords(value: /* data */ js.UndefOr[js.Any] => IResultSet): Self = StObject.set(x, "readRecords", js.Any.fromFunction1(value))
      
      @scala.inline
      def setReadRecordsUndefined: Self = StObject.set(x, "readRecords", js.undefined)
      
      @scala.inline
      def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
      
      @scala.inline
      def setRelayEvents(value: (/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any]) => IObservable): Self = StObject.set(x, "relayEvents", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRelayEventsUndefined: Self = StObject.set(x, "relayEvents", js.undefined)
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootProperty(value: String): Self = StObject.set(x, "rootProperty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootPropertyUndefined: Self = StObject.set(x, "rootProperty", js.undefined)
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      @scala.inline
      def setSetClientIdProperty(value: /* clientIdProperty */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setClientIdProperty", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetClientIdPropertyUndefined: Self = StObject.set(x, "setClientIdProperty", js.undefined)
      
      @scala.inline
      def setSetIdProperty(value: /* idProperty */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setIdProperty", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetIdPropertyUndefined: Self = StObject.set(x, "setIdProperty", js.undefined)
      
      @scala.inline
      def setSetImplicitIncludes(value: /* implicitIncludes */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setImplicitIncludes", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetImplicitIncludesUndefined: Self = StObject.set(x, "setImplicitIncludes", js.undefined)
      
      @scala.inline
      def setSetMessageProperty(value: /* messageProperty */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setMessageProperty", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetMessagePropertyUndefined: Self = StObject.set(x, "setMessageProperty", js.undefined)
      
      @scala.inline
      def setSetModel(value: /* model */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setModel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetModelUndefined: Self = StObject.set(x, "setModel", js.undefined)
      
      @scala.inline
      def setSetRootProperty(value: /* rootProperty */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setRootProperty", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetRootPropertyUndefined: Self = StObject.set(x, "setRootProperty", js.undefined)
      
      @scala.inline
      def setSetSuccessProperty(value: /* successProperty */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setSuccessProperty", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetSuccessPropertyUndefined: Self = StObject.set(x, "setSuccessProperty", js.undefined)
      
      @scala.inline
      def setSetTotalProperty(value: /* totalProperty */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setTotalProperty", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetTotalPropertyUndefined: Self = StObject.set(x, "setTotalProperty", js.undefined)
      
      @scala.inline
      def setSuccessProperty(value: String): Self = StObject.set(x, "successProperty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuccessPropertyUndefined: Self = StObject.set(x, "successProperty", js.undefined)
      
      @scala.inline
      def setTotalProperty(value: String): Self = StObject.set(x, "totalProperty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalPropertyUndefined: Self = StObject.set(x, "totalProperty", js.undefined)
    }
  }
  
  @js.native
  trait IXml
    extends typingsSlinky.senchaTouch.Ext.data.reader.IReader {
    
    /** [Method] Normalizes the data object
      * @param data Object The raw data object.
      * @returns Object Returns the documentElement property of the data object if present, or the same object if not.
      */
    var getData: js.UndefOr[js.Function1[/* data */ js.UndefOr[js.Any], _]] = js.native
    
    /** [Method] Returns the value of record
      * @returns String
      */
    var getRecord: js.UndefOr[js.Function0[String]] = js.native
    
    /** [Config Option] (String) */
    var record: js.UndefOr[String] = js.native
    
    /** [Method] Sets the value of record
      * @param record String The new value.
      */
    var setRecord: js.UndefOr[js.Function1[/* record */ js.UndefOr[String], Unit]] = js.native
  }
  object IXml {
    
    @scala.inline
    def apply(): IXml = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IXml]
    }
    
    @scala.inline
    implicit class IXmlMutableBuilder[Self <: IXml] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetData(value: /* data */ js.UndefOr[js.Any] => _): Self = StObject.set(x, "getData", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetDataUndefined: Self = StObject.set(x, "getData", js.undefined)
      
      @scala.inline
      def setGetRecord(value: () => String): Self = StObject.set(x, "getRecord", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetRecordUndefined: Self = StObject.set(x, "getRecord", js.undefined)
      
      @scala.inline
      def setRecord(value: String): Self = StObject.set(x, "record", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecordUndefined: Self = StObject.set(x, "record", js.undefined)
      
      @scala.inline
      def setSetRecord(value: /* record */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setRecord", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetRecordUndefined: Self = StObject.set(x, "setRecord", js.undefined)
    }
  }
}
