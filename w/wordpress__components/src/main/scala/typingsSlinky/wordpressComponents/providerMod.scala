package typingsSlinky.wordpressComponents

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.wordpressComponents.anon.ChildrenReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object providerMod extends Shortcut {
  
  @JSImport("@wordpress/components/drop-zone/provider", JSImport.Default)
  @js.native
  val default: ReactComponentClass[ChildrenReactNode] = js.native
  
  type _To = ReactComponentClass[ChildrenReactNode]
  
  /* This means you don't have to write `default`, but can instead just say `providerMod.foo` */
  override def _to: ReactComponentClass[ChildrenReactNode] = default
}
