package typingsSlinky.tuyaPanelKit.anon

import typingsSlinky.tuyaPanelKit.stackTypesMod.StackDescriptorMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClosingRouteKeys extends js.Object {
  
  var closingRouteKeys: js.UndefOr[scala.Nothing] = js.native
  
  var descriptors: StackDescriptorMap = js.native
  
  var openingRouteKeys: js.UndefOr[scala.Nothing] = js.native
  
  var previousDescriptors: StackDescriptorMap = js.native
  
  // tslint:disable-next-line no-redundant-undefined array-type use-default-type-parameter
  var previousRoutes: js.Array[typingsSlinky.tuyaPanelKit.routersTypesMod.Route[String, js.UndefOr[js.Object]]] = js.native
  
  var replacingRouteKeys: js.UndefOr[scala.Nothing] = js.native
  
  // tslint:disable-next-line no-redundant-undefined array-type use-default-type-parameter
  var routes: js.Array[typingsSlinky.tuyaPanelKit.routersTypesMod.Route[String, js.UndefOr[js.Object]]] = js.native
}
object ClosingRouteKeys {
  
  @scala.inline
  def apply(
    descriptors: StackDescriptorMap,
    previousDescriptors: StackDescriptorMap,
    previousRoutes: js.Array[typingsSlinky.tuyaPanelKit.routersTypesMod.Route[String, js.UndefOr[js.Object]]],
    routes: js.Array[typingsSlinky.tuyaPanelKit.routersTypesMod.Route[String, js.UndefOr[js.Object]]]
  ): ClosingRouteKeys = {
    val __obj = js.Dynamic.literal(descriptors = descriptors.asInstanceOf[js.Any], previousDescriptors = previousDescriptors.asInstanceOf[js.Any], previousRoutes = previousRoutes.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClosingRouteKeys]
  }
  
  @scala.inline
  implicit class ClosingRouteKeysOps[Self <: ClosingRouteKeys] (val x: Self) extends AnyVal {
    
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
    def setDescriptors(value: StackDescriptorMap): Self = this.set("descriptors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousDescriptors(value: StackDescriptorMap): Self = this.set("previousDescriptors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousRoutesVarargs(value: (typingsSlinky.tuyaPanelKit.routersTypesMod.Route[String, js.UndefOr[js.Object]])*): Self = this.set("previousRoutes", js.Array(value :_*))
    
    @scala.inline
    def setPreviousRoutes(value: js.Array[typingsSlinky.tuyaPanelKit.routersTypesMod.Route[String, js.UndefOr[js.Object]]]): Self = this.set("previousRoutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutesVarargs(value: (typingsSlinky.tuyaPanelKit.routersTypesMod.Route[String, js.UndefOr[js.Object]])*): Self = this.set("routes", js.Array(value :_*))
    
    @scala.inline
    def setRoutes(value: js.Array[typingsSlinky.tuyaPanelKit.routersTypesMod.Route[String, js.UndefOr[js.Object]]]): Self = this.set("routes", value.asInstanceOf[js.Any])
  }
}
