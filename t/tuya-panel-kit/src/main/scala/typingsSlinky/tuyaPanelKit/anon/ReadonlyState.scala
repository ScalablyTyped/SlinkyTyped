package typingsSlinky.tuyaPanelKit.anon

import typingsSlinky.tuyaPanelKit.stackTypesMod.StackDescriptorMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<tuya-panel-kit.tuya-panel-kit/@react-navigation/stack/views/Stack/StackView.State> */
@js.native
trait ReadonlyState extends js.Object {
  
  val closingRouteKeys: js.Array[String] = js.native
  
  val descriptors: StackDescriptorMap = js.native
  
  val openingRouteKeys: js.Array[String] = js.native
  
  val previousDescriptors: StackDescriptorMap = js.native
  
  val previousRoutes: js.Array[typingsSlinky.tuyaPanelKit.routersTypesMod.Route[String, js.UndefOr[js.Object]]] = js.native
  
  val replacingRouteKeys: js.Array[String] = js.native
  
  val routes: js.Array[typingsSlinky.tuyaPanelKit.routersTypesMod.Route[String, js.UndefOr[js.Object]]] = js.native
}
object ReadonlyState {
  
  @scala.inline
  def apply(
    closingRouteKeys: js.Array[String],
    descriptors: StackDescriptorMap,
    openingRouteKeys: js.Array[String],
    previousDescriptors: StackDescriptorMap,
    previousRoutes: js.Array[typingsSlinky.tuyaPanelKit.routersTypesMod.Route[String, js.UndefOr[js.Object]]],
    replacingRouteKeys: js.Array[String],
    routes: js.Array[typingsSlinky.tuyaPanelKit.routersTypesMod.Route[String, js.UndefOr[js.Object]]]
  ): ReadonlyState = {
    val __obj = js.Dynamic.literal(closingRouteKeys = closingRouteKeys.asInstanceOf[js.Any], descriptors = descriptors.asInstanceOf[js.Any], openingRouteKeys = openingRouteKeys.asInstanceOf[js.Any], previousDescriptors = previousDescriptors.asInstanceOf[js.Any], previousRoutes = previousRoutes.asInstanceOf[js.Any], replacingRouteKeys = replacingRouteKeys.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyState]
  }
  
  @scala.inline
  implicit class ReadonlyStateOps[Self <: ReadonlyState] (val x: Self) extends AnyVal {
    
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
    def setClosingRouteKeysVarargs(value: String*): Self = this.set("closingRouteKeys", js.Array(value :_*))
    
    @scala.inline
    def setClosingRouteKeys(value: js.Array[String]): Self = this.set("closingRouteKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptors(value: StackDescriptorMap): Self = this.set("descriptors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpeningRouteKeysVarargs(value: String*): Self = this.set("openingRouteKeys", js.Array(value :_*))
    
    @scala.inline
    def setOpeningRouteKeys(value: js.Array[String]): Self = this.set("openingRouteKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousDescriptors(value: StackDescriptorMap): Self = this.set("previousDescriptors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousRoutesVarargs(value: (typingsSlinky.tuyaPanelKit.routersTypesMod.Route[String, js.UndefOr[js.Object]])*): Self = this.set("previousRoutes", js.Array(value :_*))
    
    @scala.inline
    def setPreviousRoutes(value: js.Array[typingsSlinky.tuyaPanelKit.routersTypesMod.Route[String, js.UndefOr[js.Object]]]): Self = this.set("previousRoutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplacingRouteKeysVarargs(value: String*): Self = this.set("replacingRouteKeys", js.Array(value :_*))
    
    @scala.inline
    def setReplacingRouteKeys(value: js.Array[String]): Self = this.set("replacingRouteKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutesVarargs(value: (typingsSlinky.tuyaPanelKit.routersTypesMod.Route[String, js.UndefOr[js.Object]])*): Self = this.set("routes", js.Array(value :_*))
    
    @scala.inline
    def setRoutes(value: js.Array[typingsSlinky.tuyaPanelKit.routersTypesMod.Route[String, js.UndefOr[js.Object]]]): Self = this.set("routes", value.asInstanceOf[js.Any])
  }
}
