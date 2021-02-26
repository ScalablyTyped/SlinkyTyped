package typingsSlinky.senchaTouch.Ext.data

import typingsSlinky.senchaTouch.Ext.IBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDataWriter extends IBase {
  
  /** [Method] Returns the value of nameProperty
    * @returns String
    */
  var getNameProperty: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Method] Formats the data for each record before sending it to the server
    * @param record Object The record that we are writing to the server.
    * @returns Object An object literal of name/value keys to be written to the server. By default this method returns the data property on the record.
    */
  var getRecordData: js.UndefOr[js.Function1[/* record */ js.UndefOr[js.Any], _]] = js.native
  
  /** [Method] Returns the value of writeAllFields
    * @returns Boolean
    */
  var getWriteAllFields: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Config Option] (String) */
  var nameProperty: js.UndefOr[String] = js.native
  
  /** [Method] Sets the value of nameProperty
    * @param nameProperty String The new value.
    */
  var setNameProperty: js.UndefOr[js.Function1[/* nameProperty */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Sets the value of writeAllFields
    * @param writeAllFields Boolean The new value.
    */
  var setWriteAllFields: js.UndefOr[js.Function1[/* writeAllFields */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Prepares a Proxy s Ext data Request object
    * @param request Ext.data.Request The request object.
    * @returns Ext.data.Request The modified request object.
    */
  var write: js.UndefOr[js.Function1[/* request */ js.UndefOr[IRequest], IRequest]] = js.native
  
  /** [Config Option] (Boolean) */
  var writeAllFields: js.UndefOr[Boolean] = js.native
}
object IDataWriter {
  
  @scala.inline
  def apply(): IDataWriter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDataWriter]
  }
  
  @scala.inline
  implicit class IDataWriterMutableBuilder[Self <: IDataWriter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetNameProperty(value: () => String): Self = StObject.set(x, "getNameProperty", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetNamePropertyUndefined: Self = StObject.set(x, "getNameProperty", js.undefined)
    
    @scala.inline
    def setGetRecordData(value: /* record */ js.UndefOr[js.Any] => _): Self = StObject.set(x, "getRecordData", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetRecordDataUndefined: Self = StObject.set(x, "getRecordData", js.undefined)
    
    @scala.inline
    def setGetWriteAllFields(value: () => Boolean): Self = StObject.set(x, "getWriteAllFields", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetWriteAllFieldsUndefined: Self = StObject.set(x, "getWriteAllFields", js.undefined)
    
    @scala.inline
    def setNameProperty(value: String): Self = StObject.set(x, "nameProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamePropertyUndefined: Self = StObject.set(x, "nameProperty", js.undefined)
    
    @scala.inline
    def setSetNameProperty(value: /* nameProperty */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setNameProperty", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetNamePropertyUndefined: Self = StObject.set(x, "setNameProperty", js.undefined)
    
    @scala.inline
    def setSetWriteAllFields(value: /* writeAllFields */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setWriteAllFields", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetWriteAllFieldsUndefined: Self = StObject.set(x, "setWriteAllFields", js.undefined)
    
    @scala.inline
    def setWrite(value: /* request */ js.UndefOr[IRequest] => IRequest): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWriteAllFields(value: Boolean): Self = StObject.set(x, "writeAllFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWriteAllFieldsUndefined: Self = StObject.set(x, "writeAllFields", js.undefined)
    
    @scala.inline
    def setWriteUndefined: Self = StObject.set(x, "write", js.undefined)
  }
}
