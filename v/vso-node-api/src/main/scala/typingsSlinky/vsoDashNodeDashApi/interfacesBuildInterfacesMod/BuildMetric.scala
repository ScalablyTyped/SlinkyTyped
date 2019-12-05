package typingsSlinky.vsoDashNodeDashApi.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildMetric extends js.Object {
  /**
    * The date for the scope.
    */
  var date: js.Date
  /**
    * The value.
    */
  var intValue: Double
  /**
    * The name of the metric.
    */
  var name: String
  /**
    * The scope.
    */
  var scope: String
}

object BuildMetric {
  @scala.inline
  def apply(date: js.Date, intValue: Double, name: String, scope: String): BuildMetric = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], intValue = intValue.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BuildMetric]
  }
}

