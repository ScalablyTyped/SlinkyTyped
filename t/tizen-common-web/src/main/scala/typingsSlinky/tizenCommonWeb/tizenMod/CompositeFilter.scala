package typingsSlinky.tizenCommonWeb.tizenMod

import typingsSlinky.tizenCommonWeb.tizenCommonWebStrings.INTERSECTION
import typingsSlinky.tizenCommonWeb.tizenCommonWebStrings.UNION
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tizen-common-web/tizen", "CompositeFilter")
@js.native
class CompositeFilter protected () extends AbstractFilter {
  def this(`type`: INTERSECTION) = this()
  def this(`type`: UNION) = this()
  def this(`type`: CompositeFilterType) = this()
  def this(`type`: INTERSECTION, filters: js.Array[AbstractFilter]) = this()
  def this(`type`: UNION, filters: js.Array[AbstractFilter]) = this()
  def this(`type`: CompositeFilterType, filters: js.Array[AbstractFilter]) = this()
  
  /**
    * The list of filters in the composite filter.
    */
  var filters: js.Array[AbstractFilter] = js.native
  
  /**
    * The composite filter type.
    *
    */
  var `type`: CompositeFilterType | UNION | INTERSECTION = js.native
}
