package typingsSlinky.typeCheck

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.typeCheck.TypeCheck.TC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("type-check", JSImport.Namespace)
  @js.native
  val ^ : TC = js.native
  
  type _To = TC
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: TC = ^
}
