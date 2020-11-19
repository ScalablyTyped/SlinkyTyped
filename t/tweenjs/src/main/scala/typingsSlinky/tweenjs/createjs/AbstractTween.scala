package typingsSlinky.tweenjs.createjs

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.createjsLib.createjs.EventDispatcher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AbstractTween extends EventDispatcher {
  
  def addLabel(label: String, position: Double): Unit = js.native
  
  // methods
  def advance(delta: Double): Unit = js.native
  def advance(delta: Double, ignoreActions: Boolean): Unit = js.native
  
  var bounce: Boolean = js.native
  
  def calculatePosition(rawPosition: Double): Unit = js.native
  
  val currentLabel: String = js.native
  
  var duration: Double = js.native
  
  def getLabels(): js.Array[String] = js.native
  
  def gotoAndPlay(positionOrLabel: String): Unit = js.native
  def gotoAndPlay(positionOrLabel: Double): Unit = js.native
  
  def gotoAndStop(positionOrLabel: String): Unit = js.native
  def gotoAndStop(positionOrLabel: Double): Unit = js.native
  
  // properties
  var ignoreGlobalPause: Boolean = js.native
  
  var loop: Double = js.native
  
  var paused: Boolean = js.native
  
  var position: Double = js.native
  
  var rawPosition: Double = js.native
  
  def resolve(positionOrLabel: String): Double = js.native
  def resolve(positionOrLabel: Double): Double = js.native
  
  var reversed: Boolean = js.native
  
  def setLabels(labels: js.Array[StringDictionary[Double]]): Unit = js.native
  
  def setPosition(rawPosition: Double): Unit = js.native
  def setPosition(
    rawPosition: Double,
    ignoreActions: js.UndefOr[scala.Nothing],
    jump: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* tween */ this.type, Unit]
  ): Unit = js.native
  def setPosition(rawPosition: Double, ignoreActions: js.UndefOr[scala.Nothing], jump: Boolean): Unit = js.native
  def setPosition(
    rawPosition: Double,
    ignoreActions: js.UndefOr[scala.Nothing],
    jump: Boolean,
    callback: js.Function1[/* tween */ this.type, Unit]
  ): Unit = js.native
  def setPosition(rawPosition: Double, ignoreActions: Boolean): Unit = js.native
  def setPosition(
    rawPosition: Double,
    ignoreActions: Boolean,
    jump: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* tween */ this.type, Unit]
  ): Unit = js.native
  def setPosition(rawPosition: Double, ignoreActions: Boolean, jump: Boolean): Unit = js.native
  def setPosition(
    rawPosition: Double,
    ignoreActions: Boolean,
    jump: Boolean,
    callback: js.Function1[/* tween */ this.type, Unit]
  ): Unit = js.native
  
  var timeScale: Double = js.native
  
  var useTicks: Boolean = js.native
}
