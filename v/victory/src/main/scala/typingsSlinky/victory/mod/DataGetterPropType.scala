package typingsSlinky.victory.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Data getter property type
  */
/* Rewritten from type alias, can be one of: 
  - scala.Double
  - java.lang.String
  - js.Array[java.lang.String]
  - js.Function1[/ * data * / js.Any, scala.Double | java.lang.String | js.Array[java.lang.String]]
*/
trait DataGetterPropType extends js.Object

object DataGetterPropType {
  @scala.inline
  implicit def apply(value: js.Array[String]): DataGetterPropType = value.asInstanceOf[DataGetterPropType]
  @scala.inline
  implicit def apply(value: Double): DataGetterPropType = value.asInstanceOf[DataGetterPropType]
  @scala.inline
  implicit def apply(value: js.Function1[/* data */ js.Any, Double | String | js.Array[String]]): DataGetterPropType = value.asInstanceOf[DataGetterPropType]
  @scala.inline
  implicit def apply(value: String): DataGetterPropType = value.asInstanceOf[DataGetterPropType]
}

