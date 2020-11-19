package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimationEffect extends js.Object {
  
  def getComputedTiming(): ComputedEffectTiming = js.native
  
  def getTiming(): EffectTiming = js.native
  
  def updateTiming(): Unit = js.native
  def updateTiming(timing: OptionalEffectTiming): Unit = js.native
}
