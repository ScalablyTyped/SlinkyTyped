package typingsSlinky.tuyaPanelKit.anon

import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import typingsSlinky.react.mod.Ref
import typingsSlinky.tuyaPanelKit.nativeTypesMod.ServerContainerRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined tuya-panel-kit.tuya-panel-kit/@react-navigation/native/ServerContext.ServerContextType & {  children :react.react.ReactNode} & react.react.RefAttributes<tuya-panel-kit.tuya-panel-kit/@react-navigation/native/types.ServerContainerRef> */
@js.native
trait ServerContextTypechildren extends js.Object {
  
  var children: ReactElement = js.native
  
  var key: js.UndefOr[typingsSlinky.react.mod.Key | Null] = js.native
  
  var location: js.UndefOr[Pathname] = js.native
  
  var ref: js.UndefOr[Ref[ServerContainerRef]] = js.native
}
object ServerContextTypechildren {
  
  @scala.inline
  def apply(): ServerContextTypechildren = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerContextTypechildren]
  }
  
  @scala.inline
  implicit class ServerContextTypechildrenOps[Self <: ServerContextTypechildren] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChildren(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setKey(value: typingsSlinky.react.mod.Key): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setKeyNull: Self = this.set("key", null)
    
    @scala.inline
    def setLocation(value: Pathname): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setRefRefObject(value: ReactRef[ServerContainerRef]): Self = this.set("ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefFunction1(value: /* instance */ ServerContainerRef | Null => Unit): Self = this.set("ref", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRef(value: Ref[ServerContainerRef]): Self = this.set("ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRef: Self = this.set("ref", js.undefined)
    
    @scala.inline
    def setRefNull: Self = this.set("ref", null)
  }
}
