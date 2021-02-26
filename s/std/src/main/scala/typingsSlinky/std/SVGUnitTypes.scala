package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A commonly used set of constants used for reflecting gradientUnits, patternContentUnits and other similar attributes. */
@js.native
trait SVGUnitTypes extends StObject {
  
  val SVG_UNIT_TYPE_OBJECTBOUNDINGBOX: Double = js.native
  
  val SVG_UNIT_TYPE_UNKNOWN: Double = js.native
  
  val SVG_UNIT_TYPE_USERSPACEONUSE: Double = js.native
}
object SVGUnitTypes {
  
  @scala.inline
  def apply(
    SVG_UNIT_TYPE_OBJECTBOUNDINGBOX: Double,
    SVG_UNIT_TYPE_UNKNOWN: Double,
    SVG_UNIT_TYPE_USERSPACEONUSE: Double
  ): org.scalajs.dom.raw.SVGUnitTypes = {
    val __obj = js.Dynamic.literal(SVG_UNIT_TYPE_OBJECTBOUNDINGBOX = SVG_UNIT_TYPE_OBJECTBOUNDINGBOX.asInstanceOf[js.Any], SVG_UNIT_TYPE_UNKNOWN = SVG_UNIT_TYPE_UNKNOWN.asInstanceOf[js.Any], SVG_UNIT_TYPE_USERSPACEONUSE = SVG_UNIT_TYPE_USERSPACEONUSE.asInstanceOf[js.Any])
    __obj.asInstanceOf[org.scalajs.dom.raw.SVGUnitTypes]
  }
  
  @scala.inline
  implicit class SVGUnitTypesMutableBuilder[Self <: org.scalajs.dom.raw.SVGUnitTypes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSVG_UNIT_TYPE_OBJECTBOUNDINGBOX(value: Double): Self = StObject.set(x, "SVG_UNIT_TYPE_OBJECTBOUNDINGBOX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSVG_UNIT_TYPE_UNKNOWN(value: Double): Self = StObject.set(x, "SVG_UNIT_TYPE_UNKNOWN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSVG_UNIT_TYPE_USERSPACEONUSE(value: Double): Self = StObject.set(x, "SVG_UNIT_TYPE_USERSPACEONUSE", value.asInstanceOf[js.Any])
  }
}
