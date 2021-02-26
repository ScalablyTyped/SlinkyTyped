package typingsSlinky.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.semanticUiReact.containerContainerMod.ContainerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object containerMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/elements/Container", JSImport.Default)
  @js.native
  val default: ReactComponentClass[ContainerProps] = js.native
  
  type _To = ReactComponentClass[ContainerProps]
  
  /* This means you don't have to write `default`, but can instead just say `containerMod.foo` */
  override def _to: ReactComponentClass[ContainerProps] = default
}
