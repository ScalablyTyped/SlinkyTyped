package typingsSlinky.wordpressComponents

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formToggleMod extends Shortcut {
  
  @JSImport("@wordpress/components/form-toggle", JSImport.Default)
  @js.native
  val default: ReactComponentClass[HTMLProps[HTMLInputElement]] = js.native
  
  type _To = ReactComponentClass[HTMLProps[HTMLInputElement]]
  
  /* This means you don't have to write `default`, but can instead just say `formToggleMod.foo` */
  override def _to: ReactComponentClass[HTMLProps[HTMLInputElement]] = default
}
