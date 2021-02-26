package typingsSlinky.titanium.Titanium.UI.iOS

import typingsSlinky.titanium.Point
import typingsSlinky.titanium.Titanium.Proxy
import typingsSlinky.titanium.Titanium.UI.View
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Dynamic behavior defining an item's movement to a specific point.
  */
@js.native
trait SnapBehavior extends Proxy {
  
  /**
    * Specifies the amount of oscillation during the conclusion of the snap.
    */
  var damping: Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.iOS.SnapBehavior.damping> property.
    * @deprecated Access <Titanium.UI.iOS.SnapBehavior.damping> instead.
    */
  def getDamping(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.iOS.SnapBehavior.item> property.
    * @deprecated Access <Titanium.UI.iOS.SnapBehavior.item> instead.
    */
  def getItem(): View = js.native
  
  /**
    * Gets the value of the <Titanium.UI.iOS.SnapBehavior.snapPoint> property.
    * @deprecated Access <Titanium.UI.iOS.SnapBehavior.snapPoint> instead.
    */
  def getSnapPoint(): Point = js.native
  
  /**
    * Item to add to this behavior.
    */
  var item: View = js.native
  
  /**
    * Sets the value of the <Titanium.UI.iOS.SnapBehavior.damping> property.
    * @deprecated Set the value using <Titanium.UI.iOS.SnapBehavior.damping> instead.
    */
  def setDamping(damping: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.iOS.SnapBehavior.item> property.
    * @deprecated Set the value using <Titanium.UI.iOS.SnapBehavior.item> instead.
    */
  def setItem(item: View): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.iOS.SnapBehavior.snapPoint> property.
    * @deprecated Set the value using <Titanium.UI.iOS.SnapBehavior.snapPoint> instead.
    */
  def setSnapPoint(snapPoint: Point): Unit = js.native
  
  /**
    * Specifies the point to snap to.
    */
  var snapPoint: Point = js.native
}
