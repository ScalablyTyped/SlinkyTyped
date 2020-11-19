package typingsSlinky.skatejs.mod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.skatejs.typesMod.Constructor
import typingsSlinky.skatejs.typesMod.WithContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("skatejs", "withContext")
@js.native
object withContext extends js.Object {
  
  def apply[C, T /* <: Constructor[HTMLElement] */](): Constructor[WithContext[C]] with T = js.native
  def apply[C, T /* <: Constructor[HTMLElement] */](Base: T): Constructor[WithContext[C]] with T = js.native
}
