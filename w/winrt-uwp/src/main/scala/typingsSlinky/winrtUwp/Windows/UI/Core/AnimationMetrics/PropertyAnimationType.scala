package typingsSlinky.winrtUwp.Windows.UI.Core.AnimationMetrics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PropertyAnimationType extends js.Object
/** Specifies the animation type represented by a PropertyAnimation object. */
@JSGlobal("Windows.UI.Core.AnimationMetrics.PropertyAnimationType")
@js.native
object PropertyAnimationType extends js.Object {
  
  /** Animate the object's transparency. The corresponding object is the OpacityAnimation . */
  @js.native
  sealed trait opacity extends PropertyAnimationType
  
  /** Animate the size of the object, magnifying or shrinking. The corresponding object is the ScaleAnimation . */
  @js.native
  sealed trait scale extends PropertyAnimationType
  
  /** Move the object. The corresponding object is the TranslationAnimation . */
  @js.native
  sealed trait translation extends PropertyAnimationType
}
