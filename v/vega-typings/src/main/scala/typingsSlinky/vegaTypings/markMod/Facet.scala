package typingsSlinky.vegaTypings.markMod

import typingsSlinky.vegaTypings.AnonAs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.vegaTypings.AnonName
  - typingsSlinky.vegaTypings.AnonAggregate
*/
trait Facet extends js.Object

object Facet {
  @scala.inline
  def AnonName(data: String, field: String, name: String): Facet = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Facet]
  }
  @scala.inline
  def AnonAggregate(data: String, groupby: String | js.Array[String], name: String, aggregate: AnonAs = null): Facet = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], groupby = groupby.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (aggregate != null) __obj.updateDynamic("aggregate")(aggregate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Facet]
  }
}

