package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Events providing information related to transitions. */
@js.native
trait TransitionEvent extends Event {
  
  val elapsedTime: Double = js.native
  
  val propertyName: java.lang.String = js.native
  
  val pseudoElement: java.lang.String = js.native
}
