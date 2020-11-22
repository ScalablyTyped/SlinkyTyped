package typingsSlinky.storybookCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type Loadable = typingsSlinky.storybookCore.typesMod.RequireContext | js.Array[typingsSlinky.storybookCore.typesMod.RequireContext] | typingsSlinky.storybookCore.typesMod.LoaderFunction
  
  type LoaderFunction = js.Function0[scala.Unit | js.Array[js.Any]]
  
  type RenderStoryFunction = js.Function1[/* context */ typingsSlinky.storybookClientApi.typesMod.RenderContext, scala.Unit]
}
