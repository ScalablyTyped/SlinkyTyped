package typingsSlinky.winrt.Windows.Storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NameCollisionOption extends js.Object
@JSGlobal("Windows.Storage.NameCollisionOption")
@js.native
object NameCollisionOption extends js.Object {
  
  @js.native
  sealed trait failIfExists extends NameCollisionOption
  
  @js.native
  sealed trait generateUniqueName extends NameCollisionOption
  
  @js.native
  sealed trait replaceExisting extends NameCollisionOption
}
