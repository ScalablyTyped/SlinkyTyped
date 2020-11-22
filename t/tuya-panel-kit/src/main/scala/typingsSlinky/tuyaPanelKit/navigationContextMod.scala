package typingsSlinky.tuyaPanelKit

import typingsSlinky.react.mod.Context
import typingsSlinky.std.Record
import typingsSlinky.tuyaPanelKit.typesMod.NavigationProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tuya-panel-kit/@react-navigation/core/NavigationContext", JSImport.Namespace)
@js.native
object navigationContextMod extends js.Object {
  
  /**
    * Context which holds the navigation prop for a screen.
    */
  // tslint:disable-next-line use-default-type-parameter
  val default: Context[
    js.UndefOr[
      NavigationProp[Record[String, js.UndefOr[js.Object]], String, js.Any, js.Any, js.Object]
    ]
  ] = js.native
}
