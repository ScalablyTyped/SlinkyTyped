package typingsSlinky.scrivito.mod

import typingsSlinky.scrivito.anon.Attributes
import typingsSlinky.scrivito.anon.IncludeObjs
import typingsSlinky.scrivito.scrivitoStrings.asc
import typingsSlinky.scrivito.scrivitoStrings.desc
import typingsSlinky.scrivito.scrivitoStrings.equals
import typingsSlinky.scrivito.scrivitoStrings.isGreaterThan
import typingsSlinky.scrivito.scrivitoStrings.isLessThan
import typingsSlinky.scrivito.scrivitoStrings.startsWith
import typingsSlinky.std.Extract
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjSearch extends StObject {
  
  def and(
    attribute: ObjSearchAttribute,
    operator: ObjSearchOperator,
    value: ObjSearchValue,
    boost: ObjSearchAttributeBasedBoost
  ): ObjSearch = js.native
  
  def andNot(
    attribute: ObjSearchAttribute,
    operator: Extract[ObjSearchOperator, equals | startsWith | isGreaterThan | isLessThan],
    value: ObjSearchValue
  ): ObjSearch = js.native
  
  def boost(attribute: ObjSearchAttribute, operator: ObjSearchOperator, value: ObjSearchValue, factor: Double): ObjSearch = js.native
  
  def count(): Double = js.native
  
  def facet(attribute: ObjSearchSingleAttribute): ObjFacetValue = js.native
  def facet(attribute: ObjSearchSingleAttribute, option: IncludeObjs): ObjFacetValue = js.native
  
  def first(): Obj | Null = js.native
  
  def offset(offSet: Double): ObjSearch = js.native
  
  @JSName("order")
  def order_asc(attributeOrAttributes: js.Array[OrderParam], direction: asc): ObjSearch = js.native
  @JSName("order")
  def order_asc(attributeOrAttributes: OrderParam, direction: asc): ObjSearch = js.native
  @JSName("order")
  def order_desc(attributeOrAttributes: js.Array[OrderParam], direction: desc): ObjSearch = js.native
  @JSName("order")
  def order_desc(attributeOrAttributes: OrderParam, direction: desc): ObjSearch = js.native
  
  def suggest(prefix: String): js.Array[String] = js.native
  def suggest(prefix: String, options: Attributes): js.Array[String] = js.native
  
  def take(): js.Array[Obj] = js.native
  def take(count: Double): js.Array[Obj] = js.native
  
  def toArray(): js.Array[Obj] = js.native
}
