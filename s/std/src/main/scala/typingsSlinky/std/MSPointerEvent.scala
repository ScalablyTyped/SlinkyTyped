package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MSPointerEvent extends MouseEvent {
  
  val currentPoint: js.Any = js.native
  
  def getCurrentPoint(element: org.scalajs.dom.raw.Element): Unit = js.native
  
  def getIntermediatePoints(element: org.scalajs.dom.raw.Element): Unit = js.native
  
  val height: Double = js.native
  
  val hwTimestamp: Double = js.native
  
  def initPointerEvent(
    typeArg: java.lang.String,
    canBubbleArg: scala.Boolean,
    cancelableArg: scala.Boolean,
    viewArg: org.scalajs.dom.raw.Window,
    detailArg: Double,
    screenXArg: Double,
    screenYArg: Double,
    clientXArg: Double,
    clientYArg: Double,
    ctrlKeyArg: scala.Boolean,
    altKeyArg: scala.Boolean,
    shiftKeyArg: scala.Boolean,
    metaKeyArg: scala.Boolean,
    buttonArg: Double,
    relatedTargetArg: org.scalajs.dom.raw.EventTarget,
    offsetXArg: Double,
    offsetYArg: Double,
    widthArg: Double,
    heightArg: Double,
    pressure: Double,
    rotation: Double,
    tiltX: Double,
    tiltY: Double,
    pointerIdArg: Double,
    pointerType: js.Any,
    hwTimestampArg: Double,
    isPrimary: scala.Boolean
  ): Unit = js.native
  
  val intermediatePoints: js.Any = js.native
  
  val isPrimary: scala.Boolean = js.native
  
  val pointerId: Double = js.native
  
  val pointerType: js.Any = js.native
  
  val pressure: Double = js.native
  
  val rotation: Double = js.native
  
  val tiltX: Double = js.native
  
  val tiltY: Double = js.native
  
  val width: Double = js.native
}
