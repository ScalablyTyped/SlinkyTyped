package typingsSlinky.tuyaPanelKit.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  key :string,   name :string}> & std.Readonly<{  params :object | undefined}> & {  state :std.Readonly<{  key :string,   index :number,   routeNames :std.Array<string>,   history :std.Array<unknown> | undefined,   routes :std.Array<std.Readonly<{  key :string,   name :string}> & std.Readonly<{  params :object | undefined}> & any>,   type :string,   stale :false}> | tuya-panel-kit.tuya-panel-kit/@react-navigation/native.PartialState<std.Readonly<{  key :string,   index :number,   routeNames :std.Array<string>,   history :std.Array<unknown> | undefined,   routes :std.Array<std.Readonly<{  key :string,   name :string}> & std.Readonly<{  params :object | undefined}> & any>,   type :string,   stale :false}>> | undefined} */
@js.native
trait ReadonlykeystringnamestriKey extends StObject {
  
  val key: String = js.native
  
  val name: String = js.native
  
  val params: js.UndefOr[js.Object] = js.native
  
  var state: js.UndefOr[ReadonlykeystringindexnumIndex | PartialStateReadonlykeystIndex] = js.native
}
object ReadonlykeystringnamestriKey {
  
  @scala.inline
  def apply(key: String, name: String): ReadonlykeystringnamestriKey = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlykeystringnamestriKey]
  }
  
  @scala.inline
  implicit class ReadonlykeystringnamestriKeyMutableBuilder[Self <: ReadonlykeystringnamestriKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParams(value: js.Object): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    @scala.inline
    def setState(value: ReadonlykeystringindexnumIndex | PartialStateReadonlykeystIndex): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
