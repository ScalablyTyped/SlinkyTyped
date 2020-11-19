package typingsSlinky.tinajsTinaRedux

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type MapStateToProps = js.Function1[/* state */ js.Any, js.Any]
  
  type mapDispatchToProps = js.Function1[
    /* dispatch */ typingsSlinky.redux.mod.Dispatch[typingsSlinky.redux.mod.AnyAction], 
    js.Any
  ]
}
