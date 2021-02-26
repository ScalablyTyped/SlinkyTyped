package typingsSlinky.tuyaPanelKit

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.react.mod.Context
import typingsSlinky.tuyaPanelKit.anon.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object currentRenderContextMod extends Shortcut {
  
  /**
    * Context which holds the values for the current navigation tree.
    * Intended for use in SSR. This is not safe to use on the client.
    */
  @JSImport("tuya-panel-kit/@react-navigation/core/CurrentRenderContext", JSImport.Default)
  @js.native
  val default: Context[js.UndefOr[Options]] = js.native
  
  type _To = Context[js.UndefOr[Options]]
  
  /* This means you don't have to write `default`, but can instead just say `currentRenderContextMod.foo` */
  override def _to: Context[js.UndefOr[Options]] = default
}
