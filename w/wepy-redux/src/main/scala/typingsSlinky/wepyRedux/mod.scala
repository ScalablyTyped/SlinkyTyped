package typingsSlinky.wepyRedux

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.redux.mod.AnyAction
import typingsSlinky.redux.mod.Store
import typingsSlinky.wepy.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wepy-redux", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def connect(mapStateToProps: MapStateToProps, mapDispatchToProps: MapDispatchToProps): js.Function1[/* original */ Component, Component] = js.native
  
  def getStore(): Store[_, AnyAction] = js.native
  
  def setStore(store: Store[_, _]): Unit = js.native
  
  type MapDispatchToProps = StringDictionary[(js.Function2[/* store */ js.Any, /* repeated */ js.Any, Unit]) | String]
  
  type MapStateToProps = StringDictionary[(js.Function1[/* state */ js.Any, js.Any]) | String]
}
